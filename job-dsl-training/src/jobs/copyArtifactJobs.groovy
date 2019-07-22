String basePath = 'copyArtifactFolder'

folder(basePath) {
    description 'This example shows basic folder/job creation.'
}

job("$basePath/copyLastSuccess"){
    steps {
        copyArtifacts('FirstAVPervushov') {
            includePatterns('*.txt')
            excludePatterns('2.txt')
            targetDirectory('files')
            flatten()
            optional()
            buildSelector {
                latestSuccessful(true)
            }
        }
    }
}
