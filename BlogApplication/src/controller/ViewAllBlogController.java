package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.BlogDao;
import model.Blog;

/**
 * Servlet implementation class ViewAllBlogController
 */
@WebServlet("/ViewAllBlogController")
public class ViewAllBlogController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewAllBlogController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("VIEW ALL BLOG");
		System.out.println("GET ALL BLOG POST");
		BlogDao blogdao = new BlogDao();
		List<Blog> listblog = blogdao.selectallblogs();
		
		for(Blog bloglist: listblog)
		{
			System.out.println(bloglist.getBlogid());
			System.out.println(bloglist.getBlogtitle());
			System.out.println(bloglist.getBlogdescription());
			System.out.println(bloglist.getPostedon());
		}
		request.setAttribute("listblog", listblog);
		RequestDispatcher rd = this.getServletContext().getRequestDispatcher("/WEB-INF/views/blogView.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
