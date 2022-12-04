package ch21;



public class ObjectCopyTest {

	public static void main(String[] args) {
		
		
Book[] library = new Book[5];
Book[] copyLibrary = new Book[5];
	
		
		library[0] = new Book("태백산맥1", "조정래");
		library[1] = new Book("태백산맥2", "조정래");
		library[2] = new Book("태백산맥3", "조정래");
		library[3] = new Book("태백산맥4", "조정래");
		library[4] = new Book("태백산맥5", "조정래");
		
		
		copyLibrary[0] = new Book();
		copyLibrary[1] = new Book();
		copyLibrary[2] = new Book();
		copyLibrary[3] = new Book();
		copyLibrary[4] = new Book();
		
		for(int i = 0; i < library.length; i++) {
			copyLibrary[i].setAuthor(library[i].getAuthor());
			copyLibrary[i].setTitle(library[i].getTitle());

			
		} // 깊은 복사
		
		
//		System.arraycopy(library, 0, copyLibrary, 0, 5); //라이브러리에서 0부터 카피라이트에 0부터 5개 복사
		// 얕은 복
//		System.out.println("==== library ===");
//		for(Book book : library) {
//			System.out.println(book);
//			book.showInfo();
//			}
//		
//		System.out.println("=== copy library ===");
//		for(Book book : copyLibrary) {
//			System.out.println(book);
//			book.showInfo();
//			}             
		
		library[0].setAuthor("박완서");
		library[0].setTitle("나목");
		
		System.out.println("==== library ===");
		for(Book book : library) {
			System.out.println(book);
			book.showInfo();
			}
		
		System.out.println("=== copy library ===");
		for(Book book : copyLibrary) {
			System.out.println(book);
			book.showInfo();
			}
	
	}

}
