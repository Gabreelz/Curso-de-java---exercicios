package interface2.Application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import interface2.Entities.Contract;
import interface2.Entities.Installments;
import interface2.services.ContractService;
import interface2.services.PayPalService;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Entre com os datos do contrato: ");
        System.out.print("Número: ");
        int number = sc.nextInt();

        System.out.print("Data: (dd/MM/yyyy): ");
        LocalDate date = LocalDate.parse(sc.next(), fmt);

        System.out.print("Valor do Contrato: ");
        double Value = sc.nextDouble();

        Contract obj = new Contract(number, date, Value);

        System.out.print("Entre com os numeros de parcela: ");
        int n = sc.nextInt();
        
        ContractService contractService = new ContractService(new PayPalService());

        contractService.processContract(obj, n);

        System.out.println("Parcelas: ");
            for(Installments installment : obj.getInstallments()){
                System.out.println(installment);
            }

            sc.close();

    }
    
}
