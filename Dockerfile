FROM centos

RUN yum install -y java

VOLUME /tmp
ADD /jokes-app-0.0.1-SNAPSHOT.jar jokes.jar
RUN sh -c 'touch /jokes.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/jokes.jar"]