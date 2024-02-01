public class Cilindro extends Forma{


public double radio;
public double altura;


    public Cilindro(String nombre, double radio, double altura) {
        super(nombre);
        this.radio = radio;
        this.altura = altura;

    }


    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double area(){


        return Math.pow(radio,2)*altura*Math.PI;
    }
    @Override
    public String toString() {
        return "Cilindro{" +
                "radio=" + radio +
                ", altura=" + altura +
                '}';
    }
}
