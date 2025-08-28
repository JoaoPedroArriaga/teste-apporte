package com.mycompany;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SalarioContoller {
    private List<Funcionario> funcionarios = new ArrayList<>();
    private List<Desconto> descontos = new ArrayList<>();

    public void setFuncionarios(List<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }
    
    public void setDescontos(List<Desconto> descontos) {
        this.descontos = descontos;
    }

    public BigDecimal getTotalDescontos(int id_funcionario){
        BigDecimal total = BigDecimal.ZERO;

        for (Desconto desconto : descontos) {
            if (desconto.getIdFuncionario() == id_funcionario) {
                total = total.add(desconto.getDesconto());
            }
        }

        return total;
    }

    public void calcularSalarioLiquido() {
        BigDecimal[] salariosLiquidos = new BigDecimal[funcionarios.size()];
        for(int i = 0; i < funcionarios.size(); i++) {
            Funcionario funcionario = funcionarios.get(i);
            salariosLiquidos[i] = funcionario.getSalario().subtract(getTotalDescontos(funcionario.getId()));
        }

        for(int i = 0; i < funcionarios.size() - 1; i++){
            for(int j = i + 1; j < funcionarios.size(); j++){
                if (salariosLiquidos[i].compareTo(salariosLiquidos[j]) > 0) {

                Collections.swap(funcionarios, i, j);
                
                BigDecimal tempSalario = salariosLiquidos[i];
                salariosLiquidos[i] = salariosLiquidos[j];
                salariosLiquidos[j] = tempSalario;
            }
            }
        }

        for (int i = 0; i < funcionarios.size(); i++) {
            System.out.println(funcionarios.get(i).getNomeFuncionario() + "| R$" + salariosLiquidos[i]);
        }
    }
}
