package dohieu.com.testapi0310.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class RespondAfter {

    @SerializedName("cost")
    @Expose
    private String cost;
    @SerializedName("counter")
    @Expose
    private String counter;
    @SerializedName("listArea")
    @Expose
    private List<ListArea> listArea = null;

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public String getCounter() {
        return counter;
    }

    public void setCounter(String counter) {
        this.counter = counter;
    }

    public List<ListArea> getListArea() {
        return listArea;
    }

    public void setListArea(List<ListArea> listArea) {
        this.listArea = listArea;
    }

    public class ListArea {

        @SerializedName("id")
        @Expose
        private String id;
        @SerializedName("areaType")
        @Expose
        private String areaType;
        @SerializedName("areaCode")
        @Expose
        private String areaCode;
        @SerializedName("parentCode")
        @Expose
        private String parentCode;
        @SerializedName("province")
        @Expose
        private String province;
        @SerializedName("district")
        @Expose
        private String district;
        @SerializedName("precinct")
        @Expose
        private String precinct;
        @SerializedName("areaName")
        @Expose
        private String areaName;
        @SerializedName("fullName")
        @Expose
        private String fullName;
        @SerializedName("orderNo")
        @Expose
        private String orderNo;
        @SerializedName("status")
        @Expose
        private String status;
        @SerializedName("redis_meta")
        @Expose
        private RedisMeta redisMeta;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getAreaType() {
            return areaType;
        }

        public void setAreaType(String areaType) {
            this.areaType = areaType;
        }

        public String getAreaCode() {
            return areaCode;
        }

        public void setAreaCode(String areaCode) {
            this.areaCode = areaCode;
        }

        public String getParentCode() {
            return parentCode;
        }

        public void setParentCode(String parentCode) {
            this.parentCode = parentCode;
        }

        public String getProvince() {
            return province;
        }

        public void setProvince(String province) {
            this.province = province;
        }

        public String getDistrict() {
            return district;
        }

        public void setDistrict(String district) {
            this.district = district;
        }

        public String getPrecinct() {
            return precinct;
        }

        public void setPrecinct(String precinct) {
            this.precinct = precinct;
        }

        public String getAreaName() {
            return areaName;
        }

        public void setAreaName(String areaName) {
            this.areaName = areaName;
        }

        public String getFullName() {
            return fullName;
        }

        public void setFullName(String fullName) {
            this.fullName = fullName;
        }

        public String getOrderNo() {
            return orderNo;
        }

        public void setOrderNo(String orderNo) {
            this.orderNo = orderNo;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public RedisMeta getRedisMeta() {
            return redisMeta;
        }

        public void setRedisMeta(RedisMeta redisMeta) {
            this.redisMeta = redisMeta;
        }

    }

    public class RedisMeta {

        @SerializedName("timeMark")
        @Expose
        private String timeMark;
        @SerializedName("timeMarkText")
        @Expose
        private String timeMarkText;
        @SerializedName("className")
        @Expose
        private String className;

        public String getTimeMark() {
            return timeMark;
        }

        public void setTimeMark(String timeMark) {
            this.timeMark = timeMark;
        }

        public String getTimeMarkText() {
            return timeMarkText;
        }

        public void setTimeMarkText(String timeMarkText) {
            this.timeMarkText = timeMarkText;
        }

        public String getClassName() {
            return className;
        }

        public void setClassName(String className) {
            this.className = className;
        }

    }
}
