package com.yufei.test;

import com.yufei.wechat.TulingApiProcess;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

/**
 * Created by pc on 2016-10-12.
 */
public class Test {

    public static void main(String[] args) {
        System.out.println(new TulingApiProcess().getTulingResult("海淀天气"));
    }

}
