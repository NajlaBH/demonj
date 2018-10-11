# To change this license header, choose License Headers in Project Properties.
# To change this template file, choose Tools | Templates
# and open the template in the editor.
FROM bhntools/demonj:latest
ADD target/demonj.jar demonj.jar
EXPOSE 8080
EXPOSE 4200
EXPOSE 9000
EXPOSE 5432
ENTRYPOINT ["java","-jar","demonj.jar"]
