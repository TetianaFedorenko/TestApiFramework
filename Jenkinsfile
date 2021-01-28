node {
	stage ('SCM checkout'){
		git "https://github.com/TetianaFedorenko/TestApiFramework"
		}
	stage ('Build Project'){
	     script {
	            bat "mvn clean install"
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