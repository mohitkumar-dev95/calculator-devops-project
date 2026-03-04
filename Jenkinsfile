pipeline {
    agent any

    environment {
        DOCKER_IMAGE = "mohitkumar95/calculator"
    }

    stages {

        stage('Clone Git') {
            steps {
                git branch: 'main', url: 'https://github.com/mohitkumar-dev95/calculator-devops-project.git'
            }
        }

        stage('Build the Maven Project') {
            steps {
                sh 'mvn clean package'
            }
        }

        stage('Test the Maven project') {
            steps {
                sh 'mvn test'
            }
        }

        stage('Verify JAR Existence') {
            steps {
                sh 'ls -lh target/'
            }
        }

        stage('Build Docker Image') {
            steps {
                sh 'docker build -t scientific-calculator .'
            }
        }

        stage('Tag Docker Image') {
            steps {
                sh 'docker tag scientific-calculator:latest $DOCKER_IMAGE:latest'
            }
        }

        stage('Push Docker Image') {
            steps {
                sh 'docker push $DOCKER_IMAGE:latest'
            }
        }

        stage('Deploy with Ansible') {
            steps {
                sh 'ansible-playbook -i inventory deploy.yml'
            }
        }
    }

    post {
        success {
            echo "Pipeline executed successfully!"
        }

        failure {
            echo "Pipeline failed. Check logs."
        }
    }
}