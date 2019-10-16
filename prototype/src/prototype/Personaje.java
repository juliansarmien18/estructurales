
package prototype;


public abstract class Personaje {
    
     private String nombre ="diomedes";
    private String arma = "DAGA"; // arma por defecto cuchoooooooo
    // ------------------------------
    public String getNombre() {
        return this.nombre;
    }
    // ------------------------------
    public void setNombre( String nombre) {
        this.nombre = nombre;
    }
    // ------------------------------
    public String getArma() {
        return this.arma;
    }
    // ------------------------------
    public void setArma( String arma) {
        this.arma = arma;
    }
    // ------------------------------
    // Métodos que deberán ser construídos por las clases que hereden de ésta
     public abstract Personaje clonar();
    public abstract void atacar();
    public abstract void detener();
    
}
