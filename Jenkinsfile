pipeline {
    agent any

    stages {
        stage('Compile') {
            steps {
                script {
                    dir('C:/Users/PCAMPOS/.jenkins/workspace/ipeline_multibranch_branch-sonar'){
                        bat  "./mvnw.cmd clean compile -e"           
                    }
                }
            }
        }
        stage('SonarQube analysis 2') {
            steps {
                script {
                    def scannerHome = tool 'sonar-scanner';
                    withSonarQubeEnv('sonar-scanner') {
                    bat "${scannerHome}/bin/sonar-scanner -Dsonar.projectKey=ejemplo-maven2 -Dsonar.sources=src/main/java/  -Dsonar.java.binaries=build -Dsonar.projectBaseDir=C:/Users/PCAMPOS/.jenkins/workspace/ipeline_multibranch_branch-sonar -Dsonar.login=8e8236752890bf7bb18bc071593360e27a3d0346"
                    }
                }
            }
        }
        stage('Test') {
            steps {
                script {
                    dir('C:/Users/PCAMPOS/.jenkins/workspace/ipeline_multibranch_branch-sonar'){
                        bat  "./mvnw.cmd clean test -e"
                    }
                }
            }
        }
        stage('Package') {
            steps {
                script {
                    dir('C:/Users/PCAMPOS/.jenkins/workspace/ipeline_multibranch_branch-sonar'){
                        bat  "./mvnw.cmd clean package -e"     
                    }
                }
            }
        }
        stage('Run') {
            steps {
                script {
                    dir('C:/Users/PCAMPOS/.jenkins/workspace/ipeline_multibranch_branch-sonar'){
                        bat  "start /min mvnw.cmd spring-boot:run &"
                    }
                }
            }
        }
    }
}
