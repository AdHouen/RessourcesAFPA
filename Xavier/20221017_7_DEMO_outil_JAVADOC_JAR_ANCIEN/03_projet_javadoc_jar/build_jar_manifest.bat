cd classes
move ..\manifest

REM move ..\lib
REM jar cvfm afpa.jar manifest .\lib .\biblio

jar cvfm demo.jar manifest .\fr
cd ..
move classes\demo.jar .

REM move classes\lib

move classes\manifest

REM Pour Utiliser ce jar, dans une console :java -jar afpa.jar
pause