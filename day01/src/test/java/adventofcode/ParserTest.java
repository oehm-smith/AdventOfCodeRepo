package adventofcode;

import org.junit.Assert;
import org.junit.Test;

public class ParserTest {

	Parser p = new Parser();

	@Test
	public void testLeft() {
		Assert.assertEquals(1, p.findFinalFloor("("));
	}
	
	@Test
    public void testLeftRight() {
        Assert.assertEquals(0, p.findFinalFloor("()"));
    }

	@Test
    public void testComplex01() {
        Assert.assertEquals(0, p.findFinalFloor("((((()))))"));
    }
	@Test
	public void testComplex02() {
	    Assert.assertEquals(0, p.findFinalFloor("()()()()()"));
	}
	@Test
	public void testComplex03() {
	    Assert.assertEquals(0, p.findFinalFloor("((((()()())()))(()))"));
	}
	@Test
	public void testComplex04() {
	    Assert.assertEquals(0, p.findFinalFloor("()())((((()))))("));
	}
	
	@Test
	public void testFloorFirstReached_0() {
	    Assert.assertEquals(0, p.findIndexWhenHitFloor("", 0));
	}
	
	@Test
	public void testFloorFirstReached_1() {
	    Assert.assertEquals(1, p.findIndexWhenHitFloor("(", 1));
	}
	@Test
	public void testFloorFirstReached_2() {
	    Assert.assertEquals(2, p.findIndexWhenHitFloor("((", 2));
	}
	@Test
	public void testFloorFirstReached_3() {
	    Assert.assertEquals(7, p.findIndexWhenHitFloor("(())(((", 3));
	}
	@Test
	public void testFloorFirstReached_4() {
	    Assert.assertEquals(40, p.findIndexWhenHitFloor("))))))))()()()()((((((((()()()()((())(((()()()()))))", 4));
	}
}
