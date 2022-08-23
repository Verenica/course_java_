package by.epam.tr.main;

import java.util.ArrayList;
import java.util.List;

public class PlaneLogic {

	public List<Planes> planes(List<Planes> planes, String place) {
		List<Planes> arrived = new ArrayList<Planes>();
		for (Planes plane : planes) {
			if (plane.getPlace().equals(place)) {
				arrived.add(plane);
			}
		}
		return arrived;
	}

	public List<Planes> dayLeave(List<Planes> planes, String day) {
		List<Planes> dayleave = new ArrayList<Planes>();
		for (Planes plane : planes) {
			if (plane.getDay().equals(day)) {
				dayleave.add(plane);
			}
		}
		return dayleave;
	}

	public List<Planes> dayAtTime(List<Planes> planes, String day, int hour, int min, int sec) {
		List<Planes> time = new ArrayList<Planes>();
		for (Planes plane : planes) {
			if (plane.getDay().equals(day)) {
				if (plane.getHour() > hour) {
					time.add(plane);
				} else if (plane.getHour() == hour) {
					if (plane.getMin() > min) {
						time.add(plane);
					} else if (plane.getHour() == hour) {
						if (plane.getSec() > sec) {
							time.add(plane);
						}
					}
				}
			}
		}
		return time;
	}
}
