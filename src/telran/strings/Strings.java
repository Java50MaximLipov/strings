package telran.strings;

public class Strings {
	static public String javaVariable() {
		return "[a-zA-Z$][\\w$]*|_[\\w$]+";
	}

	static public String zero_300() {
		return "[1-9]\\d?|[1-2]\\d\\d|300|0";
	}

	static public String ipV4Octet() {
		// 0 - 255 with possible leading zeros
		return "(\\d\\d?|[0-1]\\d\\d|2([0-4]\\d|5[0-5]))";
	}

	static public String ipV4Address() {
		String octet = ipV4Octet();
		return String.format("%1$s(\\.%1$s){3}", octet);
	}

//	HW-21
	static public String arithmeticExpression() {
		String operand = operand();
		String operator = operator();
//		return String.format("%1$s(?:%2$s%1$s)*", operand, operator);
		return String.format("%1$s(?:%2$s%1$s)*", operand, operator);
	}

	static private String operand() {
//		return "\\s?((\\d*(?:\\.\\d*)?)|([a-zA-Z$][\\w$]*|_[\\w$]+))\\s?";
		return "\\s?((\\d*(?:\\.\\d*)?)|([a-zA-Z$][\\w$]*|_[\\w$]+))\\s?";
	}

	static private String operator() {
		return "[+\\-*/]";
	}
}