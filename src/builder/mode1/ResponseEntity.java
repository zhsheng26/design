package builder.mode1;

import com.sun.istack.internal.Nullable;

import java.util.HashMap;

public class ResponseEntity<T> {
    private @Nullable
    T body;
    private HashMap<String, String> header;
    private Integer code;

    public ResponseEntity(T body, HashMap<String, String> header, Integer code) {
        this.body = body;
        this.header = header;
        this.code = code;
    }

    public @Nullable
    T getBody() {
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
