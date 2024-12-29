def call() {
  deploy adapters: [tomcat9(credentialsId: 'Tomcat-Credential', path: '', url: 'http://localhost:8082/')], contextPath: 'hi', war: '**/*.war'
}
