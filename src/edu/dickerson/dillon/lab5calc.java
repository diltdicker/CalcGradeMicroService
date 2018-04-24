package edu.dickerson.dillon;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class lab5calc
 */
@WebServlet(description = "calculate grade", urlPatterns = { "/lab5calc" })
public class lab5calc extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public lab5calc() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			String yearStr = request.getParameter("year");
			String subjectStr = request.getParameter("subject");
			System.out.println("year: " + yearStr + " subject: " + subjectStr);
			response.getWriter().append(CalcLogic.getService().calculateGrade(yearStr, subjectStr));
		} catch (Exception e) {
			response.getWriter().append(CalcLogic.error(e));
		}
	}

}
