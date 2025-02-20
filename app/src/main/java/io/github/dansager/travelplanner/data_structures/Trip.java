package io.github.dansager.travelplanner.data_structures;

import org.joda.time.DateTime;
import org.joda.time.DateTime;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Trip {
    private String name = "";
    private DateTime startDate;
    private DateTime endDate;
    private double moneySpent = 0.0;
    private double budget = 0.0;
    private List<Expense> list = new ArrayList<Expense>();

    public Trip(String name,DateTime startDate,DateTime endDate) {
        this.name = name;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public String setName (String s) {
        return name = s;
    }

    public double setMoneySpent (double i) {
        return moneySpent = i;
    }

    public DateTime setStartDate (DateTime d) {
        return startDate = d;
    }
    public DateTime setEndDate (DateTime d) {
        return endDate = d;
    }

    public double setBudget (double i) { return budget = i; }

    public double getMoneySpent() {
        return moneySpent;
    }

    public String getName () {
        return name;
    }

    public DateTime getStartDate () {
        return startDate;
    }
    public DateTime getEndDate () {
        return endDate;
    }

    public double getBudget () { return budget; }

    public List<Expense> getList () {
        return list;
    }

    public void addToList (Expense e) {
        list.add(e);
    }
}
