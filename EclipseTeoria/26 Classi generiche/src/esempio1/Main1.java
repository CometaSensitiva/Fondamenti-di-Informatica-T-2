package esempio1;

public class Main1 {

	public static void main(String[] args) {
		MyStack<Integer> stack = new MyStack<>();
		stack.push(18);
		stack.push(22);
		stack.push(34);
		while (!stack.isEmpty())
			try {
				System.out.println(stack.pop());
			} catch (Exception e) {
			}
		stack.push(18).push(22).push(34);
		while (!stack.isEmpty())
			try {
				System.out.println(stack.pop());
			} catch (Exception e) {
			}
	}

}
