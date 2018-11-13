package builder.mode2;

import com.sun.istack.internal.Nullable;

import java.util.HashMap;

public class ResponseEntity<T> {
    @Nullable
    private T body;
    private HashMap<String, String> header;
    private Integer code;

    public ResponseEntity(T body, HashMap<String, String> header, Integer code) {
        this.body = body;
        this.header = header;
        this.code = code;
    }

    public static class ResponseBuilder {
        private HashMap<String, String> headers = new HashMap<>();
        private Integer status = 200;

        public ResponseBuilder code(Integer code) {
            this.status = code;
            return this;
        }

        public ResponseBuilder putHeader(String key, String value) {
            this.headers.put(key, value);
            return this;
        }

        public <T> ResponseEntity<T> build() {
            return body(null);
        }

        public <T> ResponseEntity<T> body(T body) {
            return new ResponseEntity<>(body, headers, status);
        }
    }

    public T getBody() {
        return body;
    }

    public void setBody(T body) {
        this.body = body;
    }

    public HashMap<String, String> getHeader() {
        return header;
    }

    public void setHeader(HashMap<String, String> header) {
        this.header = header;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "ResponseEntity{" +
                "body=" + body +
                ", header=" + header +
                ", code=" + code +
                '}';
    }
}
