# Examples

The examples provided under the ETCS folder are based on the SIEMENS European Train Control System (ETCS) design for DEIS.

- 'etcs.model' contains the overall ETCS system DDI combined with the On-Board Unit DDI
- 'trackside.model' contains the Trackside Unit DDI

The idea here is that the OEM has already developed the overall system and a subsystem and needs to integrate another subsystem received from a supplier. Using the tools provided in the repository, it is possible for both parties to:
- Create system (and subsystem) DDIs via scripts
- Exchange information as DDIs across tools used by each party using the common tool adapter
- Validate, evaluate and integrate the DDIs via scripts

# Prerequisites

To run the example, the [Deployment Guide](https://github.com/DEIS-Project-EU/DDI-Scripting-Tools/tree/master/Documentation/Deployment%20Guide) must be followed first.

# Viewing the ETCS DDIs

At this point, the user should have an Eclipse IDE instance running, with a project created.
The 'etcs.model' and 'trackside.model' can be imported into the project by:
- Right-clicking on the project in the Model Explorer
- Import...
- General->Filesystem
- Navigate to the folder containing the .model files and select them

The .model files can now be viewed in a tree-based editor within Eclipse (known as [Exeed](https://www.eclipse.org/epsilon/doc/exeed/)); simply double-click on each .model in the Model Explorer and the editor should launch.

# Re-generating the DDIs

To illustrate how these models can be created programmatically, the [`generateETCS.eol`](https://github.com/DEIS-Project-EU/DDI-Scripting-Tools/blob/master/Examples/ETCS/generateETCS.eol) and [`generateTrackside.eol`](https://github.com/DEIS-Project-EU/DDI-Scripting-Tools/blob/master/Examples/ETCS/generateTrackside.eol) scripts can be used.
Follow the [Deployment Guide](https://github.com/DEIS-Project-EU/DDI-Scripting-Tools/tree/master/Documentation/Deployment%20Guide) to create a project in Eclipse with the `DDIBuilderHelpers.eol` script setup.

To generate a new ETCS DDI:
- Right-click on the project in the Model Explorer
- Import...
- General->Filesystem
- Navigate to the generateETCS.eol file and select it
- Right-click on the imported generateETCS.eol file in the Navigator
- Run As->Run Configurations...
- Double-click 'EOL Program' to create a new configuration
- Under 'Models', set the model to be the empty DDI model created according to the [Deployment Guide](https://github.com/DEIS-Project-EU/DDI-Scripting-Tools/tree/master/Documentation/Deployment%20Guide) (step 4)
- IMPORTANT: Add an alias to the model as 'm', required for most of the `DDIBuilderHelpers.eol` operations
- Apply to save changes to the configuration
- Run the configuration
- Review the updated DDI model

At the end of the process, the ETCS model generated should appear as follows:

![Generated ETCS Model](https://raw.githubusercontent.com/DEIS-Project-EU/DDI-Scripting-Tools/master/Documentation/img/etcs.PNG)

The steps for re-generating the Trackside Unit DDI are almost identical, just use the [`generateTrackside.eol`](https://github.com/DEIS-Project-EU/DDI-Scripting-Tools/blob/master/Examples/ETCS/generateTrackside.eol) script instead
