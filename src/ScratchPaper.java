import java.util.ArrayList;

import javax.swing.JFrame;

public class ScratchPaper {
	public static void main(String[] args) {
		Integer num = 0;
		ArrayList< Integer > intList = new ArrayList< Integer >();
		intList.add(1);
		intList.add(2);
		intList.add(3);
		intList.add(4);
		num = intList.remove(2);
		System.out.println(num);
		
	}
}