package TM05JUNIT;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;


@RunWith(Suite.class)
@Suite.SuiteClasses({
	VideoTest.class,
	VideoStoreTest.class
})
public class UnitTestClass {

	
	
	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
