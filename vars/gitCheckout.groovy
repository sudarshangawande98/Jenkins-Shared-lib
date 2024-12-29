def call(String url, String branch) {
    echo "Checking out branch '${branch}' from '${url}'"
    checkout([$class: 'GitSCM',
              branches: [[name: branch]],
              userRemoteConfigs: [[url: url]]])
}
