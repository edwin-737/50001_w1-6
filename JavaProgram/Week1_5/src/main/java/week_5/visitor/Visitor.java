package week_5.visitor;

public interface Visitor {
    void visit(Book b);
    void visit(Cookware cw);
    void visit(Clothing c);
    void visit(Supplement s);
}

