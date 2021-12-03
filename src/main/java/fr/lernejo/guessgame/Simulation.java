package fr.lernejo.guessgame;

import fr.lernejo.logger.Logger;
import fr.lernejo.logger.LoggerFactory;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.DateTimeException;
import java.time.Duration;
import java.time.format.DateTimeFormatter;

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
    public void loopUntilPlayerSucceed(long max) {
        logger.log("Debut de la partie");
        boolean test=nextRound();
        int i=0;
        long Start=System.currentTimeMillis();
        long End =0;
        while(!test && i<max )
        {
            test=nextRound();
            i++;
        }
        End=System.currentTimeMillis();
        long TimeTotal = End-Start;
        Timestamp timestamp=new Timestamp(TimeTotal);
        logger.log("Temps : "+new SimpleDateFormat("mm:ss.SSS").format(timestamp));


    }
}
