import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class Materia {
    private String nombre;
    private List<Materia> correlativas;

    public Materia() {
        this.correlativas = new ArrayList<>();
    }

    public List<Materia> getCorrelativas() {
        return correlativas;
    }

    public void setCorrelativas(List<Materia> correlativas) {
        this.correlativas = correlativas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean cumpleCorrelativas(List<Materia> materiasAprobadas){
       return new HashSet<>(materiasAprobadas).containsAll(this.getMateriasNecesarias());
    }

    public List<Materia> getMateriasNecesarias(){
        return correlativas;
    }
}
