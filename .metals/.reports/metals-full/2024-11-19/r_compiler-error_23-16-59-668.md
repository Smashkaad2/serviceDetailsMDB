file:///C:/Users/Javier/Desktop/serviceDetailsMDB/serviceDetailsMDB/src/main/java/com/graphqljava/tutorial/serviceDetailsMDB/entity/Transporte.java
### java.util.NoSuchElementException: next on empty iterator

occurred in the presentation compiler.

presentation compiler configuration:


action parameters:
offset: 1353
uri: file:///C:/Users/Javier/Desktop/serviceDetailsMDB/serviceDetailsMDB/src/main/java/com/graphqljava/tutorial/serviceDetailsMDB/entity/Transporte.java
text:
```scala
package com.graphqljava.tutorial.serviceDetailsMDB.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "TRANSPORTE")
public class Transporte extends Servicio {

    @Column(name = "TIPO_TRANSPORTE")
    private TipoTransporte tipoTransporte;

    @Column(name = "FECHA_SALIDA")
    private LocalDateTime fechaSalida;

    @Column(name = "FECHA_LLEGADA")
    private LocalDateTime fechaLlegada;

    @Column(name = "CAPACIDAD")
    private int capacidad;

    @Column(name = "COSTO_POR_PASAJERO")
    private double costoPorPasajero;

    @Column(name = "ORIGEN_LATITUD")
    private double origenLatitud;

    @Column(name = "ORIGEN_LONGITUD")
    private double origenLongitud;

    @Column(name = "DESTINO_LATITUD")
    private double destinoLatitud;

    @Column(name = "DESTINO_LONGITUD")
    private double destinoLongitud;

    public Transporte() {
    }

    public Transporte(String nombre, String descripcion, EstadoServicio estado, TipoTransporte tipoTransporte,
            String fechaSalida, String fechaLlegada, int capacidad, double costoPorPasajero,
            double origenLatitud, double origenLongitud, double destinoLatitud, double destinoLongitud) {
        this.nombr@@e = nombre;
        this.descripcion = descripcion;
        this.estado = estado;
        this.tipoTransporte = tipoTransporte;
        this.fechaSalida = fechaSalida;
        this.fechaLlegada = fechaLlegada;
        this.capacidad = capacidad;
        this.costoPorPasajero = costoPorPasajero;
        this.origenLatitud = origenLatitud;
        this.origenLongitud = origenLongitud;
        this.destinoLatitud = destinoLatitud;
        this.destinoLongitud = destinoLongitud;
    }

    public TipoTransporte getTipoTransporte() {
        return tipoTransporte;
    }

    public void setTipoTransporte(TipoTransporte tipoTransporte) {
        this.tipoTransporte = tipoTransporte;
    }

    public LocalDateTime getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(LocalDateTime fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public LocalDateTime getFechaLlegada() {
        return fechaLlegada;
    }

    public void setFechaLlegada(LocalDateTime fechaLlegada) {
        this.fechaLlegada = fechaLlegada;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public double getCostoPorPasajero() {
        return costoPorPasajero;
    }

    public void setCostoPorPasajero(double costoPorPasajero) {
        this.costoPorPasajero = costoPorPasajero;
    }

    public double getOrigenLatitud() {
        return origenLatitud;
    }

    public void setOrigenLatitud(double origenLatitud) {
        this.origenLatitud = origenLatitud;
    }

    public double getOrigenLongitud() {
        return origenLongitud;
    }

    public void setOrigenLongitud(double origenLongitud) {
        this.origenLongitud = origenLongitud;
    }

    public double getDestinoLatitud() {
        return destinoLatitud;
    }

    public void setDestinoLatitud(double destinoLatitud) {
        this.destinoLatitud = destinoLatitud;
    }

    public double getDestinoLongitud() {
        return destinoLongitud;
    }

    public void setDestinoLongitud(double destinoLongitud) {
        this.destinoLongitud = destinoLongitud;
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