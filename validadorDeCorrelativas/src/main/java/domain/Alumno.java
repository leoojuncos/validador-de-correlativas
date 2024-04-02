package domain;

import java.util.List;
public class Alumno {
    private List<Materia> materiasAprobadas;

    public Alumno(List<Materia> materiasAprobadas) {
        this.materiasAprobadas = materiasAprobadas;
    }
    public List<Materia> getMateriasAprobadas() {
        return materiasAprobadas;
    }
    public void setMateriasAprobadas(List<Materia> materiasAprobadas) {
        this.materiasAprobadas = materiasAprobadas;
    }

    public boolean tieneAprobada(Materia materia) {
        return this.materiasAprobadas
                .contains(materia);
    }
}
