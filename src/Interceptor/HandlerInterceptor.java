package Interceptor;

import com.sun.istack.internal.Nullable;

public interface HandlerInterceptor {
    default boolean preHandle(InputMessage input, OutMessage out) {
        return true;
    }

    default void postHandle(InputMessage input, OutMessage out, @Nullable ModelAndView modelAndView) {
    }

    default void afterCompletion(InputMessage input, OutMessage out) {
    }
}
