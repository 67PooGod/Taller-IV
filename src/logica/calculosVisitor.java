package logica;

import dominio.*;

public class calculosVisitor implements CartaVisitor {
    
    private String textoDetalles;

    @Override
    public void visit(Pokemon pokemon) {
        textoDetalles = "Daño: " + pokemon.getDamage() + " | Energías: " + pokemon.getCantEnergias();
    }

    @Override
    public void visit(Item item) {
        textoDetalles = "Bonificación: +" + item.getBonificacion();
    }

    @Override
    public void visit(Supporter supporter) {
        textoDetalles = "Efectos por turno: " + supporter.getEfectosPorTurno();
    }

    @Override
    public void visit(Energy energy) {
        textoDetalles = "Elemento: " + energy.getElemento();
    }

   
    public String getTextoDetalles() {
        return textoDetalles;
    }
}