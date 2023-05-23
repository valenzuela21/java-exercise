package org.davidvalenzuela.genericlcass;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Camion<T> implements Iterable<T> {

    private List<T> objects;
    private int max;

    public Camion(int max) {
        this.max = max;
        this.objects = new ArrayList<>();
    }


    public void add(T object){
        if(this.objects.size() <= max){
            this.objects.add(object);
        }else{
            throw  new RuntimeException("No hay más espacio");
        }

    }

    @Override
    public Iterator<T> iterator() {
        return objects.iterator();
    }
}
