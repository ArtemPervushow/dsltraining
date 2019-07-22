String basePath = 'parentScriptFolder'

folder(basePath) {
    description 'THis is sample for inner scripting'
}

job("$basePath/callChild"){
    steps {
        dsl {
            external('childScript.groovy')
            removeAction('DISABLE')
            ignoreExisting()
        }
    }
}
