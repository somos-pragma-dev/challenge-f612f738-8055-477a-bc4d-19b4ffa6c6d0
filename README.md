# Desarrollo de una API REST para gestión de productos

La empresa necesita una API REST para gestionar productos. La API debe permitir crear, leer, actualizar y eliminar productos. Cada producto tiene un nombre, precio, stock y categoría. La API debe validar que el nombre no esté duplicado y que el precio no sea negativo. Además, debe generar documentación OpenAPI para facilitar su uso por parte de los desarrolladores.

## Informacion General

| Campo | Valor |
|-------|-------|
| **Tema** | API REST con validación de entidades y documentación |
| **Nivel** | junior-l1 |
| **Tipo** | practical |
| **Tiempo estimado** | 8 horas |

## Fases del Reto

### Fase 0: Configuración del Proyecto

**Objetivo:** Obtener el proyecto base funcional enviando el Código Base a un asistente de IA, que lo analizará, corregirá errores y generará un ZIP listo para usar.

**Tiempo estimado:** 15-30 minutos

**Instrucciones:**

- Asegúrate de tener instalado para ejecutar el proyecto: Un IDE o editor de código.
- Copia todo el contenido del campo **Código Base** de este reto — incluyendo el texto de instrucciones que aparece al inicio.
- Abre un asistente de IA (Claude en claude.ai, ChatGPT o Gemini — se recomienda Claude), pega el contenido copiado en el chat y envíalo.
- El asistente analizará los archivos, corregirá errores y generará un archivo ZIP descargable. Descárgalo y extráelo en la carpeta donde quieras trabajar.
- Verifica que el proyecto arranca sin errores.

**Entregable:** El proyecto compila/arranca sin errores.

<details>
<summary>Pistas de conocimiento</summary>

- Copia el Código Base completo incluyendo el texto de instrucciones al inicio — esas instrucciones le indican al asistente exactamente qué hacer con los archivos.
- Si el asistente no genera el ZIP automáticamente al terminar el análisis, escríbele: "genera el ZIP ahora".
- Si el proyecto tiene errores al arrancar, comparte el mensaje de error con el mismo asistente para que lo corrija.

</details>

### Fase 1: Definición de la estructura del producto

**Objetivo:** Definir la estructura del producto y sus validaciones.

**Tiempo estimado:** 2 horas

**Instrucciones:**

- Identificar las propiedades de un producto (nombre, precio, stock, categoría).
- Definir las reglas de validación para el producto (nombre único, precio no negativo).

**Entregable:** Especificación de la estructura del producto y sus validaciones.

<details>
<summary>Pistas de conocimiento</summary>

- Piensa en cómo garantizar la unicidad del nombre y evitar precios negativos.
- Considera cómo documentar estas validaciones para que sean claras para los usuarios de la API.

</details>

### Fase 2: Implementación de la API REST

**Objetivo:** Implementar la API REST con las validaciones definidas.

**Tiempo estimado:** 4 horas

**Instrucciones:**

- Crear los endpoints para crear, leer, actualizar y eliminar productos.
- Aplicar las validaciones definidas en la fase anterior.

**Entregable:** API REST implementada con validaciones.

<details>
<summary>Pistas de conocimiento</summary>

- Recuerda que debes validar el nombre y el precio antes de guardar un producto.
- Piensa en cómo manejar los errores de validación y devolver mensajes claros al usuario.

</details>

### Fase 3: Generación de documentación OpenAPI

**Objetivo:** Generar documentación OpenAPI para la API REST.

**Tiempo estimado:** 2 horas

**Instrucciones:**

- Configurar la generación de documentación OpenAPI.
- Asegurarte de que la documentación incluya todas las operaciones y validaciones de la API.

**Entregable:** Documentación OpenAPI generada para la API REST.

<details>
<summary>Pistas de conocimiento</summary>

- Recuerda que la documentación debe ser clara y fácil de entender para los desarrolladores.
- Piensa en cómo incluir todas las operaciones y validaciones en la documentación.

</details>

## Dimensiones Evaluadas

- **queEs**: ¿Qué es un producto en el contexto de esta API?
- **paraQueSirve**: ¿Para qué sirve validar el nombre y el precio de un producto?
- **comoSeUsa**: ¿Cómo se usa la documentación OpenAPI para entender la API?
- **erroresComunes**: ¿Cuáles son los errores comunes al implementar una API REST con validaciones?

## Criterios de Evaluacion

- Definición clara de la estructura del producto y sus validaciones.
- Implementación correcta de la API REST con las validaciones definidas.
- Generación de documentación OpenAPI completa y clara.

---

*Reto generado automaticamente por Challenge Generator - Pragma*
