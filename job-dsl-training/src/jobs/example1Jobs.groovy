String basePath = 'sample1'

folder(basePath) {
    description 'This example shows basic folder/job creation.'
}

job("$basePath/conditionalBatch") {
    steps {
        conditionalSteps {
            condition {
                and {
                    status('ABORTED', 'FAILURE')
                }
            }
            runner('Fail')
            steps {
                batchFile("echo Something wrong")
            }
        }
        batchFile("echo Hello world")
    }
}

job("$basePath/shell") {
    steps {
        shell 'echo Hi bro'
    }
}
