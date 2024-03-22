package com.xworkz.ComputerParts;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/examFee",loadOnStartup = 3)
public class StudentExamFee extends HttpServlet {
	
	public StudentExamFee() {
		System.out.println("No args Constructor of Student exam fees");
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	String regno= req.getParameter("registerNumber");
	String name= req.getParameter("name");
	String course= req.getParameter("course");
	String semester= req.getParameter("semester");
	String paymentMode= req.getParameter("paymentMode");
	String feeAmount= req.getParameter("feeAmount");
	
	System.out.println(regno+" "+name+" "+course+" "+semester+" "+paymentMode+" "+feeAmount);
	
	int convSem=Integer.parseInt(semester);
	
	double convFeeAmt = Double.parseDouble(feeAmount);
	
	PrintWriter writer=resp.getWriter();
	
	resp.setContentType("text/html");
	
	 writer.write("<html>");
     writer.write("<head>");
     writer.write("<title>Recharge Application</title>");
     writer.write("<link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css\" integrity=\"sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH\" crossorigin=\"anonymous\">");
     writer.write("</head>");
     writer.write("<body>");
     writer.write("<nav class=\"navbar navbar-expand-lg navbar-dark bg-dark\">");
     writer.write("<div class=\"container-fluid\">");
     writer.write("<button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarNavDropdown\" aria-controls=\"navbarNavDropdown\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">");
     writer.write("<span class=\"navbar-toggler-icon\"></span>");
     writer.write("</button>");
     writer.write("<div class=\"collapse navbar-collapse justify-content-center\" id=\"navbarNavDropdown\">");
     writer.write("<ul class=\"navbar-nav\">");
     writer.write("<li class=\"nav-item\">");
     writer.write("<a class=\"nav-link active text-white me-3\" aria-current=\"page\" href=\"index.html\">Home</a>");
     writer.write("</li>");
     writer.write("<li class=\"nav-item\">");
     writer.write("<a class=\"nav-link text-white me-3\" href=\"computerParts.html\">Computer Parts</a>");
     writer.write("</li>");
     writer.write("<li class=\"nav-item\">");
     writer.write("<a class=\"nav-link text-white me-3\" href=\"TvRecharge.html\">TV Recharge</a>");
     writer.write("</li>");
     writer.write("<li class=\"nav-item\"><a class=\"nav-link text-white me-3\"href=\"TvRecharge.html\">TV Recharge</a></li>");
     writer.write("</li>");
     writer.write("<li class=\"nav-item\">");
     writer.write("</ul>");
     writer.write("</div>");
     writer.write("</div>");
     writer.write("</nav>");
     writer.write("<div class=\"container\">");
     writer.write("<h1 class=\"text-success mt-5\">Your Exam fees has paid Succesfully: Rs " + convFeeAmt + "</h1>");
     writer.write("<h3 class=\"text-success mt-4 text-black\">Your Exam Fees Details : </h3>");
     writer.write("<hp>Register ID: " +regno  + "</p>");
     writer.write("<p>NAme: " + name+ "</p>");
     writer.write("<p>Branch: " +  course+ "</p>");
     writer.write("<p>Semister " + semester + "</p>");
     writer.write("<p>Payment Mode " +  paymentMode+ "</p>");
     writer.write("</div>");
     writer.write("</body>");
     writer.write("</html>");
	
	
	}

}
