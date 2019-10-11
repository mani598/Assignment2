package nz.ac.eit.Assignment2;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class DiceTest {

    private Dice dice;

    @Before
    public void setup(){
        dice = new Dice();
    }

    @Test
    public void diceRoll_LessThan1() {
        int diceRollValue = dice.diceRoll();
        boolean result = diceRollValue < 2;
        assertEquals("Both die should roll between 2 and 12, die rolled less than 2 result false", false,result);
    }

    @Test
    public void diceRoll_moreThan12() {
        int diceRollValue = dice.diceRoll();
        boolean result = diceRollValue > 12;
        assertEquals("Both die should roll between 2 and 12, die rolled more than 12 result false", false, result);
    }
}
