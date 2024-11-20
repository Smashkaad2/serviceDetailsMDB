file:///C:/Users/Javier/Desktop/serviceDetailsMDB/serviceDetailsMDB/src/main/java/com/graphqljava/tutorial/serviceDetailsMDB/controller/TransporteGRAPHController.java
### java.util.NoSuchElementException: next on empty iterator

occurred in the presentation compiler.

presentation compiler configuration:


action parameters:
offset: 1510
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
    @MutationMappin@@g
    public Transporte crearTransporte(Transporte transporte) {
        return transporteService.crearServicio(transporte);
    }

    // Mutación: Actualizar transporte
    @MutationMapping
    public Transporte actualizarTransporte(Long id, Transporte transporte) {
        return transporteService.actualizarServicio(id, transporte);
    }

    // Mutación: Eliminar transporte
    @MutationMapping
    public String eliminarTransporte(Long id) {
        transporteService.eliminarServicio(id);
        return "Transporte eliminado con éxito";
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
	dotty.tools.pc.HoverProvider$.hover(HoverProvider.scala:40)
	dotty.tools.pc.ScalaPresentationCompiler.hover$$anonfun$1(ScalaPresentationCompiler.scala:376)
```
#### Short summary: 

java.util.NoSuchElementException: next on empty iterator