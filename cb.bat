@set jp=c:\java\new\__tools\apache-maven-3.9.1\bin\

@set PATH=%PATH%;c:\java\new\__tools\apache-maven-3.9.1\bin\

@set JAVA_HOME=c:\OpenJDK\

@%jp%mvn package

@:c:\openjdk\bin\java.exe -jar c:\java\new\_maxima\dz\13.08\target\mathOps-2.0-SNAPSHOT.jar


@pause