package ui.editors;

import media.*;

public class SongEditor extends MediaEditor {
	public Media create() {
		String titolo = getInput().readString("titolo");
		if (titolo == null)
			return null;
		int anno = getInput().readInteger("anno");
		if (anno == -1)
			return null;
		String cantante = getInput().readString("cantante");
		if (cantante == null)
			return null;
		int durata = getInput().readInteger("durata");
		if (durata == -1)
			return null;
		String genere = getInput().readString("genere");
		if (genere == null)
			return null;

		return new Song(titolo, anno, cantante, durata, genere);
	}
}
