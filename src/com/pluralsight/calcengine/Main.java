package com.pluralsight.calcengine;

public class Main {

    public static void main(String[] args) {
//        double leftVals[] = {100.0d, 25.0d, 225.0d, 11.0d};
//        double rightVals[] = {50.0, 92.0d, 17.0d, 3.0d};
//        char[] opCodes = {'d', 'a', 's', 'm'};
//        double[] results = new double[opCodes.length];
//        double val1 = 100.0d;
//        double val2 = 50.0d;
//        double result ;
//        char opCode = 'd';

//        MathEquation testEquation = new MathEquation();
//        testEquation.execute();
//        System.out.print("test = " + testEquation.getResult());

        MathEquation[] equations = new MathEquation[4];
        equations[0] = new MathEquation('d',100.0d, 50.0d);
        equations[1] = new MathEquation('a', 25.0d, 92.0d);
        equations[2] = new MathEquation('s', 225.0d, 17.0d);
        equations[3] = new MathEquation('m', 11.0d, 3.0d);

        for(MathEquation equation : equations) {
            equation.execute();
            System.out.println("result = " + equation.getResult());
        }

        System.out.println();
        System.out.println("Using overloads");
        System.out.println();

        double leftDouble = 9.0d;
        double rightdouble = 4.0d;
        int leftInt = 9;
        int rightInt = 4;

        MathEquation equationOverload = new MathEquation('d');

        equationOverload.execute(leftDouble, rightdouble);
        System.out.println("result = " + equationOverload.getResult());

        equationOverload.execute(leftInt, rightInt);
        System.out.println("result = " + equationOverload.getResult());

        equationOverload.execute((double) leftInt, rightInt);
        System.out.println("result = " + equationOverload.getResult());

        System.out.println();
        System.out.println("Using inheritance");
        System.out.println();

        CalculateBase[] calculators = {
            new Divider(100.0d, 50.0d),
            new Adder(25.0d, 92.0d),
            new Subtracter(225.0d, 17.0d),
            new Multiplier(11.0d, 3.0d)
        };

        for(CalculateBase calculator : calculators) {
            calculator.calculate();
            System.out.println("result = " + calculator.getResult());
        }
    }

//    public static MathEquation create(double leftVal, double rightVal, char opCode) {
//        MathEquation equation = new MathEquation();
//        equation.setLeftVal(leftVal);
//        equation.setRightVal(rightVal);
//        equation.setOpCode(opCode);
//
//        return equation;
//    }
}
