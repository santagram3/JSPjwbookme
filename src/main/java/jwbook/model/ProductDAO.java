package jwbook.model;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

public class ProductDAO {
	//sqlsession 얻기
	//1.SqlSessionFactory객체선언
	private SqlSessionFactory sqlSessionFactory = null;
	 
	//2.생성시 sqlSessionFacotry 초기화
    public ProductDAO(SqlSessionFactory sqlSessionFactory){
        this.sqlSessionFactory = sqlSessionFactory;
    }
 
    public  List<Product> selectAll(){
        List<Product> list = null;
        //3.getConnection처럼 SqlSession 연결객체 얻기
        SqlSession session = sqlSessionFactory.openSession();
 
        try {
            list = session.selectList("product.selectAll");
        } finally {
            session.close();
        }
 
        return list;
    }
 /*
    public Product selectById(int id){
        Product product = null;
        SqlSession session = sqlSessionFactory.openSession();
        try {
            product = session.selectOne("product.selectById", id);
        } finally {
            session.close();
        }
 
        return product;
    }
 
    public int insert(Product product){
        int id = -1;
        SqlSession session = sqlSessionFactory.openSession();
 
        try {
            id = session.insert("product.insert", product);
        } finally {
            session.commit();
            session.close();
        }
 
        return id;
    }
 
    public void update(Product product){
 
        SqlSession session = sqlSessionFactory.openSession();
 
        try {
            session.update("product.update", product);
        } finally {
            session.commit();
            session.close();
        }
    }
 */
    /**
     * Delete an instance of book from the database.
     * @param id value of the instance to be deleted.
     */
  /*  public void delete(int id){
 
        SqlSession session = sqlSessionFactory.openSession();
 
        try {
            session.delete("product.delete", id);
        } finally {
            session.commit();
            session.close();
        }
    }
   */
}
