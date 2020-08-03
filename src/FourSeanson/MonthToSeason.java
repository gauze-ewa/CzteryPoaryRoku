package FourSeanson;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MonthToSeason {
    private Month month;
    private Seasons seasons;

    private List<Month> createListMonth(){
        Month january = new Month(Seasons.WINTER, "styczeń");
        Month february = new Month(Seasons.WINTER, "luty");
        Month march = new Month(Seasons.SPRING, "marzecz");
        Month april = new Month(Seasons.SPRING, "kwiecień");
        Month may = new Month(Seasons.SPRING, "maj");
        Month june = new Month(Seasons.SUMMER, "czerwiec");
        Month july = new Month(Seasons.SUMMER, "lipiec");
        Month august = new Month(Seasons.SUMMER, "sierpień");
        Month september = new Month(Seasons.AUTUMN, "wrzesień");
        Month october = new Month(Seasons.AUTUMN, "październik");
        Month november = new Month(Seasons.AUTUMN, "listopad");
        Month december = new Month(Seasons.WINTER, "grudzień");

        List<Month> months = Arrays.asList(january, february, march, april,
                may, june, july, august, september, october, november, december);
        return months;
    }

    private Seasons[] showOption(){
        System.out.println("Witaj w naszym programie!");
        System.out.println("Podaj pore roku. Może byc po polsku. Dostępne opcje):");

        Seasons[] season = Seasons.values();
        System.out.println(Arrays.toString(season));
        return season;
    }

    public void choseSeason(){
        List<Month>months=createListMonth();
        Seasons[]season=showOption();
        Scanner sc = new Scanner(System.in);
        String userInput = sc.nextLine();
        Seasons seasons = null;
        try {
            seasons = Seasons.valueOf(userInput);
        } catch (IllegalArgumentException e) {
            for (Seasons s : season) {
                if (s.getTranslation().equalsIgnoreCase(userInput)) {
                    seasons = s;
                    break;
                }
            }
        }
        if (seasons != null) {
            for (Month elements : months) {
                if (elements.getSeasons() == seasons) {
                    System.out.println(elements);
                }
            }
        } else {
            System.out.println("Nie znaleziono pory roku");
        }
    }
}
