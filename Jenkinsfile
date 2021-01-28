node {
	stage ('SCM checkout'){
		git "https://github.com/TetianaFedorenko/TestApiFramework"
		}
	stage ('Build Project'){
	     script {
	            bat "mvn clean install"
	     }
	}
	stage ('Run Tests'){
    	     script {
    	            bat "mvn test"
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