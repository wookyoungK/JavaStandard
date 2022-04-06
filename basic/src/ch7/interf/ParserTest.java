package ch7.interf;

interface Parseable {
	// ���� �м��۾��� �����Ѵ�.
	public abstract void parse(String fileName);
}

class ParserManager {
	// ����Ÿ���� Parseable�������̽��̴�.
	public static Parseable getParser(String type) {
		if (type.equals("XML")) {
			return new XMLParser();
		} else {
			Parseable p = new HTMLParser();
			return p;
			// return new HTMLParser();
		}
	}
}

class XMLParser implements Parseable {
	public void parse(String fileName) {
		/* ���� �м��۾��� �����ϴ� �ڵ带 ���´�. */
		System.out.println(fileName + "- XML parsing completed.");
	}
}

class HTMLParser implements Parseable {
	public void parse(String fileName) {
		/* ���� �м��۾��� �����ϴ� �ڵ带 ���´�. */
		System.out.println(fileName + "-HTML parsing completed.");
	}
}

class ParserTest {
	public static void main(String args[]) {

		Parseable parser = ParserManager.getParser("XML");
		// Parseable parser = new XMLParser();
		parser.parse("document.xml");
		parser = ParserManager.getParser("HTML");
		// Parseable parser = new HTMLParser(); parser.parse("document2.html");
	}
	// �Ʒ��������� �ٲ� �� �ִ�.
	/*
	 * Parseable parser = new XMLParser(); parser.parse("document.xml"); Parseable
	 * parser = new HTMLParser(); parser.parse("document2.html");
	 */
}
