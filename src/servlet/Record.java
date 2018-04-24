package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import util.Json;

/**
 * Servlet implementation class Record
 */
@WebServlet("/Record")
public class Record extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Record() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//String name = request.getParameter("name");
		//int lightz = request.getParameterValues(lightz);
		String starttime = request.getParameter("starttime");
		String endtime = request.getParameter("endtime");
		Boolean isParmExist = false;
		try{
			//if(!name.equals("")&&!starttime.equals("")&&!endtime.equals(""))
			if(!starttime.equals("")&&!endtime.equals(""))
				isParmExist = true;
		}catch (Exception e) {
			//空操作
		}
		if(isParmExist){
			//request.setAttribute("records", Json.getRecord(name,starttime,endtime));
		}else {
			request.setAttribute("records", Json.getAllRecords());
		}
		request.getRequestDispatcher("/query.jsp").forward(request,response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
