pipeline {
    agent any
    tools { jdk 'JDK17'; maven 'Maven3' }
    stages {
        stage('Checkout') { steps { checkout scm } }
        stage('UI Tests') { steps { sh 'mvn -B clean test -Dheadless=true' } }
    }
    post {
        always {
            archiveArtifacts artifacts: 'target/screenshots/**/*.png', allowEmptyArchive: true
            junit allowEmptyResults: true, testResults: 'target/surefire-reports/TEST-*.xml'
        }
    }
}
