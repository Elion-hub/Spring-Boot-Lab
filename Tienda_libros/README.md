# 📚 Tienda Libros

Aplicación de escritorio desarrollada en **Java con Spring Boot** que permite gestionar un inventario de libros. Integra una interfaz gráfica con **Swing** para interactuar con el usuario y utiliza **Spring Data JPA** para la persistencia de datos.

---

## 🚀 Características principales

* 📖 **Gestión de libros**: agregar, modificar, listar y eliminar registros.
* 🖥️ **Interfaz gráfica (Swing)**: sencilla y funcional para CRUD de libros.
* 🗄️ **Persistencia con JPA**: conexión a base de datos a través de `LibroRepository`.
* 🔗 **Arquitectura organizada**: separación en capas (modelo, repositorio, servicio y vista).
* ⚡ **Spring Boot con Swing**: integración de backend con interfaz gráfica.

---

## Contacto
- LinkedIn: [www.linkedin.com/in/josem-garcia-](https://www.linkedin.com/in/josem-garcia-)

---

## 🛠️ Tecnologías utilizadas

* **Java 17+**
* **Spring Boot** (contexto, gestión de dependencias, JPA)
* **Spring Data JPA** (repositorio para persistencia)
* **Hibernate** (implementación ORM)
* **Swing** (interfaz gráfica)
* **Lombok** (reducción de boilerplate en entidades)
* **Maven** (gestión de dependencias)

---

## 📂 Estructura del proyecto

```
src/main/java/com/elionc/Tienda_libros
│
├── models/
│   └── Libro.java              # Entidad JPA Libro
│
├── repository/
│   └── LibroRepository.java    # Repositorio con JpaRepository
│
├── service/
│   ├── ILibroService.java      # Interfaz de servicio
│   └── LibroService.java       # Implementación del servicio
│
├── vista/
│   └── LibroForm.java          # Interfaz gráfica Swing
│
└── TiendaLibrosApplication.java # Clase principal con arranque Spring Boot
```

---

## 📋 Requisitos previos

* Tener instalado **Java 17+**
* Tener configurado **Maven**
* Una base de datos compatible con JPA (ej. MySQL, H2, PostgreSQL)
* IDE recomendado: IntelliJ IDEA, Eclipse o VS Code

---

## ▶️ Ejecución del proyecto

1. Clonar el repositorio:

```bash
git clone https://github.com/tuusuario/tienda-libros.git
cd tienda-libros
```

2. Compilar y ejecutar con Maven:

```bash
mvn spring-boot:run
```

3. La aplicación abrirá una ventana **Swing** para gestionar los libros.

---

## 🖼️ Vista previa

Interfaz gráfica de ejemplo:

* 📌 Formulario para añadir o editar libros
* 📌 Tabla con los libros almacenados
* 📌 Botones para agregar, modificar y eliminar registros

![Tienda_libros]()

---

## 💼 Valor profesional

Este proyecto es un **ejemplo práctico de integración de Java Swing con Spring Boot y JPA**, mostrando cómo combinar interfaz gráfica con backend robusto.
Es especialmente útil para:

* Practicar **CRUD completo en Java**.
* Reforzar conceptos de **arquitectura en capas**.
* Mejorar el entendimiento de **Spring Boot en aplicaciones no web**.

---

## 🔮 Próximos pasos

* 📊 Conectar con base de datos externa (MySQL/PostgreSQL).
* 📝 Validar datos de entrada en el formulario.
* 🎨 Mejorar la interfaz gráfica con JavaFX o frameworks modernos.
* 🌐 Migrar la aplicación a versión web con **Spring Boot + Thymeleaf**.

---

👨‍💻 Desarrollado por **Elion**
