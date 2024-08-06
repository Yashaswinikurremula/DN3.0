

public class BuilderTest {

    public static void main(String[] args) {
        Computer basicComputer = new Computer.Builder()
                .setCPU("Intel i3")
                .setRAM("8GB")
                .setStorage("256GB SSD")
                .build();

        System.out.println("Basic Computer: " + basicComputer);


        Computer gamingComputer = new Computer.Builder()
                .setCPU("Intel i7")
                .setRAM("16GB")
                .setStorage("1TB SSD")
                .setGraphicsCard("NVIDIA RTX 3080")
                .setPowerSupply("750W")
                .setMotherboard("ASUS ROG")
                .setCaseType("Mid Tower")
                .build();

        System.out.println("Gaming Computer: " + gamingComputer);

        Computer workstationComputer = new Computer.Builder()
                .setCPU("AMD Ryzen 9")
                .setRAM("32GB")
                .setStorage("2TB SSD")
                .setGraphicsCard("NVIDIA Quadro")
                .setPowerSupply("850W")
                .setMotherboard("MSI Workstation")
                .setCaseType("Full Tower")
                .build();

        System.out.println("Workstation Computer: " + workstationComputer);
    }
}
