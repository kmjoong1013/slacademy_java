package string_ex;

public class String05 {

	public static void main(String[] args) {
		String data = "kim;lee;choi;";
		
		int pos = data.indexOf(";");
		
		System.out.println(pos);
		
		int pos2 = data.indexOf(";", pos+1);
		System.out.println(pos2);
		
		int pos3,pos4=-1;
		//while문으로
		while(true) {
			pos3 = data.indexOf(";",pos4+1);
			
			if (pos3==-1) {
				break;
			}
			System.out.println(";위치 : "+pos3);
			
			pos4=pos3;
		}
	}
}
