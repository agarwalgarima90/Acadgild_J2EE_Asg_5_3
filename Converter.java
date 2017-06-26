package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Converter
 */
@WebServlet("/Converter")
public class Converter extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Converter() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//Get PrintWriter Obj
		PrintWriter out = response.getWriter();
		
		//Populate HTML Form
		response.setContentType("text/html");
		out.println("<html>");
		out.println("<head><title> Converter </title></head>");
		out.println("<body>");
		out.println("<form action=\"Converter\" method=\"post\" >");
		out.println("Currency in INR: <input type='text'/ name='curr'><br>");
		out.println("<input type=\"submit\" name=\"submit\" value=\"Convert\" />");
		out.println("</form");
		out.println("</body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		//Fetch inout text value from parameters.
		String currINR = request.getParameter("curr");
		out.println("<b> Input Currency: </b>" + currINR + " INR");
		
		//Convert String to Int
		int temp = Integer.parseInt(currINR);
		
		//Convert INR to USD considering 70 is the conversion rate.
		int currUSD = temp * 70;
		out.println("<br> <b> Output Currency:</b> " + currUSD + " USD");
	}

}
