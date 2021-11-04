package controller;

import java.util.ArrayList;

public class BaseController<T>{

    public ArrayList<T> listaPratos;

    public BaseController(){
        listaPratos = new ArrayList<T>();
    }

    //CRUD
    public void create(T obj){
        this.listaPratos.add(obj);
    }

    public ArrayList<T> read(){
        return listaPratos;

    }

    public void update(T obj){
        if(existe(obj)){
            delete(obj);
            create(obj);
        }
    }

    public void delete(T obj){
        this.listaPratos.remove(obj);

    }

    public boolean existe(T obj){
        return this.listaPratos.contains(obj);         
    }
    
}

