package com.prisc.cursojavabasico.parte6herancainterfacepolimorfismo.aula46;

public interface BancoDeDados extends SqlDML, SqlDCL, SqlDDL{

    void abrirConexao();
    void fecharConexao();

}
