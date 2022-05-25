package GetAndSet;

/**
 *
 * @author trant
 */
public class money {
    private String year;
    private String month;
    private int money;

    public money() {
    }

    public money(String year, String month, int money) {
        this.year = year;
        this.month = month;
        this.money = money;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
    
}