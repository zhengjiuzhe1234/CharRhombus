package t10;
public class CharRhombus {
	public static void main(String[] args) {
		method();
	}

	public static void kongge(int num) {
		for (int i = 0; i < num; i++) {
			System.out.print(" ");
		}
	}

	public static void zimu(int num, String ch) {
		for (int i = 0; i < num; i++) {
			System.out.print(ch);
		}
	}

	public static void result(String[] list, int h) {
		for (int j = h, m = 0; j >= 0; j--) {
			for (int i = 0; i < 6; i++) {
				kongge(j);
				zimu(m * 2 + 1, list[m]);
				kongge(4);
				kongge(j);
			}
			System.out.println();
			m++;
		}
		for (int j = 1, m = 3; m >= 0; m--, j++) {
			for (int i = 0; i < 6; i++) {
				kongge(j);
				zimu(m * 2 + 1, list[m]);
				kongge(4);
				kongge(j);
			}
			System.out.println();
		}
	}

	public static void method() {
		String[] list = { "A", "B", "C", "D", "E" };
		int h = 4;
		for (int i = 0; i < 2; i++) {
			result(list, h);
			System.out.println();
			System.out.println();
		}
	}
}