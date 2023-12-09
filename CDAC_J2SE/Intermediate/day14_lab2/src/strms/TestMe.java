package strms;

import java.util.Optional;
import java.util.stream.Stream;

public class TestMe {
	public static void main(String[] args) {
		Stream<String> stringStream = Stream.of("A1", "B", "C", "D");
	//	Stream<String> stringStream = Stream.of();
		Optional<String> result1 = stringStream.findFirst(); //deterministic
		System.out.println(result1.get());
		Optional<String> result2 = Stream.of("A1", "B", "C", "D").findAny(); //non-deterministic
		System.out.println(result2.get());
		stringStream.findAny();		//illegal state exc : strm alrdy closed!
	}

}
