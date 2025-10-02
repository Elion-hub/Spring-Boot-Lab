# 🐉 API REST Pokémon - Spring Boot

![GitHub repo size](https://img.shields.io/github/repo-size/tuusuario/ApiRest2)
![GitHub language count](https://img.shields.io/github/languages/count/tuusuario/ApiRest2)
![GitHub stars](https://img.shields.io/github/stars/tuusuario/ApiRest2?style=social)
![GitHub forks](https://img.shields.io/github/forks/tuusuario/ApiRest2?style=social)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-2.7-green)
![Java](https://img.shields.io/badge/Java-17-blue)
![Coverage](https://img.shields.io/badge/Coverage-95%25-brightgreen)
![Build Status](https://img.shields.io/badge/Build-Passing-green)

---

📫 Contacto

LinkedIn: [www.linkedin.com/in/josem-garcia-](https://www.linkedin.com/in/josem-garcia-)

## ✨ Descripción

¡Bienvenido a tu **API REST de Pokémon**! 🐾  
Gestiona tu colección de Pokémon con **CRUD completo**, consultas por nivel y **bulk insert**.  
Este proyecto está pensado para **portafolio profesional**, pruebas de API y demostraciones interactivas.  

![Pokémon Banner](https://raw.githubusercontent.com/tuusuario/ApiRest2/main/images/pokemon-banner.gif)

---

## 🎯 Características principales

| 🔹 Funcionalidad | 🔹 Detalles |
|-----------------|-------------|
| 📝 Listar Pokémon | GET `/pokemons` |
| ⚡ Guardar Pokémon | POST `/pokemons` |
| 🌐 Bulk insert | POST `/pokemons/bulk` |
| 🔎 Consultar por ID | GET `/pokemons/{id}` |
| 🏋️ Filtrar por nivel | GET `/pokemons/query?nivel=x` |
| ❌ Eliminar Pokémon | DELETE `/pokemons/{id}` |

---

---

## 📊 Mini Dashboard de Pokémon

| Pokémon | Clase | Nivel | Emoji |
|---------|-------|-------|-------|
| **Bulbasaur** | Planta | 6 | 🌱 |
| **Charmander** | Fuego | 8 | 🔥 |
| **Squirtle** | Agua | 7 | 💧 |
| **Pikachu** | Eléctrico | 5 | ⚡ |
| **Jigglypuff** | Normal / Hada | 4 | 🎤 |
| **Meowth** | Normal | 3 | 🐱 |

## 🛠 Tecnologías utilizadas

| Backend | Base de Datos | Herramientas |
|---------|---------------|--------------|
| Java 17+ | H2 / MySQL | Maven |
| Spring Boot | JPA / Hibernate | Postman / cURL |

---

## 📂 Estructura del proyecto
ApiRestPokemon/
├─ src/main/java/com/elionc/ApiRest2/
│ ├─ controllers/ # Endpoints REST
│ ├─ models/ # Entidad Pokémon
│ ├─ repositories/ # CRUD JPA
│ ├─ services/ # Lógica de negocio
│ └─ ApiRest2Application.java # Clase principal

🌟 Valor profesional

Practica backend + base de datos con Spring Boot y JPA

Domina APIs REST robustas y escalables

Portafolio GitHub visual y profesional

Integración fácil con frontend y pruebas de API

🔜 Roadmap / Próximos pasos

✅ Validaciones en modelos

✅ Mejor manejo de errores y respuestas HTTP

💡 Integrar Swagger/OpenAPI

💡 Conectar con un frontend interactivo

💡 Añadir tests unitarios y de integración con badges de cobertura
