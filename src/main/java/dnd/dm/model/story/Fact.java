package dnd.dm.model.story;

public class Fact {

	private FactRenown renown;

	private String fact;

	public FactRenown getRenown() {
		return renown;
	}

	public void setRenown(FactRenown renown) {
		this.renown = renown;
	}

	public String getFact() {
		return fact;
	}

	public void setFact(String fact) {
		this.fact = fact;
	}

	public Fact(FactRenown renown, String fact) {
		this.renown = renown;
		this.fact = fact;
	}
	
	public Fact(String fact) {
		this.renown = FactRenown.COMMON_KNOWLEDGE;
		this.fact = fact;
	}

}

enum FactRenown {
	/**
	 * COMMON_KNOWLEDGE is a level of renown for a fact where someone who is
	 * unfamiliar with the subject to know it.
	 */
	COMMON_KNOWLEDGE(1),
	/**
	 * AVAILABLE_KNOWLEDGE is a level of renown for a fact where someone who is
	 * moderately familiar with the subject would know.
	 */
	AVAILABLE_KNOWLEDGE(2),
	/**
	 * UNCOMMON_KNOWLEDGE is a level of renown for a fact where someone who is
	 * substantially familiar with the subject to know it.
	 */
	UNCOMMON_KNOWLEDGE(3),
	/**
	 * SECRET_KNOWLEDGE is a level of renown for a fact where only someone who
	 * is intimately familiar with the subject to know it.
	 */
	SECRET_KNOWLEDGE(4);
	
	private final int level;
	
	FactRenown(int level){
		this.level = level;
	}

	public int getLevel() {
		return level;
	}
}

