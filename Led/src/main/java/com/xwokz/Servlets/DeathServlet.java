package com.xwokz.Servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/ApplyDeath",loadOnStartup = 1)
public class DeathServlet extends HttpServlet {
	
	public DeathServlet() {
		System.out.println("no args constructor");
	}
	
		@Override
   		protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
        String name = request.getParameter("name");
        String deathDate = request.getParameter("deathDate");
        String age = request.getParameter("age");
        String cause = request.getParameter("cause");
        String gender = request.getParameter("gender");
        String deathPlace = request.getParameter("deathPlace");
        String address = request.getParameter("address");
        String relationPerson = request.getParameter("relationPerson");
        String regnum = request.getParameter("regnum");
        
        System.out.println(name + " " + deathDate + " " + age + " " + cause + " " + gender + " " + deathPlace + " " + address + " " + relationPerson + " " + regnum);
        
        PrintWriter writer = response.getWriter();
        response.setContentType("text/plain");
        writer.write("Your Death Certificate is under process.........");
    }
}
