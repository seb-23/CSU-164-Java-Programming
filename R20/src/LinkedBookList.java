

public class LinkedBookList {

	private BookNode head;
	private int size;
	
	public LinkedBookList(){
		head = null;
		size = 0;
	}
	
	//returns size of the list
	public int size(){
		return size;
	}
	
	//IMPLEMENT -- adds a book to the end of the linked list
	public void add(Book b){
		BookNode C = null;
		BookNode curr = null;
		
	
		if (head == null) {
			C = new BookNode(b);
			head = C;
			size++;
			return;
			//System.out.println(head + " F ");
		
		}
		size++;
		
		for (curr = head; curr.getNext() != null; curr = curr.getNext()) {
		}

		C = new BookNode(b);
		curr.setNext(C);

		
//		if (head.getNext()==null) {
//			BookNode CD = new BookNode(b);
			
//			return;
			

//		}
		//System.out.println(size);
		
		
		//new BookNode(b, C).getNext();
		//System.out.println(D);
		
		return;
	}
	
	//IMPLEMENT -- adds a book at the specific index, 
	//  or at the end if index is greater than size
	public void add(Book b, int index){	
		BookNode C = null;
		BookNode curr = null;
		int i = 0;
		
		if (index >= size) {
				add(b);
		}
		

		for (curr = head; curr.getNext() != null; curr = curr.getNext()) {
			System.out.println(curr);
			C = curr;
			i++;
			
			if (i==index) {
				C.setNext(new BookNode(b, C.getNext()));
				size++;		
			}

		}
								
		return;
	}
	
	//IMPLEMENT -- removes a book and returns it, or 
	//	returns null if book is not present
	public Book remove(Book b){
		BookNode curr = null;

		int i = 0;


		for (curr = head; curr.getNext() != null; curr = curr.getNext()) {
			i++;
			if (curr.getBook().equals(b)) {
				System.out.println(i);
				remove(i-1);
//				curr.setNext(curr.getNext().getNext());
				//curr.setBook(curr.getNext().getBook());

				
			}


		}
		
		return null;
		
		
		

			
		
	}

	//IMPLEMENT -- removes a book at a specific index and returns it, 
	//	or returns null if index is not present
	public Book remove(int index){

		if (index<0 || index >= size) {
			return null;
		}
	    if (index == 0) {
	        // special case: removing first element
	        head = head.getNext();
	    } else {
	        // removing from elsewhere in the list
	        BookNode current = head;
	        for (int i = 0; i < index - 1; i++) {
	            current = current.getNext();
	        }
	        current.setNext(current.getNext().getNext());
	    }
	    size--;
		return null;
	}
	
	//IMPLEMENT -- returns the total number of pages in the linked list
	public int totalPages(){
		int total = 0;
		for (int i = 0; i<size; i++) {
			total += head.getNumPages();
			head.getNext();
		}

		return total;
	}
	

        public String toString()
        {
                String res = "";
                for (BookNode pos = head; pos != null; pos = pos.getNext()) {
                        if (pos.getBook() == null) {
                                res += "null";
                        } else {
                                res += pos.getBook();
                        }

                        if (pos.getNext() != null) res += "\n";
                }
                return res;
        }

}




