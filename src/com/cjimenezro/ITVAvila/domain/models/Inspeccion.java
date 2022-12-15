package com.cjimenezro.ITVAvila.domain.models;

public class Inspeccion {

    public String fecha,codigo;

    public Vehiculo matriculaVehiculo;

    public Propietario dniPropietario;
    public boolean resultado;

    //Fueciones


    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Boolean getResultado() {
        return resultado;
    }

    public void setResultado(Boolean resultado) {
        this.resultado = resultado;
    }

    public Vehiculo getMatriculaVehiculo() {
        return matriculaVehiculo;
    }

    public void setMatriculaVehiculo(Vehiculo matriculaVehiculo) {
        this.matriculaVehiculo = matriculaVehiculo;
    }

    public Propietario getDniPropietario() {
        return dniPropietario;
    }

    public void setDniPropietario(Propietario dniPropietario) {
        this.dniPropietario = dniPropietario;
    }
}
