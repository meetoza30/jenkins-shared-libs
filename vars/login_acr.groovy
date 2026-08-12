def call(String acr_name){
	sh 'az login --identity'
	sh "az acr login -n ${acr_name}"
}


