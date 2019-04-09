# Examples

The examples provided under the ETCS folder are based on the SIEMENS European Train Control System (ETCS) design for DEIS.

- 'etcs.model' contains the overall ETCS system DDI combined with the On-Board Unit DDI
- 'trackside.model' contains the Trackside Unit DDI

The idea here is that the OEM has already developed the overall system and a subsystem and needs to integrate another subsystem received from a supplier. Using the tools provided in the repository, it is possible for both parties to:
- Create system (and subsystem) DDIs via scripts
- Exchange information as DDIs across tools used by each party using the common tool adapter
- Validate, evaluate and integrate the DDIs via scripts

# Prerequisites

To run the example, the [Deployment Guide](https://github.com/DEIS-Project-EU/DDI-Scripting-Tools/tree/documentation_01/Documentation/Deployment%20Guide) must be followed first.

At this point, the user should have an Eclipse IDE instance running, with a project created.
The 'etcs.model' and 'trackside.model' can be imported into the project by:
- Right-clicking on the project in the Model Explorer
- Import...
- General->Filesystem
- Navigate to the folder containing the .model files and select them

The .model files can now be viewed in a tree-based editor within Eclipse (known as [Exeed](https://www.eclipse.org/epsilon/doc/exeed/)); simply double-click on each .model in the Model Explorer and the editor should launch.
