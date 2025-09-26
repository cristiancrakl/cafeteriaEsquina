# Café la Esquina - Sistema de Reservaciones

## Descripción General

Este proyecto es una aplicación de escritorio desarrollada en Java utilizando Swing para la interfaz gráfica de usuario (GUI). Se trata de un sistema simple de gestión de reservaciones para un café llamado "Café la Esquina". El sistema permite configurar parámetros básicos del negocio (como el número de mesas y si se atiende los domingos), registrar clientes con sus datos de reservación, consultar la lista de clientes, buscar por cédula, y generar reportes estadísticos sobre la ocupación por días, mesas y totales semanales.

El código está organizado en el directorio `src/`, dividido en dos paquetes principales:

- **Interfaz**: Contiene las clases de la GUI.
- **Logica**: Maneja la lógica de negocio, incluyendo la estructura de datos para clientes y el seguimiento de ocupación.

La aplicación utiliza una lista enlazada para almacenar los datos de los clientes y un arreglo bidimensional para rastrear la cantidad de clientes por mesa y día de la semana.

## Estructura del Proyecto

### Directorio `src/`

- **Interfaz/**
  - `logicaNegocio.java`: Ventana inicial para configurar los parámetros del negocio (número de mesas y si se atiende domingos). Una vez configurado, pasa a la interfaz de registro de clientes.
  - `menuInicio.java`: Menú principal con opciones para:
    - Ingresar un nuevo cliente.
    - Consultar todos los clientes.
    - Buscar cliente por número de cédula.
    - Ver total de clientes por semana.
    - Ver total de clientes por día de la semana.
    - Ver total de clientes por mesa.
    - Identificar el día con más clientes.
  - `registrarCliente_Interfaz.java`: Formulario para registrar un cliente, solicitando nombre, número de cédula, mesa, y día de la semana. Captura automáticamente la hora de ingreso.
- **Logica/**
  - `crudCliente_Logica.java`: Clase principal de lógica. Maneja:
    - Inicialización de la matriz de ocupación (mesas x días).
    - Inserción de clientes en una lista enlazada.
    - Consultas (todas las clientes o por ID).
    - Cálculos estadísticos (totales por semana, día, mesa; día más ocupado).
    - Conversión de números de día a nombres en español.
  - `Persona.java`: Clase que representa a un cliente, con atributos como nombre, cédula, posición de mesa, día de la semana y hora de ingreso. Incluye método para mostrar los atributos.
  - `Nodo.java`: Clase para nodos de la lista enlazada que almacena los objetos `Persona`.
- `Run.java`: Clase principal de ejecución. Inicia la aplicación abriendo la ventana de configuración (`logicaNegocio`).

### Archivos Adicionales

- Archivos `.form`: Generados por NetBeans para el diseño de las interfaces GUI (no editar manualmente).
- `build.xml` y `nbproject/`: Archivos de configuración para compilación con Ant (usado en NetBeans).

## Características Principales

- **Configuración Inicial**: Define el número de mesas y los días de operación (6 o 7 días, incluyendo domingos opcionalmente).
- **Registro de Clientes**: Valida entradas (mesa válida, día de la semana correcto) y registra la hora actual de ingreso.
- **Gestión de Datos**:
  - Lista enlazada para almacenar clientes (permite inserciones eficientes).
  - Matriz 2D para contar ocupación por mesa y día (facilita reportes).
- **Reportes**:
  - Consulta completa de clientes con sus detalles.
  - Búsqueda por cédula.
  - Totales semanales, por día (lunes a domingo), por mesa.
  - Día con mayor afluencia de clientes.
- **Interfaz en Español**: Todos los labels y mensajes están en español, adaptados al contexto de un café.
- **Manejo de Errores**: Usa `JOptionPane` para mostrar mensajes de éxito, error o validación (ej. día inválido, mesa fuera de rango).

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
   - Se abre la ventana de configuración: Ingresa el número de mesas y selecciona si atienden domingos.
   - Confirma para pasar al registro de cliente.
   - Registra clientes uno por uno (o regresa al menú principal).
   - Desde el menú, usa las opciones para consultar o generar reportes.
   - La aplicación cierra al salir de cualquier ventana principal.

## Limitaciones y Mejoras Posibles

- **Persistencia**: Los datos se pierden al cerrar la aplicación (en memoria). Podría agregarse guardado en archivo o base de datos.
- **Validaciones**: Mejora el manejo de excepciones (ej. entradas no numéricas).
- **UI/UX**: Interfaz básica podría mejorarse con diseños más modernos o validaciones en tiempo real.
- **Escalabilidad**: La lista enlazada es simple etsa bien para este sistema pero para grandes volúmenes, habria que considerar estructuras más eficientes.

## Autor

- Desarrollado por Cristiancrakl Keiner y Compañia.
