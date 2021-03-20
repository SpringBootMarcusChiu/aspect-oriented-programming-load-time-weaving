## Build Project
- mvn clean compile

## Run Project
- mvn spring-boot:run
- java -javaagent:$HOME/.m2/repository/org/aspectj/aspectjweaver/1.9.5/aspectjweaver-1.9.5.jar -jar target/*.jar
- java -javaagent:/Users/marcuschiu/.m2/repository/org/aspectj/aspectjweaver/1.9.5/aspectjweaver-1.9.5.jar -jar target/*.jar

## Run Tests
- mvn clean test
- mvn clean verify

## Things to Note
- org.aspectj/aop.xml

## Confluence
- http://confluence.marcuschiu.com/x/JwBDAQ
- http://confluence.marcuschiu.com/x/CYGFAQ