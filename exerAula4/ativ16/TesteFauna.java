package ativ16;

public class TesteFauna {
    public static void main(String[] args) {
        Fauna animal = new Fauna();
        
        animal.setEspecieAnimal("Elefante");
        animal.setIdadeAnimal(15);
        animal.setMassaCorporal(5000.0);

        animal.alimentarAnimal();
        animal.repousarAnimal();

        System.out.println("Espécie: " + animal.getEspecieAnimal());
        System.out.println("Idade: " + animal.getIdadeAnimal());
        System.out.println("Massa corporal: " + animal.getMassaCorporal() + " kg");
    }
}