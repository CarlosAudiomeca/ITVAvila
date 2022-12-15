package com.cjimenezro.ITVAvila.data;
import com.cjimenezro.ITVAvila.domain.models.Inspeccion;
import com.cjimenezro.ITVAvila.domain.models.Propietario;

import java.util.Map;
import java.util.TreeMap;

public class InspecionDataStore {
    private static InspecionDataStore instance = null;

    private Map<String, Inspeccion> dataStore = new TreeMap<>();

    public void guardar(Inspeccion inspeccion) {
        dataStore.put(inspeccion.getCodigo(), inspeccion);
    }

    public void eliminar(String inspeccion) {
        dataStore.remove(inspeccion);
    }

    public Inspeccion buscar(String inspeccion) {
        return dataStore.get(inspeccion);
    }

    public void modificar(Inspeccion inspeccion) {
        dataStore.put(inspeccion.getCodigo(), inspeccion);
    }

    public static InspecionDataStore getInstance() {
        if (instance == null) {
            instance = new InspecionDataStore();
        }
        return instance;
    }
}
