package com.xworkz.ComputerParts;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/recharge", loadOnStartup = 1)
public class TvRechargeServlet extends HttpServlet {

    public TvRechargeServlet() {
        System.out.println("Tv recharge No args constructor");
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String cid = req.getParameter("cid");
        String vendor = req.getParameter("vendor");
        String rechargeType = req.getParameter("rechargeType");
        String amount = req.getParameter("amount");

        System.out.println(cid + " " + vendor + " " + rechargeType + " " + amount);

        long convAmt = Long.parseLong(amount);

        resp.setContentType("text/html");

        PrintWriter writer = resp.getWriter();

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
        writer.write("</ul>");
        writer.write("</div>");
        writer.write("</div>");
        writer.write("</nav>");
        writer.write("<div class=\"container\">");
        writer.write("<h1 class=\"text-success mt-5\">Your Recharge has successful: Rs " + convAmt + "</h1>");
        writer.write("<h3 class=\"text-success mt-4 text-black\">Your Recharge Details : </h3>");
        writer.write("<hp>Customer ID: " + cid + "</p>");
        writer.write("<p>Vendor: " + vendor + "</p>");
        writer.write("<p>Recharge Type: " + rechargeType + "</p>");
        writer.write("<p>Recharge Amount: Rs " + convAmt + "</p>");
        writer.write("</div>");
        writer.write("</body>");
        writer.write("</html>");
    }
}
