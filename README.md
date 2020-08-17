# setting up registration-proxy
  1. clone git repo 
  
  2. import project in intelliJ
  
  #build
  3. run this command :   mvn install
  
  #start server
  4. run this command :   mvn spring-boot:run 
  
# check if server is running
 From browser access http://localhost:8085/api/registration-proxy/actuator/health
 you should see :
 
 {
 "status": "UP"
 }
 
# check API documention
From browser access http://localhost:8085/api/registration-proxy/swagger-ui.html


 