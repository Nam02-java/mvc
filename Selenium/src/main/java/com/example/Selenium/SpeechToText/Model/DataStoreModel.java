package com.example.Selenium.SpeechToText.Model;

import org.telegram.telegrambots.meta.api.methods.send.SendMessage;

import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;

public class DataStoreModel {

    public  String text, text_constructor = null;

    public  CountDownLatch latch = new CountDownLatch(1);
    public  CountDownLatch countDownLatch;
    public  final int limitChar = 2000;
    public  ArrayList<String> arrayList_Char = new ArrayList<>();
    public  int count = 0;

    public String DownloadsFilePath = "E:\\New folder\\";

    public DataStoreModel() {
    }

    public DataStoreModel(String text, String text_constructor, CountDownLatch latch, CountDownLatch countDownLatch, ArrayList<String> arrayList_Char, int count) {
        this.text = text;
        this.text_constructor = text_constructor;
        this.latch = latch;
        this.countDownLatch = countDownLatch;
        this.arrayList_Char = arrayList_Char;
        this.count = count;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getText_constructor() {
        return text_constructor;
    }

    public void setText_constructor(String text_constructor) {
        this.text_constructor = text_constructor;
    }

    public CountDownLatch getLatch() {
        return latch;
    }

    public void setLatch(CountDownLatch latch) {
        this.latch = latch;
    }

    public CountDownLatch getCountDownLatch() {
        return countDownLatch;
    }

    public void setCountDownLatch(CountDownLatch countDownLatch) {
        this.countDownLatch = countDownLatch;
    }

    public int getLimitChar() {
        return limitChar;
    }

    public ArrayList<String> getArrayList_Char() {
        return arrayList_Char;
    }

    public void setArrayList_Char(ArrayList<String> arrayList_Char) {
        this.arrayList_Char = arrayList_Char;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }


    public String getDownloadsFilePath() {
        return DownloadsFilePath;
    }

    public void setDownloadsFilePath(String downloadsFilePath) {
        DownloadsFilePath = downloadsFilePath;
    }
}

