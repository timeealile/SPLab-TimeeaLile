package ro.uvt.info.designpatternslab2023.classes;

public interface Visitor<T> {
    T visitBook(Book book);
    T visitSection(Section section);
    T visitTableOfContents(TableOfContents toc);
    T visitParagraph(Paragraph paragraph);
    T visitImageProxy(ImageProxy imageProxy);
    T visitImage(Image image);
    T visitTable(Table table);
    T visitAuthor(Author author);
}