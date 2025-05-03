pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                sh './gradlew assemble'
            }
        }
        stage('Test') {
            steps {
                sh './gradlew test'
            }
        }
        stage('Build Frontend') {
            steps {
                dir('client-app') {
                    sh 'yarn install'
                    sh 'yarn build'
                }
            }
        }
    }

    post {
        always {
            junit '**/build/test-results/test/*.xml'
            archiveArtifacts artifacts: '**/build/libs/*.jar', fingerprint: true
        }
    }
}
