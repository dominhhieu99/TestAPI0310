package dohieu.com.testapi0310.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RequestAfter {
    @SerializedName("counter")
    @Expose
    private String counter;
    @SerializedName("area_type")
    @Expose
    private String areaType;
    @SerializedName("parentCode")
    @Expose
    private String parentCode;

    public RequestAfter(String counter, String area_type, String parentCode) {
        this.counter = counter;
        this.areaType = area_type;
        this.parentCode = parentCode;
    }

    public String getCounter() {
        return counter;
    }

    public void setCounter(String counter) {
        this.counter = counter;
    }

    public String getAreaType() {
        return areaType;
    }

    public void setAreaType(String areaType) {
        this.areaType = areaType;
    }

    public String getParentCode() {
        return parentCode;
    }

    public void setParentCode(String parentCode) {
        this.parentCode = parentCode;
    }

}
