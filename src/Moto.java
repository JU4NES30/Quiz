public class Moto extends Vehiculo{
    public Moto() {
    }

    public Moto(String marca, int modelo, int combustible) {
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
