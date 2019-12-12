FROM ubuntu:latest
RUN apt-get -y update && apt-get -y upgrade
RUN apt-get -y install redis-server
RUN apt-get -y install openjdk-11-jdk wget
RUN mkdir /usr/local/tomcat
RUN wget http://apache-mirror.rbc.ru/pub/apache/tomcat/tomcat-9/v9.0.27/bin/apache-tomcat-9.0.27.tar.gz -O /tmp/tomcat.tar.gz
RUN cd /tmp && tar xvfz tomcat.tar.gz
RUN cp -Rv /tmp/apache-tomcat-9.0.27/* /usr/local/tomcat/
COPY . /usr/local/tomcat/webapps
WORKDIR /usr/local/tomcat/bin/
EXPOSE 8080
CMD /usr/local/tomcat/bin/catalina.sh run
