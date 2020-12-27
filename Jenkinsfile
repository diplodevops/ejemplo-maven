def call (tareas4m3){
pipeline {
        agent any
    stages {
        stage ('compile'){
                steps {
                dir ("/Users/Joram/Devops/Modulo3/Clase4/ejemplo-maven"){
                sh './mvnw clean compile -e'
                }
                }
        }
        stage ('test'){
                steps {
                dir ("/Users/Joram/Devops/Modulo3/Clase4/ejemplo-maven"){    
                sh './mvnw clean test -e'
                }
                }
        }
        stage ('jar'){
                steps {
                dir ("/Users/Joram/Devops/Modulo3/Clase4/ejemplo-maven"){    
                sh './mvnw clean package -e'
                }
                }
        }
        stage ('run jar'){
                steps {
                dir ("/Users/Joram/Devops/Modulo3/Clase4/ejemplo-maven"){ 
                sh 'nohup bash mvnw spring-boot:run &'
                }
                }
                
        }
    }
}
}
