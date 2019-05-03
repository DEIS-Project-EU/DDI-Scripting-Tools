# DDI Scripting Tools
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
* Under ['Documentation'](https://github.com/DEIS-Project-EU/DDI-Scripting-Tools/tree/master/Documentation), you can find appropriate guides and information for acquiring, deploying and using the provided tools
* Under ['Examples'](https://github.com/DEIS-Project-EU/DDI-Scripting-Tools/tree/master/Examples), you can find example models and scripts that use the provided tools
* Under ['ODE_Metamodel'](https://github.com/DEIS-Project-EU/DDI-Scripting-Tools/tree/master/ODE_Metamodel), you can find a working copy of the Open Dependability Exchange (ODE) metamodel; it is the DDI metamodel. A dedicated repository for the ODE's development can be found [here](https://github.com/DEIS-Project-EU/ODEv2)
* Under ['ODE_ToolAdapter'](https://github.com/DEIS-Project-EU/DDI-Scripting-Tools/tree/master/ODE_Tooladapter), you can find the common tool adapter; this tool enables (via Apache Thrift) the exchange of models across tools that support it
* Under ['Scripts'](https://github.com/DEIS-Project-EU/DDI-Scripting-Tools/tree/master/Scripts), you can find various scripts (in one of the [Epsilon](https://www.eclipse.org/epsilon/) languages), supporting part of the functionality described above

Dependencies and License Information
============
The work provided here uses the following open-source software:
* [Apache Thrift](https://thrift.apache.org/) under the [Apache License 2.0](http://www.apache.org/licenses/LICENSE-2.0)
* [Apache Log4j2](https://logging.apache.org/log4j/2.x/) under the [Apache License 2.0](http://www.apache.org/licenses/LICENSE-2.0)
* [picocli](https://picocli.info) under the [Apache License 2.0](http://www.apache.org/licenses/LICENSE-2.0)
* [slf4j](https://www.slf4j.org) under the [MIT License](https://www.slf4j.org/license.html)
* [cod](https://github.com/namuol/cod) under the [MIT License](https://github.com/namuol/cod/blob/master/LICENSE) - Used to generate the [API documentation](https://deis-project-eu.github.io/DDI-Scripting-Tools/) and is not part of the source code provided here
* [MkDocs](https://www.mkdocs.org/) under the [BSD License](https://www.mkdocs.org/about/license/) - Used to generate the [API documentation](https://deis-project-eu.github.io/DDI-Scripting-Tools/) and is not part of the source code provided here
