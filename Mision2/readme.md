# Paso 1
**Extensiones obligatorias en vs code**
1. Extension Pack for Java (Microsoft)
2. Spring Boot Extension Pack (VMware)
3. Maven for Java (Microsoft)
# Paso 2
**Crear poyecto Spring Boot**
cmd + shift + p
Spring Initializr: Create a Maven Project
Specify Spring Boot Version 3.5.10 
--> java
com.talentotech (enter)
energia (enter)
jar (enter)
elegir 17
seleccionar dependencias
Spring Web
Spring Data JPA
PostgreSql Driver

verificar si esta instalado mvn -v
mvn clean
mvn spring-boot:run
.\mvnw.cmd spring-boot:run

para el mensaje ajustar aplication.yml al final del codigo
```
 error:
    include-message: always
```


