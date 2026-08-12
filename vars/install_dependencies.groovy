def call(String directory){
	dir("${directory}"){
		sh 'npm ci'
	}
}
