pipeline {
  agent { label 'myaws' }
  stages {
    stage('Verify browsers are installed') {
      steps {
        sh 'google-chrome --version'
        sh 'firefox --version'
      }
    }
    stage('Run Tests') {
      steps {
        sh './mvnw clean test'
      }
    }
  }
}
