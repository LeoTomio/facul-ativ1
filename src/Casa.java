public class Casa extends Edificio {
    private int numeroDeQuartos;

    public Casa(String localizacao, int andares, boolean temElevador, int numeroDeQuartos) {
        super(localizacao, andares, temElevador);
        this.numeroDeQuartos = numeroDeQuartos;
    }

    public int getNumeroDeQuartos() {
        return numeroDeQuartos;
    }

    public void setNumeroDeQuartos(int numeroDeQuartos) {
        this.numeroDeQuartos = numeroDeQuartos;
    }

    @Override
    public double getCarbonFootprint() {
        double baseFootprint = getAndares() * 500; 
        baseFootprint += numeroDeQuartos * 200;
        if (isTemElevador()) {
            baseFootprint += 300;
        }
        return baseFootprint;
    }
}
