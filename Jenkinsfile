import groovy.json.JsonSlurperClassic

def jsonParse(def json) {
    new groovy.json.JsonSlurperClassic().parseText(json)
}
pipeline {
    agent any
    environment {
        NEXUS_USER         = credentials('nexus-user')
        NEXUS_PASSWORD     = credentials('nexus-password')
    }
    stages {
        stage('Paso 1: Compliar') {
            steps {
                script {
                    sh "echo 'Compile Code!'"
                    // Run Maven on a Unix agent.
                    //sh 'mvn clean compile -e'
                }
            }
        }
        stage('Paso 2: Testear') {
            steps {
                script {
                    sh "echo 'Test Code!'"
                    // Run Maven on a Unix agent.
                    //sh 'mvn clean test -e'
                }
            }
        }
        stage('Paso 3: Build .Jar') {
            steps {
                script {
                    sh "echo 'Build .Jar!'"
                    // Run Maven on a Unix agent.
                    sh 'mvn clean package -e'
                }
            }
            post {
                //record the test results and archive the jar file.
                success {
                    archiveArtifacts artifacts:'build/*.jar'
                }
            }
        }
        stage('Paso 4: Análisis SonarQube') {
            steps {
                withSonarQubeEnv('sonarqube') {
                    sh "echo 'Calling sonar Service in another docker container!'"
                    // Run Maven on a Unix agent to execute Sonar.
                   //sh 'mvn clean verify sonar:sonar -Dsonar.projectKey=github-sonar'
                }
            }
        }

        stage('Paso 5: Subir a Nexus') {
            steps {
                //archiveArtifacts artifacts:'build/*.jar'
                nexusPublisher nexusInstanceId: 'nexus',
                nexusRepositoryId: 'devops-usach',
                    packages: [
                    [$class: 'MavenPackage',
                       mavenAssetList: [
                            [classifier: '',
                            extension: 'jar',
                            filePath: 'build/DevOpsUsach2020-0.0.1.jar']
                            ],
                        mavenCoordinate: [
                            artifactId: 'DevOpsUsach2020',
                            groupId: 'com.devopsusach2020',
                            packaging: 'jar',
                            version: '0.0.3']
                    ]
                    ]
            }
        }
        stage(" Paso 6: Download: Nexus"){
            steps {
                sh "echo 'fase success'"
                sh "pwd"
                //http://nexus3:10003/repository/devops-usach-nexus/com/devopsusach2020/DevOpsUsach2020/0.0.2/DevOpsUsach2020-0.0.2.jar
                sh ' curl -X GET -u $NEXUS_USER:$NEXUS_PASSWORD "http://nexus:8081/repository/devops-usach/com/devopsusach2020/DevOpsUsach2020/0.0.3/DevOpsUsach2020-0.0.3.jar" -O'
                sh "ls -l"
            }
        }
        stage(" Paso 7: Levantar Springboot APP"){
            steps {
                sh 'nohup bash java -jar DevOpsUsach2020-0.0.3.jar & >/dev/null'
            }
        }

/*
        stage('Paso 6: Levantar Springboot APP') {
            steps {
                sh 'mvn spring-boot:run &'
            }
        }
        stage('Paso 7: Dormir(Esperar 10sg) ') {
            steps {
                sh 'sleep 60'
            }
        }
        stage('Paso 8: Test Alive Service - Testing Application!') {
            steps {
                sh 'curl -X GET "http://localhost:8081/rest/mscovid/test?msg=testing"'
            }
        }*/
    }
    post {
        always {
            sh "echo 'fase always executed post'"
        }
        success {
            sh "echo 'fase success'"
        }
        failure {
            sh "echo 'fase failure'"
        }
    }
}
