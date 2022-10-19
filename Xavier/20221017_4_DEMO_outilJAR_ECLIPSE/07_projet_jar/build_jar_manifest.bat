:: Archive avec  META-INF\MANIFEST.MF
:: d'où archive exécutable
cd classes
move ..\manifest

REM move ..\lib
REM jar cvfm afpa.jar manifest .\lib .\biblio

jar cvfm demo2.jar manifest .\biblio
cd ..
move classes\demo2.jar .

REM move classes\lib

move classes\manifest

REM Pour Utiliser ce jar, dans une console :java -jar afpa.jar
pause