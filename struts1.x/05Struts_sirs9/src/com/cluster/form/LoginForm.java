package com.cluster.form;

import org.apache.struts.validator.ValidatorForm;

public class LoginForm extends ValidatorForm {
    
    private String sid;
    
    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }
 
    

}
