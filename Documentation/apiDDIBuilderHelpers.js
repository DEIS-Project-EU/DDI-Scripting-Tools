apijson2 = {
  "Clone": {
	"context": {
	  "type": "Any",
	  "!text": "The subject EMF element to be cloned"
	},
	"return-type": {
	  "type": "Any",
	  "!text": "The clone of the context EMF element"
	},
	"comments": {
	  "!text": "Clone deep-copies a EMF element using org.eclipse.epsilon.emc.emf.tools.EmfTool.EcoreUtil.copy \n<br><b>IMPORTANT: </b>For the cloned element to be usable (properties accessible), it must be copied into a container element in the subject model"
	}
  },
  "SetNameDescription": {
	"context": {
	  "type": "BaseElement",
	  "!text": "The BaseElement whose name and description should be set"
	},
	"param": [
	  {
		"!value": "name",
		"type": "String",
		"!text": "The name the element should be set to"
	  },
	  {
		"!value": "description",
		"type": "String",
		"!text": "The description the element should be set to"
	  }
	],
	"comments": {
	  "!text": "SetNameDescription sets a BaseElement's name and description"
	}
  }
};
