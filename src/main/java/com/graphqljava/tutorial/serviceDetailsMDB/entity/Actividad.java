package com.graphqljava.tutorial.serviceDetailsMDB.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Table;

@Entity
@Table(name = "ACTIVIDADES")
public class Actividad extends Servicio{
    
    @Column(name = "TIPO_ACTIVIDAD")
    private TipoActividad tipoActividad;

    @Column(name = "DURACION")
    private double duracion;

    @Column(name = "NIVEL_DIFICULTAD")
    private NivelDificultad nivelDificultad;

    @Column(name = "PRECIO")
    private double precio;

    @ElementCollection(fetch = FetchType.EAGER)
    private List<String> requerimientos;
    
    @Column(name = "CAPACIDAD_MAXIMA")
    private int capacidadMaxima;

    @Column(name = "UBICACION_LATITUD")
    private double ubicacionLatitud;

    @Column(name = "UBICACION_LONGITUD")
    private double ubicacionLongitud;

    @Column(name = "NOMBRE_UBICACION")
    private String nombreUbicacion;

    public Actividad() {
    }


    public Actividad(String nombre, String descripcion, EstadoServicio estado,TipoActividad tipoActividad, double duracion, NivelDificultad nivelDificultad, double precio, List<String> requerimientos, int capacidadMaxima, double ubicacionLatitud, double ubicacionLongitud, String nombreUbicacion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.estado = estado;
        this.tipoActividad = tipoActividad;
        this.duracion = duracion;
        this.nivelDificultad = nivelDificultad;
        this.precio = precio;
        this.requerimientos = requerimientos;
        this.capacidadMaxima = capacidadMaxima;
        this.ubicacionLatitud = ubicacionLatitud;
        this.ubicacionLongitud = ubicacionLongitud;
        this.nombreUbicacion = nombreUbicacion;
    }


    public TipoActividad getTipoActividad() {
        return tipoActividad;
    }

    public void setTipoActividad(TipoActividad tipoActividad) {
        this.tipoActividad = tipoActividad;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    public NivelDificultad getNivelDificultad() {
        return nivelDificultad;
    }

    public void setNivelDificultad(NivelDificultad nivelDificultad) {
        this.nivelDificultad = nivelDificultad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public List<String> getRequerimientos() {
        return requerimientos;
    }

    public void setRequerimientos(List<String> requerimientos) {
        this.requerimientos = requerimientos;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
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