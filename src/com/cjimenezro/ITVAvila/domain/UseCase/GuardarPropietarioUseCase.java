package com.cjimenezro.ITVAvila.domain.UseCase;

import com.cjimenezro.ITVAvila.data.PropietariosDataStore;
import com.cjimenezro.ITVAvila.data.VehiculoDataStore;
import com.cjimenezro.ITVAvila.domain.models.Propietario;
import com.cjimenezro.ITVAvila.domain.models.Vehiculo;

public class GuardarPropietarioUseCase {
    private PropietariosDataStore dataStore = PropietariosDataStore.getInstance();

    public void execute(Propietario propietario) {
        dataStore.guardar(propietario);
    }
}
