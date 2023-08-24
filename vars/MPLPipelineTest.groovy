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
        when { expression { MPLModuleEnabled() } }
        steps {
          sh "echo 'lol'"
        }
      }
    }
  }
}