import static org.junit.Assert.*;
import org.junit.*;
import org.junit.Test;

import junit.framework.TestCase;

public class TestCae_QP extends TestCase {
	letterGrade gr ;
	
	@Before
	 public void setUp() throws Exception {
		gr = new letterGrade();
	 }
	
	 @After
	 public void tearDown() throws Exception {
		 gr = null;
	 }
	
	@Test
	public void test_tc01 () {
		String result = gr.Grade(95) ;
		assertEquals("A",result );
	}
	
	@Test
	public void test_tc02() {
		String result = gr.Grade(85) ;
		assertEquals("B",result );
	}
	@Test
	public void test_tc03() {
		String result = gr.Grade(75) ;
		assertEquals("C",result );
	}
	
	@Test
	public void test_tc04() {
		String result = gr.Grade(65) ;
		assertEquals("D",result );
	}
	
	@Test
	public void test_tc05() {
		String result = gr.Grade(55) ;
		assertEquals("F",result );
	}
	
	@Test
	public void test_tc06() {
		String result = gr.Grade(1000) ;
		assertEquals("X",result );
	}
	
	@Test
	public void test_tc07() {
		String result = gr.Grade(90) ;
		assertEquals("A",result );
	}
	
	@Test
	public void test_tc08() {
		String result = gr.Grade(91) ;
		assertEquals("A",result );
	}
	
	@Test
	public void test_tc09() {
		String result = gr.Grade(89) ;
		assertEquals("B",result );
	}
	
	@Test
	public void test_tc10() {
		String result = gr.Grade(88) ;
		assertEquals("B",result );
	}

	@Test
	public void test_tc11() {
		String result = gr.Grade(80) ;
		assertEquals("B",result );
	}
	
	@Test
	public void test_tc12() {
		String result = gr.Grade(81) ;
		assertEquals("B",result );
	}
	
	@Test
	public void test_tc13() {
		String result = gr.Grade(79) ;
		assertEquals("C",result );
	}
	
	@Test
	public void test_tc14() {
		String result = gr.Grade(78) ;
		assertEquals("C",result );
	}
	
	@Test
	public void test_tc15() {
		String result = gr.Grade(70) ;
		assertEquals("C",result );
	}
	@Test
	public void test_tc16() {
		String result = gr.Grade(71) ;
		assertEquals("C",result );
	}
	
	@Test
	public void test_tc17() {
		String result = gr.Grade(69) ;
		assertEquals("D",result );
	}
	
	@Test
	public void test_tc18() {
		String result = gr.Grade(68) ;
		assertEquals("D",result );
	}
	
	@Test
	public void test_tc19() {
		String result = gr.Grade(60) ;
		assertEquals("D",result );
	}
	@Test
	public void test_tc20() {
		String result = gr.Grade(61) ;
		assertEquals("D",result );
	}
	
	@Test
	public void test_tc21() {
		String result = gr.Grade(59) ;
		assertEquals("F",result );
	}
	
	@Test
	public void test_tc22() {
		String result = gr.Grade(58) ;
		assertEquals("F",result );
	}
	
	@Test
	public void test_tc23() {
		String result = gr.Grade(101) ;
		assertEquals("X",result );
	}
	
	@Test
	public void test_tc24() {
		String result = gr.Grade(-1) ;
		assertEquals("X",result );
	}

}
