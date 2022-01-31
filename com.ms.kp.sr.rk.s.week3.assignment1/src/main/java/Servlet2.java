/**
 * Date: 30/01/2022
 * Author: Misita Sankhala (C0807324), Kishankumar Patel (C0805822), Suman Rani (C0796394)
 * 			Sonia (C0804808), Ramandeep Kaur(C0789784)
 * Description: This servlet get session details and display it on webpage and when clicked the button
 * it redirects to a web form.
 */

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Servlet2
 */
public class Servlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Servlet2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		res.setContentType("text/html");  
	    PrintWriter pw = res.getWriter();  
	          
	    String user=req.getParameter("username");  
	    pw.print("Welcome "+user);
	    HttpSession session=req.getSession(false);  
        String u=(String)session.getAttribute("userName");  
        pw.print("<br>Hello "+u);
	    pw.print("<br>This is servlet2");
	    pw.println("<br><br><form action='StudentDetails.jsp' method='post'>");
	    pw.println("<input type='submit' value='Click To Enter Student Detail'/>");
	}

}
