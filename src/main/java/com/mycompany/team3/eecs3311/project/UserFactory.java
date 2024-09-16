package com.mycompany.team3.eecs3311.project;

public class UserFactory {
	private final String passwordValidationRegex = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[?!@#$%^&*=+]).{4,}$";
	private final String idValidationRegex = "^(?=.*\\D).{1,}$";
	
	public User getUser(String email, String password, String name, UserType userType, String idField) throws InvalidUserCredentialException{
		if (!(email.contains("@"))) {
			throw new InvalidUserCredentialException("Please enter valid email.");
		} else if (!(password.matches(passwordValidationRegex))) {
			throw new InvalidUserCredentialException("Please enter valid password (at least one of each: uppercase, lowercase, special symbol, number).");
		}
		
		if (userType != UserType.VISITOR) {
			if (!isValidId(idField)) {
				throw new InvalidUserCredentialException("Please enter valid ID. (Integers between 0 - 999)");
			}
			
			if (userType == UserType.STUDENT) {
				return new Student(email, password, name, userType, Integer.parseInt(idField));
			} else if(userType == UserType.FACULTY_MEMBER) {
				return new Faculty(email, password, name, userType, Integer.parseInt(idField));
			} else if (userType == UserType.NON_FACULTY) {
				return new User(email, password, name, userType, Integer.parseInt(idField));
			}
		}
		
		return new User(email, password, name, userType, -1);
	}
	
	private boolean isValidId(String idField) {
		return  !idField.equals("") 
				&& !idField.matches(idValidationRegex)
				&& Integer.parseInt(idField) > 0 && Integer.parseInt(idField) < 1000;
	}
	

}
