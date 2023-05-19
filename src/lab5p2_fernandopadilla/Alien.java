
package lab5p2_fernandopadilla;


public class Alien extends Extraterrestre {
    private String planetaP;

    public Alien() {
    }

    public Alien(String planetaP, String nombre, String poder, String debilidad, String tipo, int fuerza, int agilidadF, int agilidadM) {
        super(nombre, poder, debilidad, tipo, fuerza, agilidadF, agilidadM);
        this.planetaP = planetaP;
    }

    

    public String getPlanetaP() {
        return planetaP;
    }

    public void setPlanetaP(String planetaP) {
        this.planetaP = planetaP;
    }

    @Override
    public String toString() {
        return "Alien{" + "planetaP=" + planetaP + '}';
    }
    
    
}
