pipeline {
    agent any
    stages {
        stage('Compile') {
            steps {
                dir("/Users/ricardoquiroga/Desktop/DEVOPS_USACH/Modulo3/ejemplo-maven") {
                    script {
                        sh "./mvnw clean compile -e"
                    }    
                }
            }
        }
        stage('Test') {
            steps {
               dir("/Users/ricardoquiroga/Desktop/DEVOPS_USACH/Modulo3/ejemplo-maven") {
                    script {
                        sh "./mvnw clean test -e"
                    }    
                }      
            }
        }
        stage('Jar Code') {
            steps {
               dir("/Users/ricardoquiroga/Desktop/DEVOPS_USACH/Modulo3/ejemplo-maven") {
                    script {
                        sh "./mvnw.cmd clean package -e"
                    }    
                }      
            }
        }
        stage('Run Jar') {
            steps {
               dir("/Users/ricardoquiroga/Desktop/DEVOPS_USACH/Modulo3/ejemplo-maven") {
                    script {
                        sh "./mvnw.cmd spring-boot:run"
                        sleep 20
                    }    
                }      
            }
        }
         stage('Run Jar') {
            steps {
               dir("/Users/ricardoquiroga/Desktop/DEVOPS_USACH/Modulo3/ejemplo-maven") {
                    script {
                        sh "./mvnw.cmd spring-boot:run"
                        sleep 20
                    }    
                }      
            }
        }
    }
}
