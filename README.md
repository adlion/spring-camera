# This is the backend for the camera-project repository.

To run first make sure you have mongodb running with the below configurations or update the application configurations.

`spring.data.mongodb.host=mongo-db` ==> docker container service name or container name. If you run mongo on localhost replace it to 127.0.0.1 or localhost

`spring.data.mongodb.port=27017` ==> mongo exposed port

`spring.data.mongodb.database=cameraDB` ==> mongo database for the application

`spring.data.mongodb.username=root` ==> the user that application will use to authenticate itself on mongo.

`spring.data.mongodb.password=password` ==> the password that application will use to authenticate itself on mongo.


====================================== Docker Compose ====================================== 
To run with docker please create a directory "mongoDB" on the same level with docker-compose and after you can build the camera-api image

You can build camera-api image by running `docker build -t camera-api .`


