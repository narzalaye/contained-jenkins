#!/usr/bin/env groovy

import lib.Common

job('parameterized') {
    displayName('parameterized')
    parameters {
        stringParam('foo', 'bar', 'parameter description')
        choiceParam('choice', ['502', '508'], 'my first choice')
    }
    steps {
	shell('echo "$foo = $choice"')
    }
}
