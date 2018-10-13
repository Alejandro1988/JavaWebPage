package com.pagina.action;

import com.opensymphony.xwork2.ActionSupport;
import com.pagina.bo.UserBo;

public class UserAction extends ActionSupport{
    //DI via Spring
    UserBo userBo;

    public String execute() throws Exception {

        userBo.printUser();
        return SUCCESS;

    }

    public UserBo getUserBo() {
        return userBo;
    }

    public void setUserBo(UserBo userBo) {
        this.userBo = userBo;
    }
}