package com.power.pojo;

public class Log {
    private long id;
    private String operation;
    private String parameters;
    private String result;
    private String exception;

    public Log() {
    }

    @Override
    public String toString() {
        return "Log{" +
                "id=" + id +
                ", operation='" + operation + '\'' +
                ", parameters='" + parameters + '\'' +
                ", result='" + result + '\'' +
                ", exception='" + exception + '\'' +
                '}';
    }

    public Log(long id, String operation, String parameters, String result, String exception) {
        this.id = id;
        this.operation = operation;
        this.parameters = parameters;
        this.result = result;
        this.exception = exception;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public String getParameters() {
        return parameters;
    }

    public void setParameters(String parameters) {
        this.parameters = parameters;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getException() {
        return exception;
    }

    public void setException(String exception) {
        this.exception = exception;
    }
}
