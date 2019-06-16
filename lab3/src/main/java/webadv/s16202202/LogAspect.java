package webadv.s16202202;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.BindingResult;


@Aspect
@Configuration
public class LogAspect {
    private Logger logger = LoggerFactory.getLogger(LogAspect.class);
   
    //@Pointcut("execution(public * webadv.s16202202.HomeController.check(..))")
    //public void webLog(){}
    
    //@Before("webLog()")
    @Before("execution(public * webadv.s16202202.HomeController.check(..)) && args(user,result,..)")
    public void doBefore(User user, BindingResult result) throws Throwable {
    	logger.info(String.format("Account:%s, login %s.", user.getAccount(),result.hasErrors()?"failed":"succeeded"));
       
    }    
}