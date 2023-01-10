package basic;

import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

public class FormattingNumbers {
    public static void main(String[] args) {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        System.out.println(currency.getCurrency());
        Locale inr = new Locale("", "IN");
        System.out.println(inr);
//        currency.setCurrency(Currency.getInstance(Locale.));
        String CurrencyRes = currency.format(1095348.58);
        System.out.println(CurrencyRes);

        NumberFormat percent = NumberFormat.getPercentInstance();
        String percentage = percent.format(.58);
        System.out.println(percentage);

    }
}
