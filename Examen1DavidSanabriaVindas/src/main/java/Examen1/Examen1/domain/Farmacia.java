package Examen1.Examen1.domain;

import jakarta.persistence.*;
import java.io.Serializable; 
import lombok.Data; 

@Data 
@Entity 
@Table(name = "medicamentos") 
public class Farmacia implements Serializable{

    private static final long serialVersionUID = 1L;
    
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    @Column(name = "id") 
    
    //Atributos
    private Long id;
    private String nombre;
    private String descripcion;
    private double precio;
    private int stock;
    @Column(name = "id_categoria")  
    private Integer idCategoria;
    
    //Constructor vacio
    public Farmacia() { 
    }
    
    //Constructor con variables
    public Farmacia(Long id, String nombre, String descripcion, double precio, int stock, Integer idCategoria) {
    this.id = id;
    this.nombre = nombre;
    this.descripcion = descripcion;
    this.precio = precio;
    this.stock = stock;
    this.idCategoria = idCategoria;
}
    
    //Set y get
    public Long getId() {
    return id;
}

    public void setId(Long id) {
        this.id = id;
}

    public String getNombre() {
        return nombre;
}

    public void setNombre(String nombre) {
        this.nombre = nombre;
}

    public String getDescripcion() {
        return descripcion;
}

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
}

    public double getPrecio() {
    return precio;
}

    public void setPrecio(double precio) {
        this.precio = precio;
}

    public int getStock() {
        return stock;
}

    public void setStock(int stock) {
        this.stock = stock;
}

    public Integer getIdCategoria() {
        return idCategoria;
}

    public void setIdCategoria(Integer idCategoria) {
        this.idCategoria = idCategoria;
}

}
