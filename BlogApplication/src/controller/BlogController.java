package controller;

import java.io.IOException;
import java.sql.SQLException;
import java.time.LocalDate;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.BlogDao;
import model.Blog;

/**
 * Servlet implementation class BlogController
 */
@WebServlet(urlPatterns = {"/BlogController"})
public class BlogController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BlogController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Getting into Add New Blog");
		RequestDispatcher rd = this.getServletContext().getRequestDispatcher("/WEB-INF/views/blogListView.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Entering Do get post");
	    String blogtitle = request.getParameter("title");
	    String blogdescription = request.getParameter("message");
	    LocalDate postedOn = LocalDate.now();
	    
	    Blog blog = new Blog();
	    blog.setBlogtitle(blogtitle);
	    blog.setBlogdescription(blogdescription);
	    blog.setPostedon(postedOn);
	    
	    BlogDao blogdao = new BlogDao();
	    try 
	    {
			blogdao.insertblog(blog);
		} 
	    catch (SQLException e) 
	    {
			e.printStackTrace();
		}
	    response.sendRedirect("ViewAllBlogController");
	    
	}

}
