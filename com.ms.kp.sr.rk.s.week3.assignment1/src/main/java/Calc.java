/**
 * Date: 30/01/2022
 * Author: Misita Sankhala (C0807324), Kishankumar Patel (C0805822), Suman Rani (C0796394)
 * 			Sonia (C0804808), Ramandeep Kaur(C0789784)
 * Description: This servlet gets student details and marks from a web page and calculate average marks,
 * minimum mark, maximum mark and grade of the student and send that all data to a webpage.
 */

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Calc
 */
public class Calc extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Calc() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String fname=req.getParameter("fname");
		String lname=req.getParameter("lname");
		String enrollnum=req.getParameter("enrollnum");
		Double c=Double.parseDouble(req.getParameter("c"));
		Double java=Double.parseDouble(req.getParameter("java"));
		Double net=Double.parseDouble(req.getParameter("net"));
		Double vb=Double.parseDouble(req.getParameter("vb"));
		Double dbms=Double.parseDouble(req.getParameter("dbms"));
		Double avg = (c+java+net+vb+dbms)/5;
		Double marks[] = new Double[] {c,java,net,vb,dbms};
		Double maxValue = marks[0]; 
	    for(int i=1;i < marks.length;i++){ 
	      if(marks[i] > maxValue){ 
	         maxValue = marks[i]; 
	      } 
	    }
	    Double minValue = marks[0]; 
	    for(int i=1;i < marks.length;i++){ 
	      if(marks[i] < minValue){ 
	         minValue = marks[i]; 
	      } 
	    }
	    String grade="0"; 
	    if(100>=avg && avg>=90){
	    	grade = "A+";
	    }
	    else if(89>=avg && avg>=80){
	    	grade = "A";
	    }
	    else if(79>=avg && avg>=75){
	    	grade = "B+";
	    }
	    else if(74>=avg && avg>=70){
	    	grade = "B";
	    }
	    else if(69>=avg && avg>=65){
	    	grade = "B-";
	    }
	    else if(64>=avg && avg>=60){
	    	grade = "C+";
	    }
	    else if(59>=avg && avg>=55){
	    	grade = "C";
	    }
	    else if(54>=avg && avg>=50){
	    	grade = "C-";
	    }
	    else if(49>=avg && avg>=40){
	    	grade = "D";
	    }
	    else if(39>=avg && avg>=0){
	    	grade = "F";
	    }
	    
	    
	    res.sendRedirect("final.jsp?avg="+avg+"&maxValue="+maxValue+"&minValue="+minValue+
	    		"&grade="+grade+"&fname="+fname+"&lname="+lname+"&enrollnum="+enrollnum);
	}

}
