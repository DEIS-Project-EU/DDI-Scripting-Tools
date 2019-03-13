package transformation.thrift2ode;

import java.util.HashMap;

import odeBase.BaseElement;
import odeBase.KeyValueMap;
import odeBase.TimeUnit;
import odeBase.Value;
import base.iface.IBaseElement;
import thriftContract.TDDIKeyValueMap;
import thriftContract.TDDITimeUnit;
import thriftContract.TDDIValue;
import util.EMFFactory;

public class BaseEMFTranslater {
	public static HashMap<Object, BaseElement> thrift2EmfMap = new HashMap<Object, BaseElement>();

	public static void transformBaseElementContents(IBaseElement tBaseElement, BaseElement emfBaseElement) {		
		
		if (tBaseElement.isSetId()) 
			emfBaseElement.setId(tBaseElement.getId());
		if (tBaseElement.isSetName())
			emfBaseElement.setName(tBaseElement.getName());
		if (tBaseElement.isSetDescription())
			emfBaseElement.setDescription(tBaseElement.getDescription());
				
		if (tBaseElement.isSetKeyValueMaps()) {
			for (TDDIKeyValueMap tMap : tBaseElement.getKeyValueMaps()) {
				KeyValueMap emfMap = EMFFactory.baseFactory.createKeyValueMap();
				emfMap.setKey(tMap.Key);
				for (TDDIValue tValue : tMap.Values) {
					Value emfValue = EMFFactory.baseFactory.createValue();
					emfValue.setTag(tValue.Tag);
					emfValue.setValue(tValue.Value);
					emfMap.getValues().add(emfValue);
				}
				emfBaseElement.getKeyValueMaps().add(emfMap);
			}
		}
	}
	
	public static TimeUnit transformTimeUnit(TDDITimeUnit tTimeUnit){
		switch (tTimeUnit) {
		case TUDay:
			return TimeUnit.DAY;
		case TUHour:
			return TimeUnit.HOUR;
		case TUMillisecond:
			return TimeUnit.MILLISECOND;
		case TUMinute:
			return TimeUnit.MINUTE;
		case TUMonth:
			return TimeUnit.MONTH;
		case TUSecond:
			return TimeUnit.SECOND;
		case TUWeek:
			return TimeUnit.WEEK;
		case TUYear:
			return TimeUnit.YEAR;
		default:
			return TimeUnit.HOUR;
		}
	}
}
