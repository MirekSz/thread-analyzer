package hello;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.ServletWebRequest;

@ControllerAdvice
public class ControlerInterceptor {
	@ExceptionHandler
	public String handle(Exception e, ServletWebRequest request) {
		String contextPath = request.getRequest().getRequestURI();
		return "redirect:/customers";
	}
}