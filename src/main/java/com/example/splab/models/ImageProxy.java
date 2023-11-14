package com.example.splab.models;

import com.example.splab.models.Element;
import com.example.splab.models.Image;

import java.util.Objects;

public class ImageProxy implements Element {

    private String imagename;
    private Image realImage= null;

    public ImageProxy(String imagename) {
        this.imagename = imagename;
    }

    private void loadRealImage() {
        if (Objects.isNull(realImage)) {
            realImage = new Image(this.imagename);
        }
    }

    @Override
    public void print() {
        loadRealImage();
        realImage.print();
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

