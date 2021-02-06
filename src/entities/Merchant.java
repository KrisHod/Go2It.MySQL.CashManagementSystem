package entities;

import java.time.LocalDate;
import java.util.Objects;

public class Merchant {
    private int id;
    private String bankName;
    private String swift;
    private String account;
    private double charge;
    private int period;
    private double minSum;
    private double needToSend;
    private double sent;
    private LocalDate lastSent;

    public Merchant(int id, String bankName, String swift, String account, double charge, int period,
                    double minSum, double needToSend, double sent, LocalDate lastSent) {
        this.id = id;
        this.bankName = bankName;
        this.swift = swift;
        this.account = account;
        this.charge = charge;
        this.period = period;
        this.minSum = minSum;
        this.needToSend = needToSend;
        this.sent = sent;
        this.lastSent = lastSent;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getSwift() {
        return swift;
    }

    public void setSwift(String swift) {
        this.swift = swift;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public double getCharge() {
        return charge;
    }

    public void setCharge(double charge) {
        this.charge = charge;
    }

    public int getPeriod() {
        return period;
    }

    public void setPeriod(int period) {
        this.period = period;
    }

    public double getMinSum() {
        return minSum;
    }

    public void setMinSum(double minSum) {
        this.minSum = minSum;
    }

    public double getNeedToSend() {
        return needToSend;
    }

    public void setNeedToSend(double needToSend) {
        this.needToSend = needToSend;
    }

    public double getSent() {
        return sent;
    }

    public void setSent(double sent) {
        this.sent = sent;
    }

    public LocalDate getLastSent() {
        return lastSent;
    }

    public void setLastSent(LocalDate lastSent) {
        this.lastSent = lastSent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Merchant merchant = (Merchant) o;
        return id == merchant.id && Double.compare(merchant.charge, charge) == 0 && period == merchant.period && Double.compare(merchant.minSum, minSum) == 0 && Double.compare(merchant.needToSend, needToSend) == 0 && Double.compare(merchant.sent, sent) == 0 && Objects.equals(bankName, merchant.bankName) && Objects.equals(swift, merchant.swift) && Objects.equals(account, merchant.account) && Objects.equals(lastSent, merchant.lastSent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, bankName, swift, account, charge, period, minSum, needToSend, sent, lastSent);
    }

    @Override
    public String toString() {
        return "Merchant{" +
                "id=" + id +
                ", bankName='" + bankName + '\'' +
                ", swift='" + swift + '\'' +
                ", account='" + account + '\'' +
                ", charge=" + charge +
                ", period=" + period +
                ", minSum=" + minSum +
                ", needToSend=" + needToSend +
                ", sent=" + sent +
                ", lastSent=" + lastSent +
                '}';
    }
}
