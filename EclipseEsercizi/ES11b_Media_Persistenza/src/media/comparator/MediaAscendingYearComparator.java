package media.comparator;

import java.util.Comparator;

import media.Media;

public class MediaAscendingYearComparator implements Comparator<Media> {

	@Override
	public int compare(Media m1, Media m2) {
		return Integer.compare(m1.getYear(), m2.getYear());
	}
}
