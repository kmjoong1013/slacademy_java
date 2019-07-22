package component_ex;

import java.awt.*;

public class Menu01 {

	public static void main(String[] args) {
		
		Frame frame = new Frame("메뉴 테스트");
		frame.setSize(300,200);
		
		MenuBar mb = new MenuBar();
		
		//파일 메뉴 만들기
		Menu fileMenu = new Menu("파일");
		
		MenuItem newFile = new MenuItem("새파일");
		fileMenu.add(newFile);
		
		fileMenu.add( new MenuItem("열기"));
		fileMenu.addSeparator();
		fileMenu.add( new MenuItem("닫기"));
		fileMenu.add( new MenuItem("저장"));
		fileMenu.add( new MenuItem("새 이름으로"));
		fileMenu.addSeparator();
		fileMenu.add( new MenuItem("출력"));
		fileMenu.addSeparator();
		fileMenu.add( new MenuItem("끝"));
		
		// 편집 메뉴 만들기
		Menu editMenu = new Menu("편집");
		
		editMenu.add(new MenuItem("취소"));
		editMenu.addSeparator();
		editMenu.add(new MenuItem("잘라내기"));
		editMenu.add(new MenuItem("복사하기"));
		editMenu.add(new MenuItem("붙이기"));   
		
		// 메뉴바에 메뉴들 추가.
		mb.add(fileMenu);
		mb.add(editMenu);
		
		frame.setMenuBar(mb);
		frame.setVisible(true);
	}
}
