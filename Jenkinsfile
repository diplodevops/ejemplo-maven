pipeline {
    agent any
    stages {
        stage('Compile') {
         steps {    
          sh 'mvn clean compile -e'
          }
         }
        stage('Test') {
         steps {
	        sh 'mvn clean test -e'
         }
        } 
      stage('Jar') {
        steps { 
         sh 'mvn clean package -e'
       }
      }
      stage('sonar') {
          steps {
          withSonarQubeEnv(installationName: 'Sonar') { 
           sh 'mvn org.sonarsource.scanner.maven:sonar-maven-plugin:3.7.0.1746:sonar'
        }
       }
      }  
      stage('Run') {
        steps {
	       sh 'mvn spring-boot:run &'
       } 
      }
      stage('Wait up app') {
        steps {
	       sh 'sleep 10'
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
