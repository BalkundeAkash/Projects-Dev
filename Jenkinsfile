pipeline {
    agent any

    stages {
        stage('Clone Repo') {
            steps {
                git credentialsId: 'github-pat',
                    url: 'https://github.com/akashbalkunde/<your-repo-name>.git',
                    branch: 'feature/CURD-app'
            }
        }

        stage('Build') {
            steps {
                echo 'Building the project from feature/CURD-app branch...'
            }
        }
    }

    post {
        success {
            echo "Build Successful!"
        }
        failure {
            echo "Build Failed!"
        }
    }
}
