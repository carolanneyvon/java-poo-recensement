package fr.diginamic.recensement.exception;

public class RecensementException extends Exception {

	public RecensementException() {
	}

	public RecensementException(String message) {
		super(message);
	}

	public RecensementException(Throwable cause) {
		super(cause);
	}

	public RecensementException(String message, Throwable cause) {
		super(message, cause);
	}

	public RecensementException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
