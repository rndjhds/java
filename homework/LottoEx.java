package homework;

import java.util.Iterator;
import java.util.Random;
import java.util.TreeSet;

public class LottoEx {

	public static void main(String[] args) {
		
		Random r = new Random();
		TreeSet ts = new TreeSet();
		
		while(true) {
			ts.add(r.nextInt(45)+1);
			if(ts.size() == 6)
				break;	
		}
		System.out.println(ts);
		
		Iterator it = ts.iterator();
		while(it.hasNext()) {
			System.out.println(((Integer)it.next()).intValue());
		}
	
	}

}
