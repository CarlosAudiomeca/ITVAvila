package com.cjimenezro.ITVAvila.presentation;

import com.cjimenezro.ITVAvila.domain.UseCase.BuscarPropietarioUseCase;
import com.cjimenezro.ITVAvila.domain.UseCase.BuscarVehiculoUseCase;
import com.cjimenezro.ITVAvila.domain.UseCase.GuardarPropietarioUseCase;
import com.cjimenezro.ITVAvila.domain.UseCase.GuardarVehiculoUseCase;
import com.cjimenezro.ITVAvila.domain.models.Coche;
import com.cjimenezro.ITVAvila.domain.models.Inspeccion;
import com.cjimenezro.ITVAvila.domain.models.Propietario;
import com.cjimenezro.ITVAvila.domain.models.Vehiculo;

public class Main {

    public static void main() {

        Propietario propietario = new Propietario();
        propietario.setDni("ff");
        propietario.setNombre("dadwa");
        propietario.setApellidos("gsdf");
        propietario.setDireccion("dfsdfe");
        propietario.setPoblacion("dwadsa");
        propietario.setProvincia("sd asdasd");
        propietario.setTelefono("hrtygfd");

        GuardarPropietarioUseCase guardarPropietarioUseCase = new GuardarPropietarioUseCase();
                guardarPropietarioUseCase.execute(propietario);

        Vehiculo coche = new Coche();
        coche.setMatricula("dasdaws");
        coche.setMarca("dwasd");
        coche.setModelo("wdadasd");
        coche.setColor("dwads");
        coche.setAñoMatriculacion("1999");

        GuardarVehiculoUseCase guardarVehiculoUseCase = new GuardarVehiculoUseCase();
            guardarVehiculoUseCase.execute(coche);

        BuscarPropietarioUseCase buscarPropietarioUseCase = new BuscarPropietarioUseCase();

        BuscarVehiculoUseCase buscarVehiculoUseCase = new BuscarVehiculoUseCase();

        Inspeccion inspeccion=new Inspeccion();
        inspeccion.setCodigo("5");
        inspeccion.setFecha("20");
        inspeccion.setDniPropietario(buscarPropietarioUseCase.execute("ff"));
        inspeccion.setMatriculaVehiculo(buscarVehiculoUseCase.execute("dasdaws"));
        inspeccion.setResultado(true);



        PrintInspeccion.print(inspeccion);






    }
}
