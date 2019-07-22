String basePath = 'sample1'
String repo = 'pervushov/gradle-example'

folder(basePath) {
    description 'Echo'
}

job("$basePath/gradle-example-build") {
    steps {
        batchFile('echo Hello World!')
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
