package alekseybykov.portfolio.springcore.beans.scope;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * @author Aleksey Bykov
 * @since 19.08.2020
 */
public class ACWSingletonScopeBean implements ApplicationContextAware {

	private PrototypeScopeBean prototypeScopeBean;
	private ApplicationContext applicationContext;

	public void setPrototypeScopeBean(PrototypeScopeBean prototypeScopeBean) {
		this.prototypeScopeBean = prototypeScopeBean;
	}

	public PrototypeScopeBean getPrototypeScopeBean() {
		return applicationContext.getBean(PrototypeScopeBean.class);
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext = applicationContext;
	}
}
