package dnd.dm.model.story;

public class StoryBuilder {

	private Story story;

	public StoryBuilder() {
		story = new Story();
	}

	/**
	 * 
	 * @param targetArea
	 *            if null an Area is searched for within the story, with
	 *            locBefore as the search parameter.
	 * @param newLoc
	 *            Cannot be null.
	 * @param locBefore
	 */
	@SuppressWarnings("rawtypes")
	public void addLocation(AbstractArea targetArea, ILocation newLoc, ILocation locBefore) {
		if (newLoc == null)
			throw new IllegalArgumentException("newLoc cannot be null.");
		if (targetArea == null) {
			if (locBefore == null)
				throw new IllegalArgumentException("Both 'targetArea' and 'locBefore' cannot be null");
			targetArea = story.getAreaWith(locBefore);
			if (targetArea == null)
				throw new IllegalArgumentException("locBefore: " + locBefore + " is not part of any defined Area.");
		}
		if (locBefore == null) {
			targetArea.addFirstLocation(newLoc);
		} else {
			targetArea.addLocationAfter(locBefore, newLoc);
		}
	}

	/**
	 * 
	 * @param newArea
	 *            Cannot be null.
	 * @param areaBefore
	 */
	@SuppressWarnings("rawtypes")
	public void addAreaToRoot(AbstractArea newArea, AbstractArea areaBefore) {
		if (newArea == null)
			throw new IllegalArgumentException("newLoc cannot be null.");
		if (areaBefore == null)
			story.getRootArea().addFirstLocation(newArea);
		else
			story.getRootArea().addLocationAfter(areaBefore, newArea);
	}

}
