package com.cjimenezro.ITVAvila.domain.UseCase;

import com.cjimenezro.ITVAvila.data.InspecionDataStore;
import com.cjimenezro.ITVAvila.domain.models.Inspeccion;


public class ModificarInspeccionUseCase {
    private InspecionDataStore dataStore = InspecionDataStore.getInstance();

    public void execute(Inspeccion inspeccion) {
        dataStore.modificar(inspeccion);
    }
}
