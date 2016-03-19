# Spring Boot + AOP Tutorial

To build:

```
> ./gradlew clean build
```

Then to run:
```
> java -jar build/libs/hello-springboot-aop-0.1.0.jar
```

or combined:
```
./gradlew clean build && java -jar build/libs/hello-springboot-aop-0.1.0.jar
```

To test:

http://localhost:8080/greeting

To see the provided endpoints:

http://localhost:8080/mappings

### The AOP part
To see AOP in action, hit the endpoint that simply generates a random UUID: http://localhost:/random

* Aspect configuration is in class AspectConfig
* The configuration is set up to log to the console the method name before it is executed (@Before annotation)
* The pointcut (simply, methods) is set as "any method executed in the package" as defined in the _execution_ parameter
* As you can see, the controller method _random()_ and the service method _generate()_ names were logged:
```
here at random()
here at generate()
```

### Note on Spring AOP:
Quote: "Spring AOP only supports method execution join points for Spring beans, so you can think of a pointcut as matching the execution of methods on Spring beans."
Reference: http://docs.spring.io/spring-framework/docs/current/spring-framework-reference/html/aop.html#aop-ataspectj

