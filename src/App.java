public class App {
    public static void main(String[] args) {
        // Edificio edificio = new Edificio("Centro", 5, true);
        Casa casa = new Casa("Subúrbio", 2, false, 4);
        Escola escola = new Escola("Centro", 3, true, 20);
        Carro carro = new Carro("Toyota", "Corolla", 2015);
        Bicicleta bicicleta = new Bicicleta("Montanha", 21, true);

        System.out.println("Pegada de Carbono da Casa: " + casa.getCarbonFootprint() + " kg CO2/ano");
        System.out.println("Pegada de Carbono da Escola: " + escola.getCarbonFootprint() + " kg CO2/ano");
        System.out.println("Pegada de Carbono do Carro: " + carro.getCarbonFootprint() + " kg CO2/ano");
        System.out.println("Pegada de Carbono da Bicicleta: " + bicicleta.getCarbonFootprint() + " kg CO2/ano");
   }
}
