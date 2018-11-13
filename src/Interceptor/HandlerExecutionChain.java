package Interceptor;

import com.sun.istack.internal.Nullable;

import java.util.ArrayList;
import java.util.List;

public class HandlerExecutionChain {

    @Nullable
    private List<HandlerInterceptor> interceptorList;

    public HandlerExecutionChain() {
        this.interceptorList = new ArrayList<>();
    }

    public void addInterceptor(HandlerInterceptor interceptor) {
        this.interceptorList.add(interceptor);
    }

    public List<HandlerInterceptor> getInterceptorList() {
        return interceptorList;
    }

    public boolean applyPreHandle(InputMessage input, OutMessage out) {
        List<HandlerInterceptor> interceptorList = getInterceptorList();
        for (HandlerInterceptor interceptor : interceptorList) {
            if (!interceptor.preHandle(input, out)) {
                triggerAfterCompletion(input, out);
                return false;
            }
        }
        return true;
    }

    public void applyPostHandle(InputMessage input, OutMessage out, @Nullable ModelAndView modelAndView) {
        List<HandlerInterceptor> interceptors = getInterceptorList();
        for (HandlerInterceptor interceptor : interceptors) {
            interceptor.postHandle(input, out, modelAndView);
        }
    }

    public void triggerAfterCompletion(InputMessage input, OutMessage out) {
        List<HandlerInterceptor> interceptorList = getInterceptorList();
        for (HandlerInterceptor interceptor : interceptorList) {
            interceptor.afterCompletion(input, out);
        }
    }
}
