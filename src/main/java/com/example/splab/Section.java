package com.example.splab;

import java.awt.*;

public class SubChapter {
    private String name;
    private Image image;
    private Paragraph paragraph;
    private Table table;

    public SubChapter(String name, Image image, Paragraph paragraph, Table table) {
        this.name = name;
        this.image = image;
        this.paragraph = paragraph;
        this.table = table;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public Paragraph getParagraph() {
        return paragraph;
    }

    public void setParagraph(Paragraph paragraph) {
        this.paragraph = paragraph;
    }

    public Table getTable() {
        return table;
    }

    public void setTable(Table table) {
        this.table = table;
    }

    @Override
    public String toString() {
        return "SubChapter{" +
                "name='" + name + '\'' +
                ", image=" + image +
                ", paragraph=" + paragraph +
                ", table=" + table +
                '}';
    }
    public void print() {
        System.out.println("SubChapter: " + name);
        if(image!= null) {
            image.print();
        }
        if(paragraph != null){
            paragraph.print();
        }
        if(table != null){
            table.print();
        }
    }
    public void createNewParagraph(String paragraphText) {
        paragraph.add(paragraphText);
    }
    public void createNewImage(String imagePath) {
        image.add(imagePath);
    }
    public void createNewTable(String tableDescription) {
        table.add(tableDescription);
    }

    public void createNewTable(String tableDescription) {
    }
}
