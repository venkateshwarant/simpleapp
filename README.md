# Simple spring web application
This is a simple spring web based application with DB.

## Assumptions/Pre-requisites

### Hardware
Laptop with at least 8 Gb memory (recommended 16 Gb, ideally 32 Gb)

### Software
1. Maven (v 3.6.2, or higher)
* Instructions to install here: https://maven.apache.org/download.cgi
* Check installation with the command `mvn -version`



2. VirtualBox(v 6.0, or higher)
* Instructions to install here: https://www.virtualbox.org/wiki/Downloads 


3. Vagrant (v 2.2.5, or higher) 
* Instructions to install here: https://www.vagrantup.com/downloads.html
* (only if using Windows 10 or Windows 8 Pro) Disable Hyper-V, see instructions to disable here: https://www.poweronplatforms.com/enable-disable-hyper-v-windows-10-8/
* Check installation with the command `vagrant -v`


4. Postman (V 7.19.1 (7.19.1) or higher)
* Instructions to install here: https://www.postman.com/

## Set local working environment

1- Clone this repo

2- Import the given project into your favourite IDE

3- Build the project using Maven. Either you do it from within the IDE, or from a terminal. From the terminal you must:

3.1-  Get to the directory

```
cd ~/<git_root_folder>/simpleapp
```

3.2- Run the comand.

```
mvn clean install
```

Running this command should shown (almost at the end of the output):

```
[INFO] BUILD SUCCESS
```

After running the above command, go to the following directory and see if the simpleapp.war file is generated in it.

```
cd ~/<git_root_folder>/simpleapp/target
```

## Set local testing environment
In order to run the application some tools have to be installed. The idea is to use the same versions and configurations of the tools
as expected to be in the production environment. In this manner, testing the application in our local environment (to some extend) 
it's similar that running the application on the production environment. 

For this purpose, a local production-like testing environment is going to be setup. 


1-  Get to the directory

```
cd ~/<git_root_folder>/simpleapp
```


2-  Run the command

```
vagrant up
```

Running this command should shown at the end of the output:

```
 default: Done.
```

**Troubleshooting**: if you see error messages like:
```
default: Extract into target directory
default: 
default: gzip: stdin: not in gzip format
default: tar: Child returned status 1
default: tar: Error is not recoverable: exiting now
```
then (the most probable) is that the version of Tomcat used is not available any more.
This has to be solved by editing the file
```
setup-tomcat.sh
```
and changing in the line
```
curl -o apache-tomcat-9.0.38.tar.gz https://downloads.apache.org/tomcat/tomcat-9/v9.0.38/bin/apache-tomcat-9.0.38.tar.gz
```
To see the currently available tomcat versions, go to the URL https://downloads.apache.org/tomcat/tomcat-9/
and copy the corresponding .tar.gz url of tomcat to the above line in setup-tomcat.sh file.


## Check local testing environment setup

1-  Get to the directory

```
cd ~/<git_root_folder>/simpleapp
```

2- Jump into the virtual environment (refered to also as *guest*) : 
```
 vagrant ssh
```


3-  Check mysql installation

```
mysql -u root -p
```

password: 12345678

You should have been able to connect to the database engine. To quit, type:

```
quit;
```


4-  Check Tomcat installation and configuration

Open a browser, and try to access to this url

http://192.168.33.20:8080


Then, try to access to the Tomcat's management are, via this url

http://192.168.33.20:8080/manager/html

user and password: admin



## Run the application

To run the application, go to the directory 

```
cd ~/<git_root_folder>/simpleapp
```

and run the following command

```
vagrant up
```

## Test the application

1. Add new student: http://192.168.33.20:8080/simpleapp/new 
2. List of all student: http://192.168.33.20:8080/simpleapp/ or http://192.168.33.20:8080/simpleapp/list


## Final remarks

These guidelines explain how to 
- setup this simpleapp spring web application
- build the application and generate a new war file with all the code changes
- deploy the new war file to the vm
