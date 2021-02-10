# Desviación estandar
En este laboratorio vamos a realizar un programa que nos permita calcular la desviación estandar de una tabla de datos, los datos los podremos encontrar en un archivo de tipo texto (txt), si se desea, estos datos los pueden reemplazar.
Para poder realizar este programa usamos una implementación de listas enlazadas simples (LinkedList en la que cada dato apunta a su nodo siguiente), que nos darán los datos sobre los cuales deseamos saber la desviacion extrayendo esta información del archivo de texto.

## Prerequisitos
* Maven
* Git
* Java

## Instalación
Para usar este programa debe abrir la consola (CMD) ir a la ubicación donde desee guardar el programa y ejecutar este comando:
```
git clone https://github.com/Carlos96999/AREP-desviacionEstandar.git
```

## Ejecución
Entramos a la carpeta creada por el comando anterior y entramos a "mi-desviacionEstandar" desde la consola de comandos (CMD), ejecutamos estos comandos:
```
* mvn package
* mvn clean compile
```

## Pruebas
Si desea conocer la ejecución de las pruebas, puede ejecutar en consola el comando mvn test (en la misma ubicación donde ejecuto los comandos de la parte de Ejecución).

<img src="https://github.com/Carlos96999/AREP-desviacionEstandar/blob/main/img/pruebas.png?raw=true">

Las pruebas que hemos realizado son:
* **casoDePruebasUno**: Realizamos una prueba de todo el programa con una tabla de datos diferente de "archivo.txt"
* **casoDePruebasDos**: Realizamos una prueba de todo el programa con una tabla de datos diferente de "archivo.txt" y de la prueba anterior
* **deberiaHacerSumatoria**: Realizamos una prueba de la sumatoria inicial que hace el programa
* **deberiaHacerSumatoriaConxPromedio**: <img src="https://github.com/Carlos96999/AREP-desviacionEstandar/blob/main/img/formula.png?raw=true">


## Documentación
Encontrara la documentación sobre el programa en la siguiente ubicación
```
target/site/apidocs
```

<img src="https://github.com/Carlos96999/AREP-desviacionEstandar/blob/main/img/documentacion.png?raw=true">

## Desarrollo
Este laboratorio fue construido con las siguiente herramientas:
* [Maven](https://maven.apache.org/)
* [Java](https://www.java.com/es/)
* [GIT](https://git-scm.com/)

## Licencia
[Licencia **GNU General Public License v3.0**](https://github.com/Carlos96999/AREP-desviacionEstandar/blob/main/LICENSE)

## DERECHOS DE AUTOR

Programa desarrollado por:
[Carlos Andrés Amorocho](https://github.com/Carlos96999)
