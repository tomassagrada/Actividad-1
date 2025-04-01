import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AlumnoTest {
    @Test
    public void ObtenerNombreCompleto(){
        Alumno alumno = new Alumno();
        alumno.setNombre("Manuel");
        alumno.setApellido("Garcia");

        Assertions.assertEquals("Manuel" , alumno.getNombre());
        Assertions.assertEquals("Garcia" , alumno.getApellido());
    }

    @Test
    @DisplayName("AgregarMateriasAAprobadas")
    public void ObtenerMateriasAprobadas(){
        Alumno alumno = new Alumno();
        alumno.setNombre("Manuel");
        alumno.setApellido("Garcia");

        Materia matematica = new Materia();
        matematica.setNombre("matematica");
        Materia fisica = new Materia();
        fisica.setNombre("fisica");
        Materia economia = new Materia();
        economia.setNombre("economia");

        alumno.agregarMateriasAprobadas(matematica,fisica,economia);

        Assertions.assertEquals(List.of(matematica, fisica, economia) , alumno.getMateriasAprobadas());
    }
}