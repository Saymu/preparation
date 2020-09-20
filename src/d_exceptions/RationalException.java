package d_exceptions;

public class RationalException extends Exception {

	private static final long serialVersionUID = 320963522649323108L;

	public RationalException() {
		this("Denominator cannot be zero");
	}

	public RationalException(String message) {
		super(message);
	}

	public RationalException(String message, Throwable cause) {
		super(message, cause);
	}

}
