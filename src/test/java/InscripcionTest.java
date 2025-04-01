import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class InscripcionTest {
    @Test
    @DisplayName("ArmarInscripcion")
    public void armadoDeInscripcion(){
        Alumno alumno = new Alumno();
        alumno.setNombre("Manuel");
        alumno.setApellido("Garcia");

        Materia matematica = new Materia();
        matematica.setNombre("matematica");
        Materia fisica = new Materia();
        fisica.setNombre("fisica");
        Inscripcion inscripcion = new Inscripcion();
        inscripcion.setAlumno(alumno);
        inscripcion.setFechaDeEvaluacion(LocalDateTime.of(2024, 3, 20, 0, 0));
        inscripcion.setMateriasAcursar(List.of(matematica, fisica));

        Assertions.assertEquals(List.of(matematica,fisica) , inscripcion.getMateriasAcursar());
        Assertions.assertEquals(alumno , inscripcion.getAlumno());
        Assertions.assertEquals(LocalDateTime.of(2024, 3, 20, 0, 0) , inscripcion.getFechaDeEvaluacion());
    }
    @Test
    @DisplayName("funcionaAprobado")
    public void funcionAprobado(){
        Materia matematica = new Materia();
        matematica.setNombre("matematica");
        Materia fisica = new Materia();
        fisica.setNombre("fisica");
        Materia economia = new Materia();
        economia.setNombre("economia");
        Materia disenio = new Materia();
        disenio.setNombre("disenio");

        Alumno alumno = new Alumno();
        alumno.agregarMateriasAprobadas(fisica,economia);

        Inscripcion inscripcion = new Inscripcion();
        inscripcion.setAlumno(alumno);
        inscripcion.setFechaDeEvaluacion(LocalDateTime.of(2024, 3, 20, 0, 0));
        inscripcion.setMateriasAcursar(List.of(matematica, disenio));

        matematica.setCorrelativas(List.of(fisica,economia));
        inscripcion.aprobada();
        assertTrue(inscripcion.isFueAprobada());
    }
}