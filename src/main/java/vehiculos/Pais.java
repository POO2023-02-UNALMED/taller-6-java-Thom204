package vehiculos;
import java.util.ArrayList;
public class Pais {
    private String nombre;
    int numVentas=0;
    static ArrayList<Pais>paises= new ArrayList<Pais>();

    public Pais(String nombre){
        paises.add(this);
        this.nombre=nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
    public static Pais paisMasVendedor(){
        Pais maxVentas=paises.get(0);
        for (Pais p: paises){
            if(p.numVentas> maxVentas.numVentas){
                maxVentas=p;
            }
        }
        return maxVentas;
    }
}
