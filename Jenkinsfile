pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building..'
//                 script {
                    // Get the Maven tool.
                    // ** NOTE: This 'M3' Maven tool must be configured
                    // **       in the global configuration.
//                     echo 'Pulling...' + env.BRANCH_NAME
//                     def mvnHome = tool 'Maven 3.3.9'
//                     def targetVersion = getDevVersion()
//                     print 'target build version...'
//                     print targetVersion
//                     sh "'${mvnHome}/bin/mvn' -Dintegration-tests.skip=true -Dbuild.number=${targetVersion} clean package"
//                     def pom = readMavenPom file: 'pom.xml'
//                     // get the current development version 
//                     developmentArtifactVersion = "${pom.version}-${targetVersion}"
//                     print pom.version
//                 }
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
//                 script {
//                     def mvnHome = tool 'Maven 3.3.9'
//                     if (isUnix()) {
//                         // just to trigger the integration test without unit testing
//                         sh "'${mvnHome}/bin/mvn'  verify -Dunit-tests.skip=true"
//                     } else {
//                         bat(/"${mvnHome}\bin\mvn" verify -Dunit-tests.skip=true/)
//                     }

//                 }
            }
        }
        stage('Sonar Scan') {
            // Run the sonar scan
            steps {
//                 script {
//                     def mvnHome = tool 'Maven 3.3.9'
//                     withSonarQubeEnv {

//                         sh "'${mvnHome}/bin/mvn'  verify sonar:sonar -Dintegration-tests.skip=true -Dmaven.test.failure.ignore=true"
//                     }
//                 }
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}
