public abstract class Vehiculo {
    protected String Marca;
    protected int Modelo;
    protected int Combustible;

    abstract String Encender();
    abstract String Apagar();
    abstract String  mostrarInfo();

    public int AbastecerCombustible() {
        return 0;
    }
    public Vehiculo() {
    }

    public Vehiculo(String marca, int modelo, int combustible) {
        Marca = marca;
        Modelo = modelo;
        Combustible = combustible;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public int getModelo() {
        return Modelo;
    }

    public void setModelo(int modelo) {
        Modelo = modelo;
    }

    public int getCombustible() {
        return Combustible;
    }

    public void setCombustible(int combustible) {
        Combustible = combustible;
    }
}
