package com.neorays.service;

import java.util.ArrayList;

import com.neorays.DAO.PhoneDAO;
import com.neorays.dto.StudentTO;

public class phoneService {
	public phoneService() {
		System.out.println(this.getClass().getCanonicalName());
	}

	public ArrayList getAllPhoneNumber(StudentTO pStudentTo)
			throws ArrayIndexOutOfBoundsException {
		String strStudentName = pStudentTo.getStudentname();
		PhoneDAO dao = new PhoneDAO();
		String PHONE=dao.getphonebyname(strStudentName);
		ArrayList arlPhoneNumbers = new ArrayList();
		arlPhoneNumbers.add(PHONE);
		if (arlPhoneNumbers.size() == 0) {
			throw new ArrayIndexOutOfBoundsException();
		} else
			return arlPhoneNumbers;
	}
}
