echo 'starting installation process'
cd '/home/ec2-user/docker'
sudo docker login -e="kedar.gn20@gmail.com" -u="kedargn" -p="npcomplete"   #TODO : hide password
sudo docker pull kedargn/stormclustertest
sudo docker run -d -p 8888:8080 --name stormclustertest $(sudo docker images | grep kedargn/stormclustertest | awk '{print $3}') >> ./log.txt
