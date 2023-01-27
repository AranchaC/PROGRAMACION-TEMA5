package Multimedia;

public class Disco extends Multimedia {
	protected Género género;

	public Disco(String título, String autor, double duración, Formato formato, Género género) {
		super(título, autor, duración, formato);
		this.género = género;
	}
	

}
