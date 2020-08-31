![Redox Banner](images/redox.png)

# Redox Java Data Model

![Java CI](https://github.com/jtravan3/redox-java-data-model/workflows/Java%20CI/badge.svg)
[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)
[![PRs Welcome](https://img.shields.io/badge/PRs-welcome-brightgreen.svg?style=flat-square)](http://makeapullrequest.com)
[![Gitter](https://badges.gitter.im/jtravan3/community.svg)](https://gitter.im/jtravan3/community?utm_source=badge&utm_medium=badge&utm_campaign=pr-badge)
[![codecov](https://codecov.io/gh/jtravan3/redox-java-data-model/branch/develop/graph/badge.svg)](https://codecov.io/gh/jtravan3/redox-java-data-model)

This project serves as a repository for Java POJOs that represent the Redox API Data Model.

> DISCLAIMER: This is an open source project providing additional development capabilities on the existing [Redox](https://www.redoxengine.com/)
> API. It is not an affiliate of [Redox](https://www.redoxengine.com/) and does not represent the company in any way.

## Usage

Install the dependency using [Maven](https://maven.apache.org/guides/getting-started/)

```xml
<dependency>
  <groupId>com.jtravan3</groupId>
  <artifactId>redox-java-data-model</artifactId>
  <version>1.0.0</version>
</dependency>
```

Using [Jackson](https://github.com/FasterXML/jackson) or other JSON parsing libraries you can map your raw JSON payload
received by [Redox](https://www.redoxengine.com/) to a strongly typed Java POJO.

```java
ObjectMapper mapper = new ObjectMapper();
PatientPush patientPush = mapper.readValue(stringJsonContent, PatientPush.class);
patientPush.getAllergies().stream().forEach(allergy -> {
    Criticality criticality = allergy.getCriticality();
    System.out.println(criticality.getName());
});
```

## Philosophy
Our project vision is to make available a Java data model representing the [Redox](https://www.redoxengine.com/) API 
data model. This data model can be used by those desiring to integrate into EHR's via Redox and Java-based applications.

## Contributing
Please see [CONTRIBUTING.md](https://github.com/jtravan3/redox-java-data-model/blob/develop/CONTRIBUTING.md) for more details regarding contributing issues or code.

## Questions
If you are experiencing a bug, please feel free to file an issue. For general questions, please post them to [StackOverflow](https://stackoverflow.com/search?q=redox-java-data-model) with the tag `redox-java-data-model`.

## License
The content of this project itself is licensed under the [Creative Commons Attribution 3.0 Unported](https://creativecommons.org/licenses/by/3.0/) license, and the underlying source code used to format and display that content is licensed under the [MIT license](https://github.com/jtravan3/redox-java-data-model/blob/develop/LICENSE.md).

## Resources

### Redox

For further references regarding Redox:

- [Redox Engine](https://www.redoxengine.com/)
- [Redox Developer Docs](https://developer.redoxengine.com/)

### Spring Boot

For further references with Spring Boot:

- [Spring Initializr](https://start.spring.io/)
- [Getting Started](https://spring.io/guides/gs/spring-boot/)

### Maven

For further references with Maven's dependency management framework:

- [Spring and Maven](https://spring.io/guides/gs/spring-boot/)
- [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
- [Apache Maven Getting Started](https://maven.apache.org/guides/getting-started/)
