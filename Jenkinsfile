pipeline {
    agent any

    stages {
        stage('Pre-Build') {
            steps {
                echo 'TODO: Clean Work Space"
                // Clean before build
                cleanWs()
            }
        }
        stage('Build') {
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
        stage('Package') {
            steps {
                echo 'TODO: package'
                sh "./mvnw clean package -e"
            }
        }
        stage('Run') {
            steps {
                echo 'TODO: run'
            }
        }
    }
}
