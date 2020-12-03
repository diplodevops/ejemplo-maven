pipeline {
    agent any

    stages {
        stage('compile') {
            steps {
                dir("C:\\\\Users\\\\usuario}\\\\developed\\\\ejemplo-maven"){
                sh './mvnw.cmd clean compile -e'
                
                }
            }
        }
        stage('test code') {
            steps {
                dir("C:\\\\Users\\\\usuario}\\\\developed\\\\ejemplo-maven"){
                sh './mvnw.cmd clean test -e'
                }
            }
        }
        stage('jar code') {
            steps {
                dir("C:\\\\Users\\\\usuario}\\\\developed\\\\ejemplo-maven"){
                sh './mvnw.cmd clean package -e'
                }
            }
        }
        stage('run jar') {
            steps {
                dir("C:\\\\Users\\\\usuario}\\\\developed\\\\ejemplo-maven"){
                 sh 'JENKINS_NODE_COOKIE=dontKillMe nohup bash mvnw spring-boot:run &'
               
                }
            }
        }
        
    }
}
