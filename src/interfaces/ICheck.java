package interfaces;

/**
 * @author Christian Gl�ser
 *
 * @param <D> The datatype which should be checked. e.g. digits or strings
 */
public interface ICheck {
	
	boolean isValid(String number);
}
