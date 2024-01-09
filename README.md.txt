Proyecto Banco

1. Descargar el proyecto desde git: https://github.com/rodopieroni1/banco.git
2. una vez descargado el proyecto se debe hacer un change directory desde PowerShell(recomendado) a la carpeta del proyecto
3. se debe crear la BD con el nombre "mysqldocker" de la siguiente forma:
	3.1: Connection Name: mysqldocker
	3.2: Hostname: localhost
	3.3: Port: 3307
	3.3: Usename: root
	3.4: Password: root	

4. una vez creada la BD y visualizada en el gestor, colocar en PowerShell,  el siguiente
   comando: "docker-compose up --build" (el archivo docker-compose y Dockerfile están dentro del mismo)
5. con ello se levantara el contenedor del proyecto y su motor de base de datos, creando así la tabla
6. para la prueba podrán acceder a podrán acceder desde el siguiente link: https://api.postman.com/collections/16779296-f2c09417-5754-41af-8a58-e5ebab88e8ea?access_key=PMAT-01HKNBEPMAQDX8GV4NYM73JGJV
7. Cabe aclarar que se deckerizo para que el proyecto funcione en varias instancias, es decir puede funcionar en varios puertos, 
ver en la imagen de docker a cual puerto esta haciendo referencia en el momento de la ejecucion 