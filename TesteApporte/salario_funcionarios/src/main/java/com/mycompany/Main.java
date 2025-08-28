package com.mycompany;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // 1. Inicializar listas com dados das tabelas
        List<Funcionario> funcionarios = Arrays.asList(
            new Funcionario(81, "Jonas Alberto Lekinihs", new BigDecimal("3235.00")),
            new Funcionario(82, "Roseli Nunes", new BigDecimal("1750.22")),
            new Funcionario(83, "Silvio Santos", new BigDecimal("17321.55")),
            new Funcionario(84, "Maria da Glória", new BigDecimal("7322")),
            new Funcionario(85, "Roberto Robertinho", new BigDecimal("2280.66"))
            
        );
        
        List<Desconto> descontos = Arrays.asList(
            new Desconto(81, 1, new BigDecimal("11.56")),
            new Desconto(81, 2, new BigDecimal("54.22")),
            new Desconto(81, 3, new BigDecimal("12.88")),
            new Desconto(81, 4, new BigDecimal("59.54")),
            new Desconto(81, 5, new BigDecimal("150.55")),
            new Desconto(81, 6, new BigDecimal("56.63")),
            new Desconto(82, 7, new BigDecimal("46.89")),
            new Desconto(82, 8, new BigDecimal("455.53")),
            new Desconto(82, 9, new BigDecimal("78.99")),
            new Desconto(82, 10, new BigDecimal("78.67")),
            new Desconto(82, 11, new BigDecimal("45.23")),
            new Desconto(83, 12, new BigDecimal("937.29")),
            new Desconto(83, 13, new BigDecimal("899.22")),
            new Desconto(83, 14, new BigDecimal("789.67")),
            new Desconto(83, 15, new BigDecimal("899.66")),
            new Desconto(84, 16, new BigDecimal("860.57")),
            new Desconto(84, 17, new BigDecimal("46.22")),
            new Desconto(84, 18, new BigDecimal("68.88")),
            new Desconto(85, 19, new BigDecimal("15.27")),
            new Desconto(85, 20, new BigDecimal("88.55"))
        );
        
        // 2. Configurar o controller
        SalarioContoller controller = new SalarioContoller();
        controller.setFuncionarios(funcionarios);
        controller.setDescontos(descontos);
        
        // 3. Executar o método solicitado
        controller.calcularSalarioLiquido();
    }
}