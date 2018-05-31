package com.neorays.costumvalidation;

import java.io.Serializable;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.validator.Field;
import org.apache.commons.validator.Validator;
import org.apache.commons.validator.ValidatorAction;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;

public class sidValidator implements Serializable {
	public sidValidator() {
		System.out.println(this.getClass().getCanonicalName());
	}

	public static boolean validateSid(Object bean, ValidatorAction vaction,
			Field field, ActionMessages messages, Validator validator,
			HttpServletRequest request) {
		String sid = request.getParameter("sid");
		System.out.println(sid);

		if (sid != null || sid.length() != 0) {
			System.out.println("<-----inside if->" + sid);
			try {
				String sid1 = sid.substring(0, 4);
				System.out.println(sid1);
				String sid2 = sid.substring(4);
				System.out.println(sid2);
				int i = Integer.parseInt(sid2);
				if (sid1.equals("CLS@") != true) {
					// errors.add(field.getKey(),Resources.getActionError(request,
					// action, field));
					messages.add("sid", new ActionMessage("errors.sid"));
					return true;
				}

			} catch (Exception exception) {
				messages.add("sid", new ActionMessage("errors.sid"));
				return false;
			}

		} else {
			// errors.add(field.getKey(),Resources.getActionError(request,
			// action, field));
			messages.add("sid", new ActionMessage("errors.sid"));
			return false;
		}
		return true;

	}

}
