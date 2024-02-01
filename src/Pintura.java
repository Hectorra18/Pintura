public class Pintura {

    public double cobertura;
    public Forma forma;

    public Pintura(double cobertura) {
        this.cobertura = cobertura;
    }

    public double getCobertura() {
        return cobertura;
    }

    public void setCobertura(double cobertura) {
        this.cobertura = cobertura;
    }

    public double Pintar(Forma forma){


double pintura = forma.area() / cobertura;

return pintura;}
}
