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
        stage('Sonar') {
             steps {
                    script {
                        def scannerHome = tool 'sonar-scanner';
                    }
                    withSonarQubeEnv('sonarqube-server') {
                            sh '${scannerHome}/bin/sonar-scanner -Dsonar.projectKey=ejemplo-maven -Dsonar.sources=src/main/java -Dsonar.working.directory=/Users/ricardoquiroga/Desktop/DEVOPS_USACH/Modulo3/ejemplo-maven/'
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
                          sh "curl -X GET 'http://localhost:8081/rest/mscovid/test?msg=testing'"
                    }
            }
        }
    }
}
