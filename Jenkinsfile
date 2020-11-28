pipeline {
    agent any

    stages {
        
            stage('Compile') {
                steps {
                    dir("/Users/sarutobi/PROYECTOS_SATELNET/PROYECTOS_GERARDO/DIPLOMADO_DEVOPS/ejemplo-maven") {
                        sh 'mvn clean compile -e'
                    }
                }
            }
            stage('Test') {
                steps {
                    dir("/Users/sarutobi/PROYECTOS_SATELNET/PROYECTOS_GERARDO/DIPLOMADO_DEVOPS/ejemplo-maven") {
                        sh 'mvn clean test -e'
                    }
                }
            }
            stage('Jar') {
                steps {
                    dir("/Users/sarutobi/PROYECTOS_SATELNET/PROYECTOS_GERARDO/DIPLOMADO_DEVOPS/ejemplo-maven") {
                        sh 'mvn clean package -e'
                    }
                }
            }
            stage('Run') {
                steps {
                    dir("/Users/sarutobi/PROYECTOS_SATELNET/PROYECTOS_GERARDO/DIPLOMADO_DEVOPS/ejemplo-maven") {
                        sh 'mvn spring-boot:run &'
                        sh 'sleep 15'
                    }
                }
            }
            stage('CurlTest') {
                steps {
                    dir("/Users/sarutobi/PROYECTOS_SATELNET/PROYECTOS_GERARDO/DIPLOMADO_DEVOPS/ejemplo-maven") {
                        sh 'curl -X GET http://localhost:8081/rest/mscovid/test?msg=testing'
                    }
                }
            }
    }
}
