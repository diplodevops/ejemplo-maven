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
                sh "echo 'Hello, World Usach 2021!'"
                }
            }
        }
        stage("paso 2"){
            steps {
                script {
                sh "echo 'Compile Code!'"
                }
            }
        }
        stage("paso 3"){
            steps {
                script {
                sh "echo 'Test Code!'"
                }
            }
        }
        stage("paso 3"){
            steps {
                script {
                sh "echo 'Build .Jar!'"
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