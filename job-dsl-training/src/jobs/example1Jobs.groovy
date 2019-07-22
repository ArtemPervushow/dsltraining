String basePath = 'example1'
String repo = 'pervushov/gradle-example'

folder(basePath) {
    description 'This example shows basic folder/job creation.'
}

job("$basePath/gradle-example-build") {
    scm {
        github repo
    }
    triggers {
        scm 'H/5 * * * *'
    }
    steps {
        gradle 'assemble'
        script {
            echo 'hello'
        }
    }
}

job("$basePath/gradle-example-deploy") {
    parameters {
        stringParam 'host'
    }
    steps {
        shell 'scp war file; restart...'
    }
}