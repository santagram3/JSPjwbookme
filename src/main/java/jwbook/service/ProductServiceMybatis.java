package jwbook.service;

import java.util.List;

import jwbook.model.MyBatisConnectionFactory;
import jwbook.model.Product;
import jwbook.model.ProductDAO;

public class ProductServiceMybatis {
	//DAO생성
	//MyBatisConnectionFactory로 부터 sqlSession얻기
	ProductDAO productDAO 
	= new ProductDAO(MyBatisConnectionFactory.getSqlSessionFactory());
    Product product = new Product();

    public void create() {
    //Creat
    //2건을 입력한다.
    System.out.println("==INSERT==");
   // productDAO.insert(product);
    }
    
    
    //Read
    //입력한 리스트를 보여준다.
  //상품리스트 출력
    public List<Product> findAll(){
    List<Product> bookList = productDAO.selectAll();
    return bookList;
    }


	public Product find(String id) {
		return productDAO.selectById(id);
	}

    /*
    //Update
    System.out.println("");
    System.out.println("==UPDATE==");

    //ID 2번의 이름을 업데이트 한다.
    book.setId(2);
    book.setName("해저 2만리");
    bookDAO.update(book);

    //Read
    //변경한 ID 2번의 이름을 보여준다ㅏ.
    book = bookDAO.selectById(2);
    System.out.println("BOOK ID: "+book.getId());
    System.out.println("BOOK NAME: "+book.getName());

    //Delete
    System.out.println("");
    System.out.println("==DELETE==");

    //2번을 삭제한다.
    bookDAO.delete(2);

    //Read
    //전체 리스트를 보여준다.
    bookList.clear();
    bookList = bookDAO.selectAll();
    for(Book bookInfo: bookList){
        System.out.println("BOOK ID: "+bookInfo.getId());
        System.out.println("BOOK NAME: "+bookInfo.getName());
    }
  */
}
