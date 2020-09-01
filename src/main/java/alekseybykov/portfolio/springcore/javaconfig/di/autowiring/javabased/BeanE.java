package alekseybykov.portfolio.springcore.javaconfig.di.autowiring.javabased;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author Aleksey Bykov
 * @since 31.08.2020
 */
@Component
public class BeanE {

	private String string;

	public String getString() {
		return string;
	}

	@Autowired
	public void setString(@Value("string") String string) {
		this.string = string;
	}
}
