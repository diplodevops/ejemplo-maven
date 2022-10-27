pipeline {
    agent any

    stages {
        stage('Hello') {
            steps {
                echo 'Hello World'
            }
        }
        stage('Step 1') {
            steps {
                echo 'Step 1'
                sh "uname"
            }
        }
        stage('Step 2') {
            steps {
                echo 'Step 2'
                sh "java --version"
            }
        }
        stage('Step 3') {
            steps {
                echo 'Step 3'
                sh "ps -aux"
            }
        }
        stage('Step 4') {
            steps {
                echo 'Step 4'
                sh "pwd"
            }
        }
        stage('Good Bye') {
            steps {
                echo 'Good Bye Usach Ceres'
            }
        }
    }
}