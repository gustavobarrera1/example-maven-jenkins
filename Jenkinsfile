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
              sh 'docker-compose down && docker-compose up -d'
            }
          }  
        }
        stage('Build') {
            steps {
                sh "cd sample-maven-app && mvn -B -DskipTests clean package"
            }
        }
        stage('Test') {
            steps {
                sh "cd sample-maven-app && mvn test"
            }
        }
    }
}