package Model;

public class CocheDTO {
    //Atributos
    private String marca;
    private String modelo;
    private String matricula;
    private float precio;
    private int anho;
    private int kilometros;

    //Constructor
    public CocheDTO(String marca, String matricula, String modelo, float precio, int anho, int kilometros) {
        this.marca = marca;
        this.matricula = matricula;
        this.modelo = modelo;
        this.precio = precio;
        this.anho = anho;
        this.kilometros = kilometros;
    }

    //Getter
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public float getPrecio() {
        return precio;
    }

    public int getAnho() {
        return anho;
    }

    public int getKilometros() {
        return kilometros;
    }

    //Setter
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public void setAnho(int anho) {
        this.anho = anho;
    }

    public void setKilometros(int kilometros) {
        this.kilometros = kilometros;
    }
}
