package domain;

import java.util.List;

public class Inscripcion {
    private Alumno alumnoInteresado;
    private List<Materia> materiasAInscribir;

    public Inscripcion(Alumno alumnoInteresado, List<Materia> materiasAInscribir) {
        this.alumnoInteresado = alumnoInteresado;
        this.materiasAInscribir = materiasAInscribir;
    }

    public boolean aprobada(){
        Alumno alumnoInteresado1 = this.alumnoInteresado;
        return this.materiasAInscribir
                .stream()
                .allMatch(m -> m.puedeSerCursada(alumnoInteresado1));
    }
}
