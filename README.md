# poc-jndi-tomcat
Baseado no tutorial de: http://www.journaldev.com/2905/hibernate-tomcat-jndi-datasource-example-tutorial#comment-32417

Tomcat JNDI DataSource Configuration

For configuring tomcat container to initialize DataSource, we need to make some changes in tomcat server.xml and context.xml files.

<Resource name="jdbc/MyLocalDB" 
      global="jdbc/MyLocalDB" 
      auth="Container" 
      type="javax.sql.DataSource" 
      driverClassName="com.mysql.jdbc.Driver" 
      url="jdbc:mysql://localhost:3306/TestDB" 
      username="pankaj" 
      password="pankaj123" 
      
      maxActive="100" 
      maxIdle="20" 
      minIdle="5" 
      maxWait="10000"/>
Add above resource in the server.xml GlobalNamingResources element.

<ResourceLink name="jdbc/MyLocalDB"
              global="jdbc/MyLocalDB"
              auth="Container"
              type="javax.sql.DataSource" />
Add above ResourceLink in the context.xml file, it’s required so that applications can access the JNDI resource with name jdbc/MyLocalDB.
