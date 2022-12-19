--/***************************************************************
--Script drop_voyage.sql
--***************************************************************/

-- Comportement par défaut: ne pas sortir en cas d'erreur SQL
WHENEVER SQLERROR continue none

Prompt ****************************************
Prompt SUPPRESSION DES TABLES, VUES , SEQUENCES
Prompt ****************************************

drop table JOUER cascade constraints;

drop table K7 cascade constraints;

drop table FILM cascade constraints;

drop table REALISE cascade constraints;

drop table CATEGORIE cascade constraints;

drop table ACTEUR cascade constraints;



purge recyclebin;

prompt
prompt *******************************************
prompt INTERROGATION DU DICTIONNAIRE
prompt    Reste-t-il des tables, vues, sequences ?
prompt *******************************************
select * from cat;
