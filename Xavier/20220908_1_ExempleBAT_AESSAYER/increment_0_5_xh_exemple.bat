@echo off
set i=0

:loop
	if %i% lss 5 (
		echo i vaut %i%
		set /A i=%i%+1
	) else (
		goto fin
	)
goto loop

:fin
echo Je sors du programme
pause
