#!/usr/bin/env groovy

job('hello') {
    displayName('hello')
    steps {
	// shell('echo "$(date) hello"')
        shell(readFileFromWorkspace('shell/script.sh'))
    }
}
