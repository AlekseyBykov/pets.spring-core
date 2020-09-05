package alekseybykov.portfolio.springcore.javaconfig.di.autowiring.annotationconfig.qualifier.ootb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author Aleksey Bykov
 * @since 05.09.2020
 */
@Qualifier(value = "marked")
@Component
public class BeanY implements Bean {

	private String string;

	public String getString() {
		return string;
	}

	@Autowired
	public void setString(@Value("beanY") String string) {
		this.string = string;
	}
}
