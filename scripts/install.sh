sudo cd '/home/ec2-user/storm-clustering/SG_MICROSERVICE_STROMCLUSTERING'
sudo mvn -e clean install >> /var/log/tomcat.log
sudo cp target/*.war /usr/local/tomcat7/apache-tomcat-7.0.72/webapps/ >> /var/log/tomcat.log
sudo sh /usr/local/tomcat7/apache-tomcat-7.0.72/bin/startup.sh >> /var/log/tomcat.log 2>&1 &
