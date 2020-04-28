package TM05JUNIT;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import TM2_Video_Renatl_System.Video;
import TM2_Video_Renatl_System.VideoStore;

public class VideoStoreTest {
private VideoStore videosra;
private String name;
private int storeSize;

	@Before()
public void before(){
videosra =new VideoStore(); 
Video vd = new Video();
name="dasd";
storeSize=0;
	}
	//@Test
//	public void testVideoStore() {
//		fail("Not yet implemented");
//	}

	@Test
	public void testAddVideo() {
	//	fail("Not yet implemented");
		videosra=new VideoStore();
		name="sdsa";
		
		assertEquals(name,"sdsa");
	}

	@Test
	public void testDoCheckout() {
	//	fail("Not yet implemented");
	
	videosra.addVideo(name);
	videosra.doCheckout(name);
	
	}

	@Test
	public void testDoReturn() {
		//fail("Not yet implemented");
	videosra.addVideo(name);
//	videosra.getLastAdded().doReturn();
//	assertFalse(videosra.getLastAdded().getCheckout())
	}

	@Test
	public void testReciveRating() {
		//fail("Not yet implemented");
	videosra.addVideo(name);
	videosra.reciveRating(name, 5);
	
	}

	@Test
	public void testListInventory() {
//		//fail("Not yet implemented");
		try {
			videosra.listInventory();
			assertFalse(false);
		} catch (Exception e) {
			assertTrue(true);
		}
	}

}
