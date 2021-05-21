
import java.util.ArrayList;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Victor Jafet Cruz
 */
public class Usuarios {
    private String user, pass, nombre_completo,genero,correo;
    private int numero_tel;
    private Date fecha_n;
    ArrayList<Libros> libros= new ArrayList();
    ArrayList<String>a=new ArrayList();

    public Usuarios(String user, String pass, String nombre_completo, String genero, String correo, int numero_tel, Date fecha_n) {
        this.user = user;
        this.pass = pass;
        this.nombre_completo = nombre_completo;
        this.genero = genero;
        this.correo = correo;
        this.numero_tel = numero_tel;
        this.fecha_n = fecha_n;
    }

    public Usuarios() {
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getNombre_completo() {
        return nombre_completo;
    }

    public void setNombre_completo(String nombre_completo) {
        this.nombre_completo = nombre_completo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getNumero_tel() {
        return numero_tel;
    }

    public void setNumero_tel(int numero_tel) {
        this.numero_tel = numero_tel;
    }

    public Date getFecha_n() {
        return fecha_n;
    }

    public void setFecha_n(Date fecha_n) {
        this.fecha_n = fecha_n;
    }

    public ArrayList<Libros> getLibros() {
        return libros;
    }

    public void setLibros(ArrayList<Libros> libros) {
        this.libros = libros;
    }

    public ArrayList<String> getA() {
        return a;
    }

    public void setA(ArrayList<String> a) {
        this.a = a;
    }

    @Override
    public String toString() {
        return "Usuario\n" 
                + "\nuser: " + user 
                + "\npassword: " + pass 
                + "\nnombre completo: " + nombre_completo 
                + "\ngenero: " + genero 
                + "\ncorreo: " + correo 
                + "\nnumero de telefono: " + numero_tel 
                + "\nFecha de Nacimiento: " + fecha_n 
                + "\nLista de Libros: " + libros 
                + "\nLista de Amigos: " + a;
    }
    
    
    
           
    
}
