public class Bike {
    protected int marcha;
    protected double velocidade;
    protected double velocidadeMaxima;

    public Bike(double velocidadeInicial, int marchaInicial) {
        this.marcha = marchaInicial;
        this.velocidade = velocidadeInicial;
        this.velocidadeMaxima = 120;
    }

    public void setMarcha(int novoValor){
        this.marcha = novoValor;
    }

    public void frear(int decremento){
        if(velocidade - decremento < 0){
            throw new VelocidadeException("Velocidade Inválida (negativa)");
        }
        velocidade -= decremento;
    }

    public void acelerar(int incremento){
        if(velocidade + incremento > velocidadeMaxima){
            throw new VelocidadeException("Valor ultrapassa o máximo permitido");
        }
        velocidade += incremento;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void imprimirDados(){
        System.out.println("\nBike está na marcha " + this.marcha +
                " e com velocidade de " + this.velocidade + " KM/h.");
    }
}
