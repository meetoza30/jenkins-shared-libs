def call(String img_name){
	sh "trivy image ${img_name}"	
}
