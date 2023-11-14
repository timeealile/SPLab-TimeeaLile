package com.example.splab.models;

import com.example.splab.services.AlignLeft;
import com.example.splab.services.AlignStrategy;

public class Paragraph implements Element, Visitee{
    private String name;
    private AlignStrategy align;
    public Paragraph(String name){
        this.name = name;
        align = new AlignLeft();
    }

    @Override
    public void print(){
        System.out.println("Paragraph: " + name);
        if(align == null)
            System.out.println("Paragraph: " + name);
        else
            align.render(name);
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

    public void setAlignStrategy(AlignStrategy align) {
        this.align = align;
    }

    @Override
    public void accept(Visitor v) {
        v.visitParagraph(this);
    }
}
