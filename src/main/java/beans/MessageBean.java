package beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("bean.message")
public class MessageBean {
	
	@Value("Mensaje de prueba")
	private String message;
	
	public MessageBean() {
		this("");
	}

	public MessageBean(String msg) {
		this.setMessage(msg);
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	@Override
	public String toString() {
		return message;
	}
}
