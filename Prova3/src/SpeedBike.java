public class SpeedBike extends Bike implements Qualidade{
    // in millimeters (mm)
    private int espessuraPneu;

    public SpeedBike(double velocidadeInicial, int marchaInicial, int espessuraPneu) {
        super(velocidadeInicial, marchaInicial);
        this.setEspessuraPneu(espessuraPneu);
    }

    public int getEspessuraPneu() {
        return espessuraPneu;
    }

    public void setEspessuraPneu(int espessuraPneu) {
        this.espessuraPneu = espessuraPneu;
    }

    public void imprimirDados() {
        super.imprimirDados();
        System.out.println("A SpeedBike tem pneus de "
                + this.getEspessuraPneu() + " MM.");
    }

    @Override
    public boolean ehMelhor(Qualidade obj) {

       if(((SpeedBike) obj).espessuraPneu < this.espessuraPneu){
           return true;
       }
       return false;
    }

    @Override
    public void imprimeGarantia() {
        System.out.println("Garantia de 03 anos");
    }
}
