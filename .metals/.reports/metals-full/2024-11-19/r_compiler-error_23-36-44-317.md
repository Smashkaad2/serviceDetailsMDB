file:///C:/Users/Javier/Desktop/serviceDetailsMDB/serviceDetailsMDB/src/main/java/com/graphqljava/tutorial/serviceDetailsMDB/service/ImpServicioService.java
### java.util.NoSuchElementException: next on empty iterator

occurred in the presentation compiler.

presentation compiler configuration:


action parameters:
offset: 1567
uri: file:///C:/Users/Javier/Desktop/serviceDetailsMDB/serviceDetailsMDB/src/main/java/com/graphqljava/tutorial/serviceDetailsMDB/service/ImpServicioService.java
text:
```scala
package com.graphqljava.tutorial.serviceDetailsMDB.service;

import java.util.List;

import com.graphqljava.tutorial.serviceDetailsMDB.entity.EstadoServicio;
import com.graphqljava.tutorial.serviceDetailsMDB.entity.Servicio;
import com.graphqljava.tutorial.serviceDetailsMDB.repository.ServicioRepository;

public abstract class ImpServicioService<T extends Servicio> implements IServicioService<T>{

    private final ServicioRepository <T> repositorio;

    public ImpServicioService(ServicioRepository<T> repositorio) {
        this.repositorio = repositorio;
    }

    @Override
    public T crearServicio(T servicio) {
        return repositorio.save(servicio);
    }

    @Override
    public T actualizarServicio(Long id, T servicio) {
        if (!repositorio.existsById(id)) {
            throw new IllegalArgumentException("Servicio no encontrado");
        }
        servicio.setIdServicio(id);
        return repositorio.save(servicio);
    }

    @Override
    public void eliminarServicio(Long id) {
        repositorio.deleteById(id);
    }

    @Override
    public T obtenerServiciosPorId(Long id) {
        return repositorio.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Servicio no encontrado"));
    }

    @Override
    public List<T> obtenerServiciosPorEstado(EstadoServicio estado) {
        return repositorio.findByEstado(estado);
    }

    @Override
    public List<T> obtenerServiciosPorNombre(String nombre){
        return repositorio.findByNombre(nombre)@@;
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