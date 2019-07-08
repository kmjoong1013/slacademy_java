package class_syntax;

public class This01 {
	public int stNum;
	public int edNum;
	public int sum() {
		int tot = 0;
		for (int i = stNum; i < edNum; i++) {
			tot = tot + i;
		}
		return tot;
	}
	public void setNum(int stNum, int edNum) {
		this.stNum=stNum;
		this.edNum=edNum;
	}
}
