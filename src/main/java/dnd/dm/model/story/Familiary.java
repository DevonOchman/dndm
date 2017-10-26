package dnd.dm.model.story;

public enum Familiary {

	/**
	 * UNFAMILIAR with a subject, the character knows COMMON_KNOWLEDGE Facts.
	 */
	UNFAMILIAR(1),
	/**
	 * MODERATEly familiar with a subject, the character knows AVAILABLE_KNOWLEDGE Facts.
	 */
	MODERATE(2),
	/**
	 * SUBSTANTIALy familiar with a subject, the character knows UNCOMMON_KNOWLEDGE Facts.
	 */
	SUBSTANTIAL(3),
	/**
	 * INTIMATEly familiar with a subject, the character knows SECRET_KNOWLEDGE Facts.
	 */
	INTIMATE(4);
	
	private final int level;
	
	Familiary(int level){
		this.level = level;
	}
	
	public boolean isFamiliarWith(Fact fact){
		return this.getLevel() == fact.getRenown().getLevel();
	}

	public int getLevel() {
		return level;
	}
}
