public abstract class VeiculoDuasRodas {
    private String tipoDeRoda;
    private int id;
    private String nomeFabricante;

    public VeiculoDuasRodas(String tipoDeRoda, int id, String nomeFabricante) {
        this.tipoDeRoda = tipoDeRoda;
        this.id = id;
        this.nomeFabricante = nomeFabricante;
    }

    public String getTipoDeRoda() {
        return tipoDeRoda;
    }

    public void setTipoDeRoda(String tipoDeRoda) {
        this.tipoDeRoda = tipoDeRoda;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeFabricante() {
        return nomeFabricante;
    }

    public void setNomeFabricante(String nomeFabricante) {
        this.nomeFabricante = nomeFabricante;
    }

    public abstract void imprimirDados();
}
