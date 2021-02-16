
# JAX-WS

# DEMO
<p align="center">
    <img src="https://i.ibb.co/7CWmFn4/jax.gif" />
</p>


The objective of this lab is to learn how to handle the JAX-WS API and the (SOAP) approach for the development of extended web services from the Java development platform.

The TP comes with three parent folders:

- JAX-WS Server: Contains the API as well as the connection to the MySQL database thanks to JDBC.

- JAX-WS Client: Continet the client part which allows to interact with the server.

- SOAP-UI: a backup of soap-ui that allows endpoint testing.

**Educational goals**: transformation of a POJO (Plain old Java object) into a web service, generation of artifacts from a WSDL description, use of the tools provided since JavaSE 6, implementation of an interceptor (handler), web service clients in asynchronous mode, **wsimport** tools.

  

## Software prerequisites

  

Before starting this JAX-WS lab, please prepare your development environment by installing the following tools:
  

*  [Java via OpenJDK](https://jdk.java.net/  "Java 8+")

*  [Eclipse](https://www.eclipse.org/  "Eclipse")

*  [SOAP-UI](http://www.soapui.org/  "SOAP-UI")

*  [MySQL](https://www.google.com/search?q=mysql-connector-java-5.1.18-bin.jar&oq=mysql&aqs=chrome.1.69i57j69i59l3j69i60j69i65l2j69i60.2487j0j1&sourceid=chrome&ie=UTF-8  "MySQL-connector")

  

Step to follow:

  

* Creation of a database [ex: 'DAWS']

* Creation of a [Product] table

* Modify the coordinates 'user', 'password', 'database' on the file *** materialServiceImpl.java ***

     Connection DB = new Connection (** username **, ** password **, ** database_name **);

  
  

> These examples do not use Java modules (introduced since Java 9).