package back.filter;


import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.HashMap;

public class LoggedFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        HashMap<String, Object> data = new HashMap<>();

        if (((HttpServletRequest)servletRequest).getMethod().equals("POST")){

        }
    }

    @Override
    public void destroy() {

    }
}
