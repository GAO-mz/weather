package com.luobin.utils;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class CaiHongPiUtils {
    public static String getCaiHongPi() {
        String httpUrl = "https://api.muxiaoguo.cn/api/caihongpi?api_key=10d588af6e96584d";
        // String key = "3dce266882ae1c902a925f80c47ceb07";
        // String httpUrl = "http://api.tianapi.com/caihongpi/index?key="+key;
        BufferedReader reader = null;
        String result = null;
        StringBuffer sbf = new StringBuffer();

        try {
            URL url = new URL(httpUrl);
            HttpURLConnection connection = (HttpURLConnection) url
                    .openConnection();
            connection.setRequestMethod("GET");
            InputStream is = connection.getInputStream();
            reader = new BufferedReader(new InputStreamReader(is, "UTF-8"));
            String strRead = null;
            while ((strRead = reader.readLine()) != null) {
                sbf.append(strRead);
                sbf.append("\r\n");
            }
            reader.close();
            result = sbf.toString();
        } catch (Exception e) {
            e.printStackTrace();
        }


        // JSONObject jsonObject = JSONObject.parseObject(result);
        // JSONArray newslist = jsonObject.getJSONArray("newslist");
        // String content = newslist.getJSONObject(0).getString("content");


        JSONObject jsonObject = JSONObject.parseObject(result);
        JSONObject jsonObject2 = jsonObject.getJSONObject("data");
        String content = jsonObject2.getString("comment");
        return content;
    }

}
