package telran.performance;

public abstract class PerformanceTest {
	String testName;
	int nRuns;

	public PerformanceTest(String name, int nRuns) {
		super();
		this.testName = name;
		this.nRuns = nRuns;
	}

	protected abstract void runTest();

	public void run() {
		long timestamp = System.currentTimeMillis();
		for (int i = 0; i < nRuns; i++) {
			runTest();
		}
		timestamp = System.currentTimeMillis() - timestamp;
		System.out.println("Number of runs is: " + nRuns);
		System.out.println("Test name: " + testName);
		System.out.println("Running time was: " + timestamp + "ms");
		System.out.println("----------------");
	}
}
