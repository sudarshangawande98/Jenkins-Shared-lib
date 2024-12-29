def call() {
    post {
        success {
            emailext(
                subject: "SUCCESS: Build ${env.JOB_NAME} #${env.BUILD_NUMBER}",
                body: """
                <p>Hi Team,</p>
                <p>The Jenkins pipeline <b>${env.JOB_NAME}</b> build <b>#${env.BUILD_NUMBER}</b> has succeeded.</p>
                <p>Details:</p>
                <ul>
                    <li>Project: ${env.JOB_NAME}</li>
                    <li>Build Number: ${env.BUILD_NUMBER}</li>
                    <li>Status: SUCCESS</li>
                    <li>Duration: ${currentBuild.durationString}</li>
                    <li>View Build: <a href="${env.BUILD_URL}">${env.BUILD_URL}</a></li>
                </ul>
                <p>Regards,<br>Jenkins</p>
                """,
                mimeType: 'text/html',
                to: 'sudarshangawande7@gmail.com'
            )
        }

        failure {
            emailext(
                subject: "FAILURE: Build ${env.JOB_NAME} #${env.BUILD_NUMBER}",
                body: """
                <p>Hi Team,</p>
                <p>The Jenkins pipeline <b>${env.JOB_NAME}</b> build <b>#${env.BUILD_NUMBER}</b> has failed.</p>
                <p>Details:</p>
                <ul>
                    <li>Project: ${env.JOB_NAME}</li>
                    <li>Build Number: ${env.BUILD_NUMBER}</li>
                    <li>Status: FAILURE</li>
                    <li>Duration: ${currentBuild.durationString}</li>
                    <li>View Build: <a href="${env.BUILD_URL}">${env.BUILD_URL}</a></li>
                </ul>
                <p>Please investigate the issue.</p>
                <p>Regards,<br>Jenkins</p>
                """,
                mimeType: 'text/html',
                to: 'sudarshangawande7@gmail.com'
            )
        }

        always {
            emailext(
                subject: "Build ${env.JOB_NAME} #${env.BUILD_NUMBER} Completed",
                body: """
                <p>Hi Team,</p>
                <p>The Jenkins pipeline <b>${env.JOB_NAME}</b> build <b>#${env.BUILD_NUMBER}</b> has completed with status: ${currentBuild.currentResult}.</p>
                <p>Details:</p>
                <ul>
                    <li>Project: ${env.JOB_NAME}</li>
                    <li>Build Number: ${env.BUILD_NUMBER}</li>
                    <li>Status: ${currentBuild.currentResult}</li>
                    <li>Duration: ${currentBuild.durationString}</li>
                    <li>View Build: <a href="${env.BUILD_URL}">${env.BUILD_URL}</a></li>
                </ul>
                <p>Regards,<br>Jenkins</p>
                """,
                mimeType: 'text/html',
                to: 'sudarshangawande7@gmail.com'
            )
        }
    }
}
