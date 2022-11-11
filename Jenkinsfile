pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                echo 'Building..'
                sh "./mvnw clean compile -e"
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
            }
        }
          

        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}