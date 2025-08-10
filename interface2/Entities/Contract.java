package interface2.Entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Contract {
    private int installmentsNumbers;
    private LocalDate date;
    private double TotalValues;

    private List<Installments> installments = new ArrayList<>();

    public Contract(int installmentsNumbers, LocalDate date, double TotalValues){
        this.installmentsNumbers = installmentsNumbers;
        this.date = date;
        this.TotalValues = TotalValues;
    }

    public int getInstallmentsNumbers() {
        return installmentsNumbers;
    }

    public void setInstallmentsNunbers(){
        this.installmentsNumbers = installmentsNumbers;
    }

    public double getTotalValues(){
        return TotalValues;
    }

    public void setTotalValues(){
        this.TotalValues = TotalValues;
    }

    public LocalDate getDate(){
        return date;
    }

    public void setDate(){
        this.date = date;
    }

	public List<Installments> getInstallments() {
			return installments;
    }
}
