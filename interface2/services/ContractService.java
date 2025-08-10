package interface2.services;

import java.time.LocalDate;

import interface2.Entities.Contract;
import interface2.Entities.Installments;

public class ContractService {
    private OnlinePaymentService OnlinePaymentService;

    public ContractService(OnlinePaymentService OnlinePaymentService){
        this.OnlinePaymentService = OnlinePaymentService;
    }

    public void processContract(Contract Contract, int mounth){
        double basicQuota = Contract.getTotalValues() / mounth;
        //variavel com a parcela base do contrato
        
        for(int i = 1; i <= mounth; i++)
        //Loop de repetição para gerar as parcelas por mês
        {
            
            LocalDate dueDate = Contract.getDate().plusMonths(i);
            // Data de vencimento com referencia pelos meses

            double interest = OnlinePaymentService.interest(basicQuota, i);
            // Valor do juros de acordo com a base e o mês

            double fee = OnlinePaymentService.PaymentFee(basicQuota + interest);
            //Valor da taxa

            double quota = basicQuota + interest + fee;
            //Valor da parcela total

            Contract.getInstallments().add(new Installments(dueDate, quota));
            //Adiona um novo valor na lista de contratos
        }
    }
}
