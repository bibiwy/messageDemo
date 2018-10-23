package com.nuc.test;



import com.nuc.utils.HttpClientUtil;

/**  
 * @Title: http://www.smschinese.cn/api.shtml
 * @date 2011-3-22
 * @version V1.2  
 */
public class Test {
    
    //用户名
    private static String Uid = "wy15735655124";
    
    //接口安全秘钥
    private static String Key = "618d41d8cd98f00b204e980";
    
    //手机号码，多个号码如13800000000,13800000001,13800000002
    private static String smsMob = "15735655124";
    
    //短信内容
    private static String smsText = "【密码重置】本次新密码是：892563.";
    
    
    public static void main(String[] args) {
        
        HttpClientUtil client = HttpClientUtil.getInstance();
        
        //UTF发送
        int result = client.sendMsgUtf8(Uid, Key, smsText, smsMob);
        if(result>0){
            System.out.println("UTF8成功发送条数=="+result);
        }else{
            System.out.println(client.getErrorMsg(result));
        }
    }
}