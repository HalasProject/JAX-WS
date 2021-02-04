
# JAX-WS

# DEMO
<p align="center">
    <img src="https://i.ibb.co/7CWmFn4/jax.gif" />
</p>


L'objectif de ce TP est d'apprendre à manipuler l'API JAX-WS et l'aproche (SOAP) pour le développement de services web étendus à partir de la plateforme de développement Java.

  
Le TP est fourni avec trois dossier parent :

- JAX-WS Server: Contient L'API ainsi la connection a la base de donneé MySQL grace a JDBC.

- JAX-WS Client: Continet la partie client qui permet d'interagir avec le server.

- SOAP-UI: une sauvgarde de soap-ui qui permet de tester les endpoint.

  

**Buts pédagogiques** : transformation d'un POJO (Plain old Java object) en service web, génération des artifacts à partir d'une description WSDL, utilisation de l'outillage fourni depuis JavaSE 6, mise en place d'un intercepteur (handler), clients service web en mode asynchrone, outils **wsimport**.

  

## Prérequis logiciels

  

Avant de démarrer ce TP JAX-WS, veuillez préparer votre environnement de développement en installant les outils suivants :

  

*  [Java via OpenJDK](https://jdk.java.net/  "Java 8+")

*  [Eclipse](https://www.eclipse.org/  "Eclipse")

*  [SOAP-UI](http://www.soapui.org/  "SOAP-UI")

*  [MySQL](https://www.google.com/search?q=mysql-connector-java-5.1.18-bin.jar&oq=mysql&aqs=chrome.1.69i57j69i59l3j69i60j69i65l2j69i60.2487j0j1&sourceid=chrome&ie=UTF-8  "MySQL-connector")

  

Etape a suivre:

  

* Creation d'une base de donneé [ex:'DAWS']

* Creation d'une table [Product]

* Modifier les coordonnés 'user','password','database' sur le fichier ***materialServiceImpl.java***

    Connection DB = new Connection(**username**,**password**,**database_name**);

  
  

> Ces exemples n'utilisent pas les modules Java (introduits depuis Java 9).

  

## Ressources

  

Pour aller plus loin, vous pouvez consulter les ressources suivantes :

  

*  [Support de cours SOA](https://mickael-baron.fr/soa/introduction-soa  "Support de cours SOA") ;

*  [Support de cours WSDL](https://mickael-baron.fr/soa/decrire-configurer-wsdl  "Support de cours WSDL") ;

*  [Support de cours SOAP](https://mickael-baron.fr/soa/communiquer-soap  "Support de cours SOAP") ;

*  [Support de cours JAX-WS](https://mickael-baron.fr/soa/developper-serviceweb-jaxws  "Support de cours JAX-WS").

*  [Support de cours REST](https://mickael-baron.fr/soa/comprendre-style-architecture-rest  "Support de cours REST") ;

*  [Support de cours JAX-RS](https://mickael-baron.fr/soa/developper-serviceweb-rest-jaxrs  "Support de cours JAX-RS") ;

*  [Support de cours sur le Streaming HTTP](https://mickael-baron.fr/soa/introduction-streaminghttp) ;

*  [Support de cours sur la mise en œuvre de technologies de Streaming HTTP avec le langage Java](https://mickael-baron.fr/soa/streaminghttp-mise-en-oeuvre) ;

*  [Support de cours sur une introduction aux architectures microservices](https://mickael-baron.fr/soa/introduction-microservices  "Support de cours sur une introduction aux architectures microservices") ;

*  [Support de cours sur les outils et bibliothèques pour la mise en œuvre d'architectures microservices](https://mickael-baron.fr/soa/microservices-mise-en-oeuvre  "Support de cours sur les outils et bibliothèques pour la mise en œuvre d'architectures microservices").

  

Je tiens à remercier [Mme L . BAGDADI] pour les informations fournies ainsi le bon enseignement.