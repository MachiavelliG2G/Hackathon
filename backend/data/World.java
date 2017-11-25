package data;

import java.util.ArrayList;
import java.util.Map;<E>gChange.Map;

public class World {
	private ArrayList<Map> maps;
	
	public World () {
		maps = new ArrayList<map>();
	}
	
	public Map getMaps(int iIndex) {
		return maps.get(iIndex);
	}
	
	public void removeMap (int iIndex) {
		maps.remove(iIndex);
	}
	
	public void addMap (Map map) {
		maps.add(map);
	}
}
