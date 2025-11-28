package Model;

public class ClienteDTO {

    //Atributos
    private String dni;
    private String nombre;
    private int tlfn;

    //Constructor
    public ClienteDTO(String dni, String nombre, int tlfn) {
        this.dni = dni;
        this.nombre = nombre;
        this.tlfn = tlfn;
    }

    //Getter and Setter
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTlfn() {
        return tlfn;
    }

    public void setTlfn(int tlfn) {
        this.tlfn = tlfn;
    }
}
