pipeline {
    agent any

    stages {
        stage('Compile') {
            steps {
                dir ('G:\\Jenkins\\Ejemplo Maven\\ejemplo-maven')
                {bat 'mvnw.cmd clean compile -e'}
            }
        }
        stage('Unit') {
            steps {
                dir ('G:\\Jenkins\\Ejemplo Maven\\ejemplo-maven')
                {bat 'mvnw.cmd clean test -e'}
            }
        }
        stage('Jar') {
            steps {
                dir ('G:\\Jenkins\\Ejemplo Maven\\ejemplo-maven')
                {bat 'mvnw.cmd clean package -e'}
            }
        }
        stage('Run') {
            steps {
                dir ('G:\\Jenkins\\Ejemplo Maven\\ejemplo-maven')
                {bat 'start mvnw.cmd spring-boot:run'}
            }
        }
        stage('Test') {
            steps {
                sleep(time:10,unit:"SECONDS")
                dir ('G:\\Jenkins\\Ejemplo Maven\\ejemplo-maven')
                {bat 'curl -X GET "http://localhost:8081/rest/mscovid/test?msg=testing"'}
            }
        }
    
    }
}