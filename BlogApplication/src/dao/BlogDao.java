package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import model.Blog;
import utility.ConnectionManager;

public class BlogDao implements BlogDaoInterface{

	private final String INSERT_BLOG_SQL = "INSERT INTO BLOGDET VALUES(seq_blogdet.nextval,?,?,?)";
	private final String SELECT_ALL_BLOG = "SELECT * FROM BLOGDET";
	
	@Override
	public void insertblog(Blog blog) throws SQLException {
		
		try
		{
			Connection con = ConnectionManager.getConnection();
			PreparedStatement ps = con.prepareStatement(INSERT_BLOG_SQL);
			ps.setString(1, blog.getBlogtitle());
			ps.setString(2, blog.getBlogdescription());
			ps.setDate(3, java.sql.Date.valueOf(blog.getPostedon()));
			System.out.println(ps);
			ps.executeUpdate();
		}
		catch(SQLException e)
		{
			System.out.println(e);
		}
		
	}

	@Override
	public Blog selectblog(int blogid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Blog> selectallblogs() {
		Blog blog = null;
		List<Blog> listblog = new ArrayList<>();
		
		try
		{
			Connection con = ConnectionManager.getConnection();
			PreparedStatement ps = con.prepareStatement(SELECT_ALL_BLOG);
			System.out.println(ps);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next())
			{
				int id = rs.getInt("blogid");
				String blogtitle = rs.getString("blogtitle");
				String blogdescription = rs.getString("blogdescription");
				LocalDate postedOn = rs.getDate("postedOn").toLocalDate();
				
				blog = new Blog();
				blog.setBlogid(id);
				blog.setBlogtitle(blogtitle);
				blog.setBlogdescription(blogdescription);
				blog.setPostedon(postedOn);
				
				listblog.add(blog);
			}
		}
		catch(SQLException e)
		{
			System.out.println(e);
		}
		
		return listblog;
	}

	@Override
	public boolean deleteblog(int blogid) throws SQLException, Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateblog(Blog blog) throws SQLException, Exception {
		// TODO Auto-generated method stub
		return false;
	}

}
