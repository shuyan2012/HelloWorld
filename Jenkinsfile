node{
    stage('get clone'){
        //check CODE
       git credentialsId: '56e1a242-7858-4729-a107-2808382cf9c1', url: 'https://github.com/shuyan2012/HelloWorld.git'
    }

    //����mvn����
    def mvnHome = tool 'M3'
    env.PATH = "${mvnHome}/bin:${env.PATH}"
	def workspace = pwd()

    stage('mvn test'){
        //mvn ����
        sh "mvn test"
    }

    stage('mvn build'){
        //mvn����
        sh "mvn clean install -Dmaven.test.skip=true"
    }

    stage('deploy'){
        //ִ�в���ű�
        sh "sudo '/scripts/deploy.sh' ${workspace} deploy"
    }
}