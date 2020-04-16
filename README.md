# Webservices

Prerequisites to develop the JAX-WS and JAX-RS webservices in your local system.
1. Basic knowledge on java, servlets and jsp.
2. The following softwares are ready in your local system.

1. Java - Download URL - https://www.filehorse.com/download-java-development-kit-32/19235/
2. Eclipse IDE - Download URL - https://www.eclipse.org/downloads/packages/release/helios/sr2/eclipse-ide-java-ee-developers
3. Apache tomcat server - Download URL - https://tomcat.apache.org/download-70.cgi
4. Jersey Jar files - Download URL - https://www.javatpoint.com/jax-rs-file-download-example

** Note: 
1. Place jar files in WEB-INF/lib folder or else create your own custom library in build path and add it to project.
2. While running the application, sometimes you may see ClassNotFoundException: org.glassfish.jersey.servlet.ServletContainer in the server console. Even though if you add the jar's, you will see above exception, In this case right click on project and goto properties and find the Deployment Assembly and add the WEB-INF/lib folder, If you paste the jar files in lib folder, or else If you place the jar's in custom library then add the library here.

