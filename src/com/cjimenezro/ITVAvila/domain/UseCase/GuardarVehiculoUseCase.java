package com.cjimenezro.ITVAvila.domain.UseCase;

import com.cjimenezro.ITVAvila.data.VehiculoDataStore;
import com.cjimenezro.ITVAvila.domain.models.Vehiculo;

public class GuardarVehiculoUseCase {
    private VehiculoDataStore dataStore = VehiculoDataStore.getInstance();

    public void execute(Vehiculo vehiculo) {
        dataStore.guardar(vehiculo);
    }
}