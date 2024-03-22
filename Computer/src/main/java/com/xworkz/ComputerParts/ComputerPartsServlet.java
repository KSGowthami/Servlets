package com.xworkz.ComputerParts;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/parts", loadOnStartup = 1)
public class ComputerPartsServlet extends HttpServlet {

    public ComputerPartsServlet() {
        System.out.println("No args computer");
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String model = req.getParameter("model");
        String brand = req.getParameter("brand");
        String color = req.getParameter("color");
        String computerType = req.getParameter("computerType");
        String disk = req.getParameter("disk");
        String ram = req.getParameter("ram");
        String processor = req.getParameter("processor");
        String generation = req.getParameter("generation");
        String mboard = req.getParameter("mboard");
        String cache = req.getParameter("cache");
        String price = req.getParameter("price");
        String qty = req.getParameter("qty");

        System.out.println(model + " " + brand + " " + color + " " + computerType + " " + disk + " " + ram + " " + processor + " " + generation + " " + mboard + " " + cache + " " + price + " " + qty);

        long convPrice = Long.valueOf(price);
        int convQty = Integer.parseInt(qty);

        long sum = convPrice * convQty;

        PrintWriter writer = resp.getWriter();

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
        writer.write("</ul>");
        writer.write("</div>");
        writer.write("</div>");
        writer.write("</nav>");
        writer.write("<div class=\"container\">");
        writer.write("<h1 class=\"text-success\">Total cost of the computer is: Rs" + sum + "</h1>");
        writer.write("</div>");
        writer.write("</body>");
        writer.write("</html>");
    }
}
