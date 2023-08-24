def call(body) {
  def MPL = MPLPipelineConfig(body, [
    agent_label: '',
    modules: [
      Checkout: [:],
    ]
  ])

  pipeline {
    agent {
      label MPL.agentLabel
    }
    options {
      skipDefaultCheckout(true)
    }
    stages {
      stage( 'Checkout' ) {
        when { expression { MPLModuleEnabled() } }
        steps {
          MPLModule()
        }
      }
    }
  }
}