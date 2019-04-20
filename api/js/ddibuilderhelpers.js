var ddibuilderhelpers = {
  "Clone\r": {
    "context\r": {
      "type": "Any\r",
      "!text": "The subject EMF element to be cloned\r"
    },
    "return-type": {
      "!value": "\r",
      "type": "Any\r",
      "!text": "The clone of the context EMF element\r"
    },
    "comments\r": {
      "!text": "Clone deep-copies a EMF element using org.eclipse.epsilon.emc.emf.tools.EmfTool.EcoreUtil.copy \r\n<br><b>IMPORTANT: </b>For the cloned element to be usable (properties accessible), it must be copied into a container element in the subject model\r"
    }
  },
  "GetID\r": {
    "return-type\r": {
      "type": "Integer\r",
      "!text": "A randomly generated integer to serve as an element ID\r"
    },
    "comments\r": {
      "!text": "Generates a unique pseudo-random ID using java.util.Random \r\n<br> The range is [0, MAX_ID], MAX_ID is a global Integer that should be defined by the user \r\n<br> The user must also define a global ID_LIST Collection of existing IDs for checking the uniqueness \r"
    }
  },
  "SetNameDescription\r": {
    "context\r": {
      "type": "BaseElement\r",
      "!text": "The BaseElement whose name and description should be set\r"
    },
    "param": [
      {
        "!value": "name\r",
        "type": "String\r",
        "!text": "The name the element should be set to\r"
      },
      {
        "!value": "description\r",
        "type": "String\r",
        "!text": "The description the element should be set to\r"
      }
    ],
    "comments\r": {
      "!text": "SetNameDescription sets a BaseElement's name and description\r"
    }
  },
  "AddKeyValue(1)\r": {
    "context\r": {
      "type": "BaseElement\r",
      "!text": "The BaseElement to which the key-value pair is to be added\r"
    },
    "param": [
      {
        "!value": "key\r",
        "type": "String\r",
        "!text": "The key of the key-value pair\r"
      },
      {
        "!value": "value\r",
        "type": "String\r",
        "!text": "The value of the key-value pair\r"
      }
    ],
    "comments\r": {
      "!text": "Adds the key-value pair to the context BaseElement\r"
    }
  },
  "AddKeyValue(2)\r": {
    "context\r": {
      "type": "BaseElement\r",
      "!text": "The BaseElement to which the key-value pair is to be added\r"
    },
    "param": [
      {
        "!value": "key\r",
        "type": "String\r",
        "!text": "The key of the key-value pair\r"
      },
      {
        "!value": "value\r",
        "type": "String\r",
        "!text": "The value of the key-value pair\r"
      },
      {
        "!value": "tag\r",
        "type": "String\r",
        "!text": "Additional specification of key-value pair\r"
      }
    ],
    "comments\r": {
      "!text": "Adds the key-value pair to the context BaseElement, also adds tag with pair\r"
    }
  },
  "BuildSystem(1)\r": {
    "context\r": {
      "type": "DesignPackage\r",
      "!text": "The DesignPackage to which the built System should be added to\r"
    },
    "return-type\r": {
      "type": "System\r",
      "!text": "The built System\r"
    },
    "param": [
      {
        "!value": "name\r",
        "type": "String\r",
        "!text": "The name of the built System\r"
      },
      {
        "!value": "description\r",
        "type": "String\r",
        "!text": "The description of the built System\r"
      }
    ],
    "comments\r": {
      "!text": "Builds a new System with given name and description, adds it to the context DesignPackage and returns it \r\n<br> The built System is initialised with an ID using GetID()\r"
    }
  },
  "BuildSystem(2)\r": {
    "context\r": {
      "type": "DesignPackage\r",
      "!text": "The DesignPackage to which the built System should be added to\r"
    },
    "return-type\r": {
      "type": "System\r",
      "!text": "The built System\r"
    },
    "param": [
      {
        "!value": "name\r",
        "type": "String\r",
        "!text": "The name of the built System\r"
      },
      {
        "!value": "description\r",
        "type": "String\r",
        "!text": "The description of the built System\r"
      },
      {
        "!value": "parentSystem\r",
        "type": "System\r",
        "!text": "The parent system under which the built System is added\r"
      }
    ],
    "comments\r": {
      "!text": "Builds a new System with given name and description, adds it to the context DesignPackage and returns it \r\n<br> The built System is initialised with an ID using GetID() \r\n<br> Adds the built System under the parentSystem's subSystems\r"
    }
  },
  "BuildFunction\r": {
    "context\r": {
      "type": "DesignPackage\r",
      "!text": "The DesignPackage to which the built Function should be added to\r"
    },
    "return-type\r": {
      "type": "Function\r",
      "!text": "The built Function\r"
    },
    "param": [
      {
        "!value": "name\r",
        "type": "String\r",
        "!text": "The name of the built Function\r"
      },
      {
        "!value": "description\r",
        "type": "String\r",
        "!text": "The description of the built Function\r"
      }
    ],
    "comments\r": {
      "!text": "Builds a new Function with given name and description, adds it to the context DesignPackage and returns it \r\n<br> The built Function is initialised with an ID using GetID()\r"
    }
  },
  "BuildPort(1)\r": {
    "context\r": {
      "type": "System\r",
      "!text": "The System to which the built Port should be added to\r"
    },
    "return-type\r": {
      "type": "Port\r",
      "!text": "The built Port\r"
    },
    "param": [
      {
        "!value": "name\r",
        "type": "String\r",
        "!text": "The name of the built Port\r"
      },
      {
        "!value": "description\r",
        "type": "String\r",
        "!text": "The description of the built Port\r"
      }
    ],
    "comments\r": {
      "!text": "Builds a new Port with given name and description, adds it to the context System's ports and returns it \r\n<br> The built Port is initialised with an ID using GetID()\r"
    }
  },
  "BuildPort(2)\r": {
    "context\r": {
      "type": "System\r",
      "!text": "The System to which the built Port should be added to\r"
    },
    "return-type\r": {
      "type": "Port\r",
      "!text": "The built Port\r"
    },
    "param": [
      {
        "!value": "name\r",
        "type": "String\r",
        "!text": "The name of the built Port\r"
      },
      {
        "!value": "description\r",
        "type": "String\r",
        "!text": "The description of the built Port\r"
      },
      {
        "!value": "direction\r",
        "type": "String\r",
        "!text": "The direction (\"IN\", \"OUT\", \"INOUT\") of the Port\r"
      }
    ],
    "comments\r": {
      "!text": "Builds a new Port with given name and description, adds it to the context System's ports and returns it \r\n<br> The built Port is initialised with an ID using GetID()\r\n<br> Also sets the Port's direction\r"
    }
  },
  "BuildPort(3)\r": {
    "context\r": {
      "type": "Function\r",
      "!text": "The Function to which the built Port should be added to\r"
    },
    "return-type\r": {
      "type": "Port\r",
      "!text": "The built Port\r"
    },
    "param": [
      {
        "!value": "name\r",
        "type": "String\r",
        "!text": "The name of the built Port\r"
      },
      {
        "!value": "description\r",
        "type": "String\r",
        "!text": "The description of the built Port\r"
      },
      {
        "!value": "direction\r",
        "type": "String\r",
        "!text": "The direction (\"IN\", \"OUT\", \"INOUT\") of the Port\r"
      }
    ],
    "comments\r": {
      "!text": "Builds a new Port with given name and description, adds it to the context Function's ports and returns it \r\n<br> The built Port is initialised with an ID using GetID() \r\n<br> Also sets the Port's direction\r"
    }
  },
  "SetDirection\r": {
    "context\r": {
      "type": "Port\r",
      "!text": "The Port whose direction is set\r"
    },
    "param": {
      "!value": "direction\r",
      "type": "String\r",
      "!text": "The direction (\"IN\", \"OUT\", \"INOUT\") to be set\r"
    },
    "comments\r": {
      "!text": "Sets the direction of the context Port \r\n<br> \"INOUT\" is assumed if the input does not match the other options\r"
    }
  },
  "BuildSignal(1)\r": {
    "context\r": {
      "type": "System\r",
      "!text": "The System to which the Signal will be added\r"
    },
    "return-type\r": {
      "type": "Signal\r",
      "!text": "The built Signal\r"
    },
    "param": [
      {
        "!value": "name\r",
        "type": "String\r",
        "!text": "The name of the built String\r"
      },
      {
        "!value": "description\r",
        "type": "String\r",
        "!text": "The description of the built String\r"
      },
      {
        "!value": "fromPort\r",
        "type": "Port\r",
        "!text": "The Port from which the built Signal originates\r"
      },
      {
        "!value": "toPort\r",
        "type": "Port\r",
        "!text": "The Port to which the built Signal connects\r"
      }
    ],
    "comments\r": {
      "!text": "Builds a Signal connecting two Ports, adding it under the context System's signals and returns it \r\n<br> The built Signal is initialised with an ID using GetID()\r"
    }
  },
  "BuildSignal(2)\r": {
    "context\r": {
      "type": "System\r",
      "!text": "The System to which the Signal will be added\r"
    },
    "return-type\r": {
      "type": "Signal\r",
      "!text": "The built Signal\r"
    },
    "param": [
      {
        "!value": "fromPort\r",
        "type": "Port\r",
        "!text": "The Port from which the built Signal originates\r"
      },
      {
        "!value": "toPort\r",
        "type": "Port\r",
        "!text": "The Port to which the built Signal connects\r"
      }
    ],
    "comments\r": {
      "!text": "Builds a Signal connecting two Ports, adding it under the context System's signals and returns it \r\n<br> The built Signal is initialised with an ID using GetID()\r"
    }
  },
  "AddFailureModel\r": {
    "context\r": {
      "type": "System\r",
      "!text": "The System to which the FailureModel will be added\r"
    },
    "param": {
      "!value": "fm\r",
      "type": "FailureModel\r",
      "!text": "The FailureModel to be added to the context System\r"
    },
    "comments\r": {
      "!text": "Adds the input FailureModel under the context System's failureModels\r"
    }
  },
  "AddFailure(1)\r": {
    "context\r": {
      "type": "Port\r",
      "!text": "The Port to which the Failure will be added\r"
    },
    "param": {
      "!value": "f\r",
      "type": "Failure\r",
      "!text": "The Failure to be added to the Port\r"
    },
    "comments\r": {
      "!text": "Adds the input Failure to the context Port\r"
    }
  },
  "AddFailure(2)\r": {
    "context\r": {
      "type": "Port\r",
      "!text": "The Port to which the Cause will be added\r"
    },
    "param": {
      "!value": "f\r",
      "type": "Cause\r",
      "!text": "The Cause to be added to the Port\r"
    },
    "comments\r": {
      "!text": "Adds the input Cause to the context Port\r"
    }
  },
  "BuildFaultTree(1)\r": {
    "context\r": {
      "type": "FailureLogicPackage\r",
      "!text": "The FailureLogicPackage under which the built FaultTree is to be added\r"
    },
    "return-type\r": {
      "type": "FaultTree\r",
      "!text": "The built FaultTree\r"
    },
    "param": {
      "!value": "name\r",
      "type": "String\r",
      "!text": "The name of the built FaultTree\r"
    },
    "comments\r": {
      "!text": "Builds a FaultTree, adds it under the context FailureLogicPackage and returns it \r\n<br> The built FaultTree is initialised with an ID using GetID()\r"
    }
  },
  "BuildFaultTree(2)\r": {
    "context\r": {
      "type": "FailureLogicPackage\r",
      "!text": "The FailureLogicPackage under which the built FaultTree is to be added\r"
    },
    "return-type\r": {
      "type": "FaultTree\r",
      "!text": "The built FaultTree\r"
    },
    "param": [
      {
        "!value": "name\r",
        "type": "String\r",
        "!text": "The name of the built FaultTree\r"
      },
      {
        "!value": "parent\r",
        "type": "FailureModel\r",
        "!text": "The FailureModel under which the built FaultTree is to be added\r"
      }
    ],
    "comments\r": {
      "!text": "Builds a FaultTree, adds it under the context FailureLogicPackage and the FailureModel and returns it \r\n<br> The built FaultTree is initialised with an ID using GetID()\r"
    }
  },
  "BuildFailure\r": {
    "context\r": {
      "type": "FailureModel\r",
      "!text": "The FailureModel under which the built Failure is to be added\r"
    },
    "return-type\r": {
      "type": "Failure\r",
      "!text": "The built Failure\r"
    },
    "param": [
      {
        "!value": "name\r",
        "type": "String\r",
        "!text": "The name of the built Failure\r"
      },
      {
        "!value": "description\r",
        "type": "String\r",
        "!text": "The description of the built Failure\r"
      },
      {
        "!value": "failureClass\r",
        "type": "String\r",
        "!text": "The class of the built Failure\r"
      },
      {
        "!value": "failureRate\r",
        "type": "Real\r",
        "!text": "The failure rate of the built Failure\r"
      }
    ],
    "comments\r": {
      "!text": "Builds a Failure, adds it to the context FailureModel and returns it \r\n<br> The Failure is initialised with an ID using GetID()\r"
    }
  },
  "BuildGate(1)\r": {
    "context\r": {
      "type": "FaultTree\r",
      "!text": "The FaultTree under which the built Gate is to be added\r"
    },
    "return-type\r": {
      "type": "Gate\r",
      "!text": "The built Gate\r"
    },
    "param": [
      {
        "!value": "name\r",
        "type": "String\r",
        "!text": "The name of the built Gate\r"
      },
      {
        "!value": "gateType\r",
        "type": "String\r",
        "!text": "The type of the built Gate, set using SetGateType\r"
      }
    ],
    "comments\r": {
      "!text": "Builds a Gate, adds it to the context FaultTree and returns it \r\n<br> The built Gate is initialised with an ID usign GetID()\r"
    }
  },
  "BuildGate(2)\r": {
    "context\r": {
      "type": "FaultTree\r",
      "!text": "The FaultTree under which the built Gate is to be added\r"
    },
    "return-type\r": {
      "type": "Gate\r",
      "!text": "The built Gate\r"
    },
    "param": {
      "!value": "gateType\r",
      "type": "String\r",
      "!text": "The type of the built Gate, set using SetGateType\r"
    },
    "comments\r": {
      "!text": "Builds a Gate, adds it to the context FaultTree and returns it \r\n<br> The built Gate is initialised with an ID usign GetID()\r"
    }
  },
  "AddCause\r": {
    "context\r": {
      "type": "Gate\r",
      "!text": "The Gate under which the built Cause will be added\r"
    },
    "param": {
      "!value": "c\r",
      "type": "Cause\r",
      "!text": "The Cause to be added to the context Gate\r"
    },
    "comments\r": {
      "!text": "Adds a Cause to the context Gate\r"
    }
  },
  "BuildBasicEvent\r": {
    "context\r": {
      "type": "FaultTree\r",
      "!text": "The FaultTree under which the built BasicEvent is to be added\r"
    },
    "return-type\r": {
      "type": "Cause\r",
      "!text": "The built Cause\r"
    },
    "param": [
      {
        "!value": "name\r",
        "type": "String\r",
        "!text": "The name of the built BasicEvent\r"
      },
      {
        "!value": "description\r",
        "type": "String\r",
        "!text": "The description of the built BasicEvent\r"
      },
      {
        "!value": "failureClass\r",
        "type": "String\r",
        "!text": "The failure class of the built BasicEvent\r"
      },
      {
        "!value": "failureRate\r",
        "type": "Real\r",
        "!text": "The failure rate of the built BasicEvent\r"
      },
      {
        "!value": "isCCF\r",
        "type": "Boolean\r",
        "!text": "Whether the built BasicEvent is a Common Cause Failure\r"
      }
    ],
    "comments\r": {
      "!text": "Builds a BasicEvent, adds it under the context FaultTree and returns it \r\n<br> The built BasicEvent is initialised with an ID using GetID()\r"
    }
  },
  "BuildInputEvent\r": {
    "context\r": {
      "type": "FaultTree\r",
      "!text": "The FaultTree under which the built Gate(InputEvent) is to be added\r"
    },
    "return-type\r": {
      "type": "Gate\r",
      "!text": "The built Gate(InputEvent)\r"
    },
    "param": [
      {
        "!value": "name\r",
        "type": "String\r",
        "!text": "The name of the built Gate\r"
      },
      {
        "!value": "description\r",
        "type": "String\r",
        "!text": "The description of the built Gate\r"
      },
      {
        "!value": "failureClass\r",
        "type": "String\r",
        "!text": "The failure class of the built Gate\r"
      },
      {
        "!value": "failureRate\r",
        "type": "Real\r",
        "!text": "The failure rate of the built Gate\r"
      },
      {
        "!value": "isCCF\r",
        "type": "Boolean\r",
        "!text": "Whether the built Gate is also a Common Cause Failure\r"
      }
    ],
    "comments\r": {
      "!text": "Builds a Gate(InputEvent), adds it under the FaultTree and returns it \r\n<br> The build Gate is initialised with an ID using GetID()\r"
    }
  },
  "BuildOutputEvent\r": {
    "context\r": {
      "type": "FaultTree\r",
      "!text": "The FaultTree under which the built Gate(OutputEvent) is to be added\r"
    },
    "return-type\r": {
      "type": "Gate\r",
      "!text": "The built Gate(OutputEvent)\r"
    },
    "param": [
      {
        "!value": "name\r",
        "type": "String\r",
        "!text": "The name of the built Gate\r"
      },
      {
        "!value": "description\r",
        "type": "String\r",
        "!text": "The description of the built Gate\r"
      },
      {
        "!value": "failureClass\r",
        "type": "String\r",
        "!text": "The failure class of the built Gate\r"
      },
      {
        "!value": "failureRate\r",
        "type": "Real\r",
        "!text": "The failure rate of the built Gate\r"
      },
      {
        "!value": "isCCF\r",
        "type": "Boolean\r",
        "!text": "Whether the built Gate is also a Common Cause Failure\r"
      }
    ],
    "comments\r": {
      "!text": "Builds a Gate(OutputEvent), adds it under the FaultTree and returns it \r\n<br> The build Gate is initialised with an ID using GetID()\r"
    }
  },
  "SetOriginType\r": {
    "context\r": {
      "type": "Failure\r",
      "!text": "Sets the origin type of the context Failure\r"
    },
    "param": {
      "!value": "originType\r",
      "type": "String\r",
      "!text": "The origin type (\"INPUT\", \"OUTPUT\", \"INTERNAL\") the context Failure should be set to\r"
    },
    "comments\r": {
      "!text": "Sets the Failure to the origin type (\"INPUT\", \"OUTPUT\", \"INTERNAL\") \r\n<br> Set by default to \"INTERNAL\" if the other options are not chosen instead\r"
    }
  },
  "SetGateType\r": {
    "context\r": {
      "type": "Gate\r",
      "!text": "The Gate whose type should be set\r"
    },
    "param": {
      "!value": "gateType\r",
      "type": "String\r",
      "!text": "The type the context Gate should be set to\r"
    },
    "comments\r": {
      "!text": "The type (\"OR\", \"AND\", \"NOT\", \"XOR\", \"VOTE\", \"PAND\", \"SAND\", \"INPUT\", \"OUTPUT\") the context Gate should be set to \r\n<br> Defaults to \"OUTPUT\" if the other options are not chosen\r"
    }
  },
  "SetCauseType\r": {
    "context\r": {
      "type": "Cause\r",
      "!text": "The Cause whose type should be set\r"
    },
    "param": {
      "!value": "causeType\r",
      "type": "String\r",
      "!text": "The type (\"INPUT\", \"OUTPUT\", \"GATE\", \"INTERNAL\") the context Cause should be set to\r"
    },
    "comments\r": {
      "!text": "Sets the type of the context Cause to one of the mentioned options \r\n<br> If no other options match, defaults to \"INTERNAL\"\r"
    }
  },
  "BuildHazardType\r": {
    "context": {
      "!value": "\r",
      "type": "HARAPackage\r",
      "!text": "The HARAPackage under which the built HazardType should be added\r"
    },
    "return-type\r": {
      "type": "HazardType\r",
      "!text": "The built HazardType\r"
    },
    "param": [
      {
        "!value": "name\r",
        "type": "String\r",
        "!text": "The name of the built HazardType\r"
      },
      {
        "!value": "description\r",
        "type": "String\r",
        "!text": "The description of the built HazardType\r"
      }
    ],
    "comments\r": {
      "!text": "Builds a HazardType, adds it to the HARAPackage and returns it \r\n<br> The built HazardType is initialised with an ID using GetID()\r"
    }
  },
  "BuildHazard\r": {
    "context\r": {
      "type": "HARAPackage\r",
      "!text": "The HARAPackage under which the built Hazard should be added\r"
    },
    "return-type\r": {
      "type": "Hazard\r",
      "!text": "The built Hazard\r"
    },
    "param": [
      {
        "!value": "name\r",
        "type": "String\r",
        "!text": "The name of the built Hazard\r"
      },
      {
        "!value": "description\r",
        "type": "String\r",
        "!text": "The desription of the built Hazard\r"
      },
      {
        "!value": "condition\r",
        "type": "String\r",
        "!text": "The condition of the built Hazard\r"
      },
      {
        "!value": "hazardType\r",
        "type": "HazardType\r",
        "!text": "The HazardType of the built Hazard\r"
      },
      {
        "!value": "failures\r",
        "type": "Collection\r",
        "!text": "A Collection containing Failures to be added to the Hazard\r"
      },
      {
        "!value": "measures\r",
        "type": "Collection\r",
        "!text": "A Collection containing Measures to be added to the Hazard\r"
      }
    ],
    "comments\r": {
      "!text": "Builds a Hazard, adds it to the context HARAPackage and returns it \r\n<br> The built Hazard is initialised with an ID using GetID() \r"
    }
  },
  "BuildMalfunction\r": {
    "context\r": {
      "type": "HARAPackage\r",
      "!text": "The HARAPackage under which the built Malfunction should be added\r"
    },
    "return-type\r": {
      "type": "Malfunction\r",
      "!text": "The built Malfunction\r"
    },
    "param": [
      {
        "!value": "name\r",
        "type": "String\r",
        "!text": "The name of the built Malfunction\r"
      },
      {
        "!value": "description\r",
        "type": "String\r",
        "!text": "The description of the built Malfunction\r"
      },
      {
        "!value": "hazards\r",
        "type": "Collection\r",
        "!text": "A Collection of Hazards to be added to the built Malfunction\r"
      }
    ],
    "comments\r": {
      "!text": "Builds a Malfunction, adds it to the context HARAPackage and returns it \r\n<br> The built Malfunction is initialised with an ID using GetID()\r"
    }
  },
  "SetName\r": {
    "context\r": {
      "type": "ModelElement\r",
      "!text": "The ModelElement whose 'name' should be set\r"
    },
    "param": {
      "!value": "input\r",
      "type": "String\r",
      "!text": "The name of the ModelElement\r"
    },
    "comments\r": {
      "!text": "Sets the 'name' of a ModelElement; given ModelElements do not have an explicit 'name' property, \r\n<br> the name is set as a LangString and added to the ModelElement. \r\n<br> The LangString's lang is 'en' and its content is the name\r"
    }
  },
  "BuildLangString(1)\r": {
    "return-type\r": {
      "type": "LangString\r",
      "!text": "The built LangString\r"
    },
    "param": [
      {
        "!value": "content\r",
        "type": "String\r",
        "!text": "The content of the LangString\r"
      },
      {
        "!value": "lang\r",
        "type": "String\r",
        "!text": "The language of the LangString e.g. 'eng' for english\r"
      }
    ],
    "comments\r": {
      "!text": "Builds a LangString\r"
    }
  },
  "BuildLangString(2)\r": {
    "context\r": {
      "type": "MultiLangString\r",
      "!text": "The MultiLangString to which the built LangString will be added\r"
    },
    "return-type\r": {
      "type": "LangString\r",
      "!text": "The built LangString\r"
    },
    "param": [
      {
        "!value": "content\r",
        "type": "String\r",
        "!text": "The content of the LangString\r"
      },
      {
        "!value": "lang\r",
        "type": "String\r",
        "!text": "The language of the LangString e.g. 'eng' for english\r"
      }
    ],
    "comments\r": {
      "!text": "Builds a LangString, adds it to the context MultiLangString\r"
    }
  },
  "BuildTaggedValue\r": {
    "context\r": {
      "type": "ModelElement\r",
      "!text": "The ModelElement to which the constructed TaggedValue will be added\r"
    },
    "return-type\r": {
      "type": "TaggedValue\r",
      "!text": "The built TaggedValue\r"
    },
    "param": [
      {
        "!value": "key\r",
        "type": "String\r",
        "!text": "The 'key' of the TaggedValue\r"
      },
      {
        "!value": "value\r",
        "type": "String\r",
        "!text": "The 'value' of the TaggedValue\r"
      }
    ],
    "comments\r": {
      "!text": "Builds a TaggedValue, adds it to the context ModelElement and returns it \r\n<br> Note that a MultiLangString does not have an explicit 'key' or 'value' property; \r\n<br> the key is set as the lang of a LangString contained in the MultiLangString, the 'value' being the content \r\n<br> The built TaggedValue is initialised with an ID using GetID() \r"
    }
  },
  "HasTaggedValue\r": {
    "context\r": {
      "type": "ModelElement\r",
      "!text": "The ModelElement whose TaggedValues are being queried\r"
    },
    "return-type\r": {
      "type": "Boolean\r",
      "!text": "Returns 'true' if the context ModelElement has 1+ TaggedValues whose name equals the parameter <br>\r\nReturns 'false' otherwise\r"
    },
    "param": {
      "!value": "name\r",
      "type": "String\r",
      "!text": "The name being searched for in TaggedValues of the context ModelElement\r"
    },
    "comments\r": {
      "!text": "Searches across the context ModelElement's TaggedValues to find whether \r\n<br> there is at least one with the same name as the parameter\r"
    }
  },
  "BuildExpressionLangString\r": {
    "return-type\r": {
      "type": "ExpressionLangString\r",
      "!text": "The built ExpressionLangString\r"
    },
    "param": {
      "!value": "expression\r",
      "type": "ExpressionElement\r",
      "!text": "The Expression to be referenced by the ExpressionLangString\r"
    },
    "comments\r": {
      "!text": "Builds an ExpressionLangString referencing the input ExpressionElement\r"
    }
  },
  "SetDescription\r": {
    "context\r": {
      "type": "ModelElement\r"
    },
    "param": {
      "!value": "input\r",
      "type": "String\r",
      "!text": "The description of the context ModelElement\r"
    },
    "comments\r": {
      "!text": "Sets the context ModelElement's Description, contained in a\r\n<br> MultiLangString and then LangString\r\n<br> The LangString language is set to be 'en'\r"
    }
  },
  "BuildGoal(1)\r": {
    "context\r": {
      "type": "ArgumentPackage\r",
      "!text": "The ArgumentPackage to which the built Claim(Goal) will be added\r"
    },
    "return-type\r": {
      "type": "Claim\r",
      "!text": "The built Claim(Goal)\r"
    },
    "param": [
      {
        "!value": "name\r",
        "type": "String\r",
        "!text": "The title of the Claim(Goal)\r"
      },
      {
        "!value": "description\r",
        "type": "String\r",
        "!text": "The description/content of the Claim(Goal)\r"
      }
    ],
    "comments\r": {
      "!text": "Builds a Claim(Goal), adds it to the context ArgumentPackage and returns it \r\n<br> The built Claim(Goal) is initialised with an ID using GetID()\r"
    }
  },
  "BuildGoal(2)\r": {
    "context\r": {
      "type": "ArgumentPackage\r",
      "!text": "The ArgumentPackage to which the built Claim(Goal) will be added\r"
    },
    "return-type\r": {
      "type": "Claim\r",
      "!text": "The built Claim(Goal)\r"
    },
    "param": [
      {
        "!value": "name\r",
        "type": "String\r",
        "!text": "The title of the Claim(Goal)\r"
      },
      {
        "!value": "description\r",
        "type": "Collection\r",
        "!text": "A Collection of 'desriptions' to be set as the Claim(Goal)'s description/content\r"
      }
    ],
    "comments\r": {
      "!text": "Builds a Claim(Goal), adds it to the context ArgumentPackage and returns it \r\n<br> The built Claim(Goal) is initialised with an ID using GetID() \r\n<br> This variant enables convenient construction of Claims(Goals) which have abstract descriptions, consisting of multiple LangString and ExpressionLangStrings\r"
    }
  },
  "BuildAssumption\r": {
    "context\r": {
      "type": "ArgumentPackage\r",
      "!text": "The ArgumentPackage that will contain the built Claim(Assumption)\r"
    },
    "return-type\r": {
      "type": "Claim\r",
      "!text": "The built Claim(Assumption)\r"
    },
    "param": [
      {
        "!value": "name\r",
        "type": "String\r",
        "!text": "The name of the built Claim(Assumption)\r"
      },
      {
        "!value": "description\r",
        "type": "String\r",
        "!text": "The description of the built Claim(Assumption)\r"
      }
    ],
    "comments\r": {
      "!text": "Builds a Claim(Assumption), with the assertionDeclaration property set to 'assumed' \r\n<br> Adds it to the context ArgumentPackage and returns it \r\n<br> The built Claim(Assumption) is initialised with an ID using GetID()\r"
    }
  },
  "BuildJustification\r": {
    "context\r": {
      "type": "ArgumentPackage\r",
      "!text": "The ArgumentPackage that will contain the built Claim(Justification)\r"
    },
    "return-type\r": {
      "type": "Claim\r",
      "!text": "The built Claim(Justification)\r"
    },
    "param": [
      {
        "!value": "name\r",
        "type": "String\r",
        "!text": "The name of the built Claim(Justification)\r"
      },
      {
        "!value": "description\r",
        "type": "String\r",
        "!text": "The description of the built Claim(Justification)\r"
      }
    ],
    "comments\r": {
      "!text": "Builds a Claim(Justification), with the assertionDeclaration property set to 'axiomatic' \r\n<br> Adds it to the context ArgumentPackage and returns it \r\n<br> The built Claim(Justification) is initialised with an ID using GetID()\r"
    }
  },
  "BuildStrategy(1)\r": {
    "context\r": {
      "type": "ArgumentPackage\r",
      "!text": "The ArgumentPackage that will contain the built AssertedInference(Strategy)\r"
    },
    "return-type\r": {
      "type": "AssertedInference\r",
      "!text": "The built AssertedInference(Strategy)\r"
    },
    "param": [
      {
        "!value": "name\r",
        "type": "String\r",
        "!text": "The name of the built AssertedInference(Strategy)\r"
      },
      {
        "!value": "description\r",
        "type": "String\r",
        "!text": "The description of the built AssertedInference(Strategy)\r"
      }
    ],
    "comments\r": {
      "!text": "Builds an AssertedInference(Strategy), adds it to the context ArgumentPackage and returns it \r\n<br> Internally builds an ArgumentReasoning, sets its name and description using the parameters and adds it to the AssertedInference(Strategy) \r\n<br> The built AssertedInference(Strategy) is initialised with an ID using GetID()\r"
    }
  },
  "BuildStrategy(2)\r": {
    "context\r": {
      "type": "ArgumentPackage\r",
      "!text": "The ArgumentPackage that will contain the built AssertedInference(Strategy)\r"
    },
    "return-type\r": {
      "type": "AssertedInference\r",
      "!text": "The built AssertedInference(Strategy)\r"
    },
    "param": [
      {
        "!value": "name\r",
        "type": "String\r",
        "!text": "The name of the built AssertedInference(Strategy)\r"
      },
      {
        "!value": "description\r",
        "type": "Collection\r",
        "!text": "A Collection of descriptions of the built AssertedInference(Strategy)\r"
      }
    ],
    "comments\r": {
      "!text": "Builds an AssertedInference(Strategy), adds it to the context ArgumentPackage and returns it \r\n<br> Internally builds an ArgumentReasoning, sets its name and description using the parameters and adds it to the AssertedInference(Strategy) \r\n<br> The built AssertedInference(Strategy) is initialised with an ID using GetID() \r\n<br> This variant allows convenient construction of AssertedInferences(Strategies) containing abstract descriptions, consisting of multiple LangString and ExpressionLangStrings\r"
    }
  },
  "BuildContext\r": {
    "context\r": {
      "type": "ArgumentPackage\r",
      "!text": "The ArgumentPackage that will contain the built ArtifactReference(Context)\r"
    },
    "return-type\r": {
      "type": "ArtifactReference\r",
      "!text": "The built ArtifactReference(Context)\r"
    },
    "param": [
      {
        "!value": "name\r",
        "type": "String\r",
        "!text": "The name of the built ArtifactReference(Context)\r"
      },
      {
        "!value": "description\r",
        "type": "String\r",
        "!text": "The description of the built ArtifactReference(Context)\r"
      }
    ],
    "comments\r": {
      "!text": "Builds an ArtifactReference(Context), adds it to the context ArgumentPackage and returns it \r\n<br> The built ArtifactReference(Context) is initialised with an ID using GetID()\r"
    }
  },
  "BuildSolution\r": {
    "context\r": {
      "type": "ArgumentPackage\r",
      "!text": "The ArgumentPackage that will contain the built ArtifactReference(Solution)\r"
    },
    "return-type\r": {
      "type": "ArtifactReference\r",
      "!text": "The built ArtifactReference(Solution)\r"
    },
    "param": [
      {
        "!value": "name\r",
        "type": "String\r",
        "!text": "The name of the built ArtifactReference(Solution)\r"
      },
      {
        "!value": "description\r",
        "type": "String\r",
        "!text": "The description of the built ArtifactReference(Solution)\r"
      }
    ],
    "comments\r": {
      "!text": "Builds an ArtifactReference(Solution), adds it to the context ArgumentPackage and returns it \r\n<br> The built ArtifactReference(Solution) is initialised with an ID using GetID()\r"
    }
  },
  "BuildArtifact\r": {
    "context\r": {
      "type": "ArtifactPackage\r",
      "!text": "The ArtifactPackage that will contain the built Artifact\r"
    },
    "return-type\r": {
      "type": "Artifact\r",
      "!text": "The built Artifact\r"
    },
    "param": [
      {
        "!value": "name\r",
        "type": "String\r",
        "!text": "The name of the built Artifact\r"
      },
      {
        "!value": "description\r",
        "type": "String\r",
        "!text": "The description of the built Artifact\r"
      },
      {
        "!value": "version\r",
        "type": "String\r",
        "!text": "Version of the built Artifact\r"
      },
      {
        "!value": "date\r",
        "type": "String\r",
        "!text": "Date of the built Artifact\r"
      }
    ],
    "comments\r": {
      "!text": "Builds an Artifact, adds it to the context ArtifactPackage and returns it \r\n<br> The built Artifact is initialised with an ID using GetID() \r\n<br> The date is converted using java.util.Date for parsing the parameter\r"
    }
  },
  "BuildActivity\r": {
    "context\r": {
      "type": "ArtifactPackage\r",
      "!text": "The ArtifactPackage that will contain the built Activity\r"
    },
    "return-type\r": {
      "type": "Activity\r",
      "!text": "The built Activity\r"
    },
    "param": [
      {
        "!value": "name\r",
        "type": "String\r",
        "!text": "The name of the built Activity\r"
      },
      {
        "!value": "description\r",
        "type": "String\r",
        "!text": "The description of the built Activity\r"
      },
      {
        "!value": "startTime\r",
        "type": "String\r",
        "!text": "Start time of the built Activity\r"
      },
      {
        "!value": "endTime\r",
        "type": "String\r",
        "!text": "End time of the built Activity\r"
      }
    ],
    "comments\r": {
      "!text": "Builds an Activity, adds it to the context ArtifactPackage and returns it \r\n<br> The built Activity is initialised with an ID using GetID() \r\n<br> The startTime and endTime are converted using java.util.Date for parsing the parameters\r"
    }
  },
  "BuildEvent\r": {
    "context\r": {
      "type": "ArtifactPackage\r",
      "!text": "The ArtifactPackage that will contain the built Event\r"
    },
    "return-type\r": {
      "type": "Event\r",
      "!text": "The built Event\r"
    },
    "param": [
      {
        "!value": "name\r",
        "type": "String\r",
        "!text": "The name of the built Event\r"
      },
      {
        "!value": "description\r",
        "type": "String\r",
        "!text": "The description of the built Event\r"
      },
      {
        "!value": "occurence\r",
        "type": "String\r",
        "!text": "Occurence of the built Event\r"
      }
    ],
    "comments\r": {
      "!text": "Builds an Event, adds it to the context ArtifactPackage and returns it \r\n<br> The built Event is initialised with an ID using GetID() \r\n<br> The occurence is converted using java.util.Date for parsing the parameter\r"
    }
  },
  "LinkStrategyToContexts\r": {
    "context\r": {
      "type": "ArgumentPackage\r",
      "!text": "The ArgumentPackage to which the created AssertedContext will be added\r"
    },
    "return-type\r": {
      "type": "AssertedContext\r",
      "!text": "The AssertedContext linking the AssertedInference(Strategy) and Collection of ArtifactReferences(Contexts)\r"
    },
    "param": [
      {
        "!value": "s\r",
        "type": "AssertedInference\r",
        "!text": "The AssertedInference(Strategy) to be linked to the Collection of ArtifactReferences(Contexts)\r"
      },
      {
        "!value": "c\r",
        "type": "Collection\r",
        "!text": "A Collection of ArtifactReferences(Contexts) to be linked to\r"
      },
      {
        "!value": "name\r",
        "type": "String\r",
        "!text": "The name of the created AssertedContext\r"
      },
      {
        "!value": "description\r",
        "type": "String\r",
        "!text": "The description of the created AssertedContext\r"
      }
    ],
    "comments\r": {
      "!text": "Links an AssertedInference(Strategy) to a Collection of ArtifactReferences(Contexts) by creating an AssertedContext \r\n<br> The Strategy is the target of the AssertedContext, the linked Contexts are the source \r\n<br> The created AssertedContext is initialised with an ID using GetID()\r"
    }
  },
  "LinkStrategyToContext\r": {
    "context\r": {
      "type": "ArgumentPackage\r",
      "!text": "The ArgumentPackage to which the created AssertedContext will be added\r"
    },
    "return-type\r": {
      "type": "AssertedContext\r",
      "!text": "The AssertedContext linking the AssertedInference(Strategy) and ArtifactReference(Context)\r"
    },
    "param": [
      {
        "!value": "s\r",
        "type": "AssertedInference\r",
        "!text": "The AssertedInference(Strategy) to be linked to the ArtifactReference(Context)\r"
      },
      {
        "!value": "c\r",
        "type": "ArtifactReference\r",
        "!text": "An ArtifactReference(Context) to be linked to\r"
      },
      {
        "!value": "name\r",
        "type": "String\r",
        "!text": "The name of the created AssertedContext\r"
      },
      {
        "!value": "description\r",
        "type": "String\r",
        "!text": "The description of the created AssertedContext\r"
      }
    ],
    "comments\r": {
      "!text": "Links an AssertedInference(Strategy) to an ArtifactReference(Context) by creating an AssertedContext \r\n<br> The Strategy is the target of the AssertedContext, the linked Context is the source \r\n<br> The created AssertedContext is initialised with an ID using GetID()\r"
    }
  },
  "LinkGoalToGoals(1)\r": {
    "context\r": {
      "type": "ArgumentPackage\r",
      "!text": "The ArgumentPackage to which the created AssertedInference(Strategy) will be added\r"
    },
    "return-type\r": {
      "type": "AssertedInference\r",
      "!text": "The AssertedInference linking the Claims(Goals)\r"
    },
    "param": [
      {
        "!value": "target\r",
        "type": "Claim\r",
        "!text": "The Claim(Goal) to be linked to by the Collection of Claims(Goals)\r"
      },
      {
        "!value": "subGoals\r",
        "type": "Collection\r",
        "!text": "A Collection of Claims(Goals) to be linked to the target Claim\r"
      },
      {
        "!value": "strategyName\r",
        "type": "String\r",
        "!text": "The name of the created AssertedInference(Strategy)\r"
      },
      {
        "!value": "strategyDescription\r",
        "type": "String\r",
        "!text": "The description of the created AssertedInference(Strategy)\r"
      }
    ],
    "comments\r": {
      "!text": "Links a Claim(Goal) to a Collection of Claims(Goals) by creating an AssertedInference(Strategy) \r\n<br> The Claim is the target of the AssertedInference, the Collection of Claims are the source \r\n<br> The created AssertedInference is initialised with an ID using GetID()\r"
    }
  },
  "LinkGoalToGoals(2)\r": {
    "context\r": {
      "type": "ArgumentPackage\r",
      "!text": "The ArgumentPackage to which the created AssertedInference(Strategy) will be added\r"
    },
    "return-type\r": {
      "type": "AssertedInference\r",
      "!text": "The AssertedInference linking the Claims(Goals)\r"
    },
    "param": [
      {
        "!value": "target\r",
        "type": "Claim\r",
        "!text": "The Claim(Goal) to be linked to by the Collection of Claims(Goals)\r"
      },
      {
        "!value": "subGoals\r",
        "type": "Collection\r",
        "!text": "A Collection of Claims(Goals) to be linked to the target Claim\r"
      }
    ],
    "comments\r": {
      "!text": "Links a Claim(Goal) to a Collection of Claims(Goals) by creating an AssertedInference(Strategy) \r\n<br> The Claim is the target of the AssertedInference, the Collection of Claims are the source \r\n<br> The created AssertedInference is initialised with an ID using GetID() \r\n<br> This variation links the Claims(Goals) via an AssertedInference(Strategy) without a title or description\r"
    }
  },
  "LinkGoalToGoal\r": {
    "context\r": {
      "type": "ArgumentPackage\r",
      "!text": "The ArgumentPackage to which the created AssertedInference(Strategy) will be added\r"
    },
    "return-type\r": {
      "type": "AssertedInference\r",
      "!text": "The AssertedInference linking the Claims(Goals)\r"
    },
    "param": [
      {
        "!value": "target\r",
        "type": "Claim\r",
        "!text": "The Claim(Goal) to be linked to by the subGoal Claim(Goal)\r"
      },
      {
        "!value": "subGoal\r",
        "type": "Claim\r",
        "!text": "A Claim(Goal) to be linked to the target Claim\r"
      },
      {
        "!value": "strategyName\r",
        "type": "String\r",
        "!text": "The name of the created AssertedInference(Strategy)\r"
      },
      {
        "!value": "strategyDescription\r",
        "type": "String\r",
        "!text": "The description of the created AssertedInference(Strategy)\r"
      }
    ],
    "comments\r": {
      "!text": "Links a Claim(Goal) to a Claim(Goal) by creating an AssertedInference(Strategy) \r\n<br> The Claim is the target of the AssertedInference, the subGoal Claim is the source \r\n<br> The created AssertedInference is initialised with an ID using GetID()\r"
    }
  },
  "LinkGoalToEvidence(1)\r": {
    "context\r": {
      "type": "ArgumentPackage\r",
      "!text": "The ArgumentPackage to which the created AssertedEvidence will be added\r"
    },
    "return-type\r": {
      "type": "AssertedEvidence\r",
      "!text": "The AssertedEvidence linking the Claim(Goal) with the ArtifactReferences(Evidence)\r"
    },
    "param": [
      {
        "!value": "target\r",
        "type": "Claim\r",
        "!text": "The Claim(Goal) to be linked to the Collection of ArtifactReferences(Evidence)\r"
      },
      {
        "!value": "evidence\r",
        "type": "Collection\r",
        "!text": "A Collection of ArtifactReferences(Evidence) to be linked to the target Claim\r"
      }
    ],
    "comments\r": {
      "!text": "Links a Claim(Goal) to a Collection of ArtifactReferences(Evidence) by creating an AssertedEvidence \r\n<br> The Claim is the target of the AssertedEvidence, the Collection of Evidence are the source \r\n<br> The created AssertedEvidence is initialised with an ID using GetID()\r"
    }
  },
  "LinkGoalToEvidence(2)\r": {
    "context\r": {
      "type": "ArgumentPackage\r",
      "!text": "The ArgumentPackage to which the created AssertedEvidence will be added\r"
    },
    "return-type\r": {
      "type": "AssertedEvidence\r",
      "!text": "The AssertedEvidence linking the Claim(Goal) with the ArtifactReference(Evidence)\r"
    },
    "param": [
      {
        "!value": "target\r",
        "type": "Claim\r",
        "!text": "The Claim(Goal) to be linked to the ArtifactReference(Evidence)\r"
      },
      {
        "!value": "evidence\r",
        "type": "ArtifactReference\r",
        "!text": "An ArtifactReference(Evidence) to be linked to the target Claim\r"
      }
    ],
    "comments\r": {
      "!text": "Links a Claim(Goal) to an ArtifactReference(Evidence) by creating an AssertedEvidence \r\n<br> The Claim is the target of the AssertedEvidence, the Evidence is the source \r\n<br> The created AssertedEvidence is initialised with an ID using GetID()\r"
    }
  },
  "LinkGoalToContexts\r": {
    "context\r": {
      "type": "ArgumentPackage\r",
      "!text": "The ArgumentPackage to which the created AssertedContext will be added\r"
    },
    "return-type\r": {
      "type": "AssertedContext\r",
      "!text": "The AssertedContext linking the Claim(Goal) with the ArtifactReferences(Contexts)\r"
    },
    "param": [
      {
        "!value": "target\r",
        "type": "Claim\r",
        "!text": "The Claim(Goal) to be linked to the ArtifactReferences(Contexts)\r"
      },
      {
        "!value": "contexts\r",
        "type": "Collection\r",
        "!text": "A Collection of ArtifactReferences(Contexts) to be linked to the target Claim\r"
      }
    ],
    "comments\r": {
      "!text": "Links a Claim(Goal) to a Collection of ArtifactReferences(Contexts) by creating an AssertedContext \r\n<br> The Claim is the target of the AssertedContext, the Contexts are the source \r\n<br> The created AssertedContext is initialised with an ID using GetID()\r"
    }
  },
  "LinkGoalToContext\r": {
    "context\r": {
      "type": "ArgumentPackage\r",
      "!text": "The ArgumentPackage to which the created AssertedContext will be added\r"
    },
    "return-type\r": {
      "type": "AssertedContext\r",
      "!text": "The AssertedContext linking the Claim(Goal) with the ArtifactReference(Context)\r"
    },
    "param": [
      {
        "!value": "target\r",
        "type": "Claim\r",
        "!text": "The Claim(Goal) to be linked to the ArtifactReference(Context)\r"
      },
      {
        "!value": "context\r",
        "type": "ArtifactReference\r",
        "!text": "An ArtifactReference(Context) to be linked to the target Claim\r"
      }
    ],
    "comments\r": {
      "!text": "Links a Claim(Goal) to an ArtifactReference(Context) by creating an AssertedContext \r\n<br> The Claim is the target of the AssertedContext, the Context is the source \r\n<br> The created AssertedContext is initialised with an ID using GetID()\r"
    }
  },
  "LinkToArtifact\r": {
    "context\r": {
      "type": "ArtifactReference\r",
      "!text": "The ArtifactReference to be linked\r"
    },
    "param": {
      "!value": "target\r",
      "type": "ArtifactElement\r",
      "!text": "The ArtifactElement to be linked\r"
    },
    "comments\r": {
      "!text": "Links an ArtifactReference to a concrete ArtifactElement, adding it to the referenced list\r"
    }
  },
  "SetType\r": {
    "context\r": {
      "type": "Term\r",
      "!text": "The Term whose type is being set\r"
    },
    "param": {
      "!value": "type\r",
      "type": "String\r",
      "!text": "The type to set the Term to\r"
    },
    "comments\r": {
      "!text": "Sets the context Term's type; since a Term does not have an explicit type, \r\n<br> the type is set as the name of the Term using ModelElement::SetName\r"
    }
  },
  "GetType\r": {
    "context\r": {
      "type": "Term\r",
      "!text": "The Term whose type is retrieved\r"
    },
    "return-type\r": {
      "type": "String\r",
      "!text": "Returns the type of the Term\r"
    },
    "comments\r": {
      "!text": "See Term::SetType\r"
    }
  },
  "BuildTerm(1)\r": {
    "context\r": {
      "type": "TerminologyPackage\r",
      "!text": "The TerminologyPackage the built Term should be added to\r"
    },
    "return-type\r": {
      "type": "Term\r",
      "!text": "The built Term\r"
    },
    "param": {
      "!value": "name\r",
      "type": "String\r",
      "!text": "The name of the built Term\r"
    },
    "comments\r": {
      "!text": "Builds a Term, adds it to the context TerminologyPackage and returns it \r\n<br> The built Term is initialised with an ID using GetID() \r"
    }
  },
  "BuildTerm(2)\r": {
    "context\r": {
      "type": "TerminologyPackage\r",
      "!text": "The TerminologyPackage the built Term should be added to\r"
    },
    "return-type\r": {
      "type": "Term\r",
      "!text": "The built Term\r"
    },
    "param": [
      {
        "!value": "name\r",
        "type": "String\r",
        "!text": "The name of the built Term\r"
      },
      {
        "!value": "value\r",
        "type": "String\r",
        "!text": "The value of the built Term\r"
      }
    ],
    "comments\r": {
      "!text": "Builds a Term, adds it to the context TerminologyPackage and returns it \r\n<br> The built Term is initialised with an ID using GetID() \r\n<br> This variation also sets the Term's value\r"
    }
  },
  "BuildExpression(1)\r": {
    "context\r": {
      "type": "TerminologyPackage\r",
      "!text": "The TerminologyPackage the built Expression should be added to\r"
    },
    "return-type\r": {
      "type": "Expression\r",
      "!text": "The built Expression\r"
    },
    "param": {
      "!value": "name\r",
      "type": "String\r",
      "!text": "The name of the built Expression\r"
    },
    "comments\r": {
      "!text": "Builds an Expression, adds it to the context TerminologyPackage and returns it \r\n<br> The built Expression is initialised with an ID using GetID() \r"
    }
  },
  "BuildExpression(2)\r": {
    "context\r": {
      "type": "TerminologyPackage\r",
      "!text": "The TerminologyPackage the built Expression should be added to\r"
    },
    "return-type\r": {
      "type": "Expression\r",
      "!text": "The built Expression\r"
    },
    "param": [
      {
        "!value": "name\r",
        "type": "String\r",
        "!text": "The name of the built Expression\r"
      },
      {
        "!value": "expressions\r",
        "type": "Collection\r",
        "!text": "A Collection of ExpressionElements to be added under the Expression\r"
      }
    ],
    "comments\r": {
      "!text": "Builds an Expression, adds it to the context TerminologyPackage and returns it \r\n<br> The built Expression is initialised with an ID using GetID() \r\n<br> This variation adds a Collection of ExpressionElements under the built Expression\r"
    }
  },
  "BuildExpression(3)\r": {
    "context\r": {
      "type": "TerminologyPackage\r",
      "!text": "The TerminologyPackage the built Expression should be added to\r"
    },
    "return-type\r": {
      "type": "Expression\r",
      "!text": "The built Expression\r"
    },
    "param": {
      "!value": "expressions\r",
      "type": "Collection\r",
      "!text": "A Collection of ExpressionElements to be added under the Expression\r"
    },
    "comments\r": {
      "!text": "Builds an Expression, adds it to the context TerminologyPackage and returns it \r\n<br> The built Expression is initialised with an ID using GetID() \r\n<br> This variation does not set a name for the built Expression\r"
    }
  },
  "BuildImplementationConstraint\r": {
    "context\r": {
      "type": "ModelElement\r",
      "!text": "The ModelElement to which the built ImplementationConstraint will be added\r"
    },
    "return-type\r": {
      "type": "ImplementationConstraint\r",
      "!text": "The built ImplementationConstraint\r"
    },
    "param": {
      "!value": "expression\r",
      "type": "ExpressionElement\r",
      "!text": "The ExpressionElement referenced by the ImplementationConstraint\r"
    },
    "comments\r": {
      "!text": "Builds an ImplementationConstraint referencing an ExpressionElement, adds it to the context ModelElement \r\n<br> It is added by constructing an ExpressionLangString which references the Expression, \r\n<br> then adding the ExpressionLangString to the ImplementationConstraint by storing the former in a MultiLangString \r\n<br> The built ImplementationConstraint is initialised with an ID using GetID()\r"
    }
  },
  "FindTermExternalReference\r": {
    "context\r": {
      "type": "TerminologyPackage\r",
      "!text": "The TerminologyPackage that is queried for its external reference\r"
    },
    "return-type\r": {
      "type": "String\r",
      "!text": "Returns the name of the element which matches the external reference provided\r\nIf none is found, returns \"\"\r"
    },
    "param": {
      "!value": "name\r",
      "type": "String\r",
      "!text": "The external reference\r"
    },
    "comments\r": {
      "!text": "Looks up the model for a Term element with an external reference matching the one provided\r\n<br> If found, returns \"\"\r"
    }
  },
  "GetName(1)\r": {
    "context\r": {
      "type": "ExpressionLangString\r",
      "!text": "The ExpressionLangString whose name is queried\r"
    },
    "return-type\r": {
      "type": "String\r",
      "!text": "The name of the context ExpressionLangString\r"
    },
    "comments\r": {
      "!text": "Retrieves the name of an ExpressionLangString\r"
    }
  },
  "GetName(2)\r": {
    "context\r": {
      "type": "ModelElement\r",
      "!text": "The ModelElement whose name is queried\r"
    },
    "return-type\r": {
      "type": "String\r",
      "!text": "The name of the context ModelElement\r"
    },
    "comments\r": {
      "!text": "Retrieves the name of an ModelElement\r"
    }
  },
  "GetName(3)\r": {
    "context\r": {
      "type": "AssertedInference\r",
      "!text": "The AssertedInference whose name is queried\r"
    },
    "return-type\r": {
      "type": "String\r",
      "!text": "The name of the context AssertedInference\r"
    },
    "comments\r": {
      "!text": "Retrieves the name of an AssertedInference\r"
    }
  },
  "GetDescription(1)\r": {
    "context\r": {
      "type": "Claim\r",
      "!text": "The Claim whose description is queried\r"
    },
    "return-type\r": {
      "type": "String\r",
      "!text": "The description of the context Claim\r"
    },
    "comments\r": {
      "!text": "Retrieves the description of an Claim\r"
    }
  },
  "GetDescription(2)\r": {
    "context\r": {
      "type": "AssertedInference\r",
      "!text": "The AssertedInference whose description is queried\r"
    },
    "return-type\r": {
      "type": "String\r",
      "!text": "The description of the context AssertedInference\r"
    },
    "comments\r": {
      "!text": "Retrieves the description of an AssertedInference\r"
    }
  },
  "HasImplementationConstraint\r": {
    "context\r": {
      "type": "AssertedInference\r",
      "!text": "The AssertedInference whose ImplementationConstraint is queried\r"
    },
    "return-type\r": {
      "type": "Boolean\r",
      "!text": "Returns 'true' if the AssertedInference has an ImplementationConstraint\r\nReturns 'false' otherwise\r"
    },
    "comments\r": {
      "!text": "Returns 'true' if the AssertedInference has an ImplementationConstraint\r\n<br> Returns 'false' otherwise\r"
    }
  }
};