package builder.mode1;

import com.sun.istack.internal.Nullable;

public interface Builder {

    void code(Integer code);

    void putHeader(String key, String value);

    <T> ResponseEntity<T> build();

    <T> ResponseEntity<T> body(@Nullable T body);
}
