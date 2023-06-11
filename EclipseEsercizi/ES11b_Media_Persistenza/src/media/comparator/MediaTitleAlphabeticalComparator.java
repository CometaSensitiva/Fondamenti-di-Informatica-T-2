package media.comparator;

import java.text.Normalizer;
import java.util.Comparator;

import media.Media;

public class MediaTitleAlphabeticalComparator implements Comparator<Media> {

	@Override
	public int compare(Media m1, Media m2) {
		String s1 = Normalizer.normalize(m1.getTitle().toLowerCase(), Normalizer.Form.NFD).replaceAll("\\s", "");
		String s2 = Normalizer.normalize(m2.getTitle().toLowerCase(), Normalizer.Form.NFD).replaceAll("\\s", "");
		return s1.compareTo(s2);
	}

}
