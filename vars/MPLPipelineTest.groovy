def call(body) {
  def MPL = MPLPipelineConfig(body, [
    agent_label: '',
    modules: [
      Test: [:],
    ]
  ])

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