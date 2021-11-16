package adventuregame;

import java.util.Random;

/**
 *
 * @author Saad
 */
public class Dice {

    public int getRoll(int sides) {
        Random rand = new Random();
        return rand.nextInt(sides) + 1;
    }

}
