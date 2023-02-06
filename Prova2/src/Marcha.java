public class Marcha {
    private int qtdMarcha;
    private String fabricante;
    private int marchaAtual;

    public Marcha(int qtdMarcha, String fabricante){
        this.qtdMarcha = qtdMarcha;
        this.fabricante = fabricante;
        this.marchaAtual = 1;
    }

    public int getQtdMarcha() {
        return qtdMarcha;
    }

    public String getFabricante() {
        return fabricante;
    }

    public int getMarchaAtual() {
        return marchaAtual;
    }

    public void aumentarMarcha(){
        if(marchaAtual < qtdMarcha){
            marchaAtual++;
        }
    }

    public void diminuirMarcha(){
        if(marchaAtual > 0){
            marchaAtual--;
        }
    }
}
