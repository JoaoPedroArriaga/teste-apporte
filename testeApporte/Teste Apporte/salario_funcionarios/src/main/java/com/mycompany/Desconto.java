package com.mycompany;

import java.math.BigDecimal;

public class Desconto {
    private final int id_funcionario;
    private final int id_desconto; 
    private BigDecimal vl_desconto;

    Desconto(int id_funcionario, int id_desconto, BigDecimal vl_desconto){
        this.id_funcionario = id_funcionario;
        this.id_desconto = id_desconto;
        this.vl_desconto = vl_desconto;
    }

    public int getIdFuncionario(){
        return id_funcionario;
    }

    public int getIdDesconto(){
        return id_desconto;
    }

    public BigDecimal getDesconto(){
        return vl_desconto;
    }
    public void setDesconto(BigDecimal vl_desconto){
        this.vl_desconto = vl_desconto;
    }
}
