package com.ruoyi.framework.task;

/***
 * 2020/7/2
 */
public class MyTaskJob {

    public void sendMsg() throws Exception{
        System.out.println("1231313132131");
        throw new Exception("自定义异常");
    }
}
