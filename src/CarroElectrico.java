public class CarroElectrico extends Carro implements VehiculoElectrico{
    public CarroElectrico() {
    }

    public CarroElectrico(String marca, int modelo, int combustible) {
        super(marca, modelo, combustible);
    }

    @Override
    public void CargarBateria() {

    }

    @Override
    public void NivelBateria() {

    }
}
