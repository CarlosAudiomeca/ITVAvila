package com.cjimenezro.ITVAvila.domain.UseCase;

import com.cjimenezro.ITVAvila.data.InspecionDataStore;

public class EliminarInspeccionUseCase {
    private InspecionDataStore dataStore = InspecionDataStore.getInstance();

    public void execute(String codigo) {
        dataStore.eliminar(codigo);
    }
}
