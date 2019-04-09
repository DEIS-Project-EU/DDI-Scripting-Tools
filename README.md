# DDI-Scripting-Tools
Public release of the DEIS tools for semi-automatic synthesis &amp; evaluation of DDIs

What are these tools for ?
==========================

The software tools found in this repository have been developed to enable a number of design-time operations on Cyber-Physical Systems using Digital Dependability Identities (DDIs). Initial development was performed as part of the [Dependability Engineering Innovation for CPS](http://www.deis-project.eu/) (DEIS) European research project.

Features include:
* Model exchange across tools that support the provided common tool adapter
* Support for script-based creation of DDIs
* Support for script-based integration of DDIs
* Support for script-based validation of DDIs
* Support for script-based evaluation of DDIs

Repository structure
====================
* Under ['Documentation'](https://github.com/DEIS-Project-EU/DDI-Scripting-Tools/tree/documentation_01/Documentation), you can find appropriate guides and information for acquiring, deploying and using the provided tools
* Under ['Examples'](https://github.com/DEIS-Project-EU/DDI-Scripting-Tools/tree/documentation_01/Examples), you can find example models and scripts that use the provided tools
* Under ['ODE_Metamodel'](https://github.com/DEIS-Project-EU/DDI-Scripting-Tools/tree/documentation_01/ODE_Metamodel), you can find a working copy of the Open Dependability Exchange (ODE) metamodel; it is the DDI metamodel. A dedicated repository for the ODE's development can be found [here](https://github.com/DEIS-Project-EU/ODEv2)
* Under ['ODE_ToolAdapter'](https://github.com/DEIS-Project-EU/DDI-Scripting-Tools/tree/documentation_01/ODE_Tooladapter), you can find the common tool adapter; this tool enables (via Apache Thrift) the exchange of models across tools that support it
* Under ['Scripts'](https://github.com/DEIS-Project-EU/DDI-Scripting-Tools/tree/documentation_01/Scripts), you can find various scripts (in one of the [Epsilon](https://www.eclipse.org/epsilon/) languages)

