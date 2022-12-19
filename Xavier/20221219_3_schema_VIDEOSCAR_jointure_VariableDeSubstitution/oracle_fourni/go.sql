/***************************************************************
MAJ: XH
***************************************************************/
--S'il y a un paramètre à ce fichier, alors il contient le chemin absolu
--
-- Redirection de la sortie
SPOOL go.log
-- echo des requêtes dans SQL*Plus
SET ECHO ON
-- pas d'affichage des substitutions de variable
SET VERIFY OFF
-- sortir en cas d'erreur
WHENEVER OSERROR EXIT
WHENEVER SQLERROR EXIT rollback
set linesize 60
set pagesize 200

@install_videoscar.sql
@install_data_videoscar.sql
--@req_videoscar.sql
--@install_post_videoscar.sql

PROMPT     FIN NORMALE DU SCRIPT

-- Comportement par défaut
spool off
set echo off
set verify on

-- Comportement par défaut: ne pas sortir en cas d'erreur SQL
WHENEVER SQLERROR continue none
