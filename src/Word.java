
public class Word {

	private String word;
	private String hint;
	
	
	
//GETTERS AND SETTERS
	public String getWord() {
		return word;
	}
	public void setWord(String word) {
		this.word = word;
	}
	public String getHint() {
		return hint;
	}
	public void setHint(String hint) {
		this.hint = hint;
	}
	
	
	
//CONSTRUCTOR
	public Word(String word, String hint) {
		this.word = word;
		this.hint = hint;
	}
	
	
	
	public Word() {
	}
	
	//TOSTRING
	@Override
	public String toString() {
		return String.format("%s:%s",word,hint);
	}
	
}
