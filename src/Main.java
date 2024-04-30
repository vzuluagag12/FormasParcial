public class Main {
    public static void main(String[] args) {
        Dibujador dibujador = new Dibujador();

        Forma circulo = new Circulo();
        Forma cuadrado = new Cuadrado();
        Forma triangulo = new Triangulo();

        dibujador.dibujarForma(circulo);
        dibujador.dibujarForma(cuadrado);
        dibujador.dibujarForma(triangulo);
    }
}

