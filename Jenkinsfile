pipeline {
    agent any

    stages {
        stage('Compile') {
            steps {
                script {
                    sh './mvnw clean compile -e'
                }
            }
        }
         stage('SonarQube analysis'){
            steps{
                script{
                    def scannerHome = tool 'sonar-scanner';
                    withSonarQubeEnv('sonnarqube-server'){
                        sh "${scannerHome}/bin/sonar-scanner -Dsonar.projectKey=ejemplo-maven -Dsonar.sources=src -Dsonar.java.binaries=build"
                    }
                }
            }
        }
        stage('Test') {
            steps {
                script {
                    sh './mvnw clean test -e'
                }
            }
        }
        stage('Jar') {
            steps {
                script {
                    sh './mvnw clean package -e'
                }
            }
        }
         stage('uploadNexus') {
            steps {
                nexusPublisher nexusInstanceId: 'nexus-dev2', nexusRepositoryId: 'taller10', packages: [[$class: 'MavenPackage', mavenAssetList: [[classifier: '', extension: '', filePath: 'http://a61d-167-250-55-245.ngrok.io/repository/test_nexus/com/devopsusach2020/DevOpsUsach2020/0.0.1/DevOpsUsach2020-0.0.1.jar -O']], mavenCoordinate: [artifactId: 'DevOpsUsach2020', groupId: 'com.devopsusach2020', packaging: 'jar', version: '0.0.1']]]
            }
         }
        stage('Run') {
            steps {
                script {
                    sh 'nohup bash mvnw spring-boot:run &'
                    sleep 20
                }
            }
        }
        stage('TestApp') {
            steps {
                script {
                    sh "curl -X GET 'http://localhost:8081/rest/mscovid/test?msg=testing'"
                }
            }
        }
    }
}
