package com.xwokz.Servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/ApplyGym" ,loadOnStartup = 1)
public class GymServlet extends HttpServlet {
	
	public GymServlet() {
		System.out.println("no args constructor");
	}
   @Override
   protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
        String name = request.getParameter("name");
        String dob = request.getParameter("dob");
        String phone = request.getParameter("phone");
        String address = request.getParameter("address");
        String gender = request.getParameter("gender");
        String duration = request.getParameter("duration");
        
        System.out.println(name + " " + dob + " " + phone + " " + address + " " + gender + " " + duration);
        
        PrintWriter writer = response.getWriter();
        response.setContentType("text/plain");
        writer.write("Your Gym service application is under process.....................");
    }
}
