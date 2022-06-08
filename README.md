# Primer taller de ARSW

Un aplicativo simple que calcula el numero de lineas en un archivo de texto

## Preparacion

Clonamos el repositorio con la siguiente instrucción en consola:

```
git clone https://github.com/ronis97/ARSW-T1.git
```


### Prerequisites

Necesitamos de:
* Maven
* Intellij IDEA (O cualquier IDE de Java)

Para una correcta ejecucion del aplicativo.

### Installing

Ejecutamos la siguiente instruccion en consola:

```
mvn package
```

con esto maven se encargara de descargar todos los recursos necesarios para la ejecucion del aplicativo.

Para ejecutar el programa simplemente corremos la instrucción:

```
mvn exec:java -Dexec.mainClass="edu.escuelaing.arsw.app.FirstVersion" -Dexec.args="phy src/main/resources/English.java"
```

En consola veremos la cantidad de lineas totales del programa, si queremos ver especificamente las lineas de codigo colocamos:

```
mvn exec:java -Dexec.mainClass="edu.escuelaing.arsw.app.FirstVersion" -Dexec.args="loc src/main/resources/English.java"
```


## Pruebas

Para verificar las pruebas simplemente corremos el comando:

```
mvn test
```



### JAVADOC



### And coding style tests

Explain what these tests test and why

```
Give an example
```

## Deployment

Add additional notes about how to deploy this on a live system

## Built With

* [Dropwizard](http://www.dropwizard.io/1.0.2/docs/) - The web framework used
* [Maven](https://maven.apache.org/) - Dependency Management
* [ROME](https://rometools.github.io/rome/) - Used to generate RSS Feeds

## Contributing

Please read [CONTRIBUTING.md](https://gist.github.com/PurpleBooth/b24679402957c63ec426) for details on our code of conduct, and the process for submitting pull requests to us.

## Versioning

We use [SemVer](http://semver.org/) for versioning. For the versions available, see the [tags on this repository](https://github.com/your/project/tags). 

## Authors

* **Billie Thompson** - *Initial work* - [PurpleBooth](https://github.com/PurpleBooth)

See also the list of [contributors](https://github.com/your/project/contributors) who participated in this project.

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details

## Acknowledgments

* Hat tip to anyone whose code was used
* Inspiration
* etc
