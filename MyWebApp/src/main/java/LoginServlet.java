import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.*;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String uname=request.getParameter("userLogin");
		String stuname=request.getParameter("userName");
		String uphone=request.getParameter("userPhone");
		String uFees=request.getParameter("userFees");
		out.println("<table>");
		out.println("<tr>");
		out.println("<td>User Name");
		out.println("<td>"+uname);
		out.println("</tr>");
		out.println("<tr>");
		out.println("<td>Student Name");
		out.println("<td>"+stuname);
		out.println("</tr>");
		out.println("<tr>");
		out.println("<td>User Phone");
		out.println("<td>"+uphone);
		out.println("</tr>");
		out.println("<tr>");
		out.println("<td>User Fees");
		out.println("<td>"+uFees);
		out.println("</tr>");
		out.println("</table>");
		
		
	}

}
