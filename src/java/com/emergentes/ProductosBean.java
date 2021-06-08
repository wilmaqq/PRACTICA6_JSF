package com.emergentes;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
/**
 *
 * @author YURIKIRA105
 */
@ManagedBean
@RequestScoped
public class ProductosBean {
    private String producto;
    private String categoria;
    private String existencia;
    private String  precio;
    public ProductosBean() {
    }
    public String getProducto() {
        return producto;
    }
    public void setProducto(String producto) {
        this.producto = producto;
    }
    public String getCategoria() {
        return categoria;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    public String getExistencia() {
        return existencia;
    }
    public void setExistencia(String existencia) {
        this.existencia = existencia;
    }
    public String getPrecio() {
        return precio;
    }
    public void setPrecio(String precio) {
        this.precio = precio;
    }
}
