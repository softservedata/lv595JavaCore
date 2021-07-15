package edu.homework11.ExceptionsPractical;

public enum Type {
	Tulips("tulip"), Lilies("lilie"), Orchid("orchid"), Roses("rose");

	private String type;

	private Type(String type) {
		this.type = type;
	}

	public String getType() {
		return type;
	}

}
