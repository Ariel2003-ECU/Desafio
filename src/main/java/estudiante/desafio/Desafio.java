package estudiante.desafio;

import estudiante.desafio.clases.NavegadorHistorial;

/**
 *
 * @author ariel
 */
public class Desafio {

    public static void main(String[] args) {
        NavegadorHistorial Historial =new NavegadorHistorial();
        
        //Simular la navegación
        Historial.VisitarPagina("google.com");
        Historial.VisitarPagina("steam.com");
        Historial.VisitarPagina("x.com");
        
        Historial.irAtras();
        Historial.irAtras();
        Historial.irAdelante();
        
        Historial.VisitarPagina("youtube.com");
        Historial.MostrarHistorial();
    }
}
