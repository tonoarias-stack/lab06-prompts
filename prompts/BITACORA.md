# Bitacora de prompts

Laboratorio 06: Fundamentos de Ingenieria de Prompts.

Herramienta de IA usada: Claude

## Ejercicio 2: Tokens y ventana de contexto

Modelo del tokenizador usado: GPT-5.x & O1/3

| Texto                              | Caracteres | Tokens |
| ---------------------------------- | ---------- | ------ |
| Los estudiantes programan en Java. | 34         | 7      |
| The students program in Java.      | 29         | 6      |
| desafortunadamente                 | 18         | 4      |

En el paso 4, la IA respondió TiendaTec y Java Swing porque ese dato estaba dentro de la ventana de contexto del mismo chat.

En el paso 5, en un chat nuevo, dijo que no tenía información porque la ventana de contexto estaba vacía: nunca recibió ese dato.

## Ejercicio 3: Temperatura

| Temperatura | % de BiblioTec | Nombres en los 5 intentos                               |
| ----------- | -------------- | ------------------------------------------------------- |
| 0           | 100 %          | BiblioTec, BiblioTec, BiblioTec, BiblioTec, BiblioTec   |
| 0.5         | 65,3 %         | LibroYa, BiblioTec, PrestaLibro, BiblioTec, BiblioTec   |
| 1           | 44,5 %         | PrestaLibro, BiblioTec, LibroYa, LibroYa, BiblioTec     |
| 1.8         | 32,2 %         | BiblioTec, PrestaLibro, PrestaLibro, LectoGo, BiblioTec |

Al subir la temperatura, los porcentajes se reparten y empiezan a salir nombres distintos, incluso los menos probables.
El simulador nunca inventa un nombre nuevo porque solo elige entre las opciones que ya están en su lista: la temperatura cambia qué tan arriesgada es la elección, no lo que sabe.

## Ejercicio 4: Prompt vago vs estructurado

| Criterio                            | Prompt vago | Prompt estructurado |
| ----------------------------------- | ----------- | ------------------- |
| Menciona el objetivo del sistema    | Sí          | Sí                  |
| Menciona a los usuarios principales | Sí          | Sí                  |
| Tiene exactamente 3 funcionalidades | No          | Sí                  |
| Esta en 3 parrafos                  | No          | Sí                  |
| Lo usaria en un informe real        | No          | Sí                  |

El prompt vago dio una respuesta muy larga, con 7 módulos, tablas y listas, y ofreció más cosas al final. El prompt estructurado dio justo lo pedido: objetivo, usuarios y 3 funcionalidades en 3 párrafos.

## Ejercicio 5: Anatomia de un prompt

| Componente  | Texto de mi prompt                                                                                       |
| ----------- | -------------------------------------------------------------------------------------------------------- |
| Rol         | Actua como desarrollador Java.                                                                           |
| Instruccion | Crea un programa en Java ... usando una clase Producto con los atributos codigo, nombre, precio y stock. |
| Contexto    | ... para gestionar los productos de una tienda                                                           |
| Ejemplo     | Usa este estilo para los metodos: getPrecio(), setPrecio(double precio).                                 |
| Formato     | Explica primero la estructura de la clase y luego presenta el codigo Java.                               |

- Nivel 1: creó una calculadora en Java, un programa cualquiera sin relación con una tienda.
- Nivel 2 (+ Rol): respondió con un tono más técnico, pero el programa siguió siendo general.
- Nivel 3 (+ Contexto): el programa ya trató sobre gestionar productos de una tienda.
- Nivel 4 (+ Instruccion): creó la clase Producto con los atributos codigo, nombre, precio y stock.
- Nivel 5 (+ Formato): explicó primero la estructura de la clase y después presentó el código Java.
- Ejemplos: usó los métodos getPrecio() y setPrecio(double precio) con el estilo pedido.

## Ejercicio 6: Del prompt basico al profesional

| Qué revisar                                            | Cumple (Sí/No) |
| ------------------------------------------------------ | -------------- |
| ¿Está escrito en Java y usa Swing?                     | Sí             |
| ¿Pide correo y contraseña?                             | Sí             |
| ¿Explica el funcionamiento antes o después del código? | Sí             |
| ¿El código está organizado en clases?                  | Sí             |
| ¿Valida los datos que ingresa el usuario?              | Sí             |

```text
PROMPT PROFESIONAL:
Actua como desarrollador Java experto. Crea un ejemplo de interfaz grafica para un Login usando Java Swing. Debe incluir dos campos de texto (correo electronico y contrasena) y un boton de ingreso. Explica brevemente la estructura de las clases y presenta el codigo completo.

MEJORA (ITERACION):
Agrega validaciones al codigo anterior: verifica que el correo contenga el caracter '@' y que la contrasena tenga como minimo 8 caracteres. Si los datos son invalidos o correctos, muestra las alertas correspondientes usando cajas de dialogo JOptionPane.
```
