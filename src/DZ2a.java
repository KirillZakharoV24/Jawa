// Условие: Авиаперевозчики предлагают различные бонусные программы, начисляющие бесплатные мили за перелёты.
// Формула расчёта: за каждые 20 рублей, потраченные на билет, начисляется 1 миля. Дробные мили не начисляются.

public class DZ2a {
    public static void main(String[] args) {
        // Стоимость билета
        int ticketPrice = 15685;

        // Количество начисленных миль
        int milesEarned =  (int) (ticketPrice / 20);

        if (ticketPrice >= 20) {
            milesEarned = ticketPrice / 20;
        } else { milesEarned =0;
            
        }

        // Результат
        System.out.println("За билет стоимостью " + ticketPrice + " рублей начислено " + milesEarned + " миль.");
    }
}
