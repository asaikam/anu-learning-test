node {
	stage ('SCM checkout'){
		checkout([$class: 'GitSCM', branches: [[name: '*/demo']], extensions: [], userRemoteConfigs: [[credentialsId: 'cc828677-456b-4750-990c-8653e3c2cfe8', url: 'https://github.com/asaikam/anu-learning-test.git']]])
    }
	stage ('Build'){
        echo "Success"
    }
    stage('Learning Test'){
    sh 'test -Dcucumber.options="--tags @"$Tags""'
    }
}