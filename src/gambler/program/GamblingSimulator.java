package gambler.program;

import java.util.Random;

public class GamblingSimulator {

    public static void main(String[] args) {
        System.out.println("Welcome to Gambling Simulator Program!");
        final int $PER_GAME = 1, WIN = 1, LOOSE = 0;
        int stakePerDay = 100;
        
        System.out.println("Gambler everyday stake: $" + stakePerDay + "\n"
                + "Gambler bet every game: $" + $PER_GAME);
        
        Random random = new Random();
        int gamePoint = random.nextInt(2);
        
        switch(gamePoint) {
            case WIN:
                stakePerDay++;
                System.out.println("Gambler WON!");
                break;
            case LOOSE:
                stakePerDay--;
                System.out.println("Gambler LOOSE!");
        }
        
        System.out.println("Gambler stake after first play: " + stakePerDay);
    }
    
}
