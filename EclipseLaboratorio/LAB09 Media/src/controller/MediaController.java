package controller;

import media.Media;
import media.collection.MediaCollection;
import media.filters.Filter;

public class MediaController {
	private MediaCollection allMedias = null;

	public MediaController() {
		this.allMedias = new MediaCollection();
	}

	public boolean add(Media m) {
		if (allMedias.indexOf(m) == -1) {
			allMedias.add(m);
			return true;
		}
		return false;

	}

	public boolean remove(Media m) {
		if (allMedias.indexOf(m) != -1) {
			allMedias.remove(allMedias.indexOf(m));
			return true;
		}
		return false;

	}

	public MediaCollection getAll() {
		MediaCollection copy = new MediaCollection(allMedias.size());
		for (int i = 0; i < allMedias.size(); i++) {
			copy.add(allMedias.get(i));
		}
		return copy;
	}

	public MediaCollection find(Filter f) {
		MediaCollection result = new MediaCollection();
		for (int i = 0; i < allMedias.size(); i++) {
			Media media = allMedias.get(i);
			if (f.filter(media)) {
				result.add(media);
			}
		}
		return result;
	}
}
