package Multimedia;

public class Película extends Multimedia{
	protected String actorPrincipal, actrizPrincipal;


	public Película(String título, String autor, double duración, Formato formato, String actorPrincipal,
			String actrizPrincipal) {
		super(título, autor, duración, formato);
		this.actorPrincipal = actorPrincipal;
		this.actrizPrincipal = actrizPrincipal;
	}

	public String getActorPrincipal() {
		return actorPrincipal;
	}

	public void setActorPrincipal(String actorPrincipal) {
		this.actorPrincipal = actorPrincipal;
	}

	public String getActrizPrincipal() {
		return actrizPrincipal;
	}

	public void setActrizPrincipal(String actrizPrincipal) {
		this.actrizPrincipal = actrizPrincipal;
	}
	
	@Override
	public String toString() {
		return super.toString()+" Actor Principal= " + actorPrincipal + "\n Actriz Principal= " + actrizPrincipal+"\n \n";
	}

}
