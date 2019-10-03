package dohieu.com.testapi0310.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Respond {

    @SerializedName("restHeader")
    @Expose
    private RestHeader restHeader;
    @SerializedName("body")
    @Expose
    private String body;
    @SerializedName("secure")
    @Expose
    private Boolean secure;
    @SerializedName("cost")
    @Expose
    private String cost;

    public RestHeader getRestHeader() {
        return restHeader;
    }

    public void setRestHeader(RestHeader restHeader) {
        this.restHeader = restHeader;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public Boolean getSecure() {
        return secure;
    }

    public void setSecure(Boolean secure) {
        this.secure = secure;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public class RestHeader {

        @SerializedName("language")
        @Expose
        private String language;
        @SerializedName("channelCode")
        @Expose
        private Object channelCode;
        @SerializedName("clientRequestId")
        @Expose
        private String clientRequestId;
        @SerializedName("deviceId")
        @Expose
        private String deviceId;
        @SerializedName("clientAddress")
        @Expose
        private String clientAddress;
        @SerializedName("platform")
        @Expose
        private String platform;
        @SerializedName("signature")
        @Expose
        private Object signature;
        @SerializedName("exchangeIV")
        @Expose
        private Object exchangeIV;

        public String getLanguage() {
            return language;
        }

        public void setLanguage(String language) {
            this.language = language;
        }

        public Object getChannelCode() {
            return channelCode;
        }

        public void setChannelCode(Object channelCode) {
            this.channelCode = channelCode;
        }

        public String getClientRequestId() {
            return clientRequestId;
        }

        public void setClientRequestId(String clientRequestId) {
            this.clientRequestId = clientRequestId;
        }

        public String getDeviceId() {
            return deviceId;
        }

        public void setDeviceId(String deviceId) {
            this.deviceId = deviceId;
        }

        public String getClientAddress() {
            return clientAddress;
        }

        public void setClientAddress(String clientAddress) {
            this.clientAddress = clientAddress;
        }

        public String getPlatform() {
            return platform;
        }

        public void setPlatform(String platform) {
            this.platform = platform;
        }

        public Object getSignature() {
            return signature;
        }

        public void setSignature(Object signature) {
            this.signature = signature;
        }

        public Object getExchangeIV() {
            return exchangeIV;
        }

        public void setExchangeIV(Object exchangeIV) {
            this.exchangeIV = exchangeIV;
        }

    }

}