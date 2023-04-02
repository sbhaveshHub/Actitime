
package qso;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class filedownload {

	public static void main(String[] args) throws IOException, AWTException, InterruptedException {
		Runtime.getRuntime().exec("Notepad");
		Thread.sleep(3000);
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_SHIFT);
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_Q);
		Thread.sleep(3000);
		r.keyRelease(KeyEvent.VK_SHIFT);
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_S);
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_P);
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_CONTROL);
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_S);
		r.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_ENTER);
	}

}
