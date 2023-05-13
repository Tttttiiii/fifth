package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.sun.xml.internal.bind.v2.model.core.ID;
import dbutil.Dbconn;
import entity.Student;

public class StudentModel {
	private static PreparedStatement ps;
	private static ResultSet rs;
	static Dbconn s=new Dbconn();

	public List search(){
		List studentlist = null;
		String sql = "select * from student";
		Connection conn=null;
		try {
			conn=s.getConnection();
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			studentlist = new ArrayList();
			while(rs.next()){
				Student student = new Student();
				student.setId(rs.getInt("id"));
				student.setName(rs.getString("name"));
				student.setSex(rs.getString("sex"));
				student.setAge(rs.getInt("age"));
				student.setGrade(rs.getString("grade"));
				student.setScore(rs.getFloat("score"));
				student.setImage(rs.getString("image"));
				studentlist.add(student);
			}
			return studentlist;

		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			s.closeAll(conn,ps,rs);
		}
		return studentlist;
	}
	public Student load(Integer id) {
		Student student = null; 
		
		String sql = "select * from student  where student.id = ? ";
        try {
        	Connection conn=s.getConnection();	
        	ps = conn.prepareStatement(sql);
        	ps.setInt(1, id.intValue());
            
            rs = ps.executeQuery();
            
            if(rs.next()){
            	student = new Student();
            	student.setId(rs.getInt("id"));
            	student.setName(rs.getString("name"));
            	student.setSex(rs.getString("sex"));
            	student.setAge(rs.getInt("age"));
            	student.setGrade(rs.getString("grade"));
            	student.setScore(rs.getFloat("score"));
				student.setImage(rs.getString("image"));
             }
            s.closeAll(conn,ps,rs); 
         } catch (Exception e) {
            e.printStackTrace();
        }
		return student;
	}
	public int update(int id,String name,String sex,int age,String grade,float score,String image){
		int a=0;
		try {
			Connection conn=s.getConnection();
			String sql="update student set name=?,sex=?,age=?,grade=?,score=?,image=? where id=?";
			ps=conn.prepareStatement(sql);
			ps.setInt(7, id);
			ps.setString(1, name);
			ps.setString(2, sex);
			ps.setInt(3,age);
			ps.setString(4,grade);
			ps.setFloat(5,score);
			ps.setString(6,image);

			a=ps.executeUpdate();
			s.closeAll(conn,ps,rs);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return a;
	}
	public int insert(int id,String name,String sex,int age,String grade,float score,String image ){
		int a=0;
		try {
			Connection conn=s.getConnection();
			String sql="insert student values(?,?,?,?,?,?,?)";
			ps=conn.prepareStatement(sql);
			ps.setInt(1, id);
			ps.setString(2, name);
			ps.setString(3, sex);
			ps.setInt(4,age);
			ps.setString(5,grade);
			ps.setFloat(6,score);
			ps.setString(7,image);
			a=ps.executeUpdate();
			s.closeAll(conn,ps,rs);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return a;
	}	
	public int delete(int id){
		int a=0;
		try { 
			Connection conn=s.getConnection();
			String sql="delete from student where student.id=?";
			ps=conn.prepareStatement(sql);
			ps.setInt(1, id);
			a=ps.executeUpdate();
			s.closeAll(conn,ps,rs);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return a;
	}

	public int getStudent(int id){
		int a=0;
		try {
			Connection conn=s.getConnection();
			String sql="select * from student where student.id=?";
			ps=conn.prepareStatement(sql);
			ps.setInt(1, id);
			a=ps.executeUpdate();
			s.closeAll(conn,ps,rs);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return a;
	}
	public int addImage(int id,String image){
		int a=0;
		try {
			Connection conn=s.getConnection();
			String sql="update student set image=? where id = ?";
			ps=conn.prepareStatement(sql);
			ps.setInt(2, id);
			ps.setString(1,image);
			a=ps.executeUpdate();
			s.closeAll(conn,ps,rs);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return a;
	}
	//获取单个学生对象
	/*public static Student getStudent(int id) {
		Student stu = new Student();
		String sql = "select * from student where id=?";
		Connection conn=null;
		try {
			conn=s.getConnection();
			ps = conn.prepareStatement(sql);
			ps.setInt(1, id);
			rs = ps.executeQuery();
			if (rs.next()) {
				stu.setId(rs.getInt("id"));
				stu.setName(rs.getString("name"));
				stu.setSex(rs.getString("sex"));
				stu.setAge(rs.getInt("age"));
				stu.setGrade(rs.getString("grade"));
				stu.setScore(rs.getFloat("score"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			s.closeAll(conn,ps,rs);
		}
		return stu;
	}
	//查询功能，根据模糊查询学号返回所有学生信息
	public static List<Student> getStudentList(int id) {
		Connection conn = null;

		List<Student> allStudent = new ArrayList<>();
		try {
			conn=s.getConnection();
			ps = conn.prepareStatement("select * from stuno where id like ?");
			ps.setString(1, "%" + id + "%");
			rs = ps.executeQuery();
			while (rs.next()) {
				Student stu = new Student();
				stu.setId(rs.getInt(1));
				stu.setName(rs.getString(2));
				stu.setSex(rs.getString(3));
				stu.setAge(rs.getInt(4));
				stu.setGrade(rs.getString(5));
				stu.setScore(rs.getFloat(6));

				allStudent.add(stu);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return allStudent;
	}*/


}
