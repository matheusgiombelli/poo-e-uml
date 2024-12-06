package ativ16;

public class TesteFauna {
    public static void main(String[] args) {
        Fauna animal = new Fauna();
        animal.especieAnimal = "Elefante";
        animal.idadeAnimal = 15;
        animal.massaCorporal = 5000.0;
        animal.alimentarAnimal();
        animal.repousarAnimal();
    }
}
