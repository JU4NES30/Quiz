import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Carro Carro1 = new Carro("kia", 2020, 20 );
        Moto Moto1 = new Moto("Yamaha", 2022, 15);
        Vehiculo Camion = new Camion("kenworth", 2015, 60);
        Carro CarroElectrico1 = new CarroElectrico("Renault", 2021, 30);

        Scanner teclado = new Scanner(System.in);
        int i;
        i = teclado.nextInt();

        System.out.println("Elija una opcion;");
        System.out.println("1) Informacion del Carro");
        System.out.println("2) Informacion de la moto");
        System.out.println("3) Informacion del camion");
        System.out.println("4) Informacion del carro electrico");
        System.out.println("5) Cargar bateria");
        System.out.println("6) Salir");

        switch (i){
            case 1:
                Carro1.mostrarInfo();

        }
    }

}