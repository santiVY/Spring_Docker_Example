# **Proyecto Docker**
1. Compilar proyecto:

`./gradlew clean build`
2. Validar existencia del archivo jar en build/libs/clientes-1.0.0-SNAPSHOT.jar
3. Crear imagen:
   
   `docker build -t jsierra93/client-service ./`
4. Para ejecutar usando imagen local se toma el sha256 que se genera en el comando anterior <imageID>
   
`docker run -p 8081:8081 <imageId>`
6. Para crear nuevo repositorio en docker-hub:
        
    `docker tag jsierra93/client-service jsierra93/client-service:1.0`
    
    `docker push jsierra93/client-service:1.0`

7. Validamos en docker-hub que halla quedado creado el nuevo repositorio con el tag asignado.
8. Para ejecutar con imagen de docker hub:
   
    `docker run -d -p 8081:8081 --name=client-service jsierra93/client-service:1.0`
   
    El argumento -d es para correr en background, al finalizar el comando obtenemos el <containerId>
   
9. Probamos que el servicio responde por medio del endpoint:
   `http://localhost:8081/v1/clients`
   
10. Para obtener el log del pod, podemos acceder por medio del nombre:
    
    `docker logs client-service`
    
11. Para detener el contenedor :
   
    `docker stop <containerId/name>`
    
12. Despues de detener del contenedor, puede ser eliminado.
    
`docker rm <containerId/name>`
    
13. Si desea eliminar la imagen descargada:
   
    `docker rmi <imageId>`

