package com.example.advanced.trace.threadlocal.code;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class FieldService {

    private String nameStroe;

    public String logic(String name) {
        log.info("์ ์ฅ name{} -> nameStore={}", name, nameStroe);
        nameStroe = name;
        sleep(1000);
        log.info("์กฐํ nameStore = {}", nameStroe);
        return nameStroe;
    }

    private void sleep(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
