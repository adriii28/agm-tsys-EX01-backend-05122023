
# Prueba técnica SpringBoot 

Se puede ver desde Postman o la documentación de **swagger** implementada

#### Ruta Swagger
```
localhost:8080/doc.html
```
Para ejecutar el proyecto deberas seguir los siguientes pasos

Clonar el repositorio:
```sh
git clone https://github.com/adriii28/agm-tsys-EX01-backend-05122023.git
```
Ejecutar el SQL en la base de datos y cambiar el usuario y contraseña del **application.properties**
## Puntos 
- RF1 ✅
Metodo POST - localhost:8080/users/register

```json
{
  "username": "user3",
  "user_password": "user1234"
}
```
- RF2 ✅
Metodo POST - localhost:8080/users/login
```json
{
  "username": "user3",
  "user_password": "user1234"
}
```
- RF3 ✅
Metodo POST - localhost:8080/party/addNew
```json
{
  "name": "Party10",
  "videogame": "Fortnite"
}
```
- RF4 ✅
Metodo GET- localhost:8080/party/game/Fortnite

- RF5 ✅
Metodo POST - localhost:8080/partyuser/join/3/3
Metodo DELETE - localhost:8080/partyuser/2
- RF6 ❌
- RF7 ❌
- RF8 ✅
Metodo DELETE - localhost:8080/users/editProfile/3
- RF9 ❌


