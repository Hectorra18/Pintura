import java.awt.geom.Area;

public class Forma {

private String nombre;


    public Forma(String nombre) {
        this.nombre = nombre;
    }


    public double area(){


 return 0;}


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    @Override
    public String toString() {
        return
                "nombre='" + nombre + '\'' +
                        '}';
    }

}

