# Introduced in Java 9 

### Modularization

1. By Java 8, rt.jar (Java Runtime) had grown to 60+ mb and continued to expand.
* Solution - Modularized JDK. Most Java programmes do not require everything in the rt.jar.
  - Type in>
    - java --list-modules

<picture>
  <img media="(prefers-color-scheme: dark)" alt="Shows an illustrated output from the command prompt." src="assets/java9/modularization.png">
</picture>

* As can be seen, the whole JDK has been modularized into a number of modules.
* So, when you build a java program, you can choose which modules you want to make use of...

2. Building Modularized Applications

* Modularization features introduced in Java 9 help you in building more encapsulated, modularized applications.
* As seen in the preceding illustration, all modules whose names begin with `java` are related to programming and names that start with `jdk` are some kind of tools
* These modules have dependencies on each other. For instance, `java.base` is the base module, and every Java application will employ it as the default module.
- Type in>
  - java -d java.sql

<picture>
  <img media="(prefers-color-scheme: dark)" alt="Shows an illustrated output from the command prompt." src="assets/java9/modularization2.png">
</picture>

  - You'd notice that java.sql requires a few modules to be present.
  
  #### Let's have a look at the sample application in the src folder to get a sense of what the traditional approach to development is and how we might improve it now that we've gotten modularization.
