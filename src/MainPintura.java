public class MainPintura {

public static void main(String[]args){


    Pintura pintar= new Pintura(250);
    Rectángulo rectángulo= new Rectángulo("Cubito",20,35);
    Esfera esfera= new Esfera("Pac-man",15);
    Cilindro cilindro = new Cilindro("Pepe",10,30);


    System.out.println("Se le añade " + pintar.cobertura + " metros cuadrados de pintura");
    System.out.println("");

    System.out.println("El rectángulo se llama " + rectángulo.getNombre());
    System.out.println("La longitud del rectángulo es: " + rectángulo.longitud);
    System.out.println("La anchura del rectángulo es: " + rectángulo.anchura);
    System.out.println("El area del rectángulo es: " + rectángulo.area());
    System.out.println("La cantidad de pintura que necesitamos para pintar el rectángulo es: " + pintar.Pintar(rectángulo));

    System.out.println("");
    System.out.println("La esfera se llama " + esfera.getNombre());
    System.out.println("El radio de la esfera es: " + esfera.radio);
    System.out.println("El area del la esfera es : " + esfera.area());
    System.out.println("La cantidad de pintura que necesitamos para pintar el cilindro es: " + pintar.Pintar(cilindro));

    System.out.println("");
    System.out.println("El cilindro se llama " + cilindro.getNombre());
    System.out.println("El radio de el cilindro es: " + cilindro.radio);
    System.out.println("La altura del cilindro es: " + cilindro.altura);
    System.out.println("EL area del cilindro es: " + cilindro.area());
    System.out.println("La cantidad de pintura que necesitamos para pintar la esfera es: " + + pintar.Pintar(esfera));


}

}
