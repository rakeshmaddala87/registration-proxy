# 1. Tools/Software needed:
  Software: Maven, Java 8 , Git ,Docker
  
  Tools : Kafka Tool , IntelliJ 2020 , PostMan
  
# 2. Setting up the entire infrastructure
  clone git repo 
  
  import project in intelliJ
  
  Open the .env file , uncomment the DOCKER_HOST_IP and replace hostname with
  your docker host ip. To get your docker host ip run the below command in the terminal
   echo $(ifconfig | grep -E "([0-9]{1,3}\.){3}[0-9]{1,3}" | grep -v 127.0.0.1 | awk '{ print $2 }' | cut -f2 -d: | head -n1)
   
  # start kafka and zookeeper
  From your root directory path in the terminal, run the docker-compose with the below command:
    docker-compose up
  
  # verify if kafka and zookeeper are running
  From the terminal, run "docker ps" and you should see kafka and zookeeper containers
  
  # build
  run this command :   mvn install
  
  # start spring boot server
  run this command :   mvn spring-boot:run 
  
  # check if server is running
  From browser access http://localhost:8085/api/registration-proxy/actuator/health
   you should see :
 
  {
   "status": "UP"
  }
 
  # check API documention
   From browser access http://localhost:8085/api/registration-proxy/swagger-ui.html
   
# 3. Testing the application
  Fire HTTP POST requests from postman to the api end-point shown in the api docs
  refer http://localhost:8085/api/registration-proxy/swagger-ui.html
  
  Check logs of the spring boot server to see the app workflow
   
# 4. Shutting down the entire infrastructure
   bring down kafka and zookeeper with the below command:
     docker-compose down
   
   shut down spring boot from IntelliJ
   
      
   
   



   



 