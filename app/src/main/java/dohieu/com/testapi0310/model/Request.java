package dohieu.com.testapi0310.model;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Request {

    @SerializedName("restHeader")
    @Expose
    private RestHeader restHeader;
    @SerializedName("body")
    @Expose
    private String body;

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

    public static class RestHeader {

        @SerializedName("language")
        @Expose
        private String language;
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

        public String getLanguage() {
            return language;
        }

        public void setLanguage(String language) {
            this.language = language;
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

    }
}