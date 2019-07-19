package container_ex;

public class Frame02_exe {

	public static void main(String[] args) {
		Frame02 loginWin = new Frame02("로그인창");
		Frame02 chatWin = new Frame02("채팅");
		
		chatWin.setVisible(true);
		loginWin.setVisible(true);
	}
}
