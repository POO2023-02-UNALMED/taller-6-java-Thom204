package vehiculos;

public class Camioneta extends Vehiculo{
    protected boolean volco;
    static int Cantidad=0;
    public Camioneta(String placa, int puertas, String nombre, double precio, double peso, Fabricante fabricante, boolean volco) {
        super(placa, puertas, 90, nombre, precio, peso, "4X4", fabricante);
        this.volco=volco;
        Cantidad++;
    }

    public void setVolco(boolean volco) {
        this.volco = volco;
    }
    public boolean isVolco() {
        return this.volco;
    }
}
