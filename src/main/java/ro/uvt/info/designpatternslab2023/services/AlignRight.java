package ro.uvt.info.designpatternslab2023.services;

public class AlignRight implements AlignStrategy{
    @Override
    public void render(String text) {
        System.out.println("Paragraph: " + "#" + text);
    }
}
