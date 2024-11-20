package com.graphqljava.tutorial.serviceDetailsMDB.init;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.graphqljava.tutorial.serviceDetailsMDB.entity.EstadoServicio;
import com.graphqljava.tutorial.serviceDetailsMDB.entity.Hospedaje;
import com.graphqljava.tutorial.serviceDetailsMDB.entity.TipoTransporte;
import com.graphqljava.tutorial.serviceDetailsMDB.entity.Transporte;
import com.graphqljava.tutorial.serviceDetailsMDB.entity.Voluntariado;
import com.graphqljava.tutorial.serviceDetailsMDB.entity.Actividad;
import com.graphqljava.tutorial.serviceDetailsMDB.entity.Alimentacion;
import com.graphqljava.tutorial.serviceDetailsMDB.entity.TipoActividad;
import com.graphqljava.tutorial.serviceDetailsMDB.entity.TipoCocina;
import com.graphqljava.tutorial.serviceDetailsMDB.entity.TipoHospedaje;
import com.graphqljava.tutorial.serviceDetailsMDB.entity.NivelDificultad;
import com.graphqljava.tutorial.serviceDetailsMDB.repository.TransporteRepository;
import com.graphqljava.tutorial.serviceDetailsMDB.repository.VoluntariadoRepository;
import com.graphqljava.tutorial.serviceDetailsMDB.repository.ActividadRepository;
import com.graphqljava.tutorial.serviceDetailsMDB.repository.AlimentacionRepository;
import com.graphqljava.tutorial.serviceDetailsMDB.repository.HospedajeRepository;

import java.time.LocalTime;
import java.util.Arrays;

@Component
public class DataInitializer implements CommandLineRunner {

        private final TransporteRepository transporteRepository;
        private final ActividadRepository actividadRepository;
        private final AlimentacionRepository alimentacionRepository;
        private final HospedajeRepository hospedajeRepository;
        private final VoluntariadoRepository voluntariadoRepository;

