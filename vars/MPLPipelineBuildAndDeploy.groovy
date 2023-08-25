def call(body) {
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
          sh 'echo '${CFG.'appName'}''
        }
      }
    }
  }
}
