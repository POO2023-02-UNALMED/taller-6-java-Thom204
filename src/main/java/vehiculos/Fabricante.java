package vehiculos;
import java.util.ArrayList;
public class Fabricante{
    private String nombre;
    Pais pais;
    int numVentas=0;
    static ArrayList<Fabricante> fabricas=new ArrayList<Fabricante>();
    public Fabricante(String nombre, Pais pais){
        this.nombre=nombre;
        this.pais=pais;
        fabricas.add(this);
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public String getNombre() {
        return nombre;
    }

    public Pais getPais() {
        return pais;
    }

    public static Fabricante fabricaMayorVentas() {
        Fabricante maxVentas=fabricas.get(0);
        for (Fabricante f : fabricas){
            if (f.numVentas>maxVentas.numVentas){
                maxVentas=f;
            }
        }
        return maxVentas;
    }
}
