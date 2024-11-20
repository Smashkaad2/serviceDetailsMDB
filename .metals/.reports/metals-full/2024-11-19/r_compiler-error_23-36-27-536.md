file:///C:/Users/Javier/Desktop/serviceDetailsMDB/serviceDetailsMDB/src/main/java/com/graphqljava/tutorial/serviceDetailsMDB/service/IServicioService.java
### java.util.NoSuchElementException: next on empty iterator

occurred in the presentation compiler.

presentation compiler configuration:


action parameters:
uri: file:///C:/Users/Javier/Desktop/serviceDetailsMDB/serviceDetailsMDB/src/main/java/com/graphqljava/tutorial/serviceDetailsMDB/service/IServicioService.java
text:
```scala
package com.graphqljava.tutorial.serviceDetailsMDB.service;

import java.util.List;

import com.graphqljava.tutorial.serviceDetailsMDB.entity.EstadoServicio;
import com.graphqljava.tutorial.serviceDetailsMDB.entity.Servicio;

public interface IServicioService <T extends Servicio>{
    T crearServicio(T servicio);
    T actualizarServicio(Long id, T servicio);
    void eliminarServicio(Long idServicio);
    T obtenerServiciosPorId(Long idServicio);
    List<T> obtenerServiciosPorEstado(EstadoServicio estado);
    List<T> obtenerServiciosPorNombre(String nombre);
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
	dotty.tools.pc.WithCompilationUnit.<init>(WithCompilationUnit.scala:31)
	dotty.tools.pc.SimpleCollector.<init>(PcCollector.scala:345)
	dotty.tools.pc.PcSemanticTokensProvider$Collector$.<init>(PcSemanticTokensProvider.scala:63)
	dotty.tools.pc.PcSemanticTokensProvider.Collector$lzyINIT1(PcSemanticTokensProvider.scala:63)
	dotty.tools.pc.PcSemanticTokensProvider.Collector(PcSemanticTokensProvider.scala:63)
	dotty.tools.pc.PcSemanticTokensProvider.provide(PcSemanticTokensProvider.scala:88)
	dotty.tools.pc.ScalaPresentationCompiler.semanticTokens$$anonfun$1(ScalaPresentationCompiler.scala:109)
```
#### Short summary: 

java.util.NoSuchElementException: next on empty iterator