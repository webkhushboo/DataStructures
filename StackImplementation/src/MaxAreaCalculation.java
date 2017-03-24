import java.util.Stack;

public class MaxAreaCalculation {
	public static int top;
	static Stack<Integer> s = new Stack<Integer>();

	// The main function to find the maximum rectangular area under given histogram with n bars
	public static int getMaxArea(int hist[], int n) {
		// Create an empty stack. The stack holds indexes of hist[] array
		// The bars stored in stack are always in increasing order of their
		// heights.

		int max_area = 0; // Initalize max area
		
		// To store top of stack
		int area_with_top; // To store area with top bar as the smallest bar

		// Run through all bars of given histogram
		int i = 0;
		while (i < n) {
			// If this bar is higher than the bar on top stack, push it to stack

			if (s.empty() || hist[s.peek()] <= hist[i])
				s.push(i++);

			else {
				
				top = s.pop(); // pop the top

				// Calculate the area with hist[top] stack as smallest bar
				area_with_top = hist[top] * (s.empty() ? i : i - s.peek() - 1);

				// update max area, if needed
				if (max_area < area_with_top)
					max_area = area_with_top;
			}
		}

		// Now pop the remaining bars from stack and calculate area with every
		// popped bar as the smallest bar
		while (s.empty() == false) {
			top = s.pop();
			area_with_top = hist[top] * (s.empty() ? i : i - s.peek() - 1);

			if (max_area < area_with_top)
				max_area = area_with_top;
		}

		return max_area;
	}

	// Driver program to test above function
	public static void main(String[] args) {
		int hist[] = { 6, 2, 5, 4, 5, 1, 6 };
		int n = hist.length;
		System.out.println("Maximum area is " + getMaxArea(hist, n));
	}
}
