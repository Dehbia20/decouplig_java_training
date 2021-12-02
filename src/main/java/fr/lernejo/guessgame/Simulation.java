package fr.lernejo.guessgame;

import fr.lernejo.logger.Logger;
import fr.lernejo.logger.LoggerFactory;

public class Simulation {
    private final Logger logger = LoggerFactory.getLogger("simulation");
    private final Player player;  //TODO add variable type
    private long numberToGuess; //TODO add variable type

    public Simulation (Player player) {
        //TODO implement me
        this.player=player;
    }

    public void initialize(long numberToGuess) {
        //TODO implement me
        this.numberToGuess=numberToGuess;
    }

    /**
     * @return true if the player have guessed the right number
     */
    private boolean nextRound() {
        //TODO implement me
        long usernumber = player.askNextGuess();
        if (usernumber == numberToGuess) {
            return true;
        } else {
            if(usernumber < numberToGuess){
                this.logger.log ("le nombre est inferieur ");
            }else{
                this.logger.log ("le nombre est superieur ");
            }
            return false;
        }
    }
    public void loopUntilPlayerSucceed() {
        //TODO implement me$
        while (nextRound() == false){
            nextRound();
    }
    }
}
