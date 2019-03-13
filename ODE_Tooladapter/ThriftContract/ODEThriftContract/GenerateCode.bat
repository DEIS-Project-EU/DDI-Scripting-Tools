@set csharpNamespace=namespace csharp STB_Modeling_Techniques.DEISProject.ODEDataModel.ThriftContract
@set javaNamespace=namespace java thriftContract
@set cppNamespace=namespace cpp thriftContract
@set mergedFileName=mergedDDIThriftContract.thrift
@set basePath=%~dp0
@REM @set thriftCompiler=..\thrift-0.9.3.exe
@set thriftCompiler=..\thrift-0.11.0.exe

@echo.

@echo Merge all files into one thrift file.
@copy %basePath%\Structs\*.thrift_enums+%basePath%\Structs\*.thrift_refs+%basePath%\Structs\*.thrift %mergedFileName%

@set mergedFilePath=%basePath%%mergedFileName%

@REM add namespaces to merged file
@set tempFile=%basePath%tempFile.txt
@echo %csharpNamespace% > %tempFile%
@echo %javaNamespace% >> %tempFile%
@echo %cppNamespace% >> %tempFile%
@type %mergedFilePath% >> %tempFile%
@type %tempFile% > %mergedFilePath%
@del %tempFile%

@REM append services to mergedFilePath
for %%f in (%basePath%\Services\*.thrift) do (
    TYPE %%f >> %mergedFilePath%
)

@rmdir "./gen_Thrift_ODE" /s /q
@mkdir "gen_Thrift_ODE/csharp"
@mkdir "gen_Thrift_ODE/java"
@mkdir "gen_Thrift_ODE/cpp"

@echo.
@echo Generate C# files
%thriftCompiler% -r -out gen_Thrift_ODE/csharp --gen csharp %mergedFilePath%

@echo.
@echo Generate Java files
%thriftCompiler% -r -out gen_Thrift_ODE/java --gen java %mergedFilePath%

@echo.
@echo Generate C++ files
%thriftCompiler% -r -out gen_Thrift_ODE/cpp --gen cpp:pure_enums %mergedFilePath%
@REM ..\thrift-0.9.3.exe -r -out gen_Thrift_ODE/cpp --gen cpp %mergedFilePath%

@echo.
@echo Delete merged thrift file.
@REM @del %mergedFilePath%

@pause