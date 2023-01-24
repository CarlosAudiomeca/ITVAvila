package com.cjimenezro.ITVAvila.domain.UseCase;

import com.cjimenezro.ITVAvila.data.VehiculoDataStore;
import com.cjimenezro.ITVAvila.domain.models.Vehiculo;


public class BuscarVehiculoUseCase {
    private VehiculoDataStore dataStore = VehiculoDataStore.getInstance();

    public Vehiculo execute(String matriclua) {
        return dataStore.buscar(matriclua);
    }
}
