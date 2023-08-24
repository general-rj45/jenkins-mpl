def call(body) {
  pipeline {
    agent {
      label MPL.agentLabel
    }
    stages {
      stage( 'Test' ) {
        steps {
          sh "echo 'lol'"
        }
      }
    }
  }
}