package domain;

import org.junit.Assert;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;


public class InscripcionTest {

    @Test
    public void laInscripcionEsAprobada(){

        Materia paradigmasDeProgramacion = new Materia(null);
        Materia analisisDeSistemas = new Materia(null);

        List<Materia> correlativasDisenio = new ArrayList<>();
        correlativasDisenio.add(paradigmasDeProgramacion);
        correlativasDisenio.add(analisisDeSistemas);

        Materia disenioDeSistemas = new Materia(correlativasDisenio);

        List<Materia> materiasAprobadasDante = new ArrayList<>();
        materiasAprobadasDante.add(paradigmasDeProgramacion);
        materiasAprobadasDante.add(analisisDeSistemas);

        Alumno dantePrystupa = new Alumno(materiasAprobadasDante);

        List<Materia> materiasInscribirDante = new ArrayList<>();
        materiasInscribirDante.add(disenioDeSistemas);

        Inscripcion inscripcionDante = new Inscripcion(dantePrystupa, materiasInscribirDante);

        Assert.assertTrue(inscripcionDante.aprobada());
    }

    @Test
    public void laInscripcionEsRechazada(){

        Materia algebra = new Materia(null);
        Materia analisisMatematico1 = new Materia(null);

        List<Materia> correlativasAM2 = new ArrayList<>();
        correlativasAM2.add(algebra);
        correlativasAM2.add(analisisMatematico1);

        Materia analisisMatematico2 = new Materia(correlativasAM2);

        List<Materia> materiasAprobadasTomas = new ArrayList<>();
        materiasAprobadasTomas.add(algebra);

        Alumno tomasDetinis = new Alumno(materiasAprobadasTomas);

        List<Materia> materiasInscribirTomas = new ArrayList<>();
        materiasInscribirTomas.add(analisisMatematico2);

        Inscripcion inscripcionTomas= new Inscripcion(tomasDetinis, materiasInscribirTomas);

        Assert.assertFalse(inscripcionTomas.aprobada());
    }
}
