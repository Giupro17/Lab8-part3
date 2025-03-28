/**
 * Test the CalcEngine class.
 * 
 * @author Hacker T. Largebrain 
 * @version 1.0
 */
public class CalcEngineTester
{
    // The engine to be tested.
    private CalcEngine engine;

    /**
     * Constructor for objects of class CalcEngineTester
     */
    public CalcEngineTester()
    {
        engine = new CalcEngine();
    }
    
    /**
     * Test everything.
     */
    public void testAll()
    {
        System.out.println("Testing the addition operation.");
        System.out.println("The result is: " + testPlus());
        System.out.println("Testing the subtraction operation.");
        System.out.println("The result is: " + testMinus());
        System.out.println("All tests passed.");
    }

    /**
     * Test the plus operation of the engine.
     * @return the result of calculating 3+4.
     */
    public int testPlus()
    {
        // Make sure the engine is in a valid starting state.
        engine.clear();
        // Simulate the key presses: 3 + 4 =
        engine.numberPressed(3);
        engine.plus();
        engine.numberPressed(4);
        engine.equals();
        // Return the result, which should be 7.
        return engine.getDisplayValue();
    }

    /**
     * Test the minus operation of the engine.
     * @return the result of calculating 9 - 4.
     */
    public int testMinus()
    {
        // Make sure the engine is in a valid starting state.
        engine.clear();
        // Simulate the presses: 9 - 4 =
        engine.numberPressed(9);
        engine.minus();
        engine.numberPressed(4);
        engine.equals();
        // Return the result, which should be 5.
        return engine.getDisplayValue();
    }
}
/*
 * 22. I beleive what the final line says because it matches the return value 
 * that is in the code and all the calculations were executed.
 * 23. returns 1 the first time, then 7 the second, it should alway return 7.
 * 24. it gives the correct result the first time then it keeps subracting
 * from the returned value from the previous test.
 * 26,
 * Method Called	displayValue	leftOperand	previousOperator
 * ---------------------------------------------------------------------
 * initial state             0               0               ''
 * plus()                    0               0               '+'
 * numberPressed(4)          4               0               '+'
 * equals()                  4               4               ''
 * gwtDisplayValue           4               4               ''
 */