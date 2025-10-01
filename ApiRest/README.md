# API REST de Gestión de Usuarios

![Spring Boot](https://img.shields.io/badge/Spring%20Boot-v3.0-green)
![Java](https://img.shields.io/badge/Java-v17-blue)
![License](https://img.shields.io/badge/License-MIT-yellow)

## Descripción

Esta es una API REST desarrollada con **Spring Boot** para gestionar usuarios, permitiendo realizar operaciones de **CRUD** (Crear, Leer, Actualizar y Eliminar) y consultas por prioridad.  
El proyecto está diseñado para servir como **backend de aplicaciones web** y puede integrarse fácilmente con frontends o herramientas de prueba como **Postman**.

## Contacto
- LinkedIn: [www.linkedin.com/in/josem-garcia-](https://www.linkedin.com/in/josem-garcia-)
---

## Características principales

- Crear nuevos usuarios con nombre, email y prioridad.
- Obtener todos los usuarios.
- Consultar usuarios por **ID** o por **prioridad**.
- Eliminar usuarios por ID.
- Arquitectura basada en **Spring Boot**, usando **JPA/Hibernate** para persistencia en base de datos.

---

## Tecnologías utilizadas

- **Java 17**  
- **Spring Boot 3.x**  
- **Spring Data JPA**  
- **Hibernate**  
- **H2 / MySQL / PostgreSQL** (según configuración de la base de datos)  
- **Maven** para gestión de dependencias

---

## Estructura del proyecto

com.elionc.ApiRest
├── ApiRestApplication.java # Clase principal de Spring Boot
├── models
│ └── UsuarioModel.java # Modelo de datos del usuario
├── repositories
│ └── UsuarioRepository.java # Repositorio JPA para operaciones con usuarios
├── services
│ └── UsuarioService.java # Lógica de negocio
└── controllers
└── UsuarioController.java # Endpoints REST para usuarios

# Requisitos previos

- Java 17 o superior
- Maven
- Base de datos configurada (H2 para pruebas en memoria, o MySQL/PostgreSQL para persistencia)
- IDE compatible (IntelliJ IDEA, Eclipse, VSCode)

---

Valor para el mercado laboral

Este proyecto demuestra conocimientos en Spring Boot, REST API, JPA y buenas prácticas en arquitectura de servicios.

Puede usarse como base para proyectos más complejos, integrando seguridad, autenticación o frontend moderno.

Es útil para portafolios y entrevistas técnicas en backend Java.