
package lab5p2_fernandopadilla;


public class Persona {
  private String nombre, poder, debilidad, tipo;
  private int fuerza, agilidadF, agilidadM;

    public Persona() {
        super();
    }

    public Persona(String nombre, String poder, String debilidad,String tipo, int fuerza, int agilidadF, int agilidadM) {
        this.nombre = nombre;
        this.poder = poder;
        this.debilidad = debilidad;
        this.fuerza = fuerza;
        this.agilidadF = agilidadF;
        this.agilidadM = agilidadM;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPoder() {
        return poder;
    }

    public void setPoder(String poder) {
        this.poder = poder;
    }

    public String getDebilidad() {
        return debilidad;
    }

    public void setDebilidad(String debilidad) {
        this.debilidad = debilidad;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public int getAgilidadF() {
        return agilidadF;
    }

    public void setAgilidadF(int agilidadF) {
        this.agilidadF = agilidadF;
    }

    public int getAgilidadM() {
        return agilidadM;
    }

    public void setAgilidadM(int agilidadM) {
        this.agilidadM = agilidadM;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", poder=" + poder + ", debilidad=" + debilidad + ", fuerza=" + fuerza + ", agilidadF=" + agilidadF + ", agilidadM=" + agilidadM + '}';
    }
  
  
  
}