        public DataInitializer(TransporteRepository transporteRepository, ActividadRepository actividadRepository,
                        AlimentacionRepository alimentacionRepository, HospedajeRepository hospedajeRepository,
                        VoluntariadoRepository voluntariadoRepository) {
                this.transporteRepository = transporteRepository;
                this.actividadRepository = actividadRepository;
                this.alimentacionRepository = alimentacionRepository;
                this.hospedajeRepository = hospedajeRepository;
                this.voluntariadoRepository = voluntariadoRepository;
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
                                -74.0721);

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
                                -75.5636);

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
                                -76.5312);

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
                                "Parque Nacional Los Nevados");

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
                                "Río Magdalena");

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
                                "Sierra Nevada de Santa Marta");

                actividadRepository.saveAll(Arrays.asList(actividad1, actividad2, actividad3));

                Alimentacion alimentacion1 = new Alimentacion(
                                "Restaurante Gourmet",
                                "Deliciosa cocina internacional",
                                EstadoServicio.DISPONIBLE,
                                TipoCocina.INTERNACIONAL,
                                LocalTime.of(8, 0),
                                LocalTime.of(22, 0),
                                50.0,
                                4.6097,
                                -74.0817,
                                "Centro Bogotá");

                Alimentacion alimentacion2 = new Alimentacion(
                                "Restaurante Vegetariano",
                                "Cocina saludable y fresca",
                                EstadoServicio.DISPONIBLE,
                                TipoCocina.VEGETARIANA,
                                LocalTime.of(9, 0),
                                LocalTime.of(20, 0),
                                30.0,
                                6.2518,
                                -75.5636,
                                "El Poblado, Medellín");

                alimentacionRepository.saveAll(Arrays.asList(alimentacion1, alimentacion2));

                Hospedaje hospedaje1 = new Hospedaje(
                                "Hotel Central",
                                "Moderno hotel en el corazón de la ciudad",
                                EstadoServicio.DISPONIBLE,
                                TipoHospedaje.HOTEL,
                                200, // Capacidad máxima
                                3, // Días
                                2, // Noches
                                LocalTime.of(11, 0),
                                Arrays.asList("WiFi", "Desayuno incluido", "Piscina"),
                                4.6097,
                                -74.0817,
                                "Centro Bogotá");

                Hospedaje hospedaje2 = new Hospedaje(
                                "Cabañas del Bosque",
                                "Encantadoras cabañas en un entorno natural",
                                EstadoServicio.DISPONIBLE,
                                TipoHospedaje.CABAÑA,
                                50, // Capacidad máxima
                                4, // Días
                                3, // Noches
                                LocalTime.of(10, 0),
                                Arrays.asList("Chimenea", "Parrilla", "Senderos cercanos"),
                                5.0689,
                                -75.5174,
                                "Bosque Nevado");

                Hospedaje hospedaje3 = new Hospedaje(
                                "Camping Estrella",
                                "Zona de camping con todas las comodidades",
                                EstadoServicio.DISPONIBLE,
                                TipoHospedaje.CAMPING,
                                100, // Capacidad máxima
                                2, // Días
                                1, // Noches
                                LocalTime.of(9, 0),
                                Arrays.asList("Sanitarios", "Duchas", "Área de fogatas"),
                                3.4516,
                                -76.5312,
                                "Zona Rural de Cali");

                hospedajeRepository.saveAll(Arrays.asList(hospedaje1, hospedaje2, hospedaje3));

                Voluntariado voluntariado1 = new Voluntariado(
                                "Voluntariado en salud comunitaria",
                                "Brigada de salud para comunidades rurales",
                                EstadoServicio.DISPONIBLE,
                                "Mejorar la salud y el bienestar de comunidades rurales",
                                15, // Duración en días
                                Arrays.asList("Atención médica", "Revisión de salud", "Charlas educativas"),
                                Arrays.asList("Mayor de 18 años", "Experiencia en salud",
                                                "Compromiso de tiempo completo"),
                                4.711, // Latitud
                                -74.072, // Longitud
                                "Cundinamarca, Colombia",
                                0.0, // Costo: Voluntariado sin costo
                                Arrays.asList("Alimentación", "Alojamiento", "Transporte"));

                Voluntariado voluntariado2 = new Voluntariado(
                                "Voluntariado ambiental",
                                "Reforestación y educación ambiental en la selva",
                                EstadoServicio.DISPONIBLE,
                                "Proteger y preservar el medio ambiente en la región amazónica",
                                30, // Duración en días
                                Arrays.asList("Reforestación", "Educación ambiental", "Reciclaje"),
                                Arrays.asList("Compromiso con la naturaleza", "Disponibilidad para trabajo físico",
                                                "Trabajo en equipo"),
                                -3.465, // Latitud
                                -62.933, // Longitud
                                "Amazonas, Colombia",
                                0.0, // Costo: Voluntariado sin costo
                                Arrays.asList("Alimentación", "Alojamiento", "Capacitación"));

                Voluntariado voluntariado3 = new Voluntariado(
                                "Voluntariado en educación",
                                "Enseñanza en comunidades sin acceso a educación formal",
                                EstadoServicio.DISPONIBLE,
                                "Brindar acceso a la educación en zonas de difícil acceso",
                                45, // Duración en días
                                Arrays.asList("Clases de matemáticas", "Clases de ciencias", "Charlas motivacionales"),
                                Arrays.asList("Habilidad para enseñar", "Paciencia", "Disponibilidad para viajar"),
                                6.2518, // Latitud
                                -75.5636, // Longitud
                                "Antioquia, Colombia",
                                0.0, // Costo: Voluntariado sin costo
                                Arrays.asList("Alimentación", "Transporte", "Material educativo"));

                // Guardar los voluntariados en la base de datos
                voluntariadoRepository.saveAll(Arrays.asList(voluntariado1, voluntariado2, voluntariado3));

        }

}
