public class MountainBike extends Bike{
    private String tipoSuspensao;

    public MountainBike(String tipoDeRoda, int id, String nomeFabricante, Marcha marcha, double velocidade, String tipoSuspensao) {
        super(tipoDeRoda, id, nomeFabricante, marcha, velocidade);
        this.tipoSuspensao = tipoSuspensao;
    }

    public String getTipoSuspensao() {
        return tipoSuspensao;
    }

    public void setTipoSuspensao(String tipoSuspensao) {
        this.tipoSuspensao = tipoSuspensao;
    }
    @Override
    public void imprimirDados() {
        super.imprimirDados();
        System.out.println("A " + "MountainBike possui" + " suspensão do tipo " + getTipoSuspensao());
    }
}
