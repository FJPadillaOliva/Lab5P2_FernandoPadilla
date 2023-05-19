
package lab5p2_fernandopadilla;


public class Mutante extends Persona {
String factores;

    public Mutante() {
    }

    public Mutante(String factores, String nombre, String poder, String debilidad, String tipo, int fuerza, int agilidadF, int agilidadM) {
        super(nombre, poder, debilidad, tipo, fuerza, agilidadF, agilidadM);
        this.factores = factores;
    }

    

    public String getFactores() {
        return factores;
    }

    public void setFactores(String factores) {
        this.factores = factores;
    }

    @Override
    public String toString() {
        return "Mutante{" + "factores=" + factores + '}';
    }


}
