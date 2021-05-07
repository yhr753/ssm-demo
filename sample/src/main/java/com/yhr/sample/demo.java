package com.yhr.sample;

import static com.yhr.sample.SMSUtils.VALIDATE_CODE;

/**
 * @program: sample
 * @description: 测试阿里短息服务
 * @packagename: com.aliyun.sample.s
 * @author: yanghongrong
 * @date: 2021-05-07 17:57
 **/
public class demo {
    public static void main(String[] args)throws Exception {
        // 第一个参数  工具类里定义的短信模板的  模版CODE
        // 第二个参数  要发送的手机号
        // 第三个参数  短信模板里的 ${code}
        String msg = SMSUtils.sendShortMessage(VALIDATE_CODE, "", "111111");
        System.out.println(msg);
    }
}
