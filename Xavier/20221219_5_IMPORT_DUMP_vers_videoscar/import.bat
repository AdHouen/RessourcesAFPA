REM @echo off
prompt CMD$g
REM
REM
REM NAME
REM   *.bat
REM
REM DESCRIPTION
REM   Commande d'importation de la BD
REM USAGE
REM
REM REMARQUE
REM   Certaines variables d'environnement 
REM   doivent être positionnées ...
REM
REM
REM   CREATION : Xavier HER
REM        MAJ : 


REM Vérification de la présence des variables d'environnement
if (%ORACLE_HOME%) == () goto nooraclehome


%ORACLE_HOME%\bin\imp  videoscar/videoscar@localhost/xepdb1 full=y file=videoscar.dmp


pause

goto exit

:nooraclehome
echo ORACLE_HOME variable d environement non positionnee
pause
exit 1


:exit
echo SCRIPT TERMINE SANS ERREUR
pause