package com.cjimenezro.ITVAvila.data;
import com.cjimenezro.ITVAvila.domain.models.Propietario;
import com.cjimenezro.ITVAvila.domain.models.Vehiculo;

import java.util.Map;
import java.util.TreeMap;

public class PropietariosDataStore {
    private static PropietariosDataStore instance = null;

    private Map<String, Propietario> dataStore = new TreeMap<>();

    public void guardar(Propietario propietario) {
        dataStore.put(propietario.getDni(), propietario);
    }

    public void eliminar(String propietario) {
        dataStore.remove(propietario);
    }

    public Propietario buscar(String propietario) {
        return dataStore.get(propietario);
    }

    public void modificar(Propietario propietario) {
        dataStore.put(propietario.getDni(), propietario);
    }

    public static PropietariosDataStore getInstance() {
        if (instance == null) {
            instance = new PropietariosDataStore();
        }
        return instance;
    }
}
