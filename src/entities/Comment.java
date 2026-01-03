package entities;

public class Comment {
	private String text;

	@Override
	public String toString() {
		return text;
	}

	public Comment(String text) {
		this.text = text;
	}
	
	
	
}
