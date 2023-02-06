public class Bike extends VeiculoDuasRodas{
    private Marcha marcha;
    protected double velocidade;

    public Bike(String tipoDeRoda, int id, String nomeFabricante,Marcha marcha, double velocidade) {
        super(tipoDeRoda, id, nomeFabricante);
        this.marcha = marcha;
        this.velocidade = velocidade;
    }
    public void frear(int decremente){
        velocidade -= decremente;
    }
    public void acelerar(int incremento){
        velocidade += incremento;
    }
    @Override
    public void imprimirDados(){
        System.out.println("\n Rodas do tipo: " + this.getTipoDeRoda() + ", I.D do veiculo: " + this.getId() + ", nome do fabricante: " + this.getNomeFabricante() + ", Bike está na marcha " + this.marcha.getMarchaAtual() + " e com velocidade de " + this.velocidade + " km/h. ");
    }
}
