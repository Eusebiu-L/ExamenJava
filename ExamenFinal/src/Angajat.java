public class Angajat {
	public String nume, prenume,functie;
	public int vechimeAngajat;
	
	public Angajat(String nume, String prenume, String functie, int salariu, int vechimeAngajat) {
		super();
		this.nume = nume;
		this.prenume = prenume;
		this.functie = functie;
		this.vechimeAngajat = vechimeAngajat;
	}
	public double calculSalariu (double salariuInitial) {
		return salariuInitial + (vechimeAngajat * salariuInitial * 0.10);
	}
	
	public void afisareNumeComplet() {
		System.out.println("Nume: " + nume + "Prenume:" + prenume + "Functie: " + functie );
	}
}
