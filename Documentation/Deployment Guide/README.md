# Deployment

1. [Prerequisites](#prerequisites)
2. [Acquisition](#acquisition)
3. [Deployment](#deployment)

## Prerequisites

Much of the toolset provided here is built using the [Eclipse IDE](https://www.eclipse.org/ide/).
While there are potential alternatives for some parts of the toolset, the Eclipse IDE is effectively mandatory and the most direct approach to use the provided tools.

To make use of the Epsilon scripts from the repository, the [Epsilon distribution of Eclipse](https://www.eclipse.org/epsilon/download/) can be used. 
![Eclipse Epsilon Distribution](https://raw.githubusercontent.com/DEIS-Project-EU/DDI-Scripting-Tools/master/Documentation/img/eclipse_epsilon_distro.png)
When installation is complete, the user should update their distribution via the stable update site URL: http://download.eclipse.org/epsilon/updates/. This is due to the provided distribution (v1.5) having a bug that the update (v1.5.1) fixes.

![Eclipse Epsilon Update Site](https://raw.githubusercontent.com/DEIS-Project-EU/DDI-Scripting-Tools/master/Documentation/img/eclipse_epsilon_update.png)

If the user uses/wishes to use a different distribution of Eclipse, the same update site can be used to install Epsilon into the Eclipse IDE.

A detailed guide to updating the Eclipse IDE using update sites can be found [here](https://help.eclipse.org/kepler/topic/org.eclipse.wb.doc.user/html/installation/updatesite_3.8.html?cp=64_2_1).

Given that the repository is hosted on GitHub, users unfamiliar with the latter are highly encouraged to read through the [GitHub introductory guide](https://guides.github.com/activities/hello-world/).

## Acquisition

If using Windows or Mac, [GitHub Desktop](https://desktop.github.com/) can be used to clone the repository, just use the 'Clone or download' button on the [main repository page](https://github.com/DEIS-Project-EU/DDI-Scripting-Tools) or use this [URL](https://github.com/DEIS-Project-EU/DDI-Scripting-Tools.git). 
Using this approach, the copy of the repository can be managed via the GitHub application.

Alternatively, if a local copy is simply needed instead, the 'Clone or Download->Download Zip' function can be used instead from the [main repository page](https://github.com/DEIS-Project-EU/DDI-Scripting-Tools). This downloads a compressed folder containing all repository files and folders.

The 'Clone or download' button can be found as follows:
![Repository Clone or Download](https://raw.githubusercontent.com/DEIS-Project-EU/DDI-Scripting-Tools/master/Documentation/img/clone_button.png)

## Deployment

Having acquired the repository by either approach mentioned earlier, the user can now setup the tools provided in the Eclipse IDE.
The guides in the other folders and/or documents describe deployment of the script-based tools and of the common tool adapter.

  * [DDI Creation Tools Deployment](https://github.com/DEIS-Project-EU/DDI-Scripting-Tools/blob/master/Documentation/DDI_Creation.md)
