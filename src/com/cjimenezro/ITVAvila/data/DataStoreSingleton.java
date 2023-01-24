package com.cjimenezro.ITVAvila.data;

public class DataStoreSingleton {

    private static DataStoreSingleton instance=null;

    private DataStoreSingleton(){

    }

    public static DataStoreSingleton getInstance(){
        if (instance==null){
            instance=new DataStoreSingleton();
        }
        return instance;
    }

}
