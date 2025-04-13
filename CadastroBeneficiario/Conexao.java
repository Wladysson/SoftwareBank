/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bank.CadastroBeneficiario;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author wladyson
 */
public class Conexao {

     // Configurações do banco de dados
    private static final String URL = "jdbc:postgresql://localhost:5432/Bank"; // Substitua "seu_banco" pelo nome do seu banco
    private static final String USUARIO = "postgres"; // Substitua "seu_usuario" pelo nome de usuário do banco
    private static final String SENHA = "12345"; // Substitua "sua_senha" pela senha do banco

    // Método para estabelecer a conexão
    public static Connection conectar() throws SQLException {
        try {
            // Carrega o driver JDBC (não é mais necessário explicitamente em versões modernas do Java)
            return DriverManager.getConnection(URL, USUARIO, SENHA);
        } catch (SQLException e) {
            // Lançar a exceção para que o chamador a trate
            throw new SQLException("Erro ao conectar ao banco de dados: " + e.getMessage(), e);
        }
    } 
}
