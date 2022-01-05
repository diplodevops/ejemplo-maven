pipeline {
    agent any

    stages {
        stage('Compile') {
            steps {
                dir ('/home/pablo/Escritorio/Diplomado-DevOps/Proyectos/ejemplo-maven') {
                    script {
                        sh "./mvnw clean compile -e"
                    }
                }    
            }
        }
        stage('Test') {
            steps {
                dir ('/home/pablo/Escritorio/Diplomado-DevOps/Proyectos/ejemplo-maven') {
                    script {
                        sh "./mvnw clean test -e"
                    }
                }    
            }
        }
        stage('Jar') {
            steps {
                dir ('/home/pablo/Escritorio/Diplomado-DevOps/Proyectos/ejemplo-maven') {
                    script {
                        sh "./mvnw clean package -e"
                    }
                }    
            }
        }
        stage('Run') {
            steps {
                dir ('/home/pablo/Escritorio/Diplomado-DevOps/Proyectos/ejemplo-maven') {
                    script {
                        sh "nohup bash mvnw spring-boot:run &"
                    }
                }    
            }
        }        
    }
}
