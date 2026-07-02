package logica;
import dominio.*;

public interface CartaVisitor {
    void visit(Pokemon pokemon);
    void visit(Item item);
    void visit(Supporter supporter);
    void visit(Energy energy);
}
