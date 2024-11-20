package com.graphqljava.tutorial.serviceDetailsMDB.init;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.graphqljava.tutorial.serviceDetailsMDB.entity.EstadoServicio;
import com.graphqljava.tutorial.serviceDetailsMDB.entity.TipoTransporte;
import com.graphqljava.tutorial.serviceDetailsMDB.entity.Transporte;
import com.graphqljava.tutorial.serviceDetailsMDB.entity.Actividad;
import com.graphqljava.tutorial.serviceDetailsMDB.entity.TipoActividad;
import com.graphqljava.tutorial.serviceDetailsMDB.entity.NivelDificultad;
import com.graphqljava.tutorial.serviceDetailsMDB.repository.TransporteRepository;
import com.graphqljava.tutorial.serviceDetailsMDB.repository.ActividadRepository;

import java.util.Arrays;

@Component
public class DataInitializer implements CommandLineRunner {

    private final TransporteRepository transporteRepository;
    private final ActividadRepository actividadRepository;

    public DataInitializer(TransporteRepository transporteRepository, ActividadRepository actividadRepository) {
        this.transporteRepository = transporteRepository;
        this.actividadRepository = actividadRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        // Limpiar datos anteriores
        transporteRepository.deleteAll();
        actividadRepository.deleteAll();

        // Crear transportes de prueba
        Transporte transporte1 = new Transporte(
            "Transporte Aéreo 1", 
            "Vuelo a Bogotá",
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

        transporteRepository.saveAll(Arrays.asList(transporte1, transporte2, transporte3));

        // Crear actividades de prueba
        Actividad actividad1 = new Actividad(
            "Trekking en el Parque Nacional",
            "Recorrido guiado por senderos naturales",
            EstadoServicio.DISPONIBLE,
            TipoActividad.TREKKING,
            5.0, // Duración en horas
            NivelDificultad.MODERADO,
            50.0, // Precio por persona
            Arrays.asList("Botas de montaña", "Agua", "Protector solar"),
            20, // Capacidad máxima
            5.0760, 
            -75.5148,
            "Parque Nacional Los Nevados"
        );

        Actividad actividad2 = new Actividad(
            "Kayak en el río Magdalena",
            "Experiencia de kayak en aguas tranquilas",
            EstadoServicio.DISPONIBLE,
            TipoActividad.KAYAK,
            3.0,
            NivelDificultad.FACIL,
            40.0,
            Arrays.asList("Chaleco salvavidas", "Ropa impermeable"),
            15,
            3.6920, 
            -73.7112,
            "Río Magdalena"
        );

        Actividad actividad3 = new Actividad(
            "Observación de aves en la Sierra Nevada",
            "Avistamiento de especies únicas de aves",
            EstadoServicio.DISPONIBLE,
            TipoActividad.OBSERVACION_AVES,
            4.0,
            NivelDificultad.FACIL_MODERADO,
            70.0,
            Arrays.asList("Binoculares", "Cámara", "Ropa cómoda"),
            10,
            11.1085, 
            -73.9355,
            "Sierra Nevada de Santa Marta"
        );

        actividadRepository.saveAll(Arrays.asList(actividad1, actividad2, actividad3));
    }
}


