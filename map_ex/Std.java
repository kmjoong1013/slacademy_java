package map_ex;

public class Std {
	public String code;
	public String name;
	public int korScore;
	public int engScore;
	 
	
	public Std(String code, String name, int korScore, int engScore){
		this.code = code;
		this.name = name;
		this.korScore = korScore;
		this.engScore = engScore;
	}
	
	public void prnInfo1(){
		System.out.println("��ȣ:"+code + " �̸�:"+ name + " ��������:"+korScore + "��������"+engScore);
	}
	
}
