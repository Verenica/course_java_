package by.tc.task01.main;

import static by.tc.task01.entity.criteria.SearchCriteria.*;

import java.util.List;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.entity.criteria.SearchCriteria;
import by.tc.task01.service.ApplianceService;
import by.tc.task01.service.ServiceException;
import by.tc.task01.service.ServiceFactory;
import by.tc.task01.service.validation.Validator;
import by.tc.task01.service.validation.ValidatorException;

public class Main {

	public static void main(String[] args) throws ServiceException, ValidatorException {
		List<Appliance> appliances;
		Validator validator = new Validator();
		ServiceFactory factory = ServiceFactory.getInstance();
		ApplianceService service = factory.getApplianceService();

		//////////////////////////////////////////////////////////////////
		Criteria criteriaOven = new Criteria(Oven.class.getSimpleName());// "Oven"
		try {
			criteriaOven.add(Oven.POWER_CONSUMPTION.toString(), 1500);
			if (validator.criteriaValidator(criteriaOven)) {

				appliances = service.find(criteriaOven);

				PrintApplianceInfo.print(appliances);
			}
		} catch (ValidatorException message) {
			message.printStackTrace();
		}
		try {
			//////////////////////////////////////////////////////////////////
			criteriaOven = new Criteria(Oven.class.getSimpleName());
			criteriaOven.add(Oven.HEIGHT.toString(), 40);
			criteriaOven.add(Oven.DEPTH.toString(), "text");
			if (validator.criteriaValidator(criteriaOven)) {

				appliances = service.find(criteriaOven);

				PrintApplianceInfo.print(appliances);
			}
		} catch (ValidatorException message) {
			message.printStackTrace();
		}
		//////////////////////////////////////////////////////////////////
		try {
			Criteria criteriaTabletPC = new Criteria(TabletPC.class.getSimpleName());
			criteriaTabletPC.add(TabletPC.COLOR.toString(), "red");
			criteriaTabletPC.add(TabletPC.DISPLAY_INCHES.toString(), 15);
			criteriaTabletPC.add(TabletPC.MEMORY_ROM.toString(), 8000);
			if (validator.criteriaValidator(criteriaTabletPC)) {

				appliances = service.find(criteriaTabletPC);

				PrintApplianceInfo.print(appliances);

			}
		} catch (ValidatorException message) {
			message.printStackTrace();
		}
	}
}
