FROM maven:3.8-ibmjava

ENV JAVA_HOME=/opt/jdk-11.0.1
ENV PATH="$PATH:$JAVA_HOME/bin"

COPY . /usr/local/sample-maven-app/

RUN cd /usr/local/sample-maven-app && mvn clean install assembly:single

CMD [ "java", "-jar", "/usr/local/sample-maven-app/target/sample-maven-app-1.0-jar-with-dependencies.jar" ] 
