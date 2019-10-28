#Stock market

  


###Instalation:
    After downloading project from git repository,
    Install PostgreSQL from https://www.postgresql.org/download/
    After installing PostgreSQL search for pgAdmin4 (it should install with postgresql driver)
    
    In pgAdmin4 create user with :
        username: stock_market
        password: stock_market
        
    Make sure to add login privilages to the user above.
       
    Create database with:
        name: stock_market
        owner: stock_market
        
    Run mvn liquibase:update and all should be good.