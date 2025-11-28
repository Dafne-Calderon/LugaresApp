# LugaresApp

Aplicación móvil desarrollada en **Android Studio (Java + XML)** que permite visualizar una lista de lugares reales en Chile, mostrando información relevante como nombre, descripción, dirección, imagen y ubicación geográfica.  
Cada elemento de la lista puede abrirse para ver más detalles y su localización directamente en **Google Maps**.

Este proyecto fue creado como actividad académica para reforzar conceptos como RecyclerView, Adapters, navegación entre Activities y uso de Intents.

---

##  Características principales

- **Listado dinámico** de 10–20 lugares usando RecyclerView  
- **Imágenes HD** cargadas desde Internet (Glide)  
- **Pantalla de detalle** con información completa del lugar  
- **Botón para abrir el sitio en Google Maps**  
- **Splash Screen personalizado**  
- **Tema elegante estilo capuchino pastel**  
- Arquitectura simple con **Repositorio de datos (PlaceRepository)**  


---

## Tecnologías utilizadas

- **Java**
- **Android Studio 2025.2.1 (Otter)**
- **Gradle DSL Groovy**
- **RecyclerView**
- **Glide** para carga de imágenes
- **Google Maps Intent**
- **XML para diseño de interfaces**

## Consideraciones
El proyecto cumple con todos los requerimientos fundamentales de la actividad: RecyclerView, detalle, navegación entre Activities, Splash Screen, carga de imágenes con Glide y apertura de ubicación en Maps.

Algunas tecnologías como StateFlow, Coroutines o MVVM completo no fueron implementadas porque son exclusivas de Kotlin.

