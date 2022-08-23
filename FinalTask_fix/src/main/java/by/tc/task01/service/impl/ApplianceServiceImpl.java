package by.tc.task01.service.impl;

import java.util.List;

import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.dao.DAOFactory;
import by.tc.task01.dao.impl.ExceptionDAO;
import by.tc.task01.dao.impl.FileApplianceDAOImpl;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.service.ApplianceService;
import by.tc.task01.service.ServiceException;
import by.tc.task01.service.validation.Validator;
import by.tc.task01.service.validation.ValidatorException;

public class ApplianceServiceImpl implements ApplianceService {

	@Override
	public List<Appliance> find(Criteria criteria) throws ServiceException, ValidatorException {
		DAOFactory factory = DAOFactory.getInstance();
		ApplianceDAO applianceDAO = factory.getApplianceDAO();
		Validator validator = new Validator();
		boolean control = false;
		List<Appliance> appliances = null;

		control = validator.criteriaValidator(criteria);

		try {
			if (control == true) {
				appliances = applianceDAO.find(criteria);
			} else {
				appliances = null;
			}
		} catch (ExceptionDAO e) {
			throw new ServiceException(e);

		}

		return appliances;
	}

}
