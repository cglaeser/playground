package interfaces;

/**
 * @author Christian Gläser
 *
 * @param <D> The datatype which should be checked. e.g. digits or strings
 */
public interface ICheck {
	
	boolean isValid(String number);
}
