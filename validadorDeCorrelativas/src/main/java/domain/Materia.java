package domain;

import java.util.List;

public class Materia {

    private List<Materia> correlativas;

    public Materia(List<Materia> correlativas) {
        this.correlativas = correlativas;
    }
    public List<Materia> getCorrelativas() {
        return correlativas;
    }
    public void setCorrelativas(List<Materia> correlativas) {
        this.correlativas = correlativas;
    }

    public boolean puedeSerCursada(Alumno alumno) {
        return this.correlativas
                .stream()
                .allMatch(alumno::tieneAprobada);
    }
}
