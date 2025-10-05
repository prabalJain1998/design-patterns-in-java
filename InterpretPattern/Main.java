class Main {
    public static void main(String[] args) {
        Context context = new Context();
        context.put("a", 1);
        context.put("b", 2);
        context.put("c", 4);
        context.put("d", 11);

        // (a*b) + (c*d)
        AbstractExpression expression = new AddNonTerminalExpression(
            new MultiplyNonTerminalExpression(new NumberTerminalExpression("a"), new NumberTerminalExpression("b")),
            new MultiplyNonTerminalExpression(new NumberTerminalExpression("c"), new NumberTerminalExpression("d")));
            
        System.out.println("Value of expression is "+expression.interpret(context));
        

    }
}