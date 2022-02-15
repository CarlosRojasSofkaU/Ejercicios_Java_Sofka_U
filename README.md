# Ejercicios de Java

En este proyecto se pretende realizar unos ejercicios de java, realizados por Carlos Rojas para practicar conocimientos como:

* Modelamiento de objetos aplicando Programación Orientada a Objetos (POO)
* Creación de entidades
* Buenas prácticas de programación en la contrucción del caso de negocio
* Manejo de librerías básicas como Scanner y Arrays

Para esto se definen las siguientes secciones:
  1. [Configuración inicial](#configuración-inicial)
  2. [Indicaciones para correr los puntos](#indicaciones-para-correr-los-puntos)
  3. [Requerimientos](#requerimientos)
  4. [Puntos](#puntos)

## Configuración inicial

Para poder iniciar con los ejercicios se debe ubicar en la carpeta Ejercicios Java, en esta se encontrarán una serie de carpetas que representan los paquetes para los ejercicios.

Posteriormente en un IDE debemos abrir el siguiente archivo de Java en la carpeta src (App.java)
![Muestra de inicialización de juego](img/Captura.PNG)

Al correr este codigo de cierta manera se podrá evidenciar cada uno de los ejercicios realizados

## Indicaciones para correr los puntos

El el archivo App.java se encontrarán los ejercicios desde el punto 1 hasta el punto 18, para correr cada uno de los puntos se debe hacer lo siguiente:

Se debe descomentar cada sección de código (por cada llamado a una función hay un comentario que indica el número del punto).

Solo se debe llamar a un punto por ejecución de código, ya que la clase Scanner se cierra en la mayoría de puntos, lo que puede poner problemas si se van a ejecutar 2 funciones consecutivamente.

El punto 14 implica un bloque de códgo de 3 lineas, ya que retorna un valor.



## Requerimientos

Para usar este proyecto es necesario tener algún IDE que permita el manejo de Java y JDK 11 si se es posible.



##Puntos

A continuación se listará los enunciados de los puntos.

###Punto1

Declara 2 variables numéricas (con el valor que desees), he indica cual es mayor de los dos. Si son iguales indicarlo también. Ve cambiando los valores para comprobar que funciona.

###Punto2

Al ejercicio anterior agregar entrada por consola de dos valores e indicar si son mayores, menores o iguales.

###Punto3

Haz una aplicación que calcule el área de un círculo(pi*R2). El radio se pedirá por teclado (recuerda pasar de String a double con Double.parseDouble). Usa la constante PI y el método pow de Math.

###Punto4

Lee un número por teclado que pida el precio de un producto (puede tener decimales) y calcule el precio final con IVA. El IVA sera una constante que sera del 21%.

###Punto5

Muestra los números impares y pares del 1 al 100 (ambos incluidos). Usa un bucle while.

###Punto6

Realiza el ejercicio anterior usando un ciclo for.

###Punto7

Lee un número por teclado y comprueba que este numero es mayor o igual que cero, si no lo es lo volverá a pedir (do while), después muestra ese número por consola.

###Punto8

Crea una aplicación por consola que nos pida un día de la semana y que nos diga si es un día laboral o no. Usa un switch para ello.

###Punto9

Del texto, “La sonrisa sera la mejor arma contra la tristeza” Reemplaza todas las a del String anterior por una e, adicionalmente concatenar a esta frase una adicional que ustedes quieran incluir por consola y las muestre luego unidas.

###Punto10

Realizar una aplicación de consola, que al ingresar una frase por teclado elimine los espacios que esta contenga.

###Punto11

Realizar la construcción de un algoritmo que permita de acuerdo a una frase pasada por consola, indicar cual es la longitud de esta frase, adicionalmente cuantas vocales tiene de “a,e,i,o,u”.

###Punto12

Pedir dos palabras por teclado, indicar si son iguales, sino son iguales mostrar sus diferencias.

###Punto13

Realizar un algoritmo que permita consulta la fecha y hora actual en el formato (AAAA/MM/DD) (HH:MM:SS)

###Punto14

Crear un programa que pida un numero por teclado y que imprima por pantalla los números desde el numero introducido hasta 1000 con saldos de 2 en 2.

###Punto15

Hacer un programa que muestre el siguiente menú de opciones
****** GESTION CINEMATOGRÁFICA ********
1-NUEVO ACTOR
2-BUSCAR ACTOR
3-ELIMINAR ACTOR
4-MODIFICAR ACTOR
5-VER TODOS LOS ACTORES
6- VER PELICULAS DE LOS ACTORES

7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES
8-SALIR


EL SISTEMA SOLO VA A SALIR CUANDO SE DIGITE EL NUMERO 8, MIENTRAS SE DIGITE UNA DE LAS CINCO OPCIONES DEBE SEGUIR MOSTRADO EL MENU Y SI EL USUARIO DIGITA UN NUMERO QUE NO ESTA EN EL MENU SE DEBE ARROJAR UN MENSAJE " OPCION INCORRECTO". Y MOSTRAR EL MENU NUEVAMENTE.
PISTA: CONVINAR SWICHT Y ALGUNO DE LOS BUCLES.

###Punto16

(Resumen) Crear una clase Persona con ciertos parámetros, constructores y métodos, y realizar un ejecutable que pida comandos por consola y con ellos cree objetos persona, para luego usar sus métodos.

###Punto17

(Resumen) Crear una superclase Electrodoméstico con ciertos parámetros, constructores y metodos. Luego realizar 2 clases hijas que heredarán de este.

Hace un ejecutable que creará objetos de las 3 clases y calculará el precio final acumulado por clase.

###Punto18

(Resumen) Crear 2 clases (Videojuegos y Serie) las cuales tendrán ciertos atributos, constructores y métodos, además compartiran una interfaz.

Se debe crear objetos de estas clases, usar métodos de la interfaz e imprimir en consola los datos de la serie y el videojuego que tiene más número de temporadas y horas estimadas