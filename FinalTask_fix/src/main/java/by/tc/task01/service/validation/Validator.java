package by.tc.task01.service.validation;

import java.util.HashMap;
import java.util.Map;
import by.tc.task01.entity.criteria.Criteria;

public class Validator {

	public static boolean criteriaValidator(Criteria criteria) throws ValidatorException {
		Map<String, Object> temp = criteria.getMap();
		for (Map.Entry entry : temp.entrySet()) {
			switch (criteria.getGroupSearchName()) {
			case "Oven":
				try {
					int tempValue = Integer.parseInt(entry.getValue().toString());
					if (tempValue <= 0) {
						//System.out.println("Number must be more than zero.");
						throw new ValidatorException("Number must be more than zero.");
						//return false;
					}
				} catch (NumberFormatException e) {
//					System.out.println("Value is not number.");
//					return false;
					throw new ValidatorException("Value is not number.");
				}
				break;
			case "TabletPC":
				if (!entry.getKey().equals("COLOR")) {
					try {
						int tempValue = Integer.parseInt(entry.getValue().toString());
						if (tempValue <= 0) {
//							System.out.println("Number must be more than zero.");
//							return false;
							throw new ValidatorException("Number must be more than zero.");
						}
					} catch (NumberFormatException e) {
//						System.out.println("Value is not number.");
//						return false;
						throw new ValidatorException("Value is not number.");
					}
				}
				break;
			}
		}
		return true;
	}
}