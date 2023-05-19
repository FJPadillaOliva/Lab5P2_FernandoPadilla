
package lab5p2_fernandopadilla;


public class SuperHumano extends Persona {
    private String superpoder;

    public SuperHumano() {
    }

    public SuperHumano(String superpoder, String nombre, String poder, String debilidad, int fuerza, int agilidadF, int agilidadM) {
        super(nombre, poder, debilidad, fuerza, agilidadF, agilidadM);
        this.superpoder = superpoder;
    }

    public String getSuperpoder() {
        return superpoder;
    }

    public void setSuperpoder(String superpoder) {
        this.superpoder = superpoder;
    }

    @Override
    public String toString() {
        return "SuperHumano{" + "superpoder=" + superpoder + '}';
    }
    
    
    
}
