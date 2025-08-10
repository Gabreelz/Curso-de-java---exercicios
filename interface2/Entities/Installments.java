package interface2.Entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Installments {

    private static DateTimeFormatter fmt = DateTimeFormatter.ofPattern(("dd/MM/yyyy"));

    private LocalDate dueDate;
    private double amount;

    public Installments(LocalDate dueDate, double amount){
        this.dueDate = dueDate;
        this.amount = amount;
    }

    public LocalDate getDueData(){
        return dueDate;
    }

    public void setDueData(){
        this.dueDate = dueDate;
    }

    public double getAmount(){
        return amount;
    }

    public void setAmount(){
        this.amount = amount;
    }

    @Override
    public String toString(){
        return dueDate.format(fmt) + " - " + String.format("R$ %.2f", amount);
    }
}
