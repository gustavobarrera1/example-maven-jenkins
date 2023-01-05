pipeline {
    agent any
    tools {
        maven 'mavenjenkins'
    }

    stages {

        stage('Verificación SCM') {
          steps {
            script {
              checkout scm
            }
          }  
        }
        stage('Build') {
            steps {
                sh 'mvn -B -DskipTests clean package'
            }
        }
        stage('Test') {
            steps {
                sh 'mvn test'
            }
            post {
                always {
                    junit 'target/surefire-reports/*.xml'
                }
            }
        }
    }
}