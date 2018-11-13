package Interceptor;

import java.util.LinkedHashMap;

public class ModelAndView {
    private LinkedHashMap<String, String> model = new LinkedHashMap<>();
    private Integer status = 200;

    public LinkedHashMap<String, String> getModel() {
        return model;
    }

    public void setModel(LinkedHashMap<String, String> model) {
        this.model = model;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
