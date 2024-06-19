import java.util.LinkedList;

public class Manager extends Angajat {

	LinkedList <String> muncitori = new LinkedList<String>();
	public Manager(String nume, String prenume, String functie, int salariu, int vechimeAngajat) {
		super(nume, prenume, functie, salariu, vechimeAngajat);
		// TODO Auto-generated constructor stub
	}
	public void adaugaMuncitor( String muncitor) {
		muncitori.add(muncitor);
	}
}
