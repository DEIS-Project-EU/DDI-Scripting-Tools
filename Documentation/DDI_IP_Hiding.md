# IP Hiding with DDIs

When exchanging DDIs containing system information that may be IP-sensitive, users have the option of generating derivative DDIs which contain only public-appropriate elements and information.

As the information captured in a DDI is centered around the ODE Product Packages and the SACM Packages, two approaches to IP hiding are available accordingly.

 1. ODE Product Package IP Hiding
 TODO: IESE's architecture black box IP hiding example here
 
 2. SACM Package IP Hiding
  For SACM packages, users need to tag SACM elements they're interested in maintaining in the public DDI. The tag used in the scripts provided in [DDIIntegrationHelpers.eol](https://github.com/DEIS-Project-EU/DDI-Scripting-Tools/blob/master/Scripts/DDIIntegrationHelpers.eol) expect 'isPublic'.
 
  Example: if the SACM ModelElement x should be included in the public DDI, use:
  
    `x.BuildTaggedValue("isPublic", "true");`
  
  Example: To collect all public elements from into an ArgumentPackageInterface (ARPI), use:
  
    `BuildARGPInterface(ARGPI, publicElements);` 
  
  A similar approach can be used for other types of SACM -PackageInterface packages. 
