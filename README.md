# Environment variables set/get example
This sample demonstrates how to set/get environment variables on Google App Engine
## Setup
Update the <application> tag in src/main/webapp/WEB-INF/appengine-web.xml with your project name
Set the environment variables on src/main/webapp/WEB-INF/appengine-web.xml

## Running locally
    $ mvn appengine:devserver

## Deploying
    $ mvn appengine:update
