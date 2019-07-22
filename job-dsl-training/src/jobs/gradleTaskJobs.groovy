String basePath = 'sample2'

folder(basePath) {
    description 'This example shows basic folder/job creation.'
}

job("$basePath/GradleTask") {
    gradle {
        tasks('clean')
    }
}
