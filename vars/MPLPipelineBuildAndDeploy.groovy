def call(body) {
  def MPL = MPLPipelineConfig(body, [
    agent_label: '',
    variables: '',
  ])
  pipeline {
    agent {
      label MPL.agentLabel
    }
    stages {
      stage('Test') {
        steps {
          script {
            sh "echo '${MPL.variables}'"
          }
        }
      }
    }
  }
}
