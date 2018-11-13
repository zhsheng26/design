package builder.mode1;

import java.util.HashMap;

public class ResponseBuilder implements Builder {

    private Integer code = 200;
    private HashMap<String, String> headers = new HashMap<>();

    @Override
    public void code(Integer code) {
        this.code = code;
    }

    @Override
    public void putHeader(String key, String value) {
        headers.put(key, value);
    }

    @Override
    public <T> ResponseEntity<T> build() {
        return body(null);
    }

    @Override
    public <T> ResponseEntity<T> body(T body) {
        return new ResponseEntity<>(body, headers, code);
    }
}
