/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Victor Jafet Cruz
 */
public class Libros {
     
    private int puntaje,copia_d;
    private double valor;
    private String edicion,autor,genero,titulo,descripcion;
    private int a_publicacion;

    public Libros(int puntaje, int copia_d, double valor, String edicion, String autor, String genero, String titulo, String descripcion, int a_publicacion) {
        this.puntaje = puntaje;
        this.copia_d = copia_d;
        this.valor = valor;
        this.edicion = edicion;
        this.autor = autor;
        this.genero = genero;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.a_publicacion = a_publicacion;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    public int getCopia_d() {
        return copia_d;
    }

    public void setCopia_d(int copia_d) {
        this.copia_d = copia_d;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getEdicion() {
        return edicion;
    }

    public void setEdicion(String edicion) {
        this.edicion = edicion;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getA_publicacion() {
        return a_publicacion;
    }

    public void setA_publicacion(int a_publicacion) {
        this.a_publicacion = a_publicacion;
    }

    @Override
    public String toString() {
        return "Libros" 
                + "\npuntaje: " + puntaje 
                + "\ncopia_d: " + copia_d 
                + "\nvalor: " + valor 
                + "\nedicion: " + edicion 
                + "\nautor: " + autor 
                + "\ngenero: " + genero 
                + "\ntitulo: " + titulo 
                + "\ndescripcion: " + descripcion 
                + "\na_publicacion: " + a_publicacion;
    }
    
    
}
