import groovy.json.JsonSlurperClassic

def jsonParse(def json) {
    new groovy.json.JsonSlurperClassic().parseText(json)
}

pipeline {
    agent any
    tools {
        maven "Maven-1"
    }

    stages {
        stage("SCM") {
            steps {
                git branch: "feature-sonar", changelog: false, poll: false, url: "https://github.com/jaime-paredes/ejemplo-maven.git"
            }
        }
        stage("Build") {
            steps {
                sh "mvn clean package"
            }
        }
        stage("SonarQube") {
            steps {
                withSonarQubeEnv(credentialsId: "access_token_sq", installationName: "MySonar") {
                    sh "mvn org.sonarsource.scanner.maven:sonar-maven-plugin:3.7.0.1746:sonar -Dsonar.target=sonar.java.binaries"
                }
            }
        }
    }
}