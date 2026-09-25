# Tarea: Mi prompt profesional

## Funcionalidad elegida

Programa de consola en Java que calcula el promedio final de un estudiante a partir de tres notas (practicas, examen parcial y examen final), cada una con un peso distinto, e indica si aprueba o desaprueba.

## Version 1: prompt basico

```text
Hazme un programa para calcular notas.
```

Qué obtuve: un programa genérico, en un lenguaje no especificado, que solo sacaba un promedio simple de dos números sin relación con notas ponderadas ni con Java.

## Version 2

```text
Actua como desarrollador Java. Crea un programa para calcular el promedio final de un estudiante
a partir de sus notas de practicas, examen parcial y examen final.
```

Qué cambié: agregué el rol (desarrollador Java) y el contexto (qué notas se evalúan).
Por qué: la v1 no decía en qué lenguaje ni qué notas específicas usar.
Qué mejoró: la IA ya generó el código en Java y usó las tres notas mencionadas, pero asumió pesos iguales para las tres y eligió su propio formato de salida.

## Version 3: prompt final

```text
Actua como desarrollador Java experto. Crea un programa de consola que calcule el promedio final
de un estudiante a partir de tres notas: practicas (peso 30%), examen parcial (peso 30%) y examen
final (peso 40%). El programa debe pedir las tres notas por teclado usando Scanner.
Por ejemplo, si practicas=15, parcial=12 y final=14, el promedio debe ser 13.7.
Muestra el resultado exactamente en este formato: "Promedio final: XX.XX - Estado: Aprobado" o
"Promedio final: XX.XX - Estado: Desaprobado" (aprobado si el promedio es mayor o igual a 10.5).
No uses librerias externas, solo las clases estandar de Java.
```

Qué cambié: agregué instrucción específica (pesos exactos de cada nota), un ejemplo numérico, el formato exacto de salida, y una restricción.
Por qué: sin los pesos exactos la IA podía promediar las notas de cualquier forma, y sin el formato definido cada respuesta se veía distinta.
Qué mejoró: el código calculó el promedio ponderado correctamente, pidió los datos por teclado, mostró el resultado exactamente en el formato pedido, y no usó ninguna dependencia externa.

## Componentes del prompt final

| Componente  | Texto de mi prompt                                                                                    |
| ----------- | ----------------------------------------------------------------------------------------------------- |
| Rol         | Actua como desarrollador Java experto.                                                                |
| Contexto    | Un estudiante tiene tres notas: practicas (30%), examen parcial (30%) y examen final (40%).           |
| Instruccion | Crea un programa de consola que calcule el promedio final pidiendo las notas por teclado con Scanner. |
| Ejemplo     | Si practicas=15, parcial=12 y final=14, el promedio debe ser 13.7.                                    |
| Formato     | Muestra el resultado exactamente como: "Promedio final: XX.XX - Estado: Aprobado/Desaprobado".        |
| Restriccion | No uses librerias externas, solo las clases estandar de Java.                                         |

## Evaluacion del resultado

| Qué revisar                                                  | Cumple (Sí/No) |
| ------------------------------------------------------------ | -------------- |
| ¿Está escrito en Java y usa Scanner para leer datos?         | Sí             |
| ¿Calcula el promedio ponderado con los pesos 30/30/40?       | Sí             |
| ¿Muestra el resultado en el formato exacto pedido?           | Sí             |
| ¿Indica correctamente si el estudiante aprueba o desaprueba? | Sí             |
| ¿Usa solo clases estandar de Java, sin librerias externas?   | Sí             |

## Errores que evite

1. **Ser demasiado general:** en la v1 no especifiqué qué notas evaluar ni cómo calcular el promedio, por eso la IA devolvió un programa genérico sin relación con el caso real. En la v3 corregí esto detallando las tres notas exactas y sus pesos.
2. **No indicar el formato:** en la v1 y v2 no dije cómo debía mostrarse el resultado, así que la IA eligió su propio formato cada vez. En la v3 pedí explícitamente el texto exacto de salida, lo que hizo la respuesta predecible y reutilizable.
