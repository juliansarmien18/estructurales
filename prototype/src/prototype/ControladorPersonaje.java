
package prototype;

import java.util.Hashtable;



public class ControladorPersonaje {
    
     // Para almacenar los objetos de tipo Prototype que se vayan creando
     private Hashtable hPersonajes = new Hashtable();
    // ------------------------------
    public ControladorPersonaje()
    {
        // Crear un Hechicero y asignarle propiedades
        Personaje h1 = new Hechicero();
        h1.setNombre("boldemor");
        // Guardarlo
         this.addPersonaje( h1.getNombre(), h1 );
        // Crear un Guerrero y asignarle propiedades
        Personaje p1 = new Guerrero();
        p1.setNombre("jon cena");
        p1.setArma("ESPADA");
        // Guardarlo
        this.addPersonaje( p1.getNombre(), p1 );
    }
    // ------------------------------
    public void addPersonaje( String nombre, Personaje objEnemigo )
    {
         this.hPersonajes.put( nombre, objEnemigo );
    }
    // ------------------------------
    public Personaje getPersonaje( String nombre )
    {
         Personaje objPrototipo = (Guerrero) hPersonajes.get( nombre );
         return objPrototipo;
    }
    // ------------------------------
     public Personaje getClon( String nombre )
    {
        // Localizar el objeto deseado
         Personaje objPrototipo = (Guerrero) hPersonajes.get( nombre );
        // Devolver un clon
         return (Personaje) objPrototipo.clonar();
    }
    
    
}
