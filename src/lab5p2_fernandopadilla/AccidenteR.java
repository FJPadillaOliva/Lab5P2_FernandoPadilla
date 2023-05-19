
package lab5p2_fernandopadilla;


public class AccidenteR extends Persona {
    private int edad;
    private String tipo;

    public AccidenteR() {
    }

    public AccidenteR(int edad, String tipo, String nombre, String poder, String debilidad, String tipoA, int fuerza, int agilidadF, int agilidadM) {
        super(nombre, poder, debilidad, tipo, fuerza, agilidadF, agilidadM);
        this.edad = edad;
        this.tipo = tipoA;
    }

    

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "AccidenteR{" + "edad=" + edad + ", tipo=" + tipo + '}';
    }
    
    
}
