@echo off
set /p Name=Bitte Dateinamen eingeben: 
echo Ausgabe:
echo -------------------
echo.
javac.exe %Name%.java
java.exe %Name%
echo.
echo -------------------
pause