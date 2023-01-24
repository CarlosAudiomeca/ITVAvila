package com.cjimenezro.ITVAvila.data;
import com.cjimenezro.ITVAvila.domain.models.Vehiculo;

import java.util.Map;
import java.util.TreeMap;

public class VehiculoDataStore {
    private static VehiculoDataStore instance = null;

    private Map<String, Vehiculo> dataStore = new TreeMap<>();

    public void guardar(Vehiculo vehiculo) {
        dataStore.put(vehiculo.getMatricula(), vehiculo);
    }

    public void eliminar(String vehiculo) {
        dataStore.remove(vehiculo);
    }

    public Vehiculo buscar(String vehiculo) {
        return dataStore.get(vehiculo);
    }

    public void modificar(Vehiculo vehiculo) {
        dataStore.put(vehiculo.getMatricula(), vehiculo);
    }

    public static VehiculoDataStore getInstance() {
        if (instance == null) {
            instance = new VehiculoDataStore();
        }
        return instance;
    }
}
