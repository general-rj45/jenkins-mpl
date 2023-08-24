def call(body, String myVariable) {
  def MPL = MPLPipelineConfig(body, [
    agent_label: '',
  ])
  pipeline {
    agent {
      label MPL.agentLabel
    }
    stages {
      stage( 'Test' ) {
        steps {
          sh "echo 'test'"
        }
      }
    }
  }
}

