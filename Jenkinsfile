pipeline {
    agent any
    stages {
        stage('Compile Code') {
            steps {
                sh 'mvn clean compile -e'
            }
        }
        stage('Test Code') {
            steps {              
                sh 'mvn clean test -e'
            }
        }
        stage('Jar Code') {
            steps {               
                sh 'mvn clean package -e'
            }
        }
        stage('SonarQube analysis') {
           steps {
             withSonarQubeEnv(installationName: 'sonar') { 
             sh 'mvn org.sonarsource.scanner.maven:sonar-maven-plugin:3.7.0.1746:sonar'
             }
          }
        }
        stage('Run Code') {
            steps {               
                sh 'nohup mvn spring-boot:run -Dserver.port=8081 &'
                sleep 25 
            }
        }  
        stage('Testing Application') {
            steps {
                sh 'curl -X GET "http://localhost:8081/rest/mscovid/test?msg=testing"'
            }
        }          


    }
}
