def call(String Project, String ImageTag){
  sh "docker build -t ${Project}:${ImageTag} ."
}
