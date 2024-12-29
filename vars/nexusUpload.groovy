def call() {
  nexusArtifactUploader artifacts: [[artifactId: 'demo', classifier: '', file: 'target/my-app.war', type: 'war']], credentialsId: 'Nexus-Credentials', groupId: 'demo', nexusUrl: 'localhost:8081', nexusVersion: 'nexus3', protocol: 'http', repository: 'MARGIN_FO_SNAPSHOT', version: '1.0.0-SNAPSHOT'        
}
