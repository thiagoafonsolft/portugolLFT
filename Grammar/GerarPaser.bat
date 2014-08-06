cls
@ECHO OFF
cd ..
cd compilador
cd src
cd compilador
rd /S /Q analysis
rd /S /Q lexer
rd /S /Q node
rd /S /Q parser
cd ..
cd ..
cd ..
cd Grammar
java -jar sablecc.jar portugolV2.grammar
pause
move compilador\analysis ..\compilador\src\compilador\
move compilador\lexer ..\compilador\src\compilador\
move compilador\node ..\compilador\src\compilador\
move compilador\parser ..\compilador\src\compilador\
rd /S /Q compilador
pause
exit