package by.tc.task01.service.validation;

public class ValidatorException extends Exception {

	public ValidatorException() {
		super();
	}

	public ValidatorException(String message) {
		super(message);
	}

	public ValidatorException(Exception e) {
		super(e);
	}

	public ValidatorException(String message, Exception e) {
		super(message, e);
	}
}