package control;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.StudentModel;
import entity.Student;

@WebServlet(name = "/showStudent", urlPatterns = "/showStudent.do")
public class ShowStudentServlet extends HttpServlet{
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// �õ����������ѧ��ID
		String id = request.getParameter("id");
		if (null==id)
		{
			request.setAttribute("error", "û�и�ѧ����");
			request.getRequestDispatcher("error.jsp").forward(request, response);
			return ;
		}
		Integer studentId = Integer.valueOf(id);
		// ���ò�ѯ�������õ�ѧ������
 		StudentModel model = new StudentModel();

		Student student = model.load(studentId);
		if (null==student)
		{
			request.setAttribute("error", "û��ָ����ŵ�ѧ����¼");
			request.getRequestDispatcher("error.jsp").forward(request, response);
			return ;
		}
		// ��ѧ�����ݱ��浽request��
		request.setAttribute("student", student);
		// ת����student.jsp
		request.getRequestDispatcher("studentshow.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doGet(request, response);
	}

}
