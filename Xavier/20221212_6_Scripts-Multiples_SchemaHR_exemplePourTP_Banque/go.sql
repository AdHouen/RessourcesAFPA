/***************************************************************
MAJ: XH
Oracle9i Release 9.2.0.1.0 - Production
JServer Release 9.2.0.1.0 - Production
***************************************************************/
--S'il y a un paramètre à ce fichier, alors il contient le chemin absolu
--
-- Redirection de la sortie vers un fichier de log
SPOOL go.log
-- echo des requêtes dans SQL*Plus
SET ECHO ON
-- pas d'affichage des substitutions de variable
SET VERIFY OFF
-- sortir en cas d'erreur
WHENEVER OSERROR EXIT
WHENEVER SQLERROR EXIT

--ALTER SESSION SET NLS_LANGUAGE=American;
--ALTER SESSION SET NLS_TERRITORY=America;

ALTER SESSION SET NLS_DATE_FORMAT = 'DD-MON-YYYY'
ALTER SESSION SET NLS_DATE_LANGUAGE = ENGLISH

--
-- création tables, sequences and constraint
--
@hr_cre
-- 
-- remplissage des tables
--
@hr_popul
--
-- création des indexes
--
@hr_idx
--
-- create procedural objects
--
@hr_code
--
-- add comments to tables and columns
--
@hr_comnt

--
PROMPT     FIN NORMALE DU SCRIPT
-- fermeture du fichier log
spool off
set echo off

