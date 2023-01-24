package com.cjimenezro.ITVAvila.presentation;

import com.cjimenezro.ITVAvila.domain.models.Inspeccion;

public class PrintInspeccion {

    public static void print(Inspeccion inspeccion){
        System.out.println(inspeccion.getCodigo());
        System.out.println(inspeccion.getFecha());
        System.out.println(inspeccion.getMatriculaVehiculo().getMatricula());
        System.out.println(inspeccion.getMatriculaVehiculo().getMarca());
        System.out.println(inspeccion.getMatriculaVehiculo().getModelo());
        System.out.println(inspeccion.getDniPropietario().getDni());
        System.out.println(inspeccion.getDniPropietario().getNombre());
        System.out.println(inspeccion.getResultado());
    }

}
