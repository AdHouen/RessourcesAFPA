javac -cp lib\*.jar -sourcepath src -d classes src\biblio\test\*.java src\biblio\*.java

javadoc -d doc -sourcepath src -classpath lib  -version -author  biblio.test biblio

:: Archive sans META-INF\MANIFEST.MF
jar -cfM  demo.jar -C .\classes .
:: jar cvfm afpa.jar manifest .\fr





pause