import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MateriaTest {
    @Test
    public void ObtenerNombreMateria(){
        Materia matematica = new Materia();
        matematica.setNombre("matematica");

        Assertions.assertEquals("matematica" , matematica.getNombre());
    }

    @Test
    @DisplayName("ObtenerCorrelativas")
    public void ObtenerMateriasCorrelativas(){
        Materia matematica = new Materia();
        matematica.setNombre("matematica");
        Materia fisica = new Materia();
        fisica.setNombre("fisica");
        Materia economia = new Materia();
        economia.setNombre("economia");

        matematica.setCorrelativas(List.of(fisica,economia));

        Assertions.assertEquals(List.of(fisica, economia) , matematica.getCorrelativas());
    }
}