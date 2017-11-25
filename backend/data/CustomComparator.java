
public class CustomComparator implements Comparator<Participant>{
	public int compare(Participant o1, Participant o2) {
        return o1.getAgility() >= o2.getAgility();
    }
}

