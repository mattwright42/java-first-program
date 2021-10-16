import java.util.Map;

public class Finance {
    public final static String BEST_LOAN_RATES = bestLoanRates;
    public final static String SAVINGS_CALCULATOR = savingsCaculator;
    public final static String MORTGAGE_CALCULATOR = mortgageCalculator;

    public final static Map<String, String> commandsToUsage = Map.of(
            BEST_LOAN_RATES, "usage: bestLoanRates",
            SAVINGS_CALCULATOR, "usage: savingsCalculator <credits separated by ','> <debits separated by ','>",
            MORTGAGE_CALCULATOR, "usage: mortgageCalculator <loanAmount> <termInYears> <annualRate>"
    );

}
