/**
 * Date: 30/01/2022
 * Author: Misita Sankhala (C0807324), Kishankumar Patel (C0805822), Suman Rani (C0796394)
 * 			Sonia (C0804808), Ramandeep Kaur(C0789784)
 * Description: This servlet gets username and password from login.jsp page and validate the credentials.
 * If credentials are right user gets redirected to another servlet and if credentials are wrong then an
 * error message is shown.
 */

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Validation
 */
public class Validation extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Validation() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		try {
			
			
			PrintWriter pw = res.getWriter();
			res.setContentType("text/html");
			String user=req.getParameter("username");
			String pass=req.getParameter("userpass");
			
			if(user.equals("Kishan") && pass.equals("kishan")) {
				Cookie ck=new Cookie("usrName",user);//creating cookie object  
			    res.addCookie(ck);//adding cookie in the response
			    HttpSession session=req.getSession();  
		        session.setAttribute("userName",user); 
				RequestDispatcher rd=req.getRequestDispatcher("Servlet2");  
		        rd.forward(req, res);
			}
			else {
				pw.println("<h4>Wrong Credentials</h4>");
				RequestDispatcher rd=req.getRequestDispatcher("/login.jsp");  
		        rd.include(req, res);
				pw.close();
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
		
		
	


