# ODE_Metamodel

This project contains the ODE Metamodel.

## Metamodel

![Test](https://bryk.com.pl/wp-content/uploads/2018/5611472-simple-images-1280x800.png)

![Image of Metamodel](https://github.com/DEIS-Project-EU/DDI-Scripting-Tools/tree/master/ODE_Metamodel/Images/ODEv2.png)

The metamodel is defined with Eclipse Modeling Framework (EMF). For further information about EMF click [here](https://www.eclipse.org/modeling/emf/)

## Change metamodel

If you use the ODE Tooladapter, please follow instructions descibed [here](https://github.com/DEIS-Project-EU/DDI-Scripting-Tools/tree/master/ODE_Tooladapter#metamodel-change-adaption) after changing the metamodel.

To update the metamodel you have to perform following steps:

### Option 1: Update a model package

1. Modify .emf files.
2. Generate ecore model file (Right-click on created .emf file -> Generate Ecore Model)

### Option 2: Create a new model package

1. Create new .emf file (Right-click on resourcePackage -> New -> Other... -> General -> File and name it <packageName>.emf)
2. Define your metamodel package in created .emf file.
2.1. Make sure the package contains a container class which extends **integration.ODEProductPackage**
3. Generate ecore model file (Right-click on created .emf file -> **Generate Ecore Model**)
4. Register ecore model (Right-click on <packageName>.ecore -> **Register EPackages**)
5. Create .genmodel file for created metamodel package. 
   1. Right-click on resourcePackage -> New -> Other... -> EclipseModeling Framework -> **EMF Generator Model**
   2. On the next wizard page, define the name and location of the genmodel as <packageName>.genmodel (including file extension) then click *Next*
   3. Choose *Ecore model* and click *Next*
   4. Browse Workspace and choose your created ecore model (<packageName>.ecore) and click *Next*
   5. On the *Package Selection* page choose referenced generator models from the lower list, if you have referenced any model types from other package. Select your created ecore file in the upper list and click *Next*. 

### Java code generation

After changing the metamodel, the new Java code has to be generated.

1. Open corresponding .genmodel in *Genmodel Editor*
2. Expand the root node
3. Right-click on package located under root node and choose *Generate Model Code*
4. The Java code will be generated in the *src* folder 
