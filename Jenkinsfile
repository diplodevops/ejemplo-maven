pipeline {
    agent any
    stages{
        stage('package'){
            steps{
                sh './mvnw clean package -e' 
            }
        }
        stage('sonarQube'){
            steps {
                withSonarQubeEnv(installationName: 'sonar'){
                    sh 'mvn org.sonarsource.scanner.maven:sonar-maven-plugin:3.7.0.1746:sonar'
                }
            }
        }
    }
}
