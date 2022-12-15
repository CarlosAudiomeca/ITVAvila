package com.cjimenezro.ITVAvila.presentation;

import com.cjimenezro.ITVAvila.domain.UseCase.GuardarPropietarioUseCase;
import com.cjimenezro.ITVAvila.domain.models.Coche;
import com.cjimenezro.ITVAvila.domain.models.Inspeccion;
import com.cjimenezro.ITVAvila.domain.models.Propietario;
import com.cjimenezro.ITVAvila.domain.models.Vehiculo;

public class Main {

    public static void main() {
        Propietario propietario = new Propietario();
        propietario.getDni();
        propietario.getNombre();
        propietario.getApellidos();
        propietario.getDireccion();
        propietario.getPoblacion();
        propietario.getProvincia();
        propietario.getTelefono();

        GuardarPropietarioUseCase guardarPropietarioUseCase = new GuardarPropietarioUseCase();
                guardarPropietarioUseCase.execute(propietario);
        Inspeccion inspeccion=new Inspeccion();




        PrintInspeccion.print(inspeccion);






    }
}
