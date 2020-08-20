package alekseybykov.portfolio.springcore.beans.scope;

/**
 * @author Aleksey Bykov
 * @since 20.08.2020
 */
public abstract class AbstractSingletonScopeBean {

	private PrototypeScopeBean prototypeScopeBean;

	public void setPrototypeScopeBean(PrototypeScopeBean prototypeScopeBean) {
		this.prototypeScopeBean = prototypeScopeBean;
	}

	public abstract PrototypeScopeBean getPrototypeScopeBean();
}
