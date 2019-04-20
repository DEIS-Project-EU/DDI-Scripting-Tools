var ddiintegrationhelpers = {
  "BuildARGPInterface\r": {
    "param": [
      {
        "!value": "ARGPI\r",
        "type": "Any\r",
        "!text": "The ArgumentPackageInterface being built\r"
      },
      {
        "!value": "ModelElements\r",
        "type": "Collection\r",
        "!text": "Collection of ModelElements which should be considered for inclusion in the ARGPI\r"
      }
    ],
    "comments\r": {
      "!text": "Adds to the ArgumentPackageInterface the ModelElements from the input that have a TaggedValue 'isPublic'\r\n<br> The check for the tag is performed using DDIBuilderHelpers.eol : HasTaggedValue operation\r\nIncluded elements are cloned and set as citations of the originals \r\n<br> (isCitation = true and set the ModelElement as the citedElement)\r"
    }
  },
  "BuildACPBinding\r": {
    "param": [
      {
        "!value": "alphaARGPI\r",
        "type": "ArgumentPackageInterface\r",
        "!text": "The first ARGPI to be bound\r"
      },
      {
        "!value": "betaARGPI\r",
        "type": "ArgumentPackageInterface\r",
        "!text": "The second ARGPI to be bound\r"
      },
      {
        "!value": "bindingMap\r",
        "type": "Map\r",
        "!text": "A Map used to associate elements from one ARGPI to the other\r"
      }
    ],
    "comments\r": {
      "!text": "Binds two ArgumentPackageInterfaces under a AssuranceCasePackageBinding, indirectly\r\n<br> the ACPB also contains a ArgumentPackageBinding under which the interfaces are directly bound\r"
    }
  },
  "IntegrateArchitecture\r": {
    "param": [
      {
        "!value": "systemName\r",
        "type": "String\r",
        "!text": "The name of the parent system\r"
      },
      {
        "!value": "subSystemName\r",
        "type": "String\r",
        "!text": "The name of the subsystem\r"
      },
      {
        "!value": "inputPortMapping\r",
        "type": "Map\r",
        "!text": "Maps parent system's input ports to the subsystem's output ports\r"
      },
      {
        "!value": "outputPortMapping\r",
        "type": "Map\r",
        "!text": "Maps the parent system's output ports to the subsystem's input ports\r"
      }
    ],
    "comments\r": {
      "!text": "Integrates a system with a subsystem, mapping I/O ports\r\n<br> Searches parent system from ownDDI for a placeholder subsystem with the provided subsystem name\r\n<br> Then removes references and signals from/to that subsystem (from just the parent system)\r\n<br> Then retrieves the subsystem from the supplierDDI, clones and adds it to the parent system's subsystems\r\n<br> Also adds it to the design package containing the parent system\r\n<br> Connects the parent system's input ports to the subsystem's output ports and vice versa\r"
    }
  }
};