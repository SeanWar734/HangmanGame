
public class WordLineConverter implements LineConverter<Word>{

	@Override
	public String toLine(Word word) {
		return String.format("%s\t%s",word.getWord(),word.getHint());
	}

	@Override
	public Word fromLine(String line) {
		String[] parts = line.split("\t");
		String word = parts[0];
		String hint = parts[1];
		return new Word(word,hint);
	}

	
}
