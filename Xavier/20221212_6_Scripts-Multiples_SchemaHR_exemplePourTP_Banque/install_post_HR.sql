--/***************************************************************
--Attribution des privilèges sur les objets.Création des synonymes
--MAJ: XH
--Oracle9i Release 9.2.0.1.0 - Production
--JServer Release 9.2.0.1.0 - Production
--***************************************************************/
REM
REM A utiliser sous un compte DBA !!!!!!!!!!!!!!!!!!!
REM
--On donne des "privilèges objet" aux autres USERS que videoscar 
grant select on hr.regions to public;
grant select on hr.countries to public;
grant select on hr.locations to public;
grant select on hr.departments to public;
grant select on hr.jobs to public;
grant select on hr.employees to public;


grant execute on hr.secure_dml  to public;
grant execute on hr.add_job_history  to public;

--Les USERs ne seront pas obligés de préfixer les objets par le nom de schéma
CREATE OR REPLACE PUBLIC SYNONYM regions FOR hr.regions;
CREATE OR REPLACE PUBLIC SYNONYM countries FOR hr.countries;
CREATE OR REPLACE PUBLIC SYNONYM locations FOR hr.locations;
CREATE OR REPLACE PUBLIC SYNONYM departments FOR hr.departments;
CREATE OR REPLACE PUBLIC SYNONYM jobs FOR hr.jobs;
CREATE OR REPLACE PUBLIC SYNONYM employees FOR hr.employees;



--grant all on matable1 to public;
--grant all on matable2 to public;
--grant all on matable3 to public;
--et/ou
--grant all on matable1 to stage;
--grant all on matable2 to stage;
--grant all on matable3 to stage;
--ou encore
--grant all on matable1 to responsable;
--grant all on matable2 to responsable;
--grant all on matable3 to responsable;

--Le propriétaire creée des PUBLIC SYNONYM sur tous ses objets
--
--CREATE OR REPLACE PUBLIC SYNONYM matable1 FOR <schema>.matable1;
--CREATE OR REPLACE PUBLIC SYNONYM matable2 FOR <schema>.matable2;
--CREATE OR REPLACE PUBLIC SYNONYM matable2 FOR <schema>.matable2;


