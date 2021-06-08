import java.io.*;

public class FibonacciCalculators {

	public static void main(String[] args) throws IOException {

		PrintWriter out1 = null;
		PrintWriter out2 = null;
		PrintWriter out3 = null;

		try {

			out1 = new PrintWriter("out1.txt");
			out1.println("Binary Fibonacci");
			out1.println("");
			out2 = new PrintWriter("out2.txt");
			out2.println("Binary Fibonacci");
			out2.println("");
			out3 = new PrintWriter("out3.txt");
			out3.println("Binary Fibonacci");
			out3.println("");
			// Binary Fibonacci

			for (int i = 1; i <= 10; i++) {
				int j = 5 * i;
				out1.println("Iteration Number : " + i);
				long BeginningTime = System.currentTimeMillis();
				out1.println((BinaryFibonacci(j)));
				long EndingTime = System.currentTimeMillis();
				long TimeElapsed = EndingTime - BeginningTime;
				out1.println("Time Elapsed: "+TimeElapsed+" ns");
				out2.println(j);
				out3.println(TimeElapsed);

			}
			out1.println("");
			out1.println("Linear Fibonacci");
			out1.println("");
			out2.println("");
			out2.println("Linear Fibonacci");
			out2.println("");
			out3.println("");
			out3.println("Linear Fibonacci");
			out3.println("");
			// Linear Fibonacci

			for (int i = 1; i <= 10; i++) {
				int j = 5 * i;
				out1.println("Iteration Number: " + i);
				long BeginningTime = System.nanoTime();
				long[] FibonacciNumber = LinearFibonacci(j);
				out1.println(FibonacciNumber[0] + " " + FibonacciNumber[1]);
				long TimeElapsed = System.nanoTime() - BeginningTime;

				out1.println("Time Elapsed: "+TimeElapsed + " ms");
				out2.println(j);
				out3.println(TimeElapsed);
			}

		} finally {
			out1.close();
			out2.close();
			out3.close();
		}
	}

	public static long BinaryFibonacci(int i) {
		if (i <= 1) {
			return i;
		} else {
			return BinaryFibonacci(i - 1) + BinaryFibonacci(i - 2);
		}
	}

	public static long[] LinearFibonacci(int i) {
		if (i <= 1) {
			long[] j = { i, 0 };
			return j;
		} else {
			long[] temp = LinearFibonacci(i - 1);
			long[] j = { temp[0] + temp[1], temp[0] };
			return j;
		}
	}
}
