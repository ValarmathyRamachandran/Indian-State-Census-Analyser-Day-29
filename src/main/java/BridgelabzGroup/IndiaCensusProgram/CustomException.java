package BridgelabzGroup.IndiaCensusProgram;

public class CustomException extends Exception{
	    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		Message message;

	    public enum Message {
	        IMPROPER_FILE_NAME, IMPROPER_DELIMITER, IMPROPER_HEADER, IMPROPER_FILE_TYPE, RECORDS_MISMATCH,
	        INVALID_ENTRYS
	    }

	    public CustomException(String messages, Message message) {
	        super(messages);
	        this.message = message;
	    }
	}
