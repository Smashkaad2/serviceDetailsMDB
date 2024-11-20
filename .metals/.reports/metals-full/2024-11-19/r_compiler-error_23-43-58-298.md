file:///C:/Users/Javier/Desktop/serviceDetailsMDB/serviceDetailsMDB/src/main/java/com/graphqljava/tutorial/serviceDetailsMDB/controller/TransporteGRAPHController.java
### java.util.NoSuchElementException: next on empty iterator

occurred in the presentation compiler.

presentation compiler configuration:


action parameters:
offset: 1149
uri: file:///C:/Users/Javier/Desktop/serviceDetailsMDB/serviceDetailsMDB/src/main/java/com/graphqljava/tutorial/serviceDetailsMDB/controller/TransporteGRAPHController.java
text:
```scala
package com.graphqljava.tutorial.serviceDetailsMDB.controller;

import com.graphqljava.tutorial.serviceDetailsMDB.entity.Transporte;
import com.graphqljava.tutorial.serviceDetailsMDB.service.ITransporteService;
import com.graphqljava.tutorial.serviceDetailsMDB.entity.EstadoServicio;

import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
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
    public Transporte obtenerTransportePorId(@Argument@@Long id) {
        return transporteService.obtenerServiciosPorId(id);
    }

    // Consulta: Obtener transportes por nombre
    @QueryMapping
    public List<Transporte> obtenerTransportesPorNombre(@Argument String nombre) {
        return transporteService.obtenerServiciosPorNombre(nombre);
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
	dotty.tools.pc.SignatureHelpProvider$.signatureHelp(SignatureHelpProvider.scala:32)
	dotty.tools.pc.ScalaPresentationCompiler.signatureHelp$$anonfun$1(ScalaPresentationCompiler.scala:422)
```
#### Short summary: 

java.util.NoSuchElementException: next on empty iterator