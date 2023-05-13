package control;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.StudentModel;
import entity.Student;

@WebServlet(name = "/SearchStudent", urlPatterns = "/SearchStudent.do")
public class SearchServlet extends HttpServlet{
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // 得到传入参数：学生ID
        String id = request.getParameter("id");

        Integer studentId = Integer.valueOf(id);
        // 调用查询方法，得到学生数据
        StudentModel model = new StudentModel();

        Student student = model.load(studentId);

        // 将学生数据保存到request中
        request.setAttribute("student", student);
        // 转发到student.jsp
        request.getRequestDispatcher("studentquery.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        this.doGet(request, response);
    }

}