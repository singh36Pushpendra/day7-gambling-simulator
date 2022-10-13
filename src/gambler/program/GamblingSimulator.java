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
        int gamePoint, lost, count;

        int todayStake = 100;
        for (int i = 1; i <= 20; i++) {
            count = 0;
            lost = 0;
            
            while (stakePerDay != todayStake / 100 * 50 && stakePerDay != todayStake + todayStake / 100 * 50) {
                gamePoint = random.nextInt(2);
                count++;
                switch (gamePoint) {
                    case WIN:
                        stakePerDay++;
                        break;
                    case LOOSE:
                        lost++;
                        stakePerDay--;
                }
            }
            System.out.println("Day " + i + ": Total no of game lost: " + lost);
            System.out.println("Day " + i + ": Total no of game won: " + (count - lost));
            System.out.println("Day " + i + ": Gambler stake: " + stakePerDay);
            
            stakePerDay = 100;
        }
    }

}
