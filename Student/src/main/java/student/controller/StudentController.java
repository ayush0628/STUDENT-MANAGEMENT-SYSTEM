package student.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

import student.dao.StudentDao;
import student.model.Student;

@RestController
public class StudentController {
	
	@Autowired
	private StudentDao studentDao;
	
	//for Api
	
	@RequestMapping("/")
	@ResponseBody
	public List<Student> home(Model m)		//To save dynamic data in index page
	{
		List<Student> students = studentDao.getStudents();
		return students;
	}
	
	// show add_student_form
	@RequestMapping(value="/add-student", method=RequestMethod.POST)
	public void addStudent(@RequestBody Student student) {
		studentDao.createStudent(student);
		System.out.println(student);
	}	
	
	
	// Handle- add student form
	@RequestMapping(value = "/handle-student", method = RequestMethod.POST)
	public RedirectView handleStudent(@ModelAttribute Student student, HttpServletRequest request) {
		System.out.println(student);
		studentDao.createStudent(student);
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(request.getContextPath() + "/"); // Give context path means ->appname/ and for this pass
																// HttpServletRequest
		return redirectView;
	}

	
	
	
	//for spring mvc
	/*@RequestMapping("/")
	public String home(Model m) // To save dynamic data in index page
	{
		List<Student> students = studentDao.getStudents();
		m.addAttribute("student", students);
		return "index";
	}*/
	
	//show add_student_form
	/*@RequestMapping("/add-student")
	public String addStudent(Model m)
	{
		m.addAttribute("title", "Add Student");
		return "add_student_form";
	}	*/
	
	
	/*//Handle- add student form
	@RequestMapping(value="/handle-student", method=RequestMethod.POST)
	public RedirectView handleStudent(@ModelAttribute Student student, HttpServletRequest request)
	{
		System.out.println(student);
		studentDao.createStudent(student);
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(request.getContextPath() + "/");	//Give context path means ->appname/ and for this pass HttpServletRequest
		return redirectView;
	}
*/	
	/*//delete handler
	@RequestMapping("/delete/{studentId}")
	public RedirectView deleteStudent(@PathVariable("studentId") int studentId, HttpServletRequest request)
	{
		this.studentDao.deleteStudent(studentId);
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(request.getContextPath() + "/");	//Give context path means ->appname/ and for this pass HttpServletRequest
		return redirectView;
	}
	
	// update handler
	@RequestMapping("/update/{studentId}")
	public String updateForm(@PathVariable("studentId") int studentId, Model model) {
		Student student = this.studentDao.getStudent(studentId);
		model.addAttribute("student", student);
		return "edit_formjsp";
	}
*/	
	

}
