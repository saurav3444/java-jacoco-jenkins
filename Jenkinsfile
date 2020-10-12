pipeline {
    agent any

    tools {
        maven 'Maven-3.6.3'
    }

    stages {
        stage("Test") {
            steps {
                sh "mvn clean test"
            }
        }

        stage("Build") {
            steps {
                sh "mvn package -DskipTests"
            }
        }

       

    }
  post {
        always {
            echo "This will always be executed"
        }
        success {
            echo "This will be executed only when all stages succeed"
            junit '**/*xml'
           jacoco exclusionPattern: 'jacoco exclusionPattern: '**/*Test.TestCalculateService', inclusionPattern: '**/*.MathService''

        }
        failure {
            echo "This will be executed whenever any stage fails"
        }
    }

    
}