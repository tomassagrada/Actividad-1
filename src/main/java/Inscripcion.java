import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Inscripcion {
    private List<Materia> materiasAcursar;
    private boolean fueAprobada;
    private Alumno alumno;
    private LocalDateTime fechaDeEvaluacion;

    public Inscripcion() {
        this.materiasAcursar = new ArrayList<>();
    }

    public List<Materia> getMateriasAcursar() {
        return materiasAcursar;
    }

    public void setMateriasAcursar(List<Materia> materiasAcursar) {
        this.materiasAcursar = materiasAcursar;
    }

    public boolean isFueAprobada() {
        return fueAprobada;
    }

    public void setFueAprobada(boolean fueAprobada) {
        this.fueAprobada = fueAprobada;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public LocalDateTime getFechaDeEvaluacion() {
        return fechaDeEvaluacion;
    }

    public void setFechaDeEvaluacion(LocalDateTime fechaDeEvaluacion) {
        this.fechaDeEvaluacion = fechaDeEvaluacion;
    }

    public boolean aprobada(){
        fueAprobada = this.materiasAcursar.stream().allMatch(a -> a.cumpleCorrelativas(alumno.getMateriasAprobadas()));
        return this.fueAprobada;
    }
}
