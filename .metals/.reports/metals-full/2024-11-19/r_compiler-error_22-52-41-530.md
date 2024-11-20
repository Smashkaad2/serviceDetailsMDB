file:///C:/Users/Javier/Desktop/serviceDetailsMDB/serviceDetailsMDB/src/main/java/com/graphqljava/tutorial/serviceDetailsMDB/entity/EstadoServicio.java
### java.util.NoSuchElementException: next on empty iterator

occurred in the presentation compiler.

presentation compiler configuration:


action parameters:
offset: 96
uri: file:///C:/Users/Javier/Desktop/serviceDetailsMDB/serviceDetailsMDB/src/main/java/com/graphqljava/tutorial/serviceDetailsMDB/entity/EstadoServicio.java
text:
```scala
package com.graphqljava.tutorial.serviceDetailsMDB.entity;

public enum EstadoServicio {
    @@DISPONIBLE,
    NO_DISPONIBLE,
    SUSPENDIDO
}


```



#### Error stacktrace:

```
scala.collection.Iterator$$anon$19.next(Iterator.scala:973)
	scala.collection.Iterator$$anon$19.next(Iterator.scala:971)
	scala.collection.mutable.MutationTracker$CheckedIterator.next(MutationTracker.scala:76)
	scala.collection.IterableOps.head(Iterable.scala:222)
	scala.collection.IterableOps.head$(Iterable.scala:222)
	scala.collection.AbstractIterable.head(Iterable.scala:935)
	dotty.tools.dotc.interactive.InteractiveDriver.run(InteractiveDriver.scala:164)
	dotty.tools.pc.MetalsDriver.run(MetalsDriver.scala:45)
	dotty.tools.pc.HoverProvider$.hover(HoverProvider.scala:40)
	dotty.tools.pc.ScalaPresentationCompiler.hover$$anonfun$1(ScalaPresentationCompiler.scala:376)
```
#### Short summary: 

java.util.NoSuchElementException: next on empty iterator