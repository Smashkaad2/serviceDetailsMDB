file:///C:/Users/Javier/Desktop/serviceDetailsMDB/serviceDetailsMDB/src/main/java/com/graphqljava/tutorial/serviceDetailsMDB/controller/TransporteGRAPHController.java
### java.util.NoSuchElementException: next on empty iterator

occurred in the presentation compiler.

presentation compiler configuration:


action parameters:
uri: file:///C:/Users/Javier/Desktop/serviceDetailsMDB/serviceDetailsMDB/src/main/java/com/graphqljava/tutorial/serviceDetailsMDB/controller/TransporteGRAPHController.java
text:
```scala
package com.graphqljava.tutorial.serviceDetailsMDB.controller;

import com.graphqljava.tutorial.serviceDetailsMDB.entity.Transporte;
import com.graphqljava.tutorial.serviceDetailsMDB.service.ITransporteService;
import com.graphqljava.tutorial.serviceDetailsMDB.entity.EstadoServicio;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class TransporteGRAPHController {

    private final ITransporteService transporteService;

    public TransporteGRAPHController(ITransporteService transporteService) {
        this.transporteService = transporteService;
    }

    // Consulta: Obtener todos los transportes
    @QueryMapping
    public List<Transporte> obtenerTransportes() {
        return transporteService.obtenerServiciosPorEstado(EstadoServicio.DISPONIBLE); // Puedes ajustarlo según lo que desees filtrar
    }

    // Consulta: Obtener transporte por ID
    @QueryMapping
    public Transporte obtenerTransportePorId(Long id) {
        return transporteService.obtenerServiciosPorId(id);
    }

    // Consulta: Obtener transportes por nombre
    @QueryMapping
    public List<Transporte> obtenerTransportesPorNombre(String nombre) {
        return transporteService.obtenerServiciosPorNombre(nombre);
    }

    // Mutación: Crear un nuevo transporte
    @MutationMapping
    public Transporte crearTransporte(Transporte transporte) {
        return transporteService.crearServicio(transporte);
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