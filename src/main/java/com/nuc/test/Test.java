package com.nuc.test;



import com.nuc.utils.HttpClientUtil;

/**  
 * @Title: http://www.smschinese.cn/api.shtml
 * @date 2011-3-22
 * @version V1.2  
 */
public class Test {
    
    //�û���
    private static String Uid = "wy15735655124";
    
    //�ӿڰ�ȫ��Կ
    private static String Key = "618d41d8cd98f00b204e980";
    
    //�ֻ����룬���������13800000000,13800000001,13800000002
    private static String smsMob = "15735655124";
    
    //��������
    private static String smsText = "���������á������������ǣ�892563.";
    
    
    public static void main(String[] args) {
        
        HttpClientUtil client = HttpClientUtil.getInstance();
        
        //UTF����
        int result = client.sendMsgUtf8(Uid, Key, smsText, smsMob);
        if(result>0){
            System.out.println("UTF8�ɹ���������=="+result);
        }else{
            System.out.println(client.getErrorMsg(result));
        }
    }
}