@echo off
rem set LIST=
rem for %i in (*) do set LIST=!LIST! %i
rem echo %LIST%

set LIST=
:encore
	if "%1"=="" goto fin
	rem echo %1
	set LIST=%LIST% %1
	shift
goto encore

:fin

echo voici tt les parametres dans une chaine :%LIST%
pause

