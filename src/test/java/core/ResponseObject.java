package core;

import io.restassured.response.Response;

public class ResponseObject {

    private Response response;

    public static <T extends ResponseObject> T as(Class<T> type, Response response) {
        response.prettyPeek();
        T object = (T) response.as(type);
        object.setResponse(response);
        return object;
    }

    public ResponseObject() {
    }

    public Response getResponse() { return this.response;}

    public void setResponse(Response response) {this.response = response;}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        else if (!(o instanceof ResponseObject))
            return false;
        else {
            ResponseObject other = (ResponseObject) o;
            if (!other.canEqual(this)) {
                return false;
            } else {
                Object this$response = this.getResponse();
                Object other$response = other.getResponse();
                if (this$response == null) {
                    if (other$response != null) {
                        return false;
                    }
                } else if (!this$response.equals(other$response)) {
                    return false;
                }
                return true;
            }
        }
    }

    @Override
    public int hashCode() {
        //int PRIME = true;
        int result = 1;
        Object $response = this.getResponse();
        //int result = response * 59 + ($response == null ? 43 : $response.hashCode());
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof ResponseObject;
    }

    public String toString() {
        return "ResponseObject(response=" + this.getResponse() + ")";
    }
}
