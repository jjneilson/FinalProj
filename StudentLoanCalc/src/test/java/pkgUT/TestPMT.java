package pkgUT;


import org.apache.poi.ss.formula.functions.*;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Collections;

import org.junit.jupiter.api.Test;

public class TestPMT {

	@Test
	public void TestPMT() {
		
		//	PMT is a standard function included in apache POI.
		//	For a given r (rate), n (number of payments), p (present value), f (future value), t (how compounding is applied)
		//	this function will determine payment
		
		//	This is an example with known values
		//	PMT returns with negative values (this is typical accounting).  
		
		double PMT;
		double r = 0.07 / 12;
		double n = 20 * 12;
		double p = 150000;
		double f = 0;
		boolean t = false;
		PMT = Math.abs(FinanceLib.pmt(r, n, p, f, t));		
		double PMTExpected = 1162.95;		
		assertEquals(PMTExpected, PMT, 0.01);
	}

}

 

