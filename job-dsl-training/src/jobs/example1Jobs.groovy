String basePath = 'sample1'

folder(basePath) {
    description 'This example shows basic folder/job creation.'
}

job("$basePath/batch") {
    steps {
        batchFile("echo Hello world")
    }
}

job("$basePath/shell") {
    steps {
        shell 'echo Hi bro'
    }
}
