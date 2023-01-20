package Multimedia;

public class Película extends Multimedia implements Comparable<Película>{
	protected String actorPrincipal, actrizPrincipal;


	public Película(String título, String autor, double duración, Formato formato, String actorPrincipal,
			String actrizPrincipal) {
		super(título, autor, duración, formato);
		this.actorPrincipal = actorPrincipal;
		this.actrizPrincipal = actrizPrincipal;
		
		/* comento este if, porque he realizado esta función dentro del toString de otra forma:
		 * if (actorPrincipal == null && actrizPrincipal == null) {
			System.out.println("ERROR: Escribe al menos uno");			
		}*/
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
		String actores = "";
		if (actorPrincipal != null) {
			actores += actorPrincipal;
			if (actrizPrincipal != null) {
			actores += " y "+actrizPrincipal;	
			}
		}
		else {
			if (actrizPrincipal != null) {
				actores += actrizPrincipal;
			}
		}
		if (actorPrincipal == null && actrizPrincipal == null) {
			actores = "ERROR: Escribe al menos uno";			
		}
		return super.toString()+ " Protagonistas: "+actores+"\n\n";
			// comento como tenía incialmente el return de toString, antes de poner los ifs:
			//super.toString()+" Actor Principal= " + actorPrincipal + "\n Actriz Principal= " + actrizPrincipal+"\n \n";
	}

	*/@Override
	public int compareTo(Película o) {
		this.Pe
		return 0;
	}*/

}
