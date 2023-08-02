package telran.performance;

import java.util.Arrays;

import telran.text.*;

public class JoinStringsPerformanceAppl {

	private static final int N_STRINGS = 1000;
	private static final int N_RUNS = 1000;

	public static void main(String[] args) {
		var onString = new JoinStringsOnString();
		var onBuilder = new JoinStringsOnBuilder();
		var onStandard = new JoinStringsOnStandard();
		String[] strings = getBigArray();
		var onStringTest = new JoinStringsPerformanceTest("JoinStringsOnStringImplTest", N_RUNS, strings, onString);
		var onBuilderTest = new JoinStringsPerformanceTest("JoinStringsBuilderImplTest", N_RUNS, strings, onBuilder);
		var onStandardTest = new JoinStringsPerformanceTest("JoinStringsOnStandardImplTest", N_RUNS, strings,
				onStandard);

		onStringTest.run();
		onBuilderTest.run();
		onStandardTest.run();
	}

	private static String[] getBigArray() {
		String[] res = new String[N_STRINGS];
		Arrays.fill(res, "Don't Panic!");
		return res;
	}

}
