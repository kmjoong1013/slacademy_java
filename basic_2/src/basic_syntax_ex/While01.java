package basic_syntax_ex;

public class While01 {
	public static void main(String[] args) {
		int i=0;
		while (true) {
			i++;
			System.out.println(i);
			if (i>10) {
				break;
			}
		}
		i=0;
		while(i<10) {
			i++;
			System.out.println(i);
		}i=11;
		do {
			i++;
			System.out.println(i);
		}while(i<10);
	}
}
