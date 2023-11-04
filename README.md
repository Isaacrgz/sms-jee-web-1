# sms-jee-web-1

This a example Jakarta EE 9.1.0 App located in a local Glassfish Server 7.0.3.

for complete operation, it's necessary create a pool connection in Server admin console: Resources / JDBC / JDBC Connection Pools / New / ...Configuration below...
  General
    Pool Name: PersonPool
    Resource Type: javax.sql.ConnectionPoolDataSource
    Datasource Classname: com.mysql.cj.jdbc.MysqlDataSource
  Additional Property
    serverTimezone: UTC
    useTimezone: true
    useSSL: false
    password: *your DB password*
    databaseName: *your DB name* ('test' in my case)
    serverName: *your Server name* ('localhost' in my case)
    datasourceName: com.mysql.cj.jdbc.MysqlDataSource
    user: *your DB user*
    portNumber: *your DB port* ('3308' in my case)
Then you have to create a New JDBC Resource: Resources / JDBC / JDBC Resources / New / ...Configuration below...
  General
    JNDI Name: jdbc/PersonDb
    Pool Name: *select the previously created pool*

Additionally, you must add 'mysql-connector-java-8.0.17.jar' in ...*your Server path*.../glashfish/lib (in my case)
