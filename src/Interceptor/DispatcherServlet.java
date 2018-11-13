package Interceptor;

public class DispatcherServlet {
    private HandlerExecutionChain executionChain;

    public DispatcherServlet(HandlerExecutionChain executionChain) {
        this.executionChain = executionChain;
    }

    public void doDispatch(InputMessage input, OutMessage out) {
        ModelAndView modelAndView = null;
        try {
            if (!this.executionChain.applyPreHandle(input, out)) {
                return;
            }
            modelAndView = processDispatchResult(input, out);
        } catch (Throwable throwable) {
            this.executionChain.triggerAfterCompletion(input, out);
        } finally {
            this.executionChain.triggerAfterCompletion(input, out);
        }

        this.executionChain.applyPostHandle(input, out, modelAndView);
        this.executionChain.triggerAfterCompletion(input, out);
    }

    public ModelAndView processDispatchResult(InputMessage input, OutMessage out) {
        return new ModelAndView();
    }


}
