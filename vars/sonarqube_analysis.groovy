def call(String sonarEnv, String projName, String projKey) {
    
    def scannerHome = tool 'SONAR'
    
    withSonarQubeEnv(sonarEnv) {
        sh "${scannerHome}/bin/sonar-scanner -Dsonar.projectName='${projName}' -Dsonar.projectKey='${projKey}'"
    }
}
