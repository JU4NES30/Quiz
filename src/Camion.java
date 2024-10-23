public class Camion extends Vehiculo{
    public Camion() {

    }

    public Camion(String marca, int modelo, int combustible) {
        super(marca, modelo, combustible);
    }

    @Override
    String Encender() {
        return "Encendido";
    }

    @Override
    String Apagar() {
        return "Apagado";
    }

    @Override
    String mostrarInfo() {
        return "";
    }
}
