package servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import util.Analyse;
import util.Json;

@WebServlet("/Alarm")
public class Alarm extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Alarm() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	String name = request.getParameter("name");
    	ArrayList<entity.Alarm> alarms = new ArrayList<entity.Alarm>();
    	/**if (name.equals("all")) {
    		//分析温度数据
        	alarms.add(Analyse.TempAnalyse(Json.getRecord("tempz", "", "")));
        	//分析气体数据
        	alarms.add(Analyse.FireAnalyse(Json.getRecord("lightz", "", "")));
        	//分析火焰数据
        	alarms.add(Analyse.GasAnalyse(Json.getRecord("wetz", "", "")));
		}else if (name.equals("tempz")) {
			alarms.add(Analyse.TempAnalyse(Json.getRecord(name, "", "")));
		}else if (name.equals("lightz")) {
			alarms.add(Analyse.FireAnalyse(Json.getRecord(name, "", "")));
		}else if (name.equals("wetz")) {
			alarms.add(Analyse.GasAnalyse(Json.getRecord(name, "", "")));
		}**/
    	request.setAttribute("name", name);
    	request.setAttribute("alarms", alarms);
    	request.getRequestDispatcher("/alarm.jsp").forward(request,response);
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
