package com.wx.lottery.service;

import com.wx.lottery.interfaces.GetInfo;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

@Service
public class GetInfoDoubleBall implements GetInfo {
    //    public static void main(String[] args) {
//        //http://www.cwl.gov.cn/cwl_admin/kjxx/findDrawNotice?name=ssq&issueCount=1 header中Referer：http://www.cwl.gov.cn/
//        //使用httpclient进行连接请求
//        HttpClient httpClient = HttpClient.newHttpClient();
//        HttpResponse<String> response = null;
//        try {
//            response = httpClient.send(HttpRequest.newBuilder().GET()
//                    .headers("Referer", "http://www.cwl.gov.cn/")
//                    .uri(URI.create("http://www.cwl.gov.cn/cwl_admin/kjxx/findDrawNotice?name=ssq&issueCount=1"))
//                    .build(), HttpResponse.BodyHandlers.ofString());
//        } catch (IOException e) {
//            e.printStackTrace();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        System.out.println(response.body());
//    }
    public static void main(String[] args) {
    }

    public String getLotteryInfo() {
        HttpClient httpClient = HttpClient.newHttpClient();
        HttpResponse<String> response = null;
        try {
            response = httpClient.send(HttpRequest.newBuilder().GET()
                    .headers("Referer", "http://www.cwl.gov.cn/")
                    .uri(URI.create("http://www.cwl.gov.cn/cwl_admin/kjxx/findDrawNotice?name=ssq&issueCount=1"))
                    .build(), HttpResponse.BodyHandlers.ofString());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return response.body();
    }

}
