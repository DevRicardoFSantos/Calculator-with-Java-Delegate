package com.JavaDelegate.andExternalTasks;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class  SumDelegate implements JavaDelegate {
    @Override
    public void execute(DelegateExecution execution) throws Exception {
        Long a =  (Long) execution.getVariable( "a");
        Long b =  (Long) execution.getVariable( "b");

        execution.setVariable( "result", a + b);

    }
}
