file://<HOME>/Documents/Java%20Project/demo/src/main/java/com/example/demo/EmployeeServiceImpl.java
### java.util.NoSuchElementException: next on empty iterator

occurred in the presentation compiler.

presentation compiler configuration:
Scala version: 3.3.3
Classpath:
<HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/scala-lang/scala3-library_3/3.3.3/scala3-library_3-3.3.3.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/scala-lang/scala-library/2.13.12/scala-library-2.13.12.jar [exists ]
Options:



action parameters:
offset: 527
uri: file://<HOME>/Documents/Java%20Project/demo/src/main/java/com/example/demo/EmployeeServiceImpl.java
text:
```scala
package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class EmployeeServiceImpl  implements EmployeeService  {

    ArrayList<Employee> employees = new ArrayList<Employee>();

    @Override
    public String createEmployee(Employee employee) {
       employees.add(employee);
       return "saved";
    }

    @Override
    public List<Employee> readEmployees() {
        return employees;

    }
    @Override
    public bolean readEmployee(Long id){
        if (cond@@ition) {
            
        } employees.stream().filter(employee -> employee.getId().equals(id)).findFirst();
    }

    @Override
    public boolean deleteEmployee(Long id) {
        if (employees.removeIf(employee -> employee.getId().equals(id))) {
            return true;
    
        } else {
            return false;
    
        }
        
    }

}

```



#### Error stacktrace:

```
scala.collection.Iterator$$anon$19.next(Iterator.scala:973)
	scala.collection.Iterator$$anon$19.next(Iterator.scala:971)
	scala.collection.mutable.MutationTracker$CheckedIterator.next(MutationTracker.scala:76)
	scala.collection.IterableOps.head(Iterable.scala:222)
	scala.collection.IterableOps.head$(Iterable.scala:222)
	scala.collection.AbstractIterable.head(Iterable.scala:933)
	dotty.tools.dotc.interactive.InteractiveDriver.run(InteractiveDriver.scala:168)
	scala.meta.internal.pc.MetalsDriver.run(MetalsDriver.scala:45)
	scala.meta.internal.pc.HoverProvider$.hover(HoverProvider.scala:36)
	scala.meta.internal.pc.ScalaPresentationCompiler.hover$$anonfun$1(ScalaPresentationCompiler.scala:380)
```
#### Short summary: 

java.util.NoSuchElementException: next on empty iterator