/***************************************************************
Script drop_voyage.sql
Oracle9i Release 9.2.0.1.0 - Production
JServer Release 9.2.0.1.0 - Production
***************************************************************/

-- Comportement par défaut: ne pas sortir en cas d'erreur SQL
WHENEVER SQLERROR continue none

Prompt ****************************************
Prompt SUPPRESSION DES TABLES, VUES , SEQUENCES
Prompt ****************************************
DROP TABLE regions cascade constraints;
DROP TABLE countries cascade constraints;
DROP TABLE locations cascade constraints;
DROP TABLE departments cascade constraints;
DROP TABLE jobs cascade constraints;
DROP TABLE employees cascade constraints;
DROP TABLE job_history cascade constraints;

DROP sequence locations_seq;
DROP sequence departments_seq;
DROP sequence employees_seq;





purge recyclebin;

prompt
prompt *******************************************
prompt INTERROGATION DU DICTIONNAIRE
prompt    Reste-t-il des tables, vues, sequences ?
prompt *******************************************
select * from cat;
