package com.mycompany;
import java.math.BigDecimal;

public class Funcionario {
    private final int id_funcionario;
    private String nm_funcionario;
    private BigDecimal vl_salario_bruto;

    Funcionario(int id_funcionario, String nm_funcionario, BigDecimal vl_salario_bruto){
        this.id_funcionario = id_funcionario;
        this.nm_funcionario = nm_funcionario;
        this.vl_salario_bruto = vl_salario_bruto;
    }

    public int getId(){
        return id_funcionario;
    }

    public String getNomeFuncionario(){
        return nm_funcionario;
    }
    public void setNomeFuncionario(String nm_funcionario){
        this.nm_funcionario = nm_funcionario;
    }

    public BigDecimal getSalario(){
        return vl_salario_bruto;
    }
    public void setSalario(BigDecimal vl_salario_bruto){
        this.vl_salario_bruto = vl_salario_bruto;
    }

}
