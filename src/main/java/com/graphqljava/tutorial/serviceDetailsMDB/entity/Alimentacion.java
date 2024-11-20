package com.graphqljava.tutorial.serviceDetailsMDB.entity;

import java.time.LocalTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "ALIMENTACION")
public class Alimentacion extends Servicio {

    @Column(name = "TIPO_COCINA")
    private TipoCocina tipoCocina;

    @Column(name = "HORA_MINIMA")
    private LocalTime horaMinima;

    @Column(name = "HORA_MAXIMA")
    private LocalTime horaMaxima;

    @Column(name = "PRECIO")
    private double precio;

    @Column(name = "UBICACION_LATITUD")
    private double ubicacionLatitud;

    @Column(name = "UBICACION_LONGITUD")
    private double ubicacionLongitud;

    @Column(name = "NOMBRE_UBICACION")
    private String nombreUbicacion;

    public Alimentacion() {
    }


    public Alimentacion(String nombre, String descripcion, EstadoServicio estado, TipoCocina tipoCocina, LocalTime horaMinima, LocalTime horaMaxima, double precio, double ubicacionLatitud, double ubicacionLongitud, String nombreUbicacion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.estado = estado;
        this.tipoCocina = tipoCocina;
        this.horaMinima = horaMinima;
        this.horaMaxima = horaMaxima;
        this.precio = precio;
        this.ubicacionLatitud = ubicacionLatitud;
        this.ubicacionLongitud = ubicacionLongitud;
        this.nombreUbicacion = nombreUbicacion;
    }


    public TipoCocina getTipoCocina() {
        return tipoCocina;
    }

    public void setTipoCocina(TipoCocina tipoCocina) {
        this.tipoCocina = tipoCocina;
    }

    public LocalTime getHoraMinima() {
        return horaMinima;
    }

    public void setHoraMinima(LocalTime horaMinima) {
        this.horaMinima = horaMinima;
    }

    public LocalTime getHoraMaxima() {
        return horaMaxima;
    }

    public void setHoraMaxima(LocalTime horaMaxima) {
        this.horaMaxima = horaMaxima;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getUbicacionLatitud() {
        return ubicacionLatitud;
    }

    public void setUbicacionLatitud(double ubicacionLatitud) {
        this.ubicacionLatitud = ubicacionLatitud;
    }

    public double getUbicacionLongitud() {
        return ubicacionLongitud;
    }

    public void setUbicacionLongitud(double ubicacionLongitud) {
        this.ubicacionLongitud = ubicacionLongitud;
    }

    public String getNombreUbicacion() {
        return nombreUbicacion;
    }

    public void setNombreUbicacion(String nombreUbicacion) {
        this.nombreUbicacion = nombreUbicacion;
    }

}