package data;
import java.util.Comparator;

public class CustomComparator implements Comparator<Participant>{
	public int compare(Participant o1, Participant o2) {
		if (o1.getAgility() >= o2.getAgility()) {
			return 1;
		} else {
			return 0;
		}
    }
}

