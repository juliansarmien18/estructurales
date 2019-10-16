
package prototype;

public class Prototype {

    public static void main(String[] args) {
        
        ControladorPersonaje objGP = new ControladorPersonaje();
        // Obtenemos el Guerrero original
         Personaje p1 = objGP.getPersonaje("Guerrero1");
        System.out.println("==============================");
        
        ////////////////////////////////7/p1.getNombre("diomedes");
        // Mostrar datos pues pa guiarnos marica
        System.out.println("guerrero de tipo [" + p1.getNombre() + "]");
        System.out.println("tipo de arma[" + p1.getArma() + "]");
        System.out.println("==============================");
        
        
        // Obtener un segundo Guerrero (clon del anterior)
         Personaje p2 = objGP.getClon("Guerrero1");
         
         
        // Mostrar los datos pues es la misma monda que el otro sqjsj
        System.out.println("Clon del Guerrero creado:");
        System.out.println("Su nombre es [" + p2.getNombre() + "]");
        System.out.println("Su arma es [" + p2.getArma() + "]");
        System.out.println("==============================");
        // Modificacion de guerrero clonado
        p2.setNombre(" URIBE ");
        p2.setArma(" MOTOSIERRA ");
        
        
        // Mostrar los datos de ambos Guerreros (ambos tienen diferentes datos)
        System.out.println("Tras modificar el clon, ahora se llama [" + p2.getNombre() + "]");
        System.out.println("Su arma es [" + p2.getArma() + "]\n");
        System.out.println("El nombre del Guerrero original es [" + p1.getNombre() + "]");
        System.out.println("Su arma es [" + p1.getArma() + "]");
        System.out.println("==============================");
        // Modificamos el Guerrero original
        p1.setNombre(" JON CENA ");
        p1.setArma("you cant see me");
        // Mostrar los datos de ambos Guerreros tras la modificación (ambos tienen diferentes datos)
        System.out.println("Tras modificar el original, ahora es [" + p1.getNombre() + "]");
        System.out.println("Su arma es [" + p1.getArma() + "]\n");
        System.out.println("El nombre del clon es [" + p2.getNombre() + "]");
        System.out.println("Su arma es [" + p2.getArma() + "]");
    }
    
}
