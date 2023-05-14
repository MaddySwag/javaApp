pipeline {
  agent any

  stages {
    stage ('Checkout') {
      steps {
        checkout scm
      }
    }

    stage ('Get Commits') {
      steps {
        sh 'git log > commits.log'
      }
    }

    stage ('Test Coverage') {
      steps {
        cobertura coberturaReport
      }
    }

    stage ('Find Failing Tests') {
      steps {
        sh 'find failing_tests'
      }
    }
  }
}
