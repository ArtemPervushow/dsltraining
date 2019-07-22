String basePath = 'childScriptFolder'

folder(basePath) {
    description 'THis is sample for inner scripting'
}

job("$basePath/childScripg"){
    steps {
        batchFile('echo This is child')
    }
}
