
package lab5p2_fernandopadilla;


public class Deidad extends Extraterrestre {
  private boolean religion;
  private String nombreR;

    public Deidad() {
    }

    public Deidad(boolean religion, String nombreR, String nombre, String poder, String debilidad, int fuerza, int agilidadF, int agilidadM) {
        super(nombre, poder, debilidad, fuerza, agilidadF, agilidadM);
        this.religion = religion;
        this.nombreR = nombreR;
    }

    public boolean isReligion() {
        return religion;
    }

    public void setReligion(boolean religion) {
        this.religion = religion;
    }

    public String getNombreR() {
        return nombreR;
    }

    public void setNombreR(String nombreR) {
        this.nombreR = nombreR;
    }

    @Override
    public String toString() {
        return "Deidad{" + "religion=" + religion + ", nombreR=" + nombreR + '}';
    }
  
  
  
}
