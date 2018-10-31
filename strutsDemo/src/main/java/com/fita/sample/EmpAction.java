package com.fita.sample;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

public class EmpAction extends DispatchAction{
	EmployeeService service =new EmployeeService();	
	public ActionForward add(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {	
		
		EmpForm eForm =(EmpForm)form;
		if(eForm.getFirstName() !=null) {
			service.addEmployee(eForm.getFirstName(), eForm.getLastName(), eForm.getSalary());
		}
		List<Employee> list=service.listEmployees();
		request.setAttribute("empList", list);
		return mapping.findForward("success");
	}

	public ActionForward list(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {	
		List<Employee> list=service.listEmployees();
		request.setAttribute("empList", list);
		return mapping.findForward("success");
	}
}
