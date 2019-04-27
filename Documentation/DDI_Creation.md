# Deploying tools for DDI creation

A collection of Epsilon Object Language (EOL) `operations` are contained within [\Scripts\DDIBuilderHelpers.eol](https://github.com/DEIS-Project-EU/DDI-Scripting-Tools/blob/master/Scripts/DDIBuilderHelpers.eol).
Users can use these operations in their own scripts to build DDIs for their subject systems.

1. Launch the Eclipse IDE (support for Epsilon should be installed, see [Deployment Guide:Prerequisites](https://github.com/DEIS-Project-EU/DDI-Scripting-Tools/blob/master/Documentation/Deployment%20Guide/README.md#prerequisites))
2. Create a new project
    - File->New->Project->General->Project</li>
    ![Eclipse New Project](https://raw.githubusercontent.com/DEIS-Project-EU/DDI-Scripting-Tools/master/Documentation/img/eclipse_new_project.png)
    - Name your new project, decide where to store it (typically in your workspace)</li>
    ![Eclipse New Project Wizard](https://raw.githubusercontent.com/DEIS-Project-EU/DDI-Scripting-Tools/master/Documentation/img/eclipse_new_project_wizard_1.PNG)
3. Import the DDIBuilderHelpers.eol file into your project
    - Right-click on project in Navigator
    
    ![Import into Project](https://raw.githubusercontent.com/DEIS-Project-EU/DDI-Scripting-Tools/master/Documentation/img/eclipse_import_option.png)
    
    - Import...
    
    ![Import Wizard](https://raw.githubusercontent.com/DEIS-Project-EU/DDI-Scripting-Tools/master/Documentation/img/eclipse_import_wizard.PNG)
    - General->File System
    - Navigate to DDIBuilderHelpers.eol and choose it
    ![Import Wizard - Choose files](https://raw.githubusercontent.com/DEIS-Project-EU/DDI-Scripting-Tools/master/Documentation/img/eclipse_import_wizard_2.PNG)
    
    Alternatively
    - Drag & drop DDIBuilderHelpers.eol into project

4. Create initial DDI model
    
    An empty DDI model is needed for the user-defined script to work with. To create a DDI model, the ODE metamodel from the repository is needed.
    - Right-click on project in Model Explorer
    - Import...
    - General->File System
    - Navigate to ODE metamodel .ecore files from repository, import all
    ![Import ODE Metamodel .ecore files](https://raw.githubusercontent.com/DEIS-Project-EU/DDI-Scripting-Tools/master/Documentation/img/eclipse_import_metamodel.PNG)
    - Once imported, select all .ecore files in Navigator
    - Right-click on selected .ecore files
    - Register EPackages
    
    ![Register EPackages](https://raw.githubusercontent.com/DEIS-Project-EU/DDI-Scripting-Tools/master/Documentation/img/eclipse_register_epackages.png)
    
    Now the empty DDI model can be created
    - File->New->Other->Epsilon->EMF Model
    ![New DDI Model](https://raw.githubusercontent.com/DEIS-Project-EU/DDI-Scripting-Tools/master/Documentation/img/eclipse_new_other.png)
    ![EMF Model](https://raw.githubusercontent.com/DEIS-Project-EU/DDI-Scripting-Tools/master/Documentation/img/eclipse_new_other_emf_model.PNG)
    - Name the new DDI model
    - Choose the ODE metamodel URI (http://www.deis-project.eu/ode/mergedODE)
    - Choose the 'Root instance type' to be 'DDIPackage'
    
    ![DDI Model Wizard](https://raw.githubusercontent.com/DEIS-Project-EU/DDI-Scripting-Tools/master/Documentation/img/eclipse_new_other_emf_model_wizard.PNG)
    
    It can be viewed immediately by double-clicking on it from the Navigator
    ![New DDI Model](https://raw.githubusercontent.com/DEIS-Project-EU/DDI-Scripting-Tools/master/Documentation/img/eclipse_new_emf_model.png)
5. Assuming the script the user wants to create is an EOL script:
    - File->New->Other->Epsilon->EOL Program
    - Name the script and choose its container project (should be the project currently worked on)
    - The DDIBuilderHelpers.eol operations can be used in a user-defined script by adding 
        ```
        import "DDIBuilderHelpers.eol";
        ``` 
        to the start of the script.
6. The script needs to operate on the given DDI model; to setup the script (and the provided script operations) to use the empty DDI model:
    - Right-click on the user-defined script in the Navigator
    - Run-as -> Run Configurations...
    ![Run Configurations option](https://raw.githubusercontent.com/DEIS-Project-EU/DDI-Scripting-Tools/master/Documentation/img/eclipse_run_configuration_option.png)
    - Double-click on 'EOL Program'
    - Name the configuration for convenience
    ![Run Configuration](https://raw.githubusercontent.com/DEIS-Project-EU/DDI-Scripting-Tools/master/Documentation/img/eclipse_eol_configuration_1.PNG)
    - On the 'Models' tab, click Add...
    ![Add Model](https://raw.githubusercontent.com/DEIS-Project-EU/DDI-Scripting-Tools/master/Documentation/img/eclipse_eol_configuration_2.PNG)
    - Choose 'EMF Model'
    
    ![Choose EMF Model](https://raw.githubusercontent.com/DEIS-Project-EU/DDI-Scripting-Tools/master/Documentation/img/eclipse_eol_configuration_3.PNG)
    - Provide the empty DDI model with a name to be referenced by the user-defined script
    - IMPORTANT: The DDIBuilderHelpers.eol assumes the subject model uses the alias 'm', add 'm' to the 'Name' or 'Aliases' section
    - Browse Workspace... -> Navigate to the empty DDI model file and select it, its metamodel should be included automatically
    
    ![Model Configuration](https://raw.githubusercontent.com/DEIS-Project-EU/DDI-Scripting-Tools/master/Documentation/img/eclipse_eol_configuration_4.PNG)
    
    ## Usage example
    For a detailed example of using the above scripting tools in practice, the [Examples](https://github.com/DEIS-Project-EU/DDI-Scripting-Tools/tree/master/Examples) section is recommended.
