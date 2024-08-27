package Models;

import java.util.UUID;

public class Libro {
    private String id;
    private String titulo;
    private Integer precio;
    private Integer cantidad;
    private String autor;

    public Libro(String titulo, String autor, Integer precio, Integer cantidad) {
        this.id = UUID.randomUUID().toString();
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public void venta(int unidades){
        if(unidades>cantidad){
            System.out.println("Error, stock insuficiente (" + this.cantidad + ")");
        }else {
            this.cantidad -= unidades;
            System.out.println("Venta exitosa");
        }
    }

    public void ingreso(int unidades){
        this.cantidad += unidades;
    }

    public void imprimir(){
        System.out.println("Empleado " +
                "[id=" + this.id + " " +
                "Titulo=" + this.titulo + " " +
                "Precio=" + this.precio + " " +
                "Cantidad=" + this.cantidad + "]");
    }
}
