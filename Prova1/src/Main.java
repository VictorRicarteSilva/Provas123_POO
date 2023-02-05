public class Main {
    public static void main(String[] args) {

        Ponto p1 = new Ponto(4, 5);
        Ponto p2 = new Ponto(1, 1);

        Retangulo r = new Retangulo(p1, p2);

        System.out.println("Area formada por (" + p1.getX() + "," + p1.getY() + ") e (" + p2.getX() + "," + p2.getY() + ") è: " + r.calcArea());
    }
}