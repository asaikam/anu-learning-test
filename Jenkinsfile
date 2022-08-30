node {
	stage ('SCM checkout'){
		checkout([$class: 'GitSCM', branches: [[name: '*/demo']], extensions: [], userRemoteConfigs: [[credentialsId: 'cc828677-456b-4750-990c-8653e3c2cfe8', url: 'https://github.com/asaikam/anu-learning-test.git']]])
    }
	stage ('Build'){
        bat 'mvn clean'
    }
    stage('Learning Test'){
        bat 'mvn test -Dcucumber.options="--tags @"smoke""'
    }
    stage('Cucumber Report'){
    cucumber buildStatus: 'null', customCssFiles: '', customJsFiles: '', failedFeaturesNumber: -1, failedScenariosNumber: -1, failedStepsNumber: -1, fileIncludePattern: '**/*.json', jsonReportDirectory: 'target', pendingStepsNumber: -1, reportTitle: 'Learning_CucumberReport', skippedStepsNumber: -1, sortingMethod: 'ALPHABETICAL', undefinedStepsNumber: -1
    }
}