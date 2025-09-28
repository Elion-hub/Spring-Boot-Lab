# 📚 Sistema de Gestión de Estudiantes (Spring Boot + JPA)

Este proyecto es una aplicación de consola desarrollada en **Spring Boot** que implementa un sistema CRUD para la gestión de estudiantes. Utiliza **Spring Data JPA** para la persistencia en base de datos y el patrón de capas para mantener una arquitectura limpia y escalable.

## Contacto
- LinkedIn: [www.linkedin.com/in/josem-garcia-](https://www.linkedin.com/in/josem-garcia-)

## 🚀 Características principales

* ✅ Listar estudiantes
* 🔍 Buscar estudiante por **ID**
* ➕ Agregar estudiante
* ✏️ Modificar estudiante
* ❌ Eliminar estudiante
* 📋 Menú interactivo en consola para gestionar todas las operaciones

---

## 🛠️ Tecnologías utilizadas

* **Java 21**
* **Spring Boot 3**
* **Spring Data JPA**
* **Hibernate**
* **Lombok**
* **MySQL** (o cualquier base de datos relacional soportada por JPA)
* **SLF4J + LoggerFactory** para trazabilidad en consola

---

## 📂 Estructura del proyecto

```
src/main/java/com/elionc/estudiantes
│
├── EstudiantesApplication.java        # Clase principal con menú interactivo
│
├── models
│   └── Estudiante.java                # Entidad JPA con Lombok
│
├── repository
│   └── EstudianteRepository.java      # Repositorio JPA
│
└── service
    ├── IEstudianteService.java        # Interfaz del servicio
    └── EstudianteService.java         # Implementación del servicio
```

---

## ⚙️ Requisitos previos

Antes de ejecutar el proyecto, asegúrate de tener instalado:

* [Java 21](https://adoptium.net/)
* [Maven](https://maven.apache.org/)
* [MySQL](https://dev.mysql.com/downloads/) (o tu motor de BD preferido)
* Un IDE como IntelliJ IDEA, Eclipse o VS Code

---

## ▶️ Ejecución

1. Clonar este repositorio:

   ```bash
   git clone https://github.com/tu-usuario/sistema-estudiantes.git
   ```

2. Configurar la conexión a la base de datos en el archivo `application.properties`:

   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/estudiantes_db
   spring.datasource.username=tu_usuario
   spring.datasource.password=tu_password
   spring.jpa.hibernate.ddl-auto=update
   spring.jpa.show-sql=true
   ```

3. Ejecutar el proyecto desde el IDE o con Maven:

   ```bash
   mvn spring-boot:run
   ```

4. Interactuar con el menú en consola para gestionar estudiantes.

---

## 🖼️ Vista previa del menú

```
*** Sistema de Estudiantes ***
1. Lista de Estudiantes
2. Buscar Estudiante
3. Agregar Estudiante
4. Modificar Estudiante
5. Eliminar Estudiante
6. Salir
Elige una opcion:
```

---

## 🎯 Valor para el mercado laboral

Este proyecto demuestra habilidades en:

* **Arquitectura en capas (Controller - Service - Repository - Model)**
* **Manejo de JPA e Hibernate para persistencia**
* **Uso de Spring Boot para aplicaciones productivas**
* **Buenas prácticas con Lombok y SLF4J**
* **Interacción con bases de datos relacionales**


---

## 📌 Próximos pasos

* Implementar validaciones con **Jakarta Validation**
* Migrar la interfaz de consola a una **API REST** con Spring Web
* Añadir pruebas unitarias con **JUnit y Mockito**
* Integrar Swagger para documentación de API

---

👨‍💻 Autor: **Jose Maria Garcia**
📅 Proyecto académico y de práctica profesional
