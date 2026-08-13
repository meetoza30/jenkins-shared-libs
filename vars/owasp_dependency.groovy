def call(){
	withCredentials([string(credentialsId: 'nvd-api-key', variable: 'NVD_KEY')]){
	dependencyCheck additionalArguments: "--scan ./ --nvdApiKey ${NVD_KEY} --autoUpdate false", odcInstallation: 'OWASP'
	dependencyCheckPublisher pattern: '**/dependency-check-report.xml'
}
}
