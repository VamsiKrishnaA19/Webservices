# Webservices

Prerequisites to develop the JAX-WS and JAX-RS webservices in your local system.
1. Basic knowledge on java, servlets and jsp.
2. The following softwares are ready in your local system.

1. Java - Download URL - https://www.filehorse.com/download-java-development-kit-32/19235/
2. Eclipse IDE - Download URL - https://www.eclipse.org/downloads/packages/release/helios/sr2/eclipse-ide-java-ee-developers
3. Apache tomcat server - Download URL - https://tomcat.apache.org/download-70.cgi

Note: Create Dynamic web project - add class with some web methods.
After that right click on class, find the webservice option, click on webservice, it will display modal window, in that you need to select the options like bottom-to-top approach from the dropdown, and move the arrows to up for both producer and consumer and finally click on finish button. It will create the client project and WSDL files for you.

To access the web methods or WSDL files
# URL : http://localhost:8080/SOAPXMLHelloClient/services - To see WSDL file.

To see Webservice methods...
# URL : http://localhost:8080/SOAPXMLHelloClient/sampleHelloSoapXmlServiceProxy/TestClient.jsp?endpoint=http://localhost:7446/SOAPXMLHello/services/HelloSoapXmlService




