package com.example.splab.models;

import com.example.splab.models.Element;

import java.util.ArrayList;
import java.util.List;

public class Section implements Element, Visitee {
    private String title;
    private List<Element> children = new ArrayList<>();

    public Section(String title) {
        this.title = title;
    }

    @Override
    public void print(){
        System.out.println(title);
        for(Element e:children)
            e.print();
    }

    @Override
    public void add(Element e){
        children.add(e);
    }

    @Override
    public void removeElement(Element e){
        children.remove(e);
    }

    @Override
    public Element get(int i){
        return children.get(i);
    }



    @Override
    public void accept(Visitor v) {
        v.visitSection(this);
    }
}

