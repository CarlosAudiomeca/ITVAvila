package com.cjimenezro.ITVAvila.domain.UseCase;

import com.cjimenezro.ITVAvila.data.PropietariosDataStore;

public class EliminarPropietarioUseCase {
    private PropietariosDataStore dataStore = PropietariosDataStore.getInstance();

    public void execute(String dni) {
        dataStore.eliminar(dni);
    }
}
