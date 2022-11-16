<<<<<<< HEAD
library 'pipeline-devops'

ejecucion.call()
=======
pipeline {
    agent any

    stages {
        stage('Compile') {
            steps {
                echo 'TODO: build'
                sh "./mvnw clean compile -e"
            }
        }
        stage('Test') {
            steps {
                echo 'TODO: test'
                sh "./mvnw clean test -e"
            }
        }
        stage('Jar') {
            steps {
                echo 'TODO: package'
                sh "./mvnw clean package -e"
            }
        }
        stage('UploadNexus') {
            steps {
                echo 'TODO: Manve'
                sh "./mvnw clean install"
            }
        }
    }
}

>>>>>>> ad3f51b (Update and rename Jenkingfile to Jenkinsfile)
