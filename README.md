# contained-jenkins

This project demonstrates a Jenkins server running as a Docker container.
The Jenkins server is configured using Jenkins Configuration As Code (jcasc)
The build jobs are triggered using the Job DSL plugin.

A single build job is configured and the build project is located at:
https://github.com/narzalaye/maven-build-with-jenkins-pipeline/tree/master
The project being built is written in Java and built using Maven.
This hello world project includes a unit test that validate the output, triggered using Maven.

## Usage:
From Linux shell (git bash) run the script jenkins.sh

Docker is required to run the script.
note that if you are running as non-root user on Linux, Docker requires sudo privileges.

The Dockerfile downloads image from Dockerhub, so the script cannot run behind corporate firewall.
The jcasc script also downloads plugins from Jenkins update site - also requires communication through FW.

## Files included in this project:
1) README.md file (this one)
2) Jenkinsfile - located in target project here:
https://github.com/narzalaye/maven-build-with-jenkins-pipeline/blob/master/src/ci/Jenkinsfile
3) Application source - in src/ folder located in the target project here:
https://github.com/narzalaye/maven-build-with-jenkins-pipeline/tree/master/src
4) Dockerfile:
The Docker build uses Jenkins base image, it then install Jenkins plugin using the jenkins-plugin-cli command line, and finally configures Jenkins with casc.yaml file.
4) CLI script - written in bash

## Test run (or: it works on my computer)
1) Execution of the script to start Jenkins server  <br>
![script log](https://github.com/narzalaye/contained-jenkins/blob/main/img/1_script_rin_log.png?raw=true)
The log shows the usage of scasc  <br>    <br>

2) Jenkins Dashboard  <br>
![jenkins dashboard](https://github.com/narzalaye/contained-jenkins/blob/main/img/2_jenkins_dashboard_showing_build.png?raw=true)
The screenshot shows the dashobard with the successful build  <br>    <br>

3) Jenkins Build screen  <br>
![jenkins dashboard](https://github.com/narzalaye/contained-jenkins/blob/main/img/3_jenkins_build_with_test_results_and_artifacts.png?raw=true)
The screenshot shows the build with test results and artifacts.  <br>    <br>

## Resources
I followed this guide:  <br>
source: https://www.digitalocean.com/community/tutorials/how-to-automate-jenkins-setup-with-docker-and-jenkins-configuration-as-code  <br>
I removed the ldap plugin according to this:  <br>
https://github.com/jenkinsci/configuration-as-code-plugin/issues/1976  <br>
Then I followed this guide:  <br>
http://eriklievaart.com/cheat/applications/jenkins/jcasc.html  <br>
I forked the Maven pipeline project from:  <br>
https://www.thinkcode.se/blog/2019/12/23/jenkins-configuration-as-code  <br>
https://github.com/tsundberg/maven-build-with-jenkins-pipeline/tree/master


