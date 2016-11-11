package com.yufei.test;

import com.yufei.wechat.TulingApiProcess;

/**
 * Created by pc on 2016-10-12.
 */
public class Test {

    public static void main(String[] args) {
        System.out.println(new TulingApiProcess().getTulingResult("海淀天气"));
    }

}
