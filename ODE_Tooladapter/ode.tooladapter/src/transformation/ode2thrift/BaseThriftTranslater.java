package transformation.ode2thrift;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import base.iface.IBaseElement;
import sacm.base.iface.IElement;
import thriftContract.TDDIKeyValueMap;
import thriftContract.TDDITimeUnit;
import thriftContract.TDDIValue;
import top.base.Element;
import top.odeBase.BaseElement;
import top.odeBase.KeyValueMap;
import top.odeBase.TimeUnit;
import top.odeBase.Value;

public class BaseThriftTranslater {

	@SuppressWarnings("unused")
	private static final Logger Log = LogManager.getLogger(BaseThriftTranslater.class);
	
	public static HashMap<BaseElement, Object> emf2ThriftMap = new HashMap<BaseElement, Object>();
	
	private static final String EmfElementIdKey = "EmfElementId";
	
	public static long importId = 1;
	
	public static boolean preserveIds = false;
	
	public static void transformBaseElementContents(IBaseElement tBaseElement, BaseElement emfBaseElement) {
		
		if(preserveIds){
			tBaseElement.setId(emfBaseElement.getId());
		}
		else
		{
			tBaseElement.setId(importId++);	
		}
		
		tBaseElement.setName(emfBaseElement.getName());
		tBaseElement.setDescription(emfBaseElement.getDescription());
		
		List<TDDIKeyValueMap> tKeyValueMaps = new ArrayList<TDDIKeyValueMap>();
		
		if (emfBaseElement.getKeyValueMaps() != null) {
			
			for (KeyValueMap eMap : emfBaseElement.getKeyValueMaps()) {
				TDDIKeyValueMap tMap = new TDDIKeyValueMap();
				tMap.Key = eMap.getKey();
				for (Value eValue : eMap.getValues()) {
					tMap.Values.add(new TDDIValue(eValue.getTag(), eValue.getValue()));
				}
				tKeyValueMaps.add(tMap);
			}
			tBaseElement.setKeyValueMaps(tKeyValueMaps);
		}
		
		//addEmfIdToKeyValueMap(tKeyValueMaps, emfBaseElement);
	}
	
	private static void addEmfIdToKeyValueMap(List<TDDIKeyValueMap> keyValueMaps, BaseElement emfBaseElement){
		List<TDDIKeyValueMap> alreadyExistingEntriesForEmfElementId = keyValueMaps.stream().filter(kvm -> kvm.Key.equals(EmfElementIdKey)).collect(Collectors.toList());
		
		// new value list with emf id
		List<TDDIValue> newValueListForEmfId = new ArrayList<TDDIValue>();
		newValueListForEmfId.add(new TDDIValue("long", String.valueOf(emfBaseElement.getId())));
		
		// if emf element id key already exists, replace value with new emf id
		if(alreadyExistingEntriesForEmfElementId.size() == 1){
			alreadyExistingEntriesForEmfElementId.get(0).setValues(newValueListForEmfId);
		}
		else if(alreadyExistingEntriesForEmfElementId.size() == 0){
			TDDIKeyValueMap emfIdKeyValueMap = new TDDIKeyValueMap(EmfElementIdKey, newValueListForEmfId);
			keyValueMaps.add(emfIdKeyValueMap);
		}
		else if(alreadyExistingEntriesForEmfElementId.size() > 1){
			Log.warn("More than one KeyValueMap exists with the key " + EmfElementIdKey + "\nAffected element:" + emfBaseElement);
		}
	}
	
	public static void transformSacmElementContents(IElement tSacmElement, Element sacmEmfElement) {

	}

	public static TDDITimeUnit transformTimeUnit(TimeUnit eTimeUnit) {
		switch(eTimeUnit){
		case DAY:
			return TDDITimeUnit.TUDay;
		case HOUR:
			return TDDITimeUnit.TUHour;
		case MILLISECOND:
			return TDDITimeUnit.TUMillisecond;
		case MINUTE:
			return TDDITimeUnit.TUMinute;
		case MONTH:
			return TDDITimeUnit.TUMonth;
		case SECOND:
			return TDDITimeUnit.TUSecond;
		case WEEK:
			return TDDITimeUnit.TUWeek;
		case YEAR:
			return TDDITimeUnit.TUYear;
		default:
			Log.warn("Transformation of time unit \"" + eTimeUnit.getName() + "\" not implemented yet. Time unit is set to hour." );
			return TDDITimeUnit.TUHour;
		}
	}
}
