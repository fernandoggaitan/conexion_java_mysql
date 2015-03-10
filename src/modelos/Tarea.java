/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelos;

/**
 * 
 * @author Fernando
 */
public class Tarea {
    
    private final Integer id_tarea;
    private String titulo;
    private String descripcion;
    private Integer nivel_de_prioridad;
    
    public Tarea() {
        this.id_tarea = null;
        this.titulo = null;
        this.descripcion = null;
        this.nivel_de_prioridad = null;
    }

    public Tarea(Integer id_tarea, String titulo, String descripcion, Integer nivel_de_prioridad) {
        this.id_tarea = id_tarea;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.nivel_de_prioridad = nivel_de_prioridad;
    }

    public Integer getId_tarea() {
        return id_tarea;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Integer getNivel_de_prioridad() {
        return nivel_de_prioridad;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setNivel_de_prioridad(Integer nivel_de_prioridad) {
        this.nivel_de_prioridad = nivel_de_prioridad;
    }

    @Override
    public String toString() {
        return "Tarea{" + "id_tarea=" + id_tarea + ", titulo=" + titulo + ", descripcion=" + descripcion + ", nivel_de_prioridad=" + nivel_de_prioridad + '}';
    }
    
}