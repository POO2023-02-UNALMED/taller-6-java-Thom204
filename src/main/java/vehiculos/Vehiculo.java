package vehiculos;

public class Vehiculo {
    protected String nombre;
    protected String placa;
    protected int puertas;
    protected double VelocidadMaxima;
    protected double precio;
    protected double peso;
    protected String traccion;
    protected Fabricante fabricante;
    protected static int CantidadVehiculos=0;

    public Vehiculo(){
        CantidadVehiculos++;
    }
    public Vehiculo(String placa,int puertas,double velocidad, String nombre, double precio, double peso, String traccion, Fabricante fabricante){
        this.nombre=nombre;
        this.placa=placa;
        this.puertas=puertas;
        this.VelocidadMaxima=velocidad;
        this.precio=precio;
        this.peso=peso;
        this.traccion=traccion;
        this.fabricante=fabricante;
        CantidadVehiculos++;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public void setFabricante(Fabricante fabricante) {
        this.fabricante = fabricante;
    }
    public void setTraccion(String traccion) {
        this.traccion = traccion;
    }
    public void setVelocidadMaxima(double velocidadMaxima) {
        this.VelocidadMaxima = velocidadMaxima;
    }
    public static void setCantidadVehiculos(int cantidadVehiculos) {
        CantidadVehiculos = cantidadVehiculos;
    }

    public int getPuertas() {
        return this.puertas;
    }
    public String getNombre() {
        return this.nombre;
    }
    public String getPlaca() {
        return this.placa;
    }
    public double getPeso() {
        return this.peso;
    }
    public double getVelocidadMaxima() {
        return this.VelocidadMaxima;
    }
    public double getPrecio() {
        return this.precio;
    }
    public Fabricante getFabricante() {
        return this.fabricante;
    }
    public String getTraccion() {
        return this.traccion;
    }
    public static int getCantidadVehiculos() {
        return CantidadVehiculos;
    }
    public static String vehiculosPorTipo() {
        return "Automoviles: "+Automovil.Cantidad+"\nCamionetas: "+Camioneta.Cantidad+"\nCamiones: "+Camion.Cantidad;
    }
}
