package alekseybykov.portfolio.springcore.javaconfig.di.autowiring.annotationconfig.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author Aleksey Bykov
 * @since 05.09.2020
 */
@Component
public class BeanO implements Bean {

	private String string;

	public String getString() {
		return string;
	}

	@Autowired
	public void setString(@Value("beanO") String string) {
		this.string = string;
	}
}
