package com.banco.sistema;

public class Usuario {
    private String nombre;
    private String apellido;
    private String correo;
    private String contrasena;

    // Constructor
    public Usuario(String nombre, String apellido, String correo, String contrasena) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.contrasena = contrasena;
    }

}
