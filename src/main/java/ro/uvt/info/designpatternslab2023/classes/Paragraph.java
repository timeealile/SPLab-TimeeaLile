package ro.uvt.info.designpatternslab2023.classes;

import java.util.List;
import lombok.Getter;

public class Paragraph extends Element implements Visitee {
    @Getter
    private String text;
    public Paragraph(String text) {
        this.text = text;
    }
    public Paragraph(Paragraph other){this.text = other.text;}


    @Override
    public Element clone() {
        return new Paragraph(this);
    }


    @Override
    public void accept(Visitor visitor) {
        visitor.visitParagraph(this);
    }
}

