node {
	stage ('SCM checkout'){
		git "https://gitlab.com/mbabilo/experitest"
		}
	stage ('Build'){
    	dir("comtest") {
	   sh "mvn clean install"
       }
       	dir("comtest/target") {
	   sh "java -jar com.test-1.0-SNAPSHOT.jar"
       }
		}
}

//pipeline {
//    agent none
//    stages {
//        stage('Build Project') {
//            steps {
//                sh 'mvn --version'
//           }
//        }
//    }
//}