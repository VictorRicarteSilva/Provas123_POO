public class Retangulo {

    private Ponto p1;
    private Ponto p2;

    public Ponto getP1() {
        return p1;
    }

    public void setP1(Ponto p1) {
        this.p1 = p1;
    }

    public Ponto getP2() {
        return p2;
    }

    public void setP2(Ponto p2) {
        this.p2 = p2;
    }

    public Retangulo(Ponto ponto1, Ponto ponto2){
        this.p1 = ponto1;
        this.p2 = ponto2;
    }

    public Retangulo(Ponto ponto2){
        this.p2 = ponto2;
    }

    public double calcArea(){
      double base = this.p1.getX() - this.p2.getX();
      double altura = this.p1.getY() - this.p2.getY();
      double area = base * altura;
      if(area < 0){
          area = -area;
      }
      return area;
    }
}
