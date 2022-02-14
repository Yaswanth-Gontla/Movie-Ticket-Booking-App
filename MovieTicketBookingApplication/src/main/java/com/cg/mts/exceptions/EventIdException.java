package com.cg.mts.exceptions;

public class EventIdException {
  private int eventId;

public EventIdException() {
	super();
	// TODO Auto-generated constructor stub
}
public EventIdException(int eventId) {
	super();
	this.eventId=eventId;
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "EventIdException [eventId=" + eventId + "]";
}


}
/*
package com.ecom.app.exceptions;

public class ErrorTemplate {
	private String errorMsg;
	private String actionType;
	public ErrorTemplate() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ErrorTemplate(String errorMsg, String actionType) {
		super();
		this.errorMsg = errorMsg;
		this.actionType = actionType;
	}
	public String getErrorMsg() {
		return errorMsg;
	}
	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}
	public String getActionType() {
		return actionType;
	}
	public void setActionType(String actionType) {
		this.actionType = actionType;
	}
	
	
	

}
*/