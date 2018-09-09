

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class MyServlet
 */
@WebServlet("/MyServlet")
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

        PrintWriter out = response.getWriter();

		
		
		/*
		 * Context path 
		 */
          
        out.append("<h1>This is my JavaEE Servlet at " + request.getContextPath() + "</h1>");
        
        

        /*
         * request Headers
         */
        out.append("<h2> Headers </h2>");

        Enumeration ee = request.getHeaderNames();
        while (ee.hasMoreElements()) {
            String name = (String) ee.nextElement();
            out.println("<p> Header: " + name + " = " + request.getHeader(name) + "<p>");
        }

         /* 
         * request Parameters
         */
        out.append("<h2> Parameters </h2>");
        ee = request.getParameterNames();
        while (ee.hasMoreElements()) {
            String name = (String) ee.nextElement();
            out.println("<p> Parameter: " + name + " = " + request.getParameter(name) + "<p>");
        }
        


        /*
         * Session handling
         */
        out.append("<h2> Sessions </h2>");
        out.println("This section deals with Session handling <br>");
        HttpSession session = (HttpSession) request.getSession();

        String first = "John E", last = "Sampleman", tmp;

        session.setAttribute("Firstname", first);
        session.setAttribute("Lastname", last);

        out.println("<p> The entered session attributes are:<p>");

        ee = (Enumeration) session.getAttributeNames();
        while (ee.hasMoreElements()) {

            String att = (String) ee.nextElement();
            tmp = (String) session.getAttribute(att);
            out.println(att + "= " + tmp + "<br>");
        }

        /*
         * Utilisation de Cookies
         */

        out.append("<h2> Cookies </h2>");
        Cookie cook = new Cookie("myTestCookies", "test-cookie-from-javaEE");

        cook.setMaxAge(10000); //Max Age in Sec
        response.addCookie(cook);
        out.println("<p>Cookie written <p>");
        
        
        /*
         * Close body and html rags
         */
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
