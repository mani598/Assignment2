package nz.ac.eit.Assignment2;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class DealerTest {

    private Dealer dealer;

    @Before
    public void setup(){
        dealer = new Dealer();
        dealer.dealerThrow();
    }

    @Test
    public void setDealer_DealerThrow_DealerLow(){

    }
}
