package Model;

import java.util.Date;

public class VentasDTO {
    //Atributos
    private int idVenta;
    private String Coche;
    private String Cliente;
    private Date fecha;
    private float precio;

    //Constructor
    public VentasDTO(int idVenta, String coche, String cliente, Date fecha, float precio) {
        this.idVenta = idVenta;
        Coche = coche;
        Cliente = cliente;
        this.fecha = fecha;
        this.precio = precio;
    }

    //Getter and Setter
    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public String getCoche() {
        return Coche;
    }

    public void setCoche(String coche) {
        Coche = coche;
    }

    public String getCliente() {
        return Cliente;
    }

    public void setCliente(String cliente) {
        Cliente = cliente;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
}

