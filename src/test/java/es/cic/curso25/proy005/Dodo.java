package es.cic.curso25.proy005;
//ejemplo de SINGLETON no es completamente correcto para evitar instancias duplicadas.
public class Dodo {

    private static Dodo instancia;

    private Dodo() {

    }

    public static Dodo getInstancia() {
        if (instancia == null) {

            instancia = new Dodo();

        }

        return instancia;
    }
}
