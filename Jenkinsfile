pipeline {
    agent any
    stages {
        stage ('Compile'){
                steps {
                sh './mvnw clean compile -e'
                }
        }
        stage ('Test'){
                steps {
                sh './mvnw clean test -e'
                }
        }
        stage ('Jar'){
                steps {
                sh './mvnw clean package -e'
                }
        }
        stage ('SonarQube'){
                steps {
                withSonarQubeEnv(installationName: 'sonar'){
                sh 'mvn org.sonarsource.scanner.maven:sonar-maven-plugin:3.7.0.1746:sonar'
                }
                }                
        }
        stage ('Run Jar'){
                steps {
                sh 'nohup bash mvnw spring-boot:run &'
                }
        }
        stage ('Sleep'){
                steps {
                sh 'sleep 30'
                }
         }        
        stage ('Testing'){
                steps {
                sh 'curl -X GET "http://localhost:8080/rest/mscovid/test?msg=testing"'
                } 
                }
    }
}
