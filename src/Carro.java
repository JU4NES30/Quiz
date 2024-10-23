public class Carro extends Vehiculo {

    public Carro() {
    }

    public Carro(String marca, int modelo, int combustible) {
        super(marca, modelo, combustible);
    }

    @Override
    String Encender() {
        return "";
    }

    @Override
    String Apagar() {
        return "";
    }

    @Override
    String mostrarInfo() {
        return "";
    }
}
