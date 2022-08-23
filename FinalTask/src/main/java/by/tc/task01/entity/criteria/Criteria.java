package by.tc.task01.entity.criteria;

import java.util.HashMap;
import java.util.Map;

public class Criteria {

	private String groupSearchName;
	private Map<String, Object> criteria = new HashMap<String, Object>();

	public Criteria() {
	}

	public Criteria(String groupSearchName) {
		this.groupSearchName = groupSearchName;
	}

	public String getGroupSearchName() {
		return groupSearchName;
	}

	public void add(String searchCriteria, Object value) {
		criteria.put(searchCriteria, value);
	}

	public boolean isSearchObject(String str) {
		for (Map.Entry entry : criteria.entrySet()) {
			if (str.indexOf(entry.getKey() + "=" + entry.getValue()) <= 0) {
				return false;
			}
		}
		return true;
	}

	public Map<String, Object > getMap() {
	    return criteria;
	  }
}
