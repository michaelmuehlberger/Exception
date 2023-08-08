/*
 * Exceptions
 * Project handeling and creating exceptions
 * Author:       Michael Muehlberger
 * Last Change:  27.03.2023
 */
public class MuehlbergerException extends Exception{
    public MuehlbergerException(String s){}
    public MuehlbergerException(String message, Throwable cause){
        super(message, cause);
    }
}
