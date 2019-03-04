package ua.compserv.javarevisited.jmh;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

import ua.compserv.javarevisited.StringExtensions;

public class StringExtensionsBenchmark {

    private static final String SOME_VALUE = "somevalue";

    @Benchmark
	public void testImplThroughLength() {
		boolean value = StringExtensions.isNotNullAndEmptyThroughLength(SOME_VALUE);
		if (!value);
	}
    
	@Benchmark
    public void testImplThroughIsEmpty2() {
    	boolean value = StringExtensions.isNotNullAndEmptyThroughIsEmpty2(SOME_VALUE);
    	if (!value);
    }
	
	@Benchmark
	public void testImplThroughIsEmpty() {
		boolean value = StringExtensions.isNotNullAndEmptyThroughIsEmpty(SOME_VALUE);
		if (!value);
	}
    
    public static void main(String[] args) throws RunnerException {
        Options opt = new OptionsBuilder()
                .include(StringExtensionsBenchmark.class.getSimpleName())
                .forks(1)
                .build();

        new Runner(opt).run();
    }


}
