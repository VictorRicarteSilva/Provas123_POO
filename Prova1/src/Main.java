import java.util.Scanner;

public class Main { // exercicio dois está num arquivo txt a parte.
    public static void main(String[] args) {
        int qtd;
        double x, y;
        Scanner scan = new Scanner(System.in);
        qtd = scan.nextInt();
        Retangulo[] retangulos = new Retangulo[qtd];
        for(int i = 0; i < qtd; i++){
            System.out.println("Entre com os eixos X e Y");
            x = scan.nextDouble();
            y = scan.nextDouble();
            Ponto p1 = new Ponto(x,y);
            x = scan.nextDouble();
            y = scan.nextDouble();
            Ponto p2 = new Ponto(x,y);
            retangulos[i] = new Retangulo(p1, p2);
            System.out.println("Area formada por (" + retangulos[i].getP1().getX() + "," + retangulos[i].getP1().getY() + ") e (" + retangulos[i].getP2().getX() + "," + retangulos[i].getP2().getY() + ") è: " + retangulos[i].calcArea());

        }
    }
}