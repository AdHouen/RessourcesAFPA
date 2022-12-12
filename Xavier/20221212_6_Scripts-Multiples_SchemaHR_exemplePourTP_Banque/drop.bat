REM @echo off
prompt CMD$g
REM
REM
REM NAME
REM   kill.bat
REM
REM DESCRIPTION
REM   Commande de destruction de la BD
REM USAGE
REM
REM   Pour rendre le script facilement r�utilisable,
REM   Les variables d'environnement suivantes
REM   doivent �tre positionn�es : ...
REM
REM
REM   Creation : Xavier HER
REM        MAJ : 


REM V�rification de la pr�sence des variables d'environnement
if (%ORACLE_HOME%) == () goto nooraclehome

REM set SOURCE=%PROJETS_HOME%\...\Oracle
set SOURCE=.

REM - lancement de SQL*Plus en mode ligne avec le script 
%ORACLE_HOME%\bin\SQLPLUS hr2 @"%SOURCE%\drop_hr.sql"


pause

goto exit

:nooraclehome
echo ORACLE_HOME variable d environement non positionnee
pause
exit 1

:exit
echo SCRIPT TERMINE SANS ERREUR
exit 0


