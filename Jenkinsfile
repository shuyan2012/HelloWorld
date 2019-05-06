node{
    stage('get clone'){
        //check CODE
       git credentialsId: '56e1a242-7858-4729-a107-2808382cf9c1', url: 'https://github.com/shuyan2012/HelloWorld.git'
    }

    //定义mvn环境
    def mvnHome = tool 'M3'
    env.PATH = "${mvnHome}/bin:${env.PATH}"
	def workspace = pwd()

    stage('mvn test'){
        //mvn 测试
        sh "mvn test"
    }

    stage('mvn build'){
        //mvn构建
        sh "mvn clean install -Dmaven.test.skip=true"
    }

    stage('deploy'){
        //执行部署脚本
        sh "sudo '/scripts/deploy.sh' ${workspace} deploy"
    }
}