package com.cjimenezro.ITVAvila.domain.UseCase;

import com.cjimenezro.ITVAvila.data.PropietariosDataStore;
import com.cjimenezro.ITVAvila.domain.models.Propietario;


public class ModificarPropietarioUseCase {
    private PropietariosDataStore dataStore = PropietariosDataStore.getInstance();

    public void execute(Propietario propietario) {
        dataStore.modificar(propietario);
    }
}
