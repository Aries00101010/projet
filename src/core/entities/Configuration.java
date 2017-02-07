package core.entities;

public class Configuration {
	String url = "";
	String login = "";
	String mdp = "";
	public Configuration() {
		
	}
	public Configuration(String url, String login, String mdp) {
		this.url = url;
		this.login = login;
		this.mdp = mdp;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getMdp() {
		return mdp;
	}
	public void setMdp(String mdp) {
		this.mdp = mdp;
	}
}
