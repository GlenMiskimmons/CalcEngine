package com.pluralsight.calcengine;

public class MathEquation {
    public double leftVal;
    public double rightVal;
    public char opCode;
    public double result;

    public void execute() {
        switch(opCode) {
            case 'a':
                result = leftVal + rightVal;
                break;
            case 's':
                result = leftVal - rightVal;
                break;
            case 'd':
                result = rightVal != 0 ?  leftVal / rightVal : 0.0d;
//                    if(val2 != 0.0d) {
//                      result = val1 / val2;
//                    } else {
//                      result = 0.0d;
//                    }
                break;
            case 'm':
                result = leftVal * rightVal;
                break;
            default:
                System.out.println("Error - invalid OpCode");
                result = 0.0d;
                break;
        }

    }
}
