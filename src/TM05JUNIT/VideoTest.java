package TM05JUNIT;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import TM2_Video_Renatl_System.Video;

public class VideoTest {

	private String videoName;
	private int rating;
	private Video v;
	@Before
	public void before() {
		videoName="fdfd";
		rating=5;
		v=new Video(videoName);
	}
	
	@Test
	public void testGetName() {
		//fail("Not yet implemented");
	
	assertEquals(videoName,v.getName());
	}

	@Test
	public void testDoCheckout() {
	//	fail("Not yet implemented");
	v.doCheckout();
	assertTrue(v.getCheckout());
	}

	@Test
	public void testDoReturn() {
		//fail("Not yet implemented");
	v.doReturn();
	assertFalse(v.getCheckout());
	
	}

	@Test
	public void testReciveRating() {
	//	fail("Not yet implemented");
	v.reciveRating(rating);
	assertEquals(rating,v.getRating());
	}

	@Test
	public void testGetRating() {
		//fail("Not yet implemented");
	v.reciveRating(rating);
	assertEquals(rating,v.getRating());
	}

	@Test
	public void testGetCheckout() {
	//	fail("Not yet implemented");
	v.doReturn();
	assertFalse(v.getCheckout());
	v.doCheckout();
	assertTrue(v.getCheckout());
	
	}

//	@Test
//	public void testVideo() {
//		fail("Not yet implemented");
//	
//	
//	}

}
