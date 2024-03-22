package com.xwokz.Servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/ApplyVehicle",loadOnStartup = 1)
public class VehicleServlet extends HttpServlet {
	
	public VehicleServlet() {
		System.out.println("no args constructor");
	}
	
		@Override
  		protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
        String name = request.getParameter("name");
        String mobile = request.getParameter("mobile");
        String address = request.getParameter("address");
        String reqDate = request.getParameter("reqDate");
        String ExpectedDated = request.getParameter("ExpectedDated");
        String vehicalNo = request.getParameter("vehicalNo");
        String vname = request.getParameter("vname");
        String vehicle = request.getParameter("vehicle");
        String services = request.getParameter("services");
        
        System.out.println(name + " " + mobile + " " + address + " " + reqDate + " " + ExpectedDated + " " + vehicalNo + " " + vname + " " + vehicle + " " + services);
        
        PrintWriter writer = response.getWriter();
        response.setContentType("text/plain");
        writer.write("Your Vehicle service application is under process.................");
    }
}
