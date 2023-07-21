# spring_trn
Proyecto Spring para bajar a tierra el manejo de TRN


Para levantar el contenedor docker de mysql ejecutar el shell script docker-mysql.sh

Para acceder al mysql dentro del contenedor ejecutar la siguiente linea de comando

```console
mysql -uroot -p -h 127.0.0.1 -P 33060
```

Para ver el log de mysql dentro del contenedor:


Primero, entrar al contenedor docker:

```console
docker exec -it mysql-curso sh
```

Luego ejecutar los siguiente comandos:

```console
touch /var/log/mysql.log
chmod 777 mysql.log
tail -f -n1500 mysql.log
```

Salimos del contenedor y abrimos una consola de mysql y ejecutamos lo siguiente:
```sql
SET global general_log = on;
SET global general_log_file='/var/log/mysql.log';
SET global log_output = 'file'; 
```


Proyecto de ejemplo:

https://www.geeksforgeeks.org/spring-boot-transaction-management-using-transactional-annotation/