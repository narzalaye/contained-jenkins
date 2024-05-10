#!/usr/bin/env groovy

job('seed-job') {
    displayName('Seed Job')
    steps {
	shell("cp -r /data/jenkins/* \$(pwd)")
        dsl {
            external('jobs/*.groovy')
            ignoreExisting(false)
            removeAction('DELETE')
            removeViewAction('DELETE')
            lookupStrategy('SEED_JOB')
	}
    }
}
