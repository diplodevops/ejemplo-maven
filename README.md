# Getting Started

### Compile Code
* ./mvnw clean compile -e

### Test Code
* ./mvnw clean test -e

### Jar Code
* ./mvnw clean package -e

### Run Jar
* Local:      ./mvnw spring-boot:run 
* Pipeline:   nohup bash mvnw spring-boot:run &

### Testing Application
* curl -X GET 'http://localhost:8081/rest/mscovid/test?msg=testing'
