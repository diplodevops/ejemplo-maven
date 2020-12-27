pipeline {
    agent any
    stages {
        stage('Compile') {
         steps {    
          sh './mvnw clean compile -e'
          }
         }
        stage('Test') {
         steps {
	        sh './mvnw clean test -e'
         }
        } 
      stage('Jar') {
        steps { 
         sh './mvnw clean package -e'
       }
      }
      stage('sonar') {
          steps {
          withSonarQubeEnv(installationName: 'Sonar') { 
           sh './mvnw org.sonarsource.scanner.maven:sonar-maven-plugin:3.7.0.1746:sonar'
        }
       }
      }  
      stage('Run') {
        steps {
	       sh './mvnw spring-boot:run &'
       } 
      }
      stage('Wait up app') {
        steps {
	       sh 'sleep 30'
       } 
      }
      stage('Testing app') {
       steps {
         sh 'curl -X GET http://localhost:8081/rest/mscovid/test?msg=testing'
        }
       }
      stage('Result Chile') {
       steps {
        sh 'curl -X GET http://localhost:8081/rest/mscovid/estadoPais?pais=CHILE'
        }
       }
      stage('Result Mundial') {
       steps {
        sh 'curl -X GET http://localhost:8081/rest/mscovid/estadoMundial'
        }
       } 
      }
     }    
