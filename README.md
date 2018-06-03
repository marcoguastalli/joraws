# joraws
Jora WebService

~/opt/apache-tomcat-8.5.9/bin/catalina.sh run
~/opt/apache-tomcat-8.5.9/bin/catalina.sh jpda run

http://localhost:8580
DEBUG 8588

gradle clean
gradle build

cp ~/dev/repository/git/joraws/build/libs/joraws-1.0-SNAPSHOT.war ~/opt/apache-tomcat-8.5.9/webapps/joraws.war

