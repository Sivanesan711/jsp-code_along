package dao;

import java.sql.SQLException;
import java.util.List;

import model.Blog;

public interface BlogDaoInterface {

	void insertblog(Blog blog) throws SQLException;
	Blog selectblog(int blogid);
	List<Blog> selectallblogs();
	boolean deleteblog(int blogid) throws SQLException, Exception;
	boolean updateblog(Blog blog) throws SQLException, Exception;
	
}
