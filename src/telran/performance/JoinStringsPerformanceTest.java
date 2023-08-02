package telran.performance;

import telran.text.JoinStrings;

public class JoinStringsPerformanceTest extends PerformanceTest implements JoinStrings {
	String[] strings;
	private JoinStrings joinStrings;

	public JoinStringsPerformanceTest(String testName, int nRuns, String[] strings, JoinStrings joinStrings) {
		super(testName, nRuns);
		this.strings = strings;
		this.joinStrings = joinStrings;
	}

	@Override
	public String join(String[] strings, String delimiter) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected void runTest() {
		joinStrings.join(strings, testName);
	}

}
