package com.example.splab.models;

import java.util.concurrent.TimeUnit;

import com.example.splab.models.Element;
import lombok.Data;
@Data
public class Image implements Element {
    private String imagename;

    public Image(String imagename){
        this.imagename = imagename;
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void print(){
        System.out.println("Image with name: " + imagename);
    }
    @Override
    public void add(Element e) {
        throw new UnsupportedOperationException();
    }
    @Override
    public void removeElement(Element e) {
        throw new UnsupportedOperationException();
    }
    @Override
    public Element get(int i) {
        throw new UnsupportedOperationException();
    }
}
