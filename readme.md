# EPP Schema Files 

The "EPP Schema Files" project, contains the xml schema files for the domain provisioning system as well as the EPP extension for the domainrobot registrar. 
The maven artifact is available on the central maven repository.

## Table of Contents
1. [Getting Started](#getting-started)
   * [Quick start](#quick-start)
2. [Documentation](#documentation)
3. [Built With](#built-with)
4. [Versioning](#versioning)
5. [Changelog](#changelog)
6. [Authors](#authors) 
7. [License](#licence)


## Getting Started

You can download the files and uses these within your epp client. If you want to write your on epp client with java you can use the epp schema files jar as dependency.


### Quick start

* clone the repository and use the schema files under `src/main/resources/xsd` folder.
* Add the plugin to your `pom.xml`:

```
<project ...>
	...
	<dependencies>
		...
		<dependency>
			<groupId>org.domainrobot.epp</groupId>
			<artifactId>epp-files</artifactId>
			<version>1.0.3</version>
		</dependency>
		...
	</dependencies>
	...
</project>
```


End with an example of getting some data out of the system or using it for a little demo

## [Documentation](https://help.internetx.com/epp) ##

Please refer to the [wiki](https://en.help.internetx.com/display/APIEN/EPP) for the full documentation.

## Built With

* [JAXB2 Maven Plugin](https://github.com/highsource/maven-jaxb2-plugin ) - The maven plugin for building java classes depending on schema files
* [Maven](https://maven.apache.org/) - Dependency Management


## Versioning

We use [SemVer](http://semver.org/) for versioning. For the versions available, see the [tags on this repository](https://github.com/your/project/tags). 

## Changelog

### 1.0.3
* Initial Release
### 1.0.4
* Add .gitignore and remove files
### 1.0.5
* Rename LICENCE to LICENCE.md
### 1.0.6
* new extension .sport
* new extension for qualifiedLawyer

### 1.0.7
* new extension .luxe
* added fee extension

## Authors

* **Thomas Proll** - *Initial work*
* **Daniel Linsenmeier** - *Initial work*


## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details


