public class Rectángulo extends Forma{


    public double longitud;
    public double anchura;


    public Rectángulo(String nombre, double longitud, double anchura) {
        super(nombre);
        this.longitud = longitud;
        this.anchura = anchura;

    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public double getAnchura() {
        return anchura;
    }

    public void setAnchura(double anchura) {
        this.anchura = anchura;
    }


   public double area(){

        double arearectangulo= longitud*anchura;
        return arearectangulo;
   }

    @Override
    public String toString() {
        return "Rectángulo{" +
                "longitud=" + longitud +
                ", anchura=" + anchura +
                '}';
    }
}
