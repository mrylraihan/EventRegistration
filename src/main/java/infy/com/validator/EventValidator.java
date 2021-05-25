package infy.com.validator;

import java.time.LocalDate;

import com.infy.dto.ParticipantDTO;
import com.infy.exception.EventRegistrationException;

public class EventValidator {
	private EventValidator() {
		
	}
	
	public static void validateParticipant(ParticipantDTO participantDTO) throws EventRegistrationException {
		
	}
	
	public static Boolean isValidGender(String gender) {
		return null;
	}
	
	public static Boolean isValidRegistrationDate(LocalDate registrationDate) {
		return null;
	}
}
