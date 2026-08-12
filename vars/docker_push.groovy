def call(String acr_registry, String img, String tag){
	sh "docker push ${acr_registry}/${img}:${tag}"
}
