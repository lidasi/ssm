package cwweb.com.util;

import java.math.RoundingMode;

public interface Const {

    /**
     * 请求头
     */
    String KEY_REQ_H_AUTH = "Authorization";

    // ****************************************
    //
    // Model相关常量
    //
    // ****************************************
    /** 非推荐行程 */
    Integer TRAVEL_RECOMMEND_FALSE = 0;
   

    /** 订单金额精读模式(向上取整) */
    RoundingMode ORDER_AMOUNT_ROUNDING_MODE = RoundingMode.CEILING;
  
    /**
     * 用户不存在返回积分余额 0
     */
    Long CREDITS_BALANCE = 0L;
    
    
    // ****************************************
    //
    // 用户登录
    //
    // ****************************************
    
    /**登录用户名**/
    String USERNAME = "username";
    
    /**登录用户密码**/
    String PASSWROD = "password";
    
    /** 验证码 **/
    String STRCODE = "strCode";
    
    /** 返回信息**/
    String CHECKCODE = "checkCode";
    
    /**返回成功代码 code**/
    String RES_SUCCESS = "200";
    
    /**返回失败代码 cod **/
    String RES_FAIL = "400";
    
}
