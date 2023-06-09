package com.entelgy.pe.app.model.response;

import com.entelgy.pe.app.model.ObjetoBase;

public class DummyResponse extends ObjetoBase {


    private String resp1;
    private String resp2;


    public DummyResponse() {
    }

    public DummyResponse(String resp1, String resp2) {
        this.resp1 = resp1;
        this.resp2 = resp2;
    }

    public String getResp1() {
        return resp1;
    }

    public void setResp1(String resp1) {
        this.resp1 = resp1;
    }

    public String getResp2() {
        return resp2;
    }

    public void setResp2(String resp2) {
        this.resp2 = resp2;
    }
}
