import java.io.*;

public class TailFibonacci {

	public static void main(String[] args) throws IOException {
		PrintWriter out1 = null;
		PrintWriter out2 = null;

		try {
			out1 = new PrintWriter("LinearOut_1.txt");
			out2 = new PrintWriter("LinearOut_2.txt");

			for (int i = 1; i <= 10; i++) {
				int j = 5 * i;
				out1.println("Iteration Number: " + i);
				long BeginningTime = System.nanoTime();
				out1.println((Tail_Fibonacci(j, 0, 1)));
				long TimeElapsed = System.nanoTime() - BeginningTime;
				out1.println("Time Elapsed: ");
				out1.println(TimeElapsed + "ns");
				out2.println(TimeElapsed);

			}
		} finally {
			out1.close();
			out2.close();
		}
	}

	public static long Tail_Fibonacci(long j, long x, long y) {

		if (j == 0) {
			return x;
		}
		if (j == 1) {
			return y;
		}
		return Tail_Fibonacci(j - 1, y, x + y);
	}
}
