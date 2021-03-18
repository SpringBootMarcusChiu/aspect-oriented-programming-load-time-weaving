confluence: https://confluence.marcuschiu.com/x/CYGFAQ

## Build Project
- mvn clean package
  
## Run Project
two ways to run project:
- mvn spring-boot:run
- java -javaagent:$HOME/.m2/repository/org/aspectj/aspectjweaver/1.9.5/aspectjweaver-1.9.5.jar -jar target/*.jar