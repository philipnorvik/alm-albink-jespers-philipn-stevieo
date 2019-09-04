pipeline {
    agent any
    parameters {
        choice(name: 'DEPLOY_ENV', choices: ['int', 'stage', 'prod'],  description: 'The target environment to deploy artifacts')
    }
    stages {       
        stage('Building project, running tests and publishing test results') {
            agent { 
                docker{ image 'maven:3.3.3'}
            }   
            steps {
                sh 'mvn clean install'
            }
            post {
                always {            
                    junit 'target/surefire-reports/*.xml'
                    publishHTML([
                    allowMissing          : false,
                    alwaysLinkToLastBuild : false,
                    keepAll               : true,
                    reportDir             : 'target/site/jacoco/',
                    reportFiles           : 'index.html',
                    reportTitles          : "Tests coverage",
                    reportName            : "Tests coverage"
                    ])
                }
                success {
                    archive "target/alm-albink-jespers-philipn-stevieo-1.0-SNAPSHOT.war"
                }
            } 
        }         
       
        stage('Deploying artifacts to selected target'){
            agent any
            steps{
                sh 'export PATH=/opt/glassfish-4.1.1/bin/asadmin:$PATH'
                sh 'asadmin --port 4848 deploy --force --name alm-albink-jespers-philipn-stevieo-${DEPLOY_ENV} --contextroot inlämning1-${DEPLOY_ENV} target/alm-albink-jespers-philipn-stevieo-1.0-SNAPSHOT.war'
            }
        } 
    }
}
