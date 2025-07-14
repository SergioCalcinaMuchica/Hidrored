# Proyecto Hidrored

Este repositorio contiene el código fuente de la aplicación **Hidrored**, una plataforma web diseñada para ayudar a los ciudadanos a reportar problemas relacionados con el servicio de agua y desagüe en sus respectivas zonas.

## Propósito y Funcionalidades del Programa

**Hidrored** busca facilitar la comunicación entre los ciudadanos y las entidades responsables de los servicios de agua y desagüe, permitiendo un reporte ágil y un seguimiento transparente de las incidencias.

### Propósito Principal:
* **Centralización de Reportes:** Proporcionar un canal único y accesible para que los usuarios puedan informar sobre problemas de agua y desagüe de manera eficiente.
* **Transparencia y Seguimiento:** Ofrecer a los usuarios la capacidad de rastrear el estado de sus reportes en tiempo real y recibir actualizaciones.
* **Mejora de la Gestión:** Ayudar a las autoridades o empresas de servicios a recibir información detallada y localizada de los problemas, facilitando una respuesta más rápida y efectiva.

### Funcionalidades Clave:

* **Gestión de Usuarios:**
    * Registro de nuevos usuarios.
    * Autenticación de usuarios (login).
    * Acceso al perfil de usuario.
* **Reporte de Incidencias de Agua/Desagüe:**
    * **Creación de Reportes:** Los usuarios pueden crear nuevos reportes de problemas, incluyendo:
        * Título y descripción detallada del problema.
        * Ubicación precisa (latitud, longitud y dirección).
        * Tipo de problema (fuga, tubería rota, desborde, etc.).
        * Prioridad del reporte (baja, media, alta, urgente).
    * **Adjuntar Evidencia:** Posibilidad de subir imágenes para documentar el reporte.
    * **Comentarios:** Los usuarios y, en una fase posterior, el personal autorizado, pueden añadir comentarios para clarificar o actualizar la información del reporte.
    * **Historial de Cambios:** Cada reporte mantendrá un historial detallado de los cambios de estado y otras actualizaciones relevantes.
    * **Actualización de Estado:** El estado del reporte puede ser actualizado (Pendiente, En Progreso, Resuelto, Cerrado) reflejando el avance de la resolución del problema.
* **Notificaciones:**
    * Los usuarios recibirán notificaciones sobre el estado de sus reportes o cualquier actualización relevante.
    * Posibilidad de marcar notificaciones como leídas.

## Arquitectura del Sistema

El proyecto Hidrored sigue una arquitectura por capas basada en **Domain-Driven Design (DDD)** y la **Arquitectura Hexagonal (Ports and Adapters)**, lo que garantiza una alta cohesión, bajo acoplamiento, mantenibilidad y escalabilidad.

### Estructura de Paquetes:

El backend está organizado en las siguientes capas principales:

* **Dominio (`backend/Dominio`):** El corazón de la aplicación, contiene la lógica de negocio pura y agnóstica a la tecnología (Entidades, Objetos de Valor, Agregados, Interfaces de Repositorio, Servicios de Dominio).
* **Aplicación (`backend/Aplicacion`):** Define los casos de uso del sistema. Orquesta las operaciones del dominio, maneja transacciones y utiliza DTOs para la comunicación con la capa de presentación.
* **Infraestructura (`backend/Infraestructura`):** Proporciona las implementaciones concretas de las interfaces de repositorio (usando Spring Data MongoDB), servicios de almacenamiento de imágenes, y configuraciones generales (seguridad, CORS).
* **Presentación (`backend/Presentacion`):** Expone la API RESTful del backend, manejando las solicitudes y respuestas HTTP a través de controladores y DTOs específicos para la API.

### Diagrama de Clases UML (Visión General de Capas y Módulos)

![Diagrama de Arquitectura Hidrored Backend](src/uml.png)
