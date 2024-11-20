file:///C:/Users/Javier/Desktop/serviceDetailsMDB/serviceDetailsMDB/src/main/java/com/graphqljava/tutorial/serviceDetailsMDB/init/DataInitializer.java
### java.util.NoSuchElementException: next on empty iterator

occurred in the presentation compiler.

presentation compiler configuration:


action parameters:
offset: 1012
uri: file:///C:/Users/Javier/Desktop/serviceDetailsMDB/serviceDetailsMDB/src/main/java/com/graphqljava/tutorial/serviceDetailsMDB/init/DataInitializer.java
text:
```scala
package com.graphqljava.tutorial.serviceDetailsMDB.init;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.graphqljava.tutorial.serviceDetailsMDB.entity.EstadoServicio;
import com.graphqljava.tutorial.serviceDetailsMDB.entity.TipoTransporte;
import com.graphqljava.tutorial.serviceDetailsMDB.entity.Transporte;
import com.graphqljava.tutorial.serviceDetailsMDB.repository.TransporteRepository;

@Component
public class DataInitializer implements CommandLineRunner {

    private final TransporteRepository transporteRepository;

    public DataInitializer(TransporteRepository transporteRepository) {
        this.transporteRepository = transporteRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        // Crear transportes de prueba
        Transporte transporte1 = new Transporte(
            null, // el id es auto-generado
            "Transporte Aéreo 1", 
            "Vuelo a B@@ogotá",
            EstadoServicio.DISPONIBLE,
            TipoTransporte.AEREO,
            "2024-12-01T10:00:00",
            "2024-12-01T14:00:00",
            150, 
            300.0,
            4.6097, 
            -74.0817,
            4.7110, 
            -74.0721
        );
        
        Transporte transporte2 = new Transporte(
            null,
            "Transporte Aéreo 2", 
            "Vuelo a Medellín",
            EstadoServicio.DISPONIBLE,
            TipoTransporte.AEREO,
            "2024-12-05T12:00:00",
            "2024-12-05T16:00:00",
            180, 
            350.0,
            4.6097, 
            -74.0817,
            6.2518, 
            -75.5636
        );
        
        Transporte transporte3 = new Transporte(
            null,
            "Transporte Terrestre 1", 
            "Autobús a Cali",
            EstadoServicio.DISPONIBLE,
            TipoTransporte.TERRESTRE,
            "2024-12-10T08:00:00",
            "2024-12-10T18:00:00",
            50, 
            100.0,
            3.4516, 
            -76.5312,
            3.4516, 
            -76.5312
        );

        // Guardar los transportes en la base de datos
        transporteRepository.save(transporte1);
        transporteRepository.save(transporte2);
        transporteRepository.save(transporte3);
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