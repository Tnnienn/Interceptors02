package co.develhope.interceptorsmiddleware2.interceptors;

import co.develhope.interceptorsmiddleware2.entities.Month;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class MonthInterceptor implements HandlerInterceptor {

    public static Month[] mese = new Month[]{new Month(1,"January","Gennaio","dsrfgiheru"),new Month(2,"February","Febbraio","dsrfgiheru"),new Month(3,"March","Marzo","dsrfgiheru"),new Month(1,"January","Gennaio","dsrfgiheru")};


    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        Character c = request.getRequestURI().charAt(request.getRequestURI().length()-1);
        if(!Character.isDigit(c)){
            response.setStatus(400);
            return false;
        }
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        HandlerInterceptor.super.postHandle(request, response, handler, modelAndView);
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        HandlerInterceptor.super.afterCompletion(request, response, handler, ex);
    }
}