
# sample-cdi

Experiments with CDI, Weld, et al.

## sample-cdi-se

~~~
$ mvn clean verify

$ java \
  -cp $(echo sample-cdi-se/target/sample-cdi-se-*-dist/lib)/"*" \
  com.github.phoswald.sample.cdi.se.Application "Shell User"
~~~
