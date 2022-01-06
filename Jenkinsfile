pipeline {
    agent any

    stages {
        stage('Compile') {
            steps {
                script {
                    dir('C:/Users/PCAMPOS/OneDrive/Desktop/ejemplo-maven'){
                        bat  "./mvnw.cmd clean compile -e"           
                    }
                }
            }
        }
        stage('Test') {
            steps {
                script {
                    dir('C:/Users/PCAMPOS/OneDrive/Desktop/ejemplo-maven'){
                        bat  "./mvnw.cmd clean test -e"
                    }
                }
            }
        }
        stage('Package') {
            steps {
                script {
                    dir('C:/Users/PCAMPOS/OneDrive/Desktop/ejemplo-maven'){
                        bat  "./mvnw.cmd clean package -e"     
                    }
                }
            }
        }
        stage('Run') {
            steps {
                script {
                    dir('C:/Users/PCAMPOS/OneDrive/Desktop/ejemplo-maven'){
                        bat  "start /min mvnw.cmd spring-boot:run &"
                    }
                }
            }
        }
    }
}
