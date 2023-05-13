package control;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.StudentModel;

@WebServlet(name = "/doupdateServlet", urlPatterns = "/DoUpdatStudenteservlet.do")
public class DoUpdateservlet extends HttpServlet {


	public DoUpdateservlet() {
		super();
	}


	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	       this.doPost(request, response);
	}


	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("gbk");
 		int id = Integer.parseInt(request.getParameter("id"));
 		String name = request.getParameter("name");
		String sex = request.getParameter("sex");
		int age = Integer.parseInt(request.getParameter("age"));
		String grade = request.getParameter("grade");
		float score = Float.parseFloat(request.getParameter("score"));
		String image = request.getParameter("image");
		
 		StudentModel model = new StudentModel();

		model.update(id, name, sex, age, grade, score,image);
		response.sendRedirect("ListStudentServlet.do");
	}

}
