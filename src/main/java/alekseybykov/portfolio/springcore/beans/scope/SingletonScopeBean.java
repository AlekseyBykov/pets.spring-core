package alekseybykov.portfolio.springcore.beans.scope;

/**
 * @author Aleksey Bykov
 * @since 19.08.2020
 */
public class SingletonScopeBean {

	private PrototypeScopeBean prototypeScopeBean;

	public void setPrototypeScopeBean(PrototypeScopeBean prototypeScopeBean) {
		this.prototypeScopeBean = prototypeScopeBean;
	}

	public PrototypeScopeBean getPrototypeScopeBean() {
		return prototypeScopeBean;
	}
}
