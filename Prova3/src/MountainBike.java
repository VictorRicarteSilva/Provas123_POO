import java.util.Objects;

public class MountainBike extends Bike implements Qualidade{
    private String tipoSuspensao;

    public MountainBike(double velocidadeInicial, int marchaInicial, String tipoSuspensao) {
        super(velocidadeInicial, marchaInicial);
        this.setTipoSuspensao(tipoSuspensao);
    }

    public String getTipoSuspensao() {
        return tipoSuspensao;
    }

    public void setTipoSuspensao(String tipoSuspensao) {
        this.tipoSuspensao = tipoSuspensao;
    }

    public void imprimirDados() {
        super.imprimirDados();
        System.out.println("A MountainBike possui suspensão do tipo " + this.getTipoSuspensao());
    }

    @Override
    public boolean ehMelhor(Qualidade obj) {
        if(Objects.equals(((MountainBike) obj).tipoSuspensao, "Óleo") && !Objects.equals(this.tipoSuspensao, "Óleo")){
            return true;
        }else if(Objects.equals(((MountainBike) obj).tipoSuspensao, "Ar") && Objects.equals(this.tipoSuspensao, "Molas")){
            return true;
        }
        return false;
    }

    @Override
    public void imprimeGarantia() {
        System.out.println("Garantia de 03 anos");
    }
}
