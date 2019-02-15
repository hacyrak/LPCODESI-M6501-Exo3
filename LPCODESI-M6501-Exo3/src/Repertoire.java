import java.util.ArrayList;

public class Repertoire extends Noeud{
	private ArrayList<Noeud> noeuds;
	public Repertoire() {
		this.noeuds = new ArrayList<Noeud>();
	}
	
	public void ajouteNoeud(Noeud noeud) {
		this.noeuds.add(noeud);
	}
}
