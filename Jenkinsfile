<<<<<<< HEAD
library 'pipeline-devops'

ejecucion.call()
=======
pipeline {
    agent any
    tools 
    {
          maven 'maven_jenkins'
    }
    stages {
        stage('Compile') {
            steps {
                echo 'TODO: build'
                sh "./mvnw clean compile -e"
            }
        }
        stage('Test') {
            steps {
                echo 'TODO: test'
                sh "./mvnw clean test -e"
            }
        }
        stage('Jar') {
            steps {
                echo 'TODO: package'
                sh "./mvnw clean package -e"
            }
        }
        stage('Maven Artifact') {
            steps {
                echo 'TODO: Maven'
                sh "./mvnw clean install"
            }
        }
       stage('ToRepository')
       {
           stages {
                   nexusPublisher nexusInstanceId: 'nexus_docker', nexusRepositoryId: 'devops-usach-nexus', packages: [[$class: 'MavenPackage', mavenAssetList: [], mavenCoordinate: [artifactId: 'DevOpsUsach2020', groupId: 'com.devopsusach2020', packaging: 'jar', version: '001']]]
                  }
       }
   }
}

>>>>>>> ad3f51b (Update and rename Jenkingfile to Jenkinsfile)
