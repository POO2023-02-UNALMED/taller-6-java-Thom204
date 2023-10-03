package vehiculos;

public class Automovil extends Vehiculo{
    private int puestos;
    static int Cantidad=0;
    public Automovil(String placa, String nombre, double precio, double peso, Fabricante fabricante, int puestos){
        super(placa,4,100,nombre,precio,peso,"FWD",fabricante);
        this.puestos=puestos;
        Cantidad++;
    }

    public void setPuestos(int puestos) {
        this.puestos = puestos;
    }
    public int getPuestos() {
        return this.puestos;
    }
}
