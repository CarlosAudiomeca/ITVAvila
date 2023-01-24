package com.cjimenezro.ITVAvila.domain.models;

public class Coche implements Vehiculo{

    private String matricula,marca, modelo, color, añoMatriculacion,puertas;

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

    public String getPuertas() {
        return puertas;
    }

    public void setPuertas(String puertas) {
        this.puertas = puertas;
    }
}
