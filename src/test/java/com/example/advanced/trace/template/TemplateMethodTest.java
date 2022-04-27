package com.example.advanced.trace.template;

import com.example.advanced.trace.threadlocal.code.AbstractTemplate;
import com.example.advanced.trace.threadlocal.code.SubClassLogic1;
import com.example.advanced.trace.threadlocal.code.SubClassLogic2;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
public class TemplateMethodTest {

    @Test
    void templateMethodV1() {
        AbstractTemplate template1 = new SubClassLogic1();
        template1.execute();
        AbstractTemplate template2 = new SubClassLogic2();
        template2.execute();
    }

    @Test
    void templateMethodV2() {
        AbstractTemplate template1 = new AbstractTemplate() {
            @Override
            protected void call() { log.info("비즈니스 로직1 실행");
            } };
        log.info("클래스 이름1={}", template1.getClass()); template1.execute();
        AbstractTemplate template2 = new AbstractTemplate() {
            @Override
            protected void call() { log.info("비즈니스 로직1 실행");
            } };
        log.info("클래스 이름2={}", template2.getClass());
        template2.execute();
    }
}
