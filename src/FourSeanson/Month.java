package FourSeanson;

public class Month {
    private Seasons seasons;
    private String monthName;

    public Month(Seasons seasons, String monthName) {
        this.seasons = seasons;
        this.monthName = monthName;
    }

    public Seasons getSeasons() {
        return seasons;
    }

    public String getMonthName() {
        return monthName;
    }

    @Override
    public String toString() {
        return "Pora roku: " + seasons.getTranslation()+ ", miesiąc: " + monthName;
    }
}
