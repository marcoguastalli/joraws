# joraws
Jora WebService

~/opt/apache-tomcat-8.5.9/bin/catalina.sh run
~/opt/apache-tomcat-8.5.9/bin/catalina.sh jpda run

http://localhost:8580

gradle build

cp ~/dev/repository/git/gradlerest/build/libs/gradlerest-1.0-SNAPSHOT.war ~/opt/apache-tomcat-8.5.9/webapps/gradlerest.war

http://localhost:8580/gradlerest/rest/hellorest
http://localhost:8580/gradlerest/rest/hellorest/marco
