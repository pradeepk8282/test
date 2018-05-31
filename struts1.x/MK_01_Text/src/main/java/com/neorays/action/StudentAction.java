package com.neorays.action;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.neorays.dto.StudentTO;
import com.neorays.exception.PhoneNotFound;
import com.neorays.form.StudentForm;
import com.neorays.service.phoneService;

public class StudentAction extends Action {
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {

		try {
			StudentForm form2 = (StudentForm) form;
			StudentTO to = new StudentTO();
			to.setStudentname(form2.getStudentname());

			phoneService phoneService = new phoneService();
			/*ArrayList arlPhone = phoneService.getAllPhoneNumber(to);*/
			ArrayList arlPhone =phoneService.getAllPhoneNumber(to);
			arlPhone.add(to.getStudentname());
			request.setAttribute("ARLPHONE", arlPhone);
			return mapping.findForward("success");
		} catch (ArrayIndexOutOfBoundsException e) {
			throw new PhoneNotFound("No phones");
		}

	}

}
