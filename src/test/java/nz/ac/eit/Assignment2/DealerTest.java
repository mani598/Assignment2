package nz.ac.eit.Assignment2;

import org.junit.Before;
import org.junit.Test;

import static nz.ac.eit.Assignment2.Dice.diceRoll;
import static org.junit.Assert.*;

public class DealerTest {

    private Dealer dealer;

    @Before
    public void setup(){
        dealer = new Dealer();
    }

    @Test
    public void setDealer_DealerThrow_DealerLow_lessThan17(){
        dealer.result(12);
        boolean result = dealer.dealerThrow();
        assertFalse(result);
    }

    @Test
    public void setDealer_DealerThrow_DealerLow_moreThan17() {
        dealer.result(19);
        boolean result = dealer.dealerThrow();
        assertFalse(result);
    }
}
