package com.cjimenezro.ITVAvila.domain.models;

public class Camion implements Vehiculo{

    private String matricula,marca, modelo, color, añoMatriculacion, tara,longitud;

    //Fuenciones

    @Override
    public String getMatricula() {
        return matricula;
    }

    @Override
    public void setMatricula(String matricula) {
        this.matricula=matricula;
    }

    @Override
    public String getMarca() {
        return marca;
    }

    @Override
    public void setMarca(String marca) {
        this.marca=marca;
    }

    @Override
    public String getModelo() {
        return modelo;
    }

    @Override
    public void setModelo(String modelo) {
        this.modelo=modelo;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void setColor(String color) {
        this.color=color;
    }

    @Override
    public String getAñoMatriculacion() {
        return añoMatriculacion;
    }

    @Override
    public void setAñoMatriculacion(String añoMatriculacion) {
        this.añoMatriculacion=añoMatriculacion;
    }

    public String getTara() {
        return tara;
    }

    public void setTara(String tara) {
        this.tara = tara;
    }

    public String getLongitud() {
        return longitud;
    }

    public void setLongitud(String longitud) {
        this.longitud = longitud;
    }
}
