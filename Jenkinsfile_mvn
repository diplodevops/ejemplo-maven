import groovy.json.JsonSlurperClassic

def jsonParse(def json) {
    new groovy.json.JsonSlurperClassic().parseText(json)
}
pipeline {
    agent any
    stages {

        stage("paso 1"){
            steps {
                script {
                sh "echo 'Compile'"
                sh "./mvnw clean compile -e"
                }
            }
        }
        stage("paso 2"){
            steps {
                script {
                sh "echo 'Test'"
                sh "./mvnw clean test -e"
                }
            }
        }
        stage("paso 3"){
            steps {
                script {
                sh "echo 'Build'"
                sh "./mvnw clean package -e"
                }
            }
        }
        stage("paso 4"){
            steps {
                script {
                sh "echo 'Correr'"
                sh "nohup bash mvnw spring-boot:run &"
                }
            }
        }
    }
    post {
        always {
            sh "echo 'fase always executed post'"
        }
        success {
            sh "echo 'fase success'"
        }

        failure {
            sh "echo 'fase failure'"
        }
    }
}