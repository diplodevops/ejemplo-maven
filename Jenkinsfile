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
                        sh './mvnw clean package -e'
                    }
            }
        }
        stage('Run Jar') {
            steps {
                    script {
                        sh 'JENKINS_NODE_COOKIE=dontKillMe nohup bash mvnw spring-boot:run &'
                        
                    }
            }
        }
        stage('Testing Application') {
            steps {
                    script {
                        sh 'curl http://localhost:8081/rest/mscovid/test?msg=testing'
                    }
            }
        }
    }
}
