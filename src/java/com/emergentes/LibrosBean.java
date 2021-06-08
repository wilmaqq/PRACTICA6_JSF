package com.emergentes;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
/**
 *
 * @author YURIKIRA105
 */
@ManagedBean
@RequestScoped
public class LibrosBean {
    private String titulo;
    private String autor;
    private String resumen;
    private String medio;
    public LibrosBean() {
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public String getResumen() {
        return resumen;
    }
    public void setResumen(String resuemen) {
        this.resumen = resuemen;
    }
    public String getMedio() {
        return medio;
    }
    public void setMedio(String medio) {
        this.medio = medio;
    }
}
