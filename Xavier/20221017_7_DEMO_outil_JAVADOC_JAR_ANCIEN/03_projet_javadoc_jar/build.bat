rem javac MonApp.java
javac -d classes -classpath lib\*.jar  src\fr\afpa\demo\*.java

javadoc -d doc -sourcepath src -classpath lib  -version -author  fr.afpa.demo

jar -cfM  demo.jar -C .\classes .
rem jar cvfm afpa.jar manifest .\fr

pause
