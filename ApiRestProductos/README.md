# Sistema de Productos y Clientes - Spring Boot

Aplicación RESTful desarrollada con **Spring Boot** que gestiona un sistema de productos y clientes. Permite la recuperación dinámica de productos desde una lista en memoria o desde un archivo JSON, según la configuración, e incluye endpoints CRUD básicos para clientes.

---
## 👨‍💻 Autor

**José María García**
Desarrollador Java Backend

LinkedIn: [www.linkedin.com/in/josem-garcia-](https://www.linkedin.com/in/josem-garcia-)
 

---
## 🚀 Características principales

* API REST completa con endpoints `/productos` y `/clientes`.
* Configuración externa mediante `application.properties`.
* Implementación de **inyección de dependencias** y **condiciones de carga de beans** (`@ConditionalOnProperty`).
* Uso de **Externalized Configuration** para obtener datos personalizados de la aplicación.
* Dos implementaciones del servicio de productos:

  * **ProductsServiceImpl**: carga productos desde una lista estática.
  * **ProductsServiceJSONImpl**: carga productos desde un archivo `products.json`.

---

## 🧩 Estructura del proyecto

```
cursoSpringB/
│
├── com.corporativoX.cursoSpringB/
│   ├── CursoSpringBApplication.java           # Clase principal (entry point)
│   ├── domain/
│   │   ├── Product.java                       # Modelo de producto
│   │   └── Customer.java                      # Modelo de cliente
│   ├── controllers/
│   │   ├── ProductController.java             # Controlador REST para productos
│   │   └── CustomerController.java            # Controlador REST para clientes
│   ├── service/
│   │   ├── ProductService.java                # Interfaz común de servicio
│   │   ├── ProductsServiceImpl.java           # Servicio de productos (lista)
│   │   └── ProductsServiceJSONImpl.java       # Servicio de productos (JSON)
│   └── configurations/
│       └── ExternalizedConfigurations.java    # Configuración personalizada externa
│
└── resources/
    ├── application.properties                 # Configuración de la aplicación
    └── products.json                          # Datos de productos (si se usa modo JSON)
```

---

## ⚙️ Configuración

En el archivo `application.properties` puedes definir los parámetros principales del sistema:

```properties
spring.application.name=cursoSpringB
server.servlet.context-path=/sistema/api/v1
server.port=8080

# Modo de carga de productos (list o json)
service.products=list

# Configuración personalizada de la aplicación
app.name=Sistema de Productos
app.version=1.0.0
app.autor=Jose Maria Garcia
app.language=es
app.country=Espain
```

Para cambiar la fuente de datos de productos a JSON:

```properties
service.products=json
```

---

## 🔗 Endpoints disponibles

### 📦 Productos

| Método | Endpoint     | Descripción                     |
| ------ | ------------ | ------------------------------- |
| GET    | `/productos` | Devuelve la lista de productos. |

**Ejemplo de respuesta:**

```json
[
  { "id": 1, "name": "Portatil", "price": 799.99, "stock": 10 },
  { "id": 2, "name": "Smartphone", "price": 499.99, "stock": 25 }
]
```

---

### 👥 Clientes

| Método | Endpoint               | Descripción                              |
| ------ | ---------------------- | ---------------------------------------- |
| GET    | `/clientes`            | Lista todos los clientes.                |
| GET    | `/clientes/{username}` | Busca un cliente por nombre de usuario.  |
| POST   | `/clientes`            | Crea un nuevo cliente.                   |
| PUT    | `/clientes`            | Actualiza todos los datos de un cliente. |
| PATCH  | `/clientes`            | Actualiza parcialmente un cliente.       |
| DELETE | `/clientes/{id}`       | Elimina un cliente por su ID.            |

---

## 🧠 Conceptos aplicados

* **Inyección de dependencias** (`@Autowired`)
* **Servicios condicionales** (`@ConditionalOnProperty`)
* **Configuración externa** con `@ConfigurationProperties`
* **Controladores REST** (`@RestController`, `@RequestMapping`)
* **Gestión de respuestas** con `ResponseEntity`
* **Uso de URIs dinámicas** con `ServletUriComponentsBuilder`
* **Serialización JSON** con Jackson (`ObjectMapper`)

---

## 🧪 Ejecución del proyecto

1. Clonar el repositorio:

   ```bash
   git clone https://github.com/tuusuario/cursoSpringB.git
   cd cursoSpringB
   ```

2. Ejecutar la aplicación:

   ```bash
   mvn spring-boot:run
   ```

3. Acceder a los endpoints desde el navegador o Postman:

   ```
   http://localhost:8080/sistema/api/v1/productos
   http://localhost:8080/sistema/api/v1/clientes
   ```

---

## 🧰 Tecnologías utilizadas

* **Java 17+**
* **Spring Boot 3+**
* **Maven**
* **Jackson Databind**
* **Spring Web**
* **Lombok (opcional)**


---



## 📜 Licencia

Este proyecto se distribuye bajo la licencia MIT. Puedes usarlo, modificarlo y distribuirlo libremente con atribución al autor original.
