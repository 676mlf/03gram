package cn.detu.weibe.exception;

import cn.detu.weibe.response.JsonResult;
import cn.detu.weibe.response.StatusCode;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * 全局异常处理器类
 * ControllerAdvice: 声明该类为全局异常处理器的类,会捕捉控制器中的异常
 * RestControllerAdvice: 复合注解,等价于 ControllerAdvice+ResponseBody 注解
 */
//@ControllerAdvice
@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler
    public JsonResult doHandleServiceException(ServiceException ex){
        /*
            ex:异常对象
            ex.getMessage():获取异常信息
         */
        log.error("ServiceException is: " + ex.getMessage());
        return new JsonResult(ex.getStatusCode());
    }
    /**
     ExceptionHandler:该方法为异常处理方法,在该方法内部定义异常处理逻辑;
        该方法有一个参数:异常类型,用来接收Controller中抛出的异常对象
     */
    @ExceptionHandler
    public JsonResult doHandleRuntimeException(RuntimeException ex){
        /*
            ex:异常对象
            ex.getMessage():获取异常信息
         */
        log.error("RuntimeException is: " + ex.getMessage());
        return new JsonResult(StatusCode.OPERATION_FAILED, ex.getMessage());
    }

    @ExceptionHandler
    public JsonResult doHandleIllegalArgumentException(IllegalArgumentException ex){
        log.error("IllegalArgumentException is: " + ex.getMessage());
        return new JsonResult(StatusCode.OPERATION_FAILED, ex.getMessage());
    }

    @ExceptionHandler
    public JsonResult doHandleMethodArgumentNotValidException(MethodArgumentNotValidException ex){
        /*
            ex.getFieldError().getDefaultMessage(): 获取提示消息
            提示消息: @NotNull(message="提示消息")
         */
        String message = ex.getFieldError().getDefaultMessage();

        return new JsonResult(StatusCode.VALIDATE_ERROR, message);
    }


    /**
     * Throwable: 处理所有类型的异常,一般开发最后加
     * 加完此异常处理方法后,程序中将永远见不到500状态码
     */
//    @ExceptionHandler
//    public JsonResult doHandleThrowable(Throwable ex){
//
//        return new JsonResult(8888, "程序运行中出现了Throwable类型的异常");
//    }

}








