package com.cjimenezro.ITVAvila.domain.UseCase;

import com.cjimenezro.ITVAvila.data.InspecionDataStore;
import com.cjimenezro.ITVAvila.data.PropietariosDataStore;
import com.cjimenezro.ITVAvila.domain.models.Inspeccion;
import com.cjimenezro.ITVAvila.domain.models.Propietario;


public class BuscarInspeccionUseCase {
    private InspecionDataStore dataStore = InspecionDataStore.getInstance();

    public Inspeccion execute(String inspeccion) {
        return dataStore.buscar(inspeccion);
    }
}
