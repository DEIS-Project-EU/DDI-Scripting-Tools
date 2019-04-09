# Deployment

1. [Prerequisites](#prerequisites)
2. [Acquisition](#acquisition)
3. [Deployment](#deployment)

## Prerequisites

Much of the toolset provided here is built using the [Eclipse IDE](https://www.eclipse.org/ide/).
While there are potential alternatives for some parts of the toolset, the Eclipse IDE is effectively mandatory and the most direct approach to use the provided tools.

To make use of the Epsilon scripts from the repository, the [Epsilon distribution of Eclipse](https://www.eclipse.org/epsilon/download/) can be used. When installation is complete, the user should update their distribution via the stable update site URL: http://download.eclipse.org/epsilon/updates/. This is due to the provided distribution (v1.5) having a bug that the update (v1.5.1) fixes.

If the user uses/wishes to use a different distribution of Eclipse, the same update site can be used to install Epsilon into the Eclipse IDE.

A detailed guide to updating the Eclipse IDE using update sites can be found [here](https://help.eclipse.org/kepler/topic/org.eclipse.wb.doc.user/html/installation/updatesite_3.8.html?cp=64_2_1).

Given that the repository is hosted on GitHub, users unfamiliar with the latter are highly encouraged to read through the [GitHub introductory guide](https://guides.github.com/activities/hello-world/).

## Acquisition

If using Windows or Mac, [GitHub Desktop](https://desktop.github.com/) can be used to clone the repository, just use the 'Clone or download' button on the [main repository page](https://github.com/DEIS-Project-EU/DDI-Scripting-Tools) or use this [URL](https://github.com/DEIS-Project-EU/DDI-Scripting-Tools.git). 
Using this approach, the copy of the repository can be managed via the GitHub application.

Alternatively, if a local copy is simply needed instead, the 'Clone or Download->Download Zip' function can be used instead from the [main repository page](https://github.com/DEIS-Project-EU/DDI-Scripting-Tools). This downloads a compressed folder containing all repository files and folders.

## Deployment

Having acquired the repository by either approach mentioned earlier, the user can now setup the tools provided in the Eclipse IDE.
The following guide describes deployment of the script-based tools and of the common tool adapter.

### Deploying tools for DDI creation

A collection of Epsilon Object Language (EOL) `operations` are contained within [\Scripts\DDIBuilderHelpers.eol](https://github.com/DEIS-Project-EU/DDI-Scripting-Tools/blob/master/Scripts/DDIBuilderHelpers.eol).
Users can use these operations in their own scripts to build DDIs for their subject systems.

1. Launch the Eclipse IDE (support for Epsilon should be installed, see [Prerequisites](#prerequisites))
2. Create a new project
    - File->New->Project->General->Project</li>
    - Name your new project, decide where to store it (typically in your workspace)</li>
3. Import the DDIBuilderHelpers.eol file into your project
    - Right-click on project in Model Explorer
    - Import...
    - General->Existing Projects into Workspace
    - Navigate to DDIBuilderHelpers.eol and choose it
    
    Alternatively
    - Drag & drop DDIBuilderHelpers.eol into project
4. Create initial DDI model
    An empty DDI model is needed for the user-defined script to work with. To create a DDI model, the ODE metamodel from the repository is needed.
    - Right-click on project in Model Explorer
    - Import...
    - General->Filesystem
    - Navigate to ODE metamodel .ecore files from repository, import all
    - Once imported, select all .ecore files in Model Explorer
    - Right-click on selected .ecore files
    - Register EPackages
    Now the empty DDI model can be created
    - File->New->Other->Epsilon->EMF Model
    - Name the new DDI model
    - Choose the ODE metamodel URI (http://www.deis-project.eu/ode/mergedODE)
    - Choose the 'Root instance type' to be 'DDIPackage'
    
5. Assuming the script the user wants to create is an EOL script:
    - File->New->Other->Epsilon->EOL Program
    - Name the script and choose its container project (should be the project currently worked on)
    
6. The script needs to operate on the given DDI model; to setup the script (and the provided script operations) to use the empty DDI model:
    - Right-click on the user-defined script in the Model Explorer
    - Run-as -> Run Configurations...
    - Double-click on 'EOL Program'
    - Name the configuration for convenience
    - On the 'Models' tab, click Add...
    - Choose 'EMF Model'
    - Provide the empty DDI model with a name to be referenced by the user-defined script
    - IMPORTANT: The DDIBuilderHelpers.eol assumes the subject model uses the alias 'm', add 'm' to the 'Aliases' section
    - Browse Workspace... -> Navigate to the empty DDI model file and select it, its metamodel should be included automatically

TODO: Integration scripts

TODO: Deploy Common Tool Adapter
