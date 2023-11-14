package com.example.splab.models;

public interface Visitor {
    void visitParagraph (Paragraph paragraph);
    void visitSection (Section section);
    void visitImage (Image image);
    void visitTable (Table table);
    void visitBook (Book book);
    void visitTableOfContent (TableOfContent tableOfContent);
    void visitImageProxy (ImageProxy imageProxy);
}
