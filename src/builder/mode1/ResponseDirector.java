package builder.mode1;

import java.util.HashMap;
import java.util.Set;

public class ResponseDirector {
    private final Builder builder;

    public ResponseDirector(Builder builder) {
        this.builder = builder;
    }

    public <T> ResponseEntity<T> create(int code, HashMap<String, String> header, T body) {
        if (code < 0) {
            throw new UnsupportedOperationException("不支持的状态码");
        }
        builder.code(code);
        if (header != null && !header.isEmpty()) {
            Set<String> keySet = header.keySet();
            for (String key : keySet) {
                builder.putHeader(key, header.get(key));
            }
        }
        return builder.body(body);
    }
}
