def call(String api, String projname, String projkey){
	withSonarQubeEnv("${api}"){
		sh "$SONAR_HOME/bin/sonar-scanner -Dsonar.projectName=${projname} -Dsonar.projectKey=${projkey}"
	}
}
