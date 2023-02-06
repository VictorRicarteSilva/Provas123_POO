public class SpeedBike extends Bike{
    // In millimeters (mm)
    private int espessuraPneu;

    public SpeedBike(String tipoDeRoda, int id, String nomeFabricante, double velocidadeInicial, Marcha marchaInicial, int espessuraPneu){
        super(tipoDeRoda, id, nomeFabricante, marchaInicial, velocidadeInicial);
        this.setExpessuraPneu(espessuraPneu);
    }
    public int getEspessuraPneu(){
        return this.espessuraPneu;
    }
    public void setExpessuraPneu(int espessuraPneu){
        this.espessuraPneu = espessuraPneu;
    }
    @Override
    public void imprimirDados(){
        super.imprimirDados();
        System.out.println("A SpeedBike tem pneus de " + getEspessuraPneu() + " MM.");
    }
}
