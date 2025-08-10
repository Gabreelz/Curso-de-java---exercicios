package interface2.Application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import interface2.Entities.Contract;
import interface2.Entities.Installments;

public class ContractFileGenerator {

    public static void saveContractToFile(Contract contract, String filePath) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write("Contrato nº: " + contract.getInstallmentsNumbers());
            writer.newLine();
            writer.write("Data: " + contract.getDate());
            writer.newLine();
            writer.write("Valor total: R$ " + String.format("%.2f", contract.getTotalValues()));
            writer.newLine();
            writer.write("Parcelas:");
            writer.newLine();
            for (Installments inst : contract.getInstallments()) {
                writer.write(inst.getDueData() + " - R$ " + String.format("%.2f", inst.getAmount()));
                writer.newLine();
            }
            writer.write("====================================");
            writer.newLine();
            writer.write("Gerado automaticamente pelo sistema.");
        } catch (IOException e) {
            System.out.println("Erro ao salvar contrato: " + e.getMessage());
        }
    }
}

