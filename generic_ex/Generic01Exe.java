package generic_ex;

public class Generic01Exe {

	public static void main(String[] args) {
		Generic01<Integer> gen = new Generic01<Integer>(10);
		gen.prn();
		
		Generic01<String> gen2 = new Generic01<String>("ghdrlfehd");
		gen2.prn();
	}
}
