public class Escola extends Edificio {
    private int numeroDeSalas;

    public Escola(String localizacao, int andares, boolean temElevador, int numeroDeSalas) {
        super(localizacao, andares, temElevador);
        this.numeroDeSalas = numeroDeSalas;
    }

    public int getNumeroDeSalas() {
        return numeroDeSalas;
    }

    public void setNumeroDeSalas(int numeroDeSalas) {
        this.numeroDeSalas = numeroDeSalas;
    }

    @Override
    public double getCarbonFootprint() {
        double baseFootprint = getAndares() * 1500; 
        baseFootprint += numeroDeSalas * 100;
        if (isTemElevador()) {
            baseFootprint += 700;
        }
        return baseFootprint;
    }
}
