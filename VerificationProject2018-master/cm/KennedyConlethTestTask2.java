package cm;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.math.BigDecimal;
import java.util.ArrayList;

import org.junit.Test;

public class KennedyConlethTestTask2 {

	@Test
	public void overallSuccessTest() {
		Period a,b ;
		b = new Period(0,6) ;
		a = new Period(7,23) ;
		ArrayList<Period> n = new ArrayList<Period>() ,r = new ArrayList<Period>();
		n.add(a); 
		r.add(b);
		
		CarParkKind kind= CarParkKind.VISITOR ;
		BigDecimal normal = new BigDecimal(2),reduced = new BigDecimal(1);
		
		Rate testValue = new Rate(kind,normal,reduced,r,n);
		
		//assertEquals(testValue.calculate(a).add(testValue.calculate(b)) ,new BigDecimal(38));
	}
	@Test
	public void reducedRateDecmialTest() {
		Period a,b ;
		b = new Period(0,6) ;
		a = new Period(7,23) ;
		ArrayList<Period> n = new ArrayList<Period>() ,r = new ArrayList<Period>();
		n.add(a); 
		r.add(b);
		
		CarParkKind kind= CarParkKind.MANAGEMENT  ;
		BigDecimal normal = new BigDecimal(1) ,reduced = new BigDecimal(0.1);
		
		Rate testValue = new Rate(kind,normal,reduced,r,n);
		
		//assertEquals(testValue.calculate(a).add(testValue.calculate(b)).ROUND_DOWN ,new BigDecimal(16.6).ROUND_DOWN);
	}
	/*@Test
	public void normalRateDecmialTest() {
		Period a,b ;
		b = new Period(0,6) ;
		a = new Period(7,23) ;
		ArrayList<Period> n = new ArrayList<Period>() ,r = new ArrayList<Period>();
		n.add(a); 
		r.add(b);
		
		CarParkKind kind= CarParkKind.VISITOR ;
		BigDecimal normal = new BigDecimal(0.1) ,reduced = new BigDecimal(1);
		
		Rate testValue = new Rate(kind,normal,reduced,r,n);
		
		//assertEquals(testValue.calculate(a).add(testValue.calculate(b)) ,18.6);
	}*/
	@Test
	public void reducedRateNegativeDecmialTest() {
		Period a,b ;
		b = new Period(0,6) ;
		a = new Period(7,23) ;
		ArrayList<Period> n = new ArrayList<Period>() ,r = new ArrayList<Period>();
		n.add(a); 
		r.add(b);
		
		CarParkKind kind= CarParkKind.STAFF ;
		BigDecimal normal = new BigDecimal(1) ,reduced = new BigDecimal(-0.1);
		
		try {
		Rate testValue = new Rate(kind,normal,reduced,r,n);
		}
		catch(IllegalArgumentException e) {
			
		}
		
		////assertEquals(testValue.calculate(a).add(testValue.calculate(b)) , new IllegalArgumentException() );
	}
	@Test
	public void normalRateNegativeDecmialTest() {
		Period a,b ;
		b = new Period(0,6) ;
		a = new Period(7,23) ;
		ArrayList<Period> n = new ArrayList<Period>() ,r = new ArrayList<Period>();
		n.add(a); 
		r.add(b);
		
		CarParkKind kind= CarParkKind.STUDENT ;
		BigDecimal normal = new BigDecimal(-0.1) ,reduced = new BigDecimal(1);
		try {
		Rate testValue = new Rate(kind,normal,reduced,r,n);
		}
		catch(IllegalArgumentException e) {
			
		}
		////assertEquals(testValue.calculate(a).add(testValue.calculate(b)) ,new IllegalArgumentException());
	}
/*	@Test
	public void doubleZeroTest() {
		Period a,b ;
		b = new Period(0,6) ;
		a = new Period(7,23) ;
		ArrayList<Period> n = new ArrayList<Period>() ,r = new ArrayList<Period>();
		n.add(a); 
		r.add(b);
		
		CarParkKind kind= CarParkKind.STAFF ;
		BigDecimal normal = new BigDecimal(0) ,reduced = new BigDecimal(0);
		
		Rate testValue = new Rate(kind,normal,reduced,r,n);
		
		//assertEquals(testValue.calculate(a).add(testValue.calculate(b)) ,0);
	}*/
	@Test
	public void postiveNormalZeroReducedTest() {
		Period a,b ;
		b = new Period(0,6) ;
		a = new Period(7,23) ;
		ArrayList<Period> n = new ArrayList<Period>() ,r = new ArrayList<Period>();
		n.add(a); 
		r.add(b);
		
		CarParkKind kind= CarParkKind.VISITOR ;
		BigDecimal normal = new BigDecimal(1) ,reduced = new BigDecimal(0);
		
		Rate testValue = new Rate(kind,normal,reduced,r,n);
		
		//assertEquals(testValue.calculate(a).add(testValue.calculate(b)) ,new BigDecimal(16));
	}
	/*@Test
	public void zeroNormalPostiveReducedTest() {
		Period a,b ;
		b = new Period(0,6) ;
		a = new Period(7,23) ;
		ArrayList<Period> n = new ArrayList<Period>() ,r = new ArrayList<Period>();
		n.add(a); 
		r.add(b);
		
		CarParkKind kind= CarParkKind.STAFF ;
		BigDecimal normal = new BigDecimal(0) ,reduced = new BigDecimal(1);
		
		Rate testValue = new Rate(kind,normal,reduced,r,n);
		
		//assertEquals(testValue.calculate(a).add(testValue.calculate(b)) ,18);
	}*/
	@Test
	public void reducedRateNegativeTest() {
		Period a,b ;
		b = new Period(0,6) ;
		a = new Period(7,23) ;
		ArrayList<Period> n = new ArrayList<Period>() ,r = new ArrayList<Period>();
		n.add(a); 
		r.add(b);
		
		CarParkKind kind= CarParkKind.STUDENT ;
		BigDecimal normal = new BigDecimal(1) ,reduced = new BigDecimal(-1);
		
		try {
		Rate testValue = new Rate(kind,normal,reduced,r,n);
		}
		catch(IllegalArgumentException e) {
			
		}
		////assertEquals(testValue.calculate(a).add(testValue.calculate(b)) , new IllegalArgumentException() );
	}
	@Test
	public void normalRateNegativeTest() {
		Period a,b ;
		b = new Period(0,6) ;
		a = new Period(7,23) ;
		ArrayList<Period> n = new ArrayList<Period>() ,r = new ArrayList<Period>();
		n.add(a); 
		r.add(b);
		
		CarParkKind kind= CarParkKind.MANAGEMENT ;
		BigDecimal normal = new BigDecimal(-1) ,reduced = new BigDecimal(1);
		
		try {
		Rate testValue = new Rate(kind,normal,reduced,r,n);
		}
		catch(IllegalArgumentException e) {
			
		}
		////assertEquals(testValue.calculate(a).add(testValue.calculate(b)) ,new IllegalArgumentException());
	}
	@Test
	public void wholeNormalRateDecmialReducedTest() {
		Period a,b ;
		b = new Period(0,7) ;
		a = new Period(7,23) ;
		ArrayList<Period> n = new ArrayList<Period>() ,r = new ArrayList<Period>();
		n.add(a); 
		r.add(b);
		
		CarParkKind kind= CarParkKind.STAFF ;
		BigDecimal normal = new BigDecimal(1.5) ,reduced = new BigDecimal(1), ex = new BigDecimal(31.0);
		
		Rate testValue = new Rate(kind,normal,reduced,r,n);
		
		//assertEquals(testValue.calculate(a).add(testValue.calculate(b)) ,ex);
	}
	@Test
	public void decmialNormalRateWholeReducedTest() {
		Period a,b ;
		b = new Period(0,6) ;
		a = new Period(7,23) ;
		ArrayList<Period> n = new ArrayList<Period>() ,r = new ArrayList<Period>();
		n.add(a); 
		r.add(b);
		
		CarParkKind kind= CarParkKind.VISITOR ;
		BigDecimal normal = new BigDecimal(2.7) ,reduced = new BigDecimal(1);
		
		Rate testValue = new Rate(kind,normal,reduced,r,n);
		
		//assertEquals(testValue.calculate(a).add(testValue.calculate(b)).ROUND_DOWN , new BigDecimal(49.2).ROUND_DOWN);
	}
	@Test
	public void overlapReducedRateTest() {
		Period a,b ;
		b = new Period(0,6) ;
		a = new Period(3,5) ;
		ArrayList<Period> n = new ArrayList<Period>() ,r = new ArrayList<Period>();
		n.add(a); 
		r.add(b);
		
		CarParkKind kind= CarParkKind.STAFF ;
		BigDecimal normal = new BigDecimal(2),reduced = new BigDecimal(1);
		try {Rate testValue = new Rate(kind,normal,reduced,r,n);}
		catch(IllegalArgumentException e){
			
		}
		
		////assertEquals(testValue.calculate(a).add(testValue.calculate(b)) ,new IllegalArgumentException());
	}
	@Test
	public void overlapNormalRateTest() {
		Period a,b ;
		b = new Period(3,5) ;
		a = new Period(0,6) ;
		ArrayList<Period> n = new ArrayList<Period>() ,r = new ArrayList<Period>();
		n.add(a); 
		r.add(b);
		
		CarParkKind kind= CarParkKind.STUDENT ;
		BigDecimal normal = new BigDecimal(99),reduced = new BigDecimal(1);
		try {
		Rate testValue = new Rate(kind,normal,reduced,r,n);
		}
		catch(IllegalArgumentException e) {
		////assertEquals(testValue.calculate(a).add(testValue.calculate(b)) ,new IllegalArgumentException());
		}
	}
	@Test
	public void nullTypeTest() {
		Period a,b ;
		b = new Period(0,6) ;
		a = new Period(7,23) ;
		ArrayList<Period> n = new ArrayList<Period>() ,r = new ArrayList<Period>();
		n.add(a); 
		r.add(b);
		
		CarParkKind kind= null ;
		BigDecimal normal = new BigDecimal(2),reduced = new BigDecimal(1);
		
		Rate testValue = new Rate(kind,normal,reduced,r,n);
		
		//assertEquals(testValue.calculate(a).add(testValue.calculate(b)) ,new IllegalArgumentException());
	}
	@Test
	public void nullNormalPeriodsTest() {
		Period a,b ;
		b = new Period(0,6) ;
		a = new Period(7,23) ;
		ArrayList<Period> n = new ArrayList<Period>() ,r = new ArrayList<Period>();
		//n.add(null); 
		n= null ; 
		r.add(b);
		
		CarParkKind kind= null ;
		BigDecimal normal = new BigDecimal(2),reduced = new BigDecimal(1);
		
		try {
		Rate testValue = new Rate(kind,normal,reduced,r,n);
		}
		catch(IllegalArgumentException e) {
		////assertEquals(testValue.calculate(a).add(testValue.calculate(b)) ,new IllegalArgumentException());
		}
	}
	@Test
	public void nullReducedPeriodsTest() {
		Period a,b ;
		b = new Period(0,6) ;
		a = new Period(7,23) ;
		ArrayList<Period> n = new ArrayList<Period>() ,r = new ArrayList<Period>();
		n.add(a); 
		//r.add(null);
		r= null ;
		
		CarParkKind kind= null ;
		BigDecimal normal = new BigDecimal(2),reduced = new BigDecimal(1);
		//try {
		Rate testValue = new Rate(kind,normal,reduced,r,n);
		//}
		//catch(IllegalArgumentException e) {
		//assertEquals(testValue.calculate(a).add(testValue.calculate(b)) ,new IllegalArgumentException());
		//}
	}
	@Test
	public void nullReducedRateTest() {
		Period a,b ;
		b = new Period(0,6) ;
		a = new Period(7,23) ;
		ArrayList<Period> n = new ArrayList<Period>() ,r = new ArrayList<Period>();
		n.add(a); 
		r.add(null);
		
		CarParkKind kind= null ;
		BigDecimal normal = new BigDecimal(1),reduced = null;
		try {
		Rate testValue = new Rate(kind,normal,reduced,r,n);
		}
		catch(IllegalArgumentException e) {
			////assertEquals(testValue.calculate(a).add(testValue.calculate(b)) ,new IllegalArgumentException());
		}
	}
	@Test
	public void nullNormalRateTest() {
		Period a,b ;
		b = new Period(0,6) ;
		a = new Period(7,23) ;
		ArrayList<Period> n = new ArrayList<Period>() ,r = new ArrayList<Period>();
		n.add(a); 
		r.add(null);
		
		CarParkKind kind= null ;
		BigDecimal normal = null,reduced = new BigDecimal(1);
		
		try{
		Rate testValue = new Rate(kind,normal,reduced,r,n);
		}
		catch(IllegalArgumentException e){
			//pass();
			////assertEquals(testValue.calculate(a).add(testValue.calculate(b)) ,new IllegalArgumentException());
		}
	}
	@Test
	public void freePeriodTest() {
		Period a,b ;
		b = new Period(0,1) ;
		a = new Period(22,23) ;
		ArrayList<Period> n = new ArrayList<Period>() ,r = new ArrayList<Period>();
		n.add(a); 
		r.add(b);
		
		CarParkKind kind= CarParkKind.MANAGEMENT ;
		BigDecimal normal = new BigDecimal(5),reduced = new BigDecimal(3);
		
		Rate testValue = new Rate(kind,normal,reduced,r,n);
		
		//assertEquals(testValue.calculate(a).add(testValue.calculate(b)) ,new BigDecimal(8));
	}
	@Test
	public void extraPeriods() {
		Period a,b,c,d,e,f ;
		b = new Period(0,2) ;
		d= new Period(2,4) ;
		f= new Period(4,6);
		
		a = new Period(7,13) ;
		c = new Period(13,19) ;
		e = new Period(19,23) ;
		ArrayList<Period> n = new ArrayList<Period>() ,r = new ArrayList<Period>();
		n.add(a); 
		n.add(c); 
		n.add(e); 
		
		r.add(b);
		r.add(d);
		r.add(f);
		
		CarParkKind kind= CarParkKind.VISITOR ;
		BigDecimal normal = new BigDecimal(2),reduced = new BigDecimal(1);
		
		Rate testValue = new Rate(kind,normal,reduced,r,n);
		
		//assertEquals(testValue.calculate(a).add(testValue.calculate(b)) ,new BigDecimal(14));
	}
	@Test
	public void overlapMutiplePeriods() {
		Period a,b,c,d,e,f ;
		b = new Period(0,2) ;
		d= new Period(1,2) ;
		f= new Period(4,6);
		
		a = new Period(1,2) ;
		c = new Period(13,19) ;
		e = new Period(19,23) ;
		ArrayList<Period> n = new ArrayList<Period>() ,r = new ArrayList<Period>();
		n.add(a); 
		n.add(c); 
		n.add(e); 
		
		r.add(b);
		r.add(d);
		r.add(f);
		
		CarParkKind kind= CarParkKind.VISITOR ;
		BigDecimal normal = new BigDecimal(2),reduced = new BigDecimal(1);
		
		try {
		Rate testValue = new Rate(kind,normal,reduced,r,n);
		}
		catch(IllegalArgumentException ex) {
			
		}
		////assertEquals(testValue.calculate(a).add(testValue.calculate(b)) ,new BigDecimal(14));
	}
}
