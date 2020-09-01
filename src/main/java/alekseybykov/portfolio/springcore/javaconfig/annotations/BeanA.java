package alekseybykov.portfolio.springcore.javaconfig.annotations;

import org.springframework.beans.factory.annotation.Value;

/**
 * @author Aleksey Bykov
 * @since 01.09.2020
 */
public class BeanA {

	@Value("string")
	private String string;

	public String getString() {
		return string;
	}

	public void setString(String string) {
		this.string = string;
	}
}
