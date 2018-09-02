package com.pagina.web.model;

import com.fasterxml.jackson.annotation.JsonView;
import com.pagina.web.jsonview.Views;

import java.util.List;

public class AjaxResponseBody {

    @JsonView(Views.Public.class)
    private String msg;
    @JsonView(Views.Public.class)
    private String code;
    @JsonView(Views.Public.class)
    private List<User> result;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public List<User> getResult() {
        return result;
    }

    public void setResult(List<User> result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "AjaxResponseResult [msg=" + msg + ", code=" + code + ", result=" + result + "]";
    }
}
