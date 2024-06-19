import java.util.LinkedList;

public class Fabrica {
	LinkedList<Angajat> angajati = new LinkedList<>();
	LinkedList<Client> clienti = new LinkedList<>();
	LinkedList<Act> acte = new LinkedList<>();
	
	public void adaugaAngajat (Angajat angajat) {
		angajati.add(angajat);
	}
	public void concediazaAngajat(Angajat angajat) {
		angajati.remove(angajat);
	}
	public void afisareAngajat() {
		for(Angajat angajat : angajati) {
			angajat.afisareNumeComplet();
		}
	}
	public void afisareClienti() {
		for(Client client : clienti) {
			System.out.println(client.nume);
		}
	}
	public void generareOferta (Client client, double valoareFinal) {
		Oferta oferta = new Oferta (valoareFinal, client);
		acte.add(oferta);
	}
	

	public static void main(String[] args) {
		
		
	}

}
