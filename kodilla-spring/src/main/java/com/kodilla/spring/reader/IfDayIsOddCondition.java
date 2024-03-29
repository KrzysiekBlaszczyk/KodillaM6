package com.kodilla.spring.reader;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

import java.time.LocalDateTime;

public class IfDayIsOddCondition implements Condition {
    @Override
    public boolean matches(ConditionContext contex, AnnotatedTypeMetadata metadata){
        return LocalDateTime.now().getDayOfMonth()%2!=0;
    }
}
