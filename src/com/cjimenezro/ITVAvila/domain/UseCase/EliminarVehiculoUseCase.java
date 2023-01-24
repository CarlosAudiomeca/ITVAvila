package com.cjimenezro.ITVAvila.domain.UseCase;

import com.cjimenezro.ITVAvila.data.VehiculoDataStore;

public class EliminarVehiculoUseCase {
    private VehiculoDataStore dataStore = VehiculoDataStore.getInstance();

    public void execute(String matricula) {
        dataStore.eliminar(matricula);
    }
}
