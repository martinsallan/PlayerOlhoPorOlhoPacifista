package br.edu.ifnmg.playerolhoporolhopacifico;

import io.github.guisso.meleeinterface.Decision;
import io.github.guisso.meleeinterface.IPlayer;

/**
 *
 * @author marti
 */
public class PlayerOlhoPorOlhoPacifico implements IPlayer{

    private Decision penultimaJogadaOponente = Decision.COOPERATE;
    
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

    @Override
    public String getDeveloperName() {
        return "Allan Martins";
    }

    @Override
    public String getEngineName() {
        return "Nate Diaz(Olho por Olho Pacifico)";
    }

    @Override
    public Decision makeMyMove(Decision opponentPreviousMove) {
        Decision minhaDecisao;
        
        if(opponentPreviousMove == Decision.NONE){
            minhaDecisao = Decision.COOPERATE;
        }
            
        else if(opponentPreviousMove == Decision.DEFECT &&
                penultimaJogadaOponente == Decision.DEFECT){
            minhaDecisao = Decision.DEFECT;
        }
        
        else{
            minhaDecisao = Decision.COOPERATE;
        }
        
        penultimaJogadaOponente = opponentPreviousMove;
        return minhaDecisao;
    }
}