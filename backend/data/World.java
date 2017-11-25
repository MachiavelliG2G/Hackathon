package data;

import java.util.ArrayList;

public class World {
	private ArrayList<Map> maps;
	
	public World () {
		maps = new ArrayList<Map>();
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
