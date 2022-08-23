package by.epam.tr.main;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Planes> planes =new ArrayList<Planes>();
		PlaneLogic logic = new PlaneLogic();
		planes.add(new Planes("Paris",2,"test",15,34,00,"Friday"));
		planes.add(new Planes("Varna",1,"test2",15,55,00,"Friday"));
		List<Planes> day = logic.dayLeave(planes, "Friday");
				for(Planes d:day) {
					System.out.println(d.toString());
				}
				System.out.println();
				List<Planes> dayAtTime= logic.dayAtTime(planes, "Friday", 15,55,00);
				for(Planes d:dayAtTime) {
					System.out.println(d.toString());
				}
			}
	}
