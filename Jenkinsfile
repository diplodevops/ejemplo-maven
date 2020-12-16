pipeline {
    agent any
    stages{
        stage('package'){
            steps{
                sh './mvnw clean package -e' 
            }
        }
    }
}
