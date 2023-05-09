package mastermind.tests.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

import mastermind.model.*;

public class MasterMindTest2 {
	
	@Test
	public void testConDueRossi() {
		Gioco gioco = new Gioco(10,4);
		MasterMind brain = new MasterMind(4) {
			protected void sorteggiaCombinazione(Combinazione segreta) {
				segreta.setPiolo(0, PioloDiGioco.ROSSO);
				segreta.setPiolo(1, PioloDiGioco.ROSSO);
				segreta.setPiolo(2, PioloDiGioco.VERDE);
				segreta.setPiolo(3, PioloDiGioco.GIALLO);
			}
		};
		assertEquals(10, gioco.maxTentativi());
		assertEquals(10, gioco.tentativiRimasti());
		assertEquals(0, gioco.tentativiEffettuati());
		assertEquals(4, gioco.dimensione());
		assertEquals(Status.IN_CORSO, gioco.stato());
		assertEquals("ROSSO,ROSSO,VERDE,GIALLO",brain.combinazioneSegreta());
		Combinazione c1 = new Combinazione(4);
		c1.setPiolo(0, PioloDiGioco.ROSSO);
		c1.setPiolo(1, PioloDiGioco.GIALLO);
		c1.setPiolo(2, PioloDiGioco.VERDE);
		c1.setPiolo(3, PioloDiGioco.BLU);
		Risposta risposta1 = brain.calcolaRisposta(c1);
		Status status1 = gioco.registraMossa(c1,risposta1);
		assertEquals(Status.IN_CORSO, status1);
		//	System.out.println("testConDueRossi-risposta#1: " + gioco.ultimaRisposta());
		assertEquals(10, gioco.maxTentativi());
		assertEquals(9, gioco.tentativiRimasti());
		assertEquals(1, gioco.tentativiEffettuati());
		assertEquals(4, gioco.dimensione());		
		assertTrue(gioco.toString().contains("Situazione:"+ System.lineSeparator()));
		assertTrue(gioco.toString().contains("Gioco: "+ Status.IN_CORSO));
		assertTrue(gioco.toString().contains("ROSSO,GIALLO,VERDE,BLU\t\tNERO,NERO,BIANCO,VUOTO"+ System.lineSeparator()));
		//System.out.println(gioco);
		assertTrue(c1.equals(gioco.ultimoTentativo()));
		Risposta r1 = new Risposta(4);
		r1.setPiolo(0, PioloRisposta.NERO);
		r1.setPiolo(1, PioloRisposta.NERO);
		r1.setPiolo(2, PioloRisposta.BIANCO);
		r1.setPiolo(3, PioloRisposta.VUOTO);
		assertTrue(r1.equals(gioco.ultimaRisposta()));
		//------------
		Combinazione c2 = new Combinazione(4);
		c2.setPiolo(0, PioloDiGioco.ROSSO);
		c2.setPiolo(1, PioloDiGioco.VERDE);
		c2.setPiolo(2, PioloDiGioco.ROSSO);
		c2.setPiolo(3, PioloDiGioco.GIALLO);
		Risposta risposta2 = brain.calcolaRisposta(c2);
		Status status2 = gioco.registraMossa(c2,risposta2);
		assertEquals(Status.IN_CORSO, status2);
		//	System.out.println("testConDueRossi-risposta#2: " + gioco.ultimaRisposta());
		assertEquals(10, gioco.maxTentativi());
		assertEquals(8, gioco.tentativiRimasti());
		assertEquals(2, gioco.tentativiEffettuati());
		assertEquals(4, gioco.dimensione());
		assertTrue(c2.equals(gioco.ultimoTentativo()));
		Risposta r2 = new Risposta(4);
		r2.setPiolo(0, PioloRisposta.NERO);
		r2.setPiolo(1, PioloRisposta.NERO);
		r2.setPiolo(2, PioloRisposta.BIANCO);
		r2.setPiolo(3, PioloRisposta.BIANCO);
		assertTrue(r2.equals(gioco.ultimaRisposta()));		
		//------------
		Combinazione c3 = new Combinazione(4);
		c3.setPiolo(0, PioloDiGioco.ROSSO);
		c3.setPiolo(1, PioloDiGioco.GIALLO);
		c3.setPiolo(2, PioloDiGioco.VERDE);
		c3.setPiolo(3, PioloDiGioco.ROSSO);
		Risposta risposta3 = brain.calcolaRisposta(c3);
		Status status3 = gioco.registraMossa(c3,risposta3);
		assertEquals(Status.IN_CORSO, status3);
		//	System.out.println("testConDueRossi-risposta#3: " + gioco.ultimaRisposta());
		assertEquals(10, gioco.maxTentativi());
		assertEquals(7, gioco.tentativiRimasti());
		assertEquals(3, gioco.tentativiEffettuati());
		assertEquals(4, gioco.dimensione());
		assertTrue(c3.equals(gioco.ultimoTentativo()));
		Risposta r3 = new Risposta(4);
		r3.setPiolo(0, PioloRisposta.NERO);
		r3.setPiolo(1, PioloRisposta.NERO);
		r3.setPiolo(2, PioloRisposta.BIANCO);
		r3.setPiolo(3, PioloRisposta.BIANCO);
		assertTrue(r3.equals(gioco.ultimaRisposta()));
		//------------
		Combinazione c4 = new Combinazione(4);
		c4.setPiolo(0, PioloDiGioco.VERDE);
		c4.setPiolo(1, PioloDiGioco.GIALLO);
		c4.setPiolo(2, PioloDiGioco.ROSSO);
		c4.setPiolo(3, PioloDiGioco.ROSSO);
		Risposta risposta4 = brain.calcolaRisposta(c4);
		Status status4 = gioco.registraMossa(c4,risposta4);
		assertEquals(Status.IN_CORSO, status4);
		//	System.out.println("testConDueRossi-risposta#4: " + gioco.ultimaRisposta());
		assertEquals(10, gioco.maxTentativi());
		assertEquals(6, gioco.tentativiRimasti());
		assertEquals(4, gioco.tentativiEffettuati());
		assertEquals(4, gioco.dimensione());
		assertTrue(c4.equals(gioco.ultimoTentativo()));
		Risposta r4 = new Risposta(4);
		r4.setPiolo(0, PioloRisposta.BIANCO);
		r4.setPiolo(1, PioloRisposta.BIANCO);
		r4.setPiolo(2, PioloRisposta.BIANCO);
		r4.setPiolo(3, PioloRisposta.BIANCO);
		assertTrue(r4.equals(gioco.ultimaRisposta()));	
		//------------
		Combinazione c5 = new Combinazione(4);
		c5.setPiolo(0, PioloDiGioco.VERDE);
		c5.setPiolo(1, PioloDiGioco.ROSSO);
		c5.setPiolo(2, PioloDiGioco.GIALLO);
		c5.setPiolo(3, PioloDiGioco.ROSSO);
		Risposta risposta5 = brain.calcolaRisposta(c5);
		Status status5 = gioco.registraMossa(c5,risposta5);
		assertEquals(Status.IN_CORSO, status5);
		//	System.out.println("testConDueRossi-risposta#5: " + gioco.ultimaRisposta());
		assertEquals(10, gioco.maxTentativi());
		assertEquals(5, gioco.tentativiRimasti());
		assertEquals(5, gioco.tentativiEffettuati());
		assertEquals(4, gioco.dimensione());
		assertTrue(c5.equals(gioco.ultimoTentativo()));
		Risposta r5 = new Risposta(4);
		r5.setPiolo(0, PioloRisposta.NERO);
		r5.setPiolo(1, PioloRisposta.BIANCO);
		r5.setPiolo(2, PioloRisposta.BIANCO);
		r5.setPiolo(3, PioloRisposta.BIANCO);
		assertTrue(r5.equals(gioco.ultimaRisposta()));	
		//------------
		Combinazione c6 = new Combinazione(4);
		c6.setPiolo(0, PioloDiGioco.ROSSO);
		c6.setPiolo(1, PioloDiGioco.ROSSO);
		c6.setPiolo(2, PioloDiGioco.VERDE);
		c6.setPiolo(3, PioloDiGioco.GIALLO);
		Risposta risposta6 = brain.calcolaRisposta(c6);
		Status status6 = gioco.registraMossa(c6,risposta6);
		assertEquals(Status.VITTORIA, status6);
		//	System.out.println("testConDueRossi-risposta#6: " + gioco.ultimaRisposta());
		assertEquals(10, gioco.maxTentativi());
		assertEquals(4, gioco.tentativiRimasti());
		assertEquals(6, gioco.tentativiEffettuati());
		assertEquals(4, gioco.dimensione());
		assertTrue(c6.equals(gioco.ultimoTentativo()));
		Risposta r6 = new Risposta(4);
		r6.setPiolo(0, PioloRisposta.NERO);
		r6.setPiolo(1, PioloRisposta.NERO);
		r6.setPiolo(2, PioloRisposta.NERO);
		r6.setPiolo(3, PioloRisposta.NERO);
		assertTrue(r6.equals(gioco.ultimaRisposta()));	
	}
	
