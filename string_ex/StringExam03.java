package string_ex;

public class StringExam03 {

	public static void main(String[] args) {
		/*
		 String data = "�̼���;100;������;98";
		 
		 ���ڿ� data���� ; �� �ش��ϴ� ��ġ�� ������ ����ؼ� �̸��� ������ �и��ϰ�
		 ������ �հ踦 ����ؼ� �Ʒ��� ���� ����Ͻÿ�.(for�� ���)
		 
		 �̼��� : 100
		 ������ : 98
		 �հ� : 198
		 */
		String data = "�̼���;100;������;98";
		int pos = 0; int pos2 = 0;
		int sum = 0; int startIndex = 0;
		
		while (true) {
			pos = data.indexOf(";",startIndex);
			pos2 = data.indexOf(";",pos+1);
			
			String name = data.substring(startIndex, pos);
			
			String scoreStr = "";
			if (pos2 == -1 ) {
				scoreStr = data.substring(pos+1);
			}else {
				scoreStr = data.substring(pos+1, pos2);
			}
			int score = Integer.parseInt(scoreStr);
			sum = sum + score;
			 System.out.println(name+":"+score);
			 startIndex = pos2+1;
			 
			 if(pos == -1 || pos2 == -1 ) {
				 break;
			 }
			
		}System.out.println("�հ�:"+ sum);
	}
}
