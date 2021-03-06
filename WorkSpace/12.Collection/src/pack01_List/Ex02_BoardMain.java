package pack01_List;

import java.util.ArrayList;
import java.util.List;

public class Ex02_BoardMain {
	public static void main(String[] args) {
		Board board = new Board("게시판제목1", "게시판 내용1");
		System.out.println(board.getTitle() + board.getContent());
		Board[] board2 = new Board[3];
		board2[0] = new Board("게시판제목2", "게시판 내용2");
		board2[1] = new Board("게시판제목3", "게시판 내용3");
		board2[2] = new Board("게시판제목4", "게시판 내용4");
		System.out.println(board2[0].getTitle() + board2[0].getContent());
		System.out.println(board2[1].getTitle() + board2[1].getContent());
		System.out.println(board2[2].getTitle() + board2[2].getContent());
		//게시글 하나를 추가 해보기 
		//new Board[3->4];
		//tempBoard[] = new Board[board2.length+1] 
		//한 사이즈 큰 임시 객체를 만들고
		//for문을 통해서 데이터를 복사하고 
		//새로 들어갈 내용을 입력
		System.out.println("==================================================");
		List<Board> boList = new ArrayList<Board>();
		boList.add(board2[0] );
		boList.add(board2[1] );
		boList.add(board2[2] );
		boList.add(new Board("추가된 내용 머리말", "추가된 내용 글"));
		//2건을 새로 입력하는데
		//1건은 add를 통해서 추가
		boList.add(new Board("추가추가", "추가내용"));//
		//1건은 add를 통해서 추가를 하는데 2번째에 추가를 해보세요.
		boList.add(2 , new Board("끼워넣기", "끼워넣기2"));
		//boList.remove(1);
		//boList.remove(board2[0]);
		for (int i = 0; i < boList.size(); i++) {
			System.out.println(boList.get(i).getTitle() + boList.get(i).getContent() );
		}
	}
}
