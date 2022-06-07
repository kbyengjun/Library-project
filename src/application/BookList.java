package application;

/**
 * 도서 정보를 가지고 있는 클래스 
 * 
 * 추가 방법 : 
 * new BookItem(임의 번호,"책 제목", "출판사", "저자", "장르", "예약 가능",Null ,Null, "책 줄거리", Null)
 * 
 * 참고 기능 : 
 * getCurrentAll()	-> 모든 도서 리턴
 * getCurrent() 	-> 첫번째 도서 리턴
 */
public class BookList {
	private BookItem[] item = new BookItem[] {
			new BookItem(
					1150,"왕좌의 게임",//수정완료
					"벚나무", "조지R.R.마틴",
					"판타지", "예약 가능",
					null, null,
					"판타지장르의 거장 조지R.R.마틴이 집필한 웨스테로스라는 가상의 대륙에서 펼쳐지는 판타지 이야기!",
					null),
			
	};
	
	public BookItem[] getCurrentAll() {
		return this.item;
	}
	
	public BookItem getCurrent() {
		return this.item[0];
	}
}
