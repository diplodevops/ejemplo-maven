pipeline {
    agent any

    stages {
        stage('Compile') {
            steps {
                script {
                    bat "mvn clean compile -e"
                }
            }
        }
        stage('Test') {
            steps {
                script {
                    bat "mvn clean test -e"
                }
            }
        }
        stage('Package') {
            steps {
                script {
                    bat "mvn clean package -e"
                }
            }
        }
        stage('Run') {
            steps {
                script {
                    bat "start /min mvn spring-boot:run &"
                }
            }
        }
        stage('Test Application') {
            steps {
                script {
                    bat " start chrome http://localhost:8081/rest/mscovid/test?msg=testing"
                }
            }
        }
    }
}
