package servlet;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import entity.Student;
import model.StudentModel;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/upload")
public class upload extends HttpServlet {

    public void doPost(HttpServletRequest req, HttpServletResponse res)
            throws IOException {
        req.setCharacterEncoding("utf-8");

        String usersString = req.getParameter("file-value");
        if (!"".equals(usersString)){
            StudentModel model = new StudentModel();
            JSONArray array = JSON.parseArray(usersString);
            for (Object o:array){
                Student user = JSON.toJavaObject(JSON.parseObject(o.toString()), Student.class);
                int insert = model.insert(user.getId(), user.getName(), user.getSex(),user.getAge(),
                        user.getGrade(), user.getScore(),user.getImage());
            }
            try {
                req.getRequestDispatcher("ListStudentServlet.do").forward(req, res);
            } catch (ServletException e) {
                e.printStackTrace();
            }
        }
    }
};
