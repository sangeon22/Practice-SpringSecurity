package com.sp.fc.web.test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.core.parameters.P;

import static org.junit.jupiter.api.Assertions.assertEquals;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
class Person {
    private String name;
}

public class SpELTest {

    ExpressionParser parser = new SpelExpressionParser();

    @DisplayName("1. 기본 테스트")
    @Test
    void test_1(){
        Person person = Person.builder()
                .name("홍길동").build();

        assertEquals("홍길동", parser.parseExpression("name").getValue(person));

    }

}
