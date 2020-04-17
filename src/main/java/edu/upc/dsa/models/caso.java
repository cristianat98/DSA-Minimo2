package edu.upc.dsa.models;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class caso {

    private String nombre;
    private String apellido1;
    private String apellido2;
    private String identificador;
    private Date fecha;
    private Date fechainforme;
    private String nivel;
    private String genero;
    private String correo;
    private int telefono;
    private String direccion;
    private String clasificacion;

    public caso(){

    }

    public caso (String nombre){


    }

    public caso(String nombre, String apellido1, String apellido2, String identificador, Date fecha, Date fechainforme, String nivel, String genero, String correo, int telefono, String direccion) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.identificador = identificador;
        this.fecha = fecha;
        this.fechainforme = fechainforme;
        this.nivel = nivel;
        this.genero = genero;
        this.correo = correo;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Date getFechainforme() {
        return fechainforme;
    }

    public void setFechainforme(Date fechainforme) {
        this.fechainforme = fechainforme;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
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

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }
}