	@Test
	public void testConTreGialli() {
		Gioco gioco = new Gioco(10,4);
		MasterMind brain = new MasterMind(4) {
			protected void sorteggiaCombinazione(Combinazione segreta) {
				segreta.setPiolo(0, PioloDiGioco.ROSSO);
				segreta.setPiolo(1, PioloDiGioco.GIALLO);
				segreta.setPiolo(2, PioloDiGioco.GIALLO);
				segreta.setPiolo(3, PioloDiGioco.GIALLO);
			}
		};
		assertEquals(10, gioco.maxTentativi());
		assertEquals(10, gioco.tentativiRimasti());
		assertEquals(0, gioco.tentativiEffettuati());
		assertEquals(4, gioco.dimensione());
		assertEquals(Status.IN_CORSO, gioco.stato());
		assertEquals("ROSSO,GIALLO,GIALLO,GIALLO",brain.combinazioneSegreta());
		Combinazione c1 = new Combinazione(4);
		c1.setPiolo(0, PioloDiGioco.ROSSO);
		c1.setPiolo(1, PioloDiGioco.GIALLO);
		c1.setPiolo(2, PioloDiGioco.VERDE);
		c1.setPiolo(3, PioloDiGioco.BLU);
		Risposta risposta1 = brain.calcolaRisposta(c1);
		Status status1 = gioco.registraMossa(c1,risposta1);
		assertEquals(Status.IN_CORSO, status1);
		//	System.out.println("testConTreGialli-risposta#1: " + gioco.ultimaRisposta());
		assertEquals(10, gioco.maxTentativi());
		assertEquals(9, gioco.tentativiRimasti());
		assertEquals(1, gioco.tentativiEffettuati());
		assertEquals(4, gioco.dimensione());		
		assertTrue(gioco.toString().contains("Situazione:"+ System.lineSeparator()));
		assertTrue(gioco.toString().contains("Gioco: "+ Status.IN_CORSO));
		assertTrue(gioco.toString().contains("ROSSO,GIALLO,VERDE,BLU\t\tNERO,NERO,VUOTO,VUOTO"+ System.lineSeparator()));
		//System.out.println(gioco);
		assertTrue(c1.equals(gioco.ultimoTentativo()));
		Risposta r1 = new Risposta(4);
		r1.setPiolo(0, PioloRisposta.NERO);
		r1.setPiolo(1, PioloRisposta.NERO);
		r1.setPiolo(2, PioloRisposta.VUOTO);
		r1.setPiolo(3, PioloRisposta.VUOTO);
		assertTrue(r1.equals(gioco.ultimaRisposta()));
		//------------
		Combinazione c2 = new Combinazione(4);
		c2.setPiolo(0, PioloDiGioco.ROSSO);
		c2.setPiolo(1, PioloDiGioco.VERDE);
		c2.setPiolo(2, PioloDiGioco.ROSSO);
		c2.setPiolo(3, PioloDiGioco.GIALLO);
		Risposta risposta2 = brain.calcolaRisposta(c2);
		Status status2 = gioco.registraMossa(c2,risposta2);
		assertEquals(Status.IN_CORSO, status2);
		//	System.out.println("testConTreGialli-risposta#2: " + gioco.ultimaRisposta());
		assertEquals(10, gioco.maxTentativi());
		assertEquals(8, gioco.tentativiRimasti());
		assertEquals(2, gioco.tentativiEffettuati());
		assertEquals(4, gioco.dimensione());
		assertTrue(c2.equals(gioco.ultimoTentativo()));
		Risposta r2 = new Risposta(4);
		r2.setPiolo(0, PioloRisposta.NERO);
		r2.setPiolo(1, PioloRisposta.NERO);
		r2.setPiolo(2, PioloRisposta.VUOTO);
		r2.setPiolo(3, PioloRisposta.VUOTO);
		assertTrue(r2.equals(gioco.ultimaRisposta()));		
		//------------
		Combinazione c3 = new Combinazione(4);
		c3.setPiolo(0, PioloDiGioco.ROSSO);
		c3.setPiolo(1, PioloDiGioco.GIALLO);
		c3.setPiolo(2, PioloDiGioco.VERDE);
		c3.setPiolo(3, PioloDiGioco.ROSSO);
		Risposta risposta3 = brain.calcolaRisposta(c3);
		Status status3 = gioco.registraMossa(c3,risposta3);		
		assertEquals(Status.IN_CORSO, status3);
		//	System.out.println("testConTreGialli-risposta#3: " + gioco.ultimaRisposta());
		assertEquals(10, gioco.maxTentativi());
		assertEquals(7, gioco.tentativiRimasti());
		assertEquals(3, gioco.tentativiEffettuati());
		assertEquals(4, gioco.dimensione());
		assertTrue(c3.equals(gioco.ultimoTentativo()));
		Risposta r3 = new Risposta(4);
		r3.setPiolo(0, PioloRisposta.NERO);
		r3.setPiolo(1, PioloRisposta.NERO);
		r3.setPiolo(2, PioloRisposta.VUOTO);
		r3.setPiolo(3, PioloRisposta.VUOTO);
		assertTrue(r3.equals(gioco.ultimaRisposta()));
		//------------
		Combinazione c4 = new Combinazione(4);
		c4.setPiolo(0, PioloDiGioco.VERDE);
		c4.setPiolo(1, PioloDiGioco.GIALLO);
		c4.setPiolo(2, PioloDiGioco.ROSSO);
		c4.setPiolo(3, PioloDiGioco.ROSSO);
		Risposta risposta4 = brain.calcolaRisposta(c4);
		Status status4 = gioco.registraMossa(c4,risposta4);
		assertEquals(Status.IN_CORSO, status4);
		//	System.out.println("testConTreGialli-risposta#4: " + gioco.ultimaRisposta());
		assertEquals(10, gioco.maxTentativi());
		assertEquals(6, gioco.tentativiRimasti());
		assertEquals(4, gioco.tentativiEffettuati());
		assertEquals(4, gioco.dimensione());
		assertTrue(c4.equals(gioco.ultimoTentativo()));
		Risposta r4 = new Risposta(4);
		r4.setPiolo(0, PioloRisposta.NERO);
		r4.setPiolo(1, PioloRisposta.BIANCO);
		r4.setPiolo(2, PioloRisposta.VUOTO);
		r4.setPiolo(3, PioloRisposta.VUOTO);
		assertTrue(r4.equals(gioco.ultimaRisposta()));
		//------------
		Combinazione c5 = new Combinazione(4);
		c5.setPiolo(0, PioloDiGioco.GIALLO);
		c5.setPiolo(1, PioloDiGioco.ROSSO);
		c5.setPiolo(2, PioloDiGioco.GIALLO);
		c5.setPiolo(3, PioloDiGioco.ROSSO);
		Risposta risposta5 = brain.calcolaRisposta(c5);
		Status status5 = gioco.registraMossa(c5,risposta5);
		assertEquals(Status.IN_CORSO, status5);
		//	System.out.println("testConTreGialli-risposta#5: " + gioco.ultimaRisposta());
		assertEquals(10, gioco.maxTentativi());
		assertEquals(5, gioco.tentativiRimasti());
		assertEquals(5, gioco.tentativiEffettuati());
		assertEquals(4, gioco.dimensione());
		assertTrue(c5.equals(gioco.ultimoTentativo()));
		Risposta r5 = new Risposta(4);
		r5.setPiolo(0, PioloRisposta.NERO);
		r5.setPiolo(1, PioloRisposta.BIANCO);
		r5.setPiolo(2, PioloRisposta.BIANCO);
		r5.setPiolo(3, PioloRisposta.VUOTO);
		assertTrue(r5.equals(gioco.ultimaRisposta()));
		//------------
		Combinazione c6 = new Combinazione(4);
		c6.setPiolo(0, PioloDiGioco.ROSSO);
		c6.setPiolo(1, PioloDiGioco.GIALLO);
		c6.setPiolo(2, PioloDiGioco.GIALLO);
		c6.setPiolo(3, PioloDiGioco.GIALLO);
		Risposta risposta6 = brain.calcolaRisposta(c6);
		Status status6 = gioco.registraMossa(c6,risposta6);
		assertEquals(Status.VITTORIA, status6);
		//	System.out.println("testConTreGialli-risposta#6: " + gioco.ultimaRisposta());
		assertEquals(10, gioco.maxTentativi());
		assertEquals(4, gioco.tentativiRimasti());
		assertEquals(6, gioco.tentativiEffettuati());
		assertEquals(4, gioco.dimensione());
		assertTrue(c6.equals(gioco.ultimoTentativo()));
		Risposta r6 = new Risposta(4);
		r6.setPiolo(0, PioloRisposta.NERO);
		r6.setPiolo(1, PioloRisposta.NERO);
		r6.setPiolo(2, PioloRisposta.NERO);
		r6.setPiolo(3, PioloRisposta.NERO);
		assertTrue(r6.equals(gioco.ultimaRisposta()));
	}
	
