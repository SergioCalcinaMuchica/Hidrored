EN RAMA DEV:

Estilos de programación aplicados

Pipeline (Fluent API): En mis clases de configuración de Spring Security (SecurityConfig.java y WebConfig.java) utilizo el builder pattern para encadenar llamadas en un flujo tipo tubería. Cada llamada devuelve el mismo objeto http, lo que permite una sintaxis concisa y legible. Por ejemplo: http.csrf(csrf -> csrf.disable()).authorizeHttpRequests(authz -> authz.requestMatchers("/api/**").permitAll().anyRequest().authenticated());

RESTful: Sigo convenciones REST para organizar mis endpoints. Toda la API queda expuesta bajo el path /api/**, de manera que cada URI representa un recurso, por ejemplo: /api/reportes /api/seguimiento /api/usuarios La configuración de seguridad en Spring hace que esas rutas sean accesibles sin autenticación y protege el resto de endpoints.

Cookbook: En React he creado componentes “recetarios” reutilizables que encapsulan fragmentos de UI completos. Cada uno es una receta para montar una pieza de interfaz y luego los combino en mi página principal. Ejemplos: – IconCard: receta para mostrar una tarjeta con icono, título y descripción, definida como const IconCard: React.FC<{ icon: JSX.Element; title: string; children: ReactNode }> = ({ icon, title, children }) => (…); – ReportIcon, TrackIcon e ImproveIcon: recetas para renderizar distintos SVG de iconos.

Things: Modelado de “cosas” tanto en frontend como en backend: – En React: cada componente (IconCard, ReportIcon, TrackIcon, ImproveIcon, HomePage) es un objeto con datos (props) y comportamiento (método render). – En Spring: cada bean (PasswordEncoder, SecurityFilterChain) es una cosa gestionada por el contenedor, con su propia configuración y ciclo de vida. Por ejemplo: @Bean public PasswordEncoder passwordEncoder() { return new BCryptPasswordEncoder(); } @Bean public SecurityFilterChain filterChain(HttpSecurity http) throws Exception { … }

LABORATORIO 11

En la categoría Nombres, se utilizaron identificadores descriptivos y autoexplicativos. Por ejemplo, las clases SecurityConfig y WebConfig reflejan claramente su función en la aplicación. Asimismo, métodos como filterChain y passwordEncoder, y componentes como IconCard, ReportIcon, TrackIcon e ImproveIcon, fueron nombrados de forma clara, lo que mejora la legibilidad y evita ambigüedades.

En cuanto a Funciones, se diseñaron funciones pequeñas y con una sola responsabilidad. En SecurityConfig.java, los métodos passwordEncoder() y filterChain() realizan tareas específicas y bien delimitadas. En el frontend, el componente IconCard también mantiene una estructura concisa y reutilizable, lo cual respeta el principio de responsabilidad única.

Respecto a los Comentarios, se agregaron anotaciones útiles en WebConfig.java para explicar configuraciones clave del CORS, como las rutas permitidas, métodos HTTP, cabeceras y origen del frontend. Los comentarios se enfocan en aclarar el propósito de las configuraciones, sin redundar en lo que ya es evidente por el código.

En la categoría de Estructura de Código Fuente, se mantuvo un estilo de codificación limpio, ordenado y bien indentado. El código está organizado en clases separadas por responsabilidad, con bloques lógicos diferenciados y formato consistente, tanto en Java como en TypeScript. Esto facilita el mantenimiento y comprensión general del sistema.

Para la categoría Objetos / Estructura de Datos, se aplicó una buena práctica en el frontend mediante el uso del componente IconCard, que encapsula estructura y diseño visual con propiedades claras (icon, title, children). Esto permite la reutilización del componente en distintas secciones, respetando principios de diseño modular.

En cuanto al Tratamiento de Errores, SonarLint detectó el uso incorrecto de una excepción genérica (RuntimeException). Para corregir este code smell, se creó una clase de excepción personalizada llamada SecurityConfigurationException, ubicada en un nuevo paquete exception. Esta fue utilizada en el método filterChain() para lanzar errores con mayor especificidad, cumpliendo la regla java:S112 y mejorando la trazabilidad de errores.

Finalmente, en la categoría de Clases, se respetó el principio de responsabilidad única. WebConfig se encarga exclusivamente de configurar CORS, mientras que SecurityConfig gestiona la seguridad de la aplicación. Esta separación clara entre clases mejora la cohesión del código y permite mantener cada módulo enfocado en una tarea específica.

LABORATORIO 12

1. S - Principio de Responsabilidad Única (Single Responsibility Principle)
Cada clase en la implementación cumple una única función bien definida.
SecurityConfig se encarga exclusivamente de la configuración de seguridad de la aplicación.


WebConfig tiene como única responsabilidad habilitar CORS.


En el frontend, IconCard es un componente de presentación que encapsula un diseño reutilizable.


Este diseño favorece la mantenibilidad, ya que si una parte del sistema requiere cambios (por ejemplo, CORS), solo se modifica una clase específica sin afectar otras.
2. O - Principio Abierto/Cerrado (Open/Closed Principle)
El código está diseñado para permitir extensiones sin modificar la lógica existente.
El componente IconCard puede recibir diferentes íconos y contenidos a través de props, sin necesidad de modificar su implementación interna.


SecurityConfig puede extenderse fácilmente con nuevos filtros de seguridad o rutas protegidas, sin alterar la estructura base del método filterChain.


Esto permite agregar nueva funcionalidad sin romper la ya existente, facilitando el crecimiento del sistema.
3. I - Principio de Segregación de Interfaces (Interface Segregation Principle)
En WebConfig, solo se implementa la interfaz necesaria: WebMvcConfigurer.
Se sobreescribe únicamente el método addCorsMappings(), sin forzar la implementación de métodos que no se necesitan.
 Esto demuestra que la clase interactúa solo con lo que requiere, sin depender de métodos o contratos innecesarios.



4. D - Principio de Inversión de Dependencias (Dependency Inversion Principle)
En SecurityConfig, se usa la anotación @Bean para definir PasswordEncoder, desacoplando la clase de la implementación concreta.
En lugar de instanciar directamente BCryptPasswordEncoder, se inyecta a través de Spring como una abstracción (PasswordEncoder), permitiendo reemplazar la implementación si fuera necesario.


Esto favorece la flexibilidad y la posibilidad de realizar pruebas con otras implementaciones del encoder sin cambiar la lógica del sistema.


