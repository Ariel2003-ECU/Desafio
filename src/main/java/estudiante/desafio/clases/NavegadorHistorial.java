/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estudiante.desafio.clases;
import java.util.Stack;
/**
 *
 * @author ariel
 */
public class NavegadorHistorial {
    //Atributos
    private Stack<String> PilaAtras;
    private Stack<String> PilaAdelante;
    private String PaginaActual;
    
    public NavegadorHistorial(){
    PilaAtras = new Stack<>();
    PilaAdelante = new Stack<>();
    PaginaActual=null;
    }
    //Metodos
    
    //Metodo VisitarPagina
    public void VisitarPagina (String url){
    if(PaginaActual !=null){
        PilaAtras.push(PaginaActual);
        }
    PaginaActual=url;
    PilaAdelante.clear();
        System.out.println("Visitando: "+PaginaActual);
    }
    //Metodo irAtras
    public void irAtras(){
    if(!PilaAtras.isEmpty()){
        PilaAdelante.push(PaginaActual);
        PaginaActual=PilaAtras.pop();
        System.out.println("Retrocediendo hacia: " +PaginaActual);
        }else{
        System.out.println("No hay mas paginas por donde retroceder.");
        }
    }
    //Metodo irAdelante
    public void irAdelante(){
    if(!PilaAdelante.isEmpty()){
        PilaAtras.push(PaginaActual);
        PaginaActual =PilaAdelante.pop();
        System.out.println("Avanzando hacia a: "+PaginaActual);
        }else{
        System.out.println("No hay paginas por donde avanzar.");
        }
    }
    //Metodo MostrarHistorial
    public void MostrarHistorial() {
        System.out.println("--- Historial ---");
        System.out.println("Páginas hacia atrás: " + PilaAtras);
        System.out.println("Página actual: " + PaginaActual);
        System.out.println("Páginas hacia adelante: " + PilaAdelante);
    }
}