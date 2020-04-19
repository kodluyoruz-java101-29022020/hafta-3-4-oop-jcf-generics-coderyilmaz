package Enum;

public enum AuthenticationStatus {
	
	SUCCESS(true,"Online"),
	FAIL(false,"Wrong Info!");
	
	private boolean code;
	private String status;
	
	private AuthenticationStatus(boolean code, String status) {
		this.code = code;
		this.status = status;
	}
	
	public boolean getCode() {
		return code;
	}
	public String getStatus() {
		return status;
	}
}
