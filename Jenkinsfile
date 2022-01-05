pipeline {
    agent any
    stages {
        stage('Compile') {
            steps {
                    script {
                        sh './mvnw clean compile -e'
                    }
            }
        }
        stage('Test') {
            steps {
                    script {
                        sh './mvnw clean test -e'
                    }
            }
        }
        stage('Jar Code') {
            steps {
                    script {
                        sh './mvnw.cmd clean package -e'
                    }
            }
        }
        stage('Run Jar') {
            steps {
                    script {
                        sh './mvnw.cmd spring-boot:run'
                        sleep 20
                    }
            }
        }
        stage('Testing Application') {
            steps {
                    script {
                        sh(script: 'curl http://localhost:8081/rest/mscovid/test?msg=testing', returnStdout: true)
                    }
            }
        }
    }
}