	@Test
	public void testConTuttiVerdi() {
		Gioco gioco = new Gioco(10,4);
		MasterMind brain = new MasterMind(4) {
			protected void sorteggiaCombinazione(Combinazione segreta) {
				segreta.setPiolo(0, PioloDiGioco.VERDE);
				segreta.setPiolo(1, PioloDiGioco.VERDE);
				segreta.setPiolo(2, PioloDiGioco.VERDE);
				segreta.setPiolo(3, PioloDiGioco.VERDE);
			}
		};
		assertEquals(10, gioco.maxTentativi());
		assertEquals(10, gioco.tentativiRimasti());
		assertEquals(0, gioco.tentativiEffettuati());
		assertEquals(4, gioco.dimensione());
		assertEquals(Status.IN_CORSO, gioco.stato());
		assertEquals("VERDE,VERDE,VERDE,VERDE",brain.combinazioneSegreta());
		Combinazione c1 = new Combinazione(4);
		c1.setPiolo(0, PioloDiGioco.ROSSO);
		c1.setPiolo(1, PioloDiGioco.GIALLO);
		c1.setPiolo(2, PioloDiGioco.VERDE);
		c1.setPiolo(3, PioloDiGioco.BLU);
		Risposta risposta1 = brain.calcolaRisposta(c1);
		Status status1 = gioco.registraMossa(c1,risposta1);
		assertEquals(Status.IN_CORSO, status1);
		//	System.out.println("testConTuttiVerdi-risposta#1: " + gioco.ultimaRisposta());
		assertEquals(10, gioco.maxTentativi());
		assertEquals(9, gioco.tentativiRimasti());
		assertEquals(1, gioco.tentativiEffettuati());
		assertEquals(4, gioco.dimensione());		
		assertTrue(gioco.toString().contains("Situazione:"+ System.lineSeparator()));
		assertTrue(gioco.toString().contains("Gioco: "+ Status.IN_CORSO));
		assertTrue(gioco.toString().contains("ROSSO,GIALLO,VERDE,BLU\t\tNERO,VUOTO,VUOTO,VUOTO"+ System.lineSeparator()));
		//System.out.println(gioco);
		assertTrue(c1.equals(gioco.ultimoTentativo()));
		Risposta r1 = new Risposta(4);
		r1.setPiolo(0, PioloRisposta.NERO);
		r1.setPiolo(1, PioloRisposta.VUOTO);
		r1.setPiolo(2, PioloRisposta.VUOTO);
		r1.setPiolo(3, PioloRisposta.VUOTO);
		assertTrue(r1.equals(gioco.ultimaRisposta()));
		//------------
		Combinazione c2 = new Combinazione(4);
		c2.setPiolo(0, PioloDiGioco.ROSSO);
		c2.setPiolo(1, PioloDiGioco.VERDE);
		c2.setPiolo(2, PioloDiGioco.ROSSO);
		c2.setPiolo(3, PioloDiGioco.GIALLO);
		Risposta risposta2 = brain.calcolaRisposta(c2);
		Status status2 = gioco.registraMossa(c2,risposta2);
		assertEquals(Status.IN_CORSO, status2);
		//	System.out.println("testConTuttiVerdi-risposta#2: " + gioco.ultimaRisposta());
		assertEquals(10, gioco.maxTentativi());
		assertEquals(8, gioco.tentativiRimasti());
		assertEquals(2, gioco.tentativiEffettuati());
		assertEquals(4, gioco.dimensione());
		assertTrue(c2.equals(gioco.ultimoTentativo()));
		Risposta r2 = new Risposta(4);
		r2.setPiolo(0, PioloRisposta.NERO);
		r2.setPiolo(1, PioloRisposta.VUOTO);
		r2.setPiolo(2, PioloRisposta.VUOTO);
		r2.setPiolo(3, PioloRisposta.VUOTO);
		assertTrue(r2.equals(gioco.ultimaRisposta()));
		//------------
		Combinazione c3 = new Combinazione(4);
		c3.setPiolo(0, PioloDiGioco.ROSSO);
		c3.setPiolo(1, PioloDiGioco.GIALLO);
		c3.setPiolo(2, PioloDiGioco.VERDE);
		c3.setPiolo(3, PioloDiGioco.ROSSO);
		Risposta risposta3 = brain.calcolaRisposta(c3);
		Status status3 = gioco.registraMossa(c3,risposta3);
		assertEquals(Status.IN_CORSO, status3);
		//	System.out.println("testConTuttiVerdi-risposta#3: " + gioco.ultimaRisposta());
		assertEquals(10, gioco.maxTentativi());
		assertEquals(7, gioco.tentativiRimasti());
		assertEquals(3, gioco.tentativiEffettuati());
		assertEquals(4, gioco.dimensione());
		assertTrue(c3.equals(gioco.ultimoTentativo()));
		Risposta r3 = new Risposta(4);
		r3.setPiolo(0, PioloRisposta.NERO);
		r3.setPiolo(1, PioloRisposta.VUOTO);
		r3.setPiolo(2, PioloRisposta.VUOTO);
		r3.setPiolo(3, PioloRisposta.VUOTO);
		assertTrue(r3.equals(gioco.ultimaRisposta()));
		//------------
		Combinazione c4 = new Combinazione(4);
		c4.setPiolo(0, PioloDiGioco.VERDE);
		c4.setPiolo(1, PioloDiGioco.GIALLO);
		c4.setPiolo(2, PioloDiGioco.ROSSO);
		c4.setPiolo(3, PioloDiGioco.VERDE);
		Risposta risposta4 = brain.calcolaRisposta(c4);
		Status status4 = gioco.registraMossa(c4,risposta4);
		assertEquals(Status.IN_CORSO, status4);
		//	System.out.println("testConTuttiVerdi-risposta#4: " + gioco.ultimaRisposta());
		assertEquals(10, gioco.maxTentativi());
		assertEquals(6, gioco.tentativiRimasti());
		assertEquals(4, gioco.tentativiEffettuati());
		assertEquals(4, gioco.dimensione());
		assertTrue(c4.equals(gioco.ultimoTentativo()));
		Risposta r4 = new Risposta(4);
		r4.setPiolo(0, PioloRisposta.NERO);
		r4.setPiolo(1, PioloRisposta.NERO);
		r4.setPiolo(2, PioloRisposta.VUOTO);
		r4.setPiolo(3, PioloRisposta.VUOTO);
		assertTrue(r4.equals(gioco.ultimaRisposta()));
		//------------
		Combinazione c5 = new Combinazione(4);
		c5.setPiolo(0, PioloDiGioco.GIALLO);
		c5.setPiolo(1, PioloDiGioco.VERDE);
		c5.setPiolo(2, PioloDiGioco.VERDE);
		c5.setPiolo(3, PioloDiGioco.ROSSO);
		Risposta risposta5 = brain.calcolaRisposta(c5);
		Status status5 = gioco.registraMossa(c5,risposta5);
		assertEquals(Status.IN_CORSO, status5);
		//	System.out.println("testConTuttiVerdi-risposta#5: " + gioco.ultimaRisposta());
		assertEquals(10, gioco.maxTentativi());
		assertEquals(5, gioco.tentativiRimasti());
		assertEquals(5, gioco.tentativiEffettuati());
		assertEquals(4, gioco.dimensione());
		assertTrue(c5.equals(gioco.ultimoTentativo()));
		Risposta r5 = new Risposta(4);
		r5.setPiolo(0, PioloRisposta.NERO);
		r5.setPiolo(1, PioloRisposta.NERO);
		r5.setPiolo(2, PioloRisposta.VUOTO);
		r5.setPiolo(3, PioloRisposta.VUOTO);
		assertTrue(r5.equals(gioco.ultimaRisposta()));
		//------------
		Combinazione c6 = new Combinazione(4);
		c6.setPiolo(0, PioloDiGioco.VERDE);
		c6.setPiolo(1, PioloDiGioco.GIALLO);
		c6.setPiolo(2, PioloDiGioco.VERDE);
		c6.setPiolo(3, PioloDiGioco.VERDE);
		Risposta risposta6 = brain.calcolaRisposta(c6);
		Status status6 = gioco.registraMossa(c6,risposta6);
		assertEquals(Status.IN_CORSO, status6);
		//	System.out.println("testConTuttiVerdi-risposta#6: " + gioco.ultimaRisposta());
		assertEquals(10, gioco.maxTentativi());
		assertEquals(4, gioco.tentativiRimasti());
		assertEquals(6, gioco.tentativiEffettuati());
		assertEquals(4, gioco.dimensione());
		assertTrue(c6.equals(gioco.ultimoTentativo()));
		Risposta r6 = new Risposta(4);
		r6.setPiolo(0, PioloRisposta.NERO);
		r6.setPiolo(1, PioloRisposta.NERO);
		r6.setPiolo(2, PioloRisposta.NERO);
		r6.setPiolo(3, PioloRisposta.VUOTO);
		assertTrue(r6.equals(gioco.ultimaRisposta()));
		//------------
		Combinazione c7 = new Combinazione(4);
		c7.setPiolo(0, PioloDiGioco.VERDE);
		c7.setPiolo(1, PioloDiGioco.VERDE);
		c7.setPiolo(2, PioloDiGioco.VERDE);
		c7.setPiolo(3, PioloDiGioco.VERDE);
		Risposta risposta7 = brain.calcolaRisposta(c7);
		Status status7 = gioco.registraMossa(c7,risposta7);
		assertEquals(Status.VITTORIA, status7);
		//	System.out.println("testConTuttiVerdi-risposta#7: " + gioco.ultimaRisposta());
		assertEquals(10, gioco.maxTentativi());
		assertEquals(3, gioco.tentativiRimasti());
		assertEquals(7, gioco.tentativiEffettuati());
		assertEquals(4, gioco.dimensione());
		assertTrue(c7.equals(gioco.ultimoTentativo()));
		Risposta r7 = new Risposta(4);
		r7.setPiolo(0, PioloRisposta.NERO);
		r7.setPiolo(1, PioloRisposta.NERO);
		r7.setPiolo(2, PioloRisposta.NERO);
		r7.setPiolo(3, PioloRisposta.NERO);
		assertTrue(r7.equals(gioco.ultimaRisposta()));
	}
}