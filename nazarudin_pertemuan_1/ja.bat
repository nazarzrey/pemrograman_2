@echo off
for %%a in (*.java) do ( 
cls
echo run "%%~nxa" 
echo.
javac "%%~nxa" 
java "%%~na" 
echo.
pause
) 
