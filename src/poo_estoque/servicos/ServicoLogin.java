/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_estoque.servicos;

import poo_estoque.produtos.Usuario;

/**
 *
 * @author Josué
 */
public class ServicoLogin {

    public static void logar(String usuario, String senha)
            throws Exception {

        try {
            Usuario user = new Usuario();

            if (usuario.equalsIgnoreCase("adm")) {
                SingletonLogin.getInstance().setCargo("Gerente");
                SingletonLogin.getInstance().setNome("Josué");
                SingletonLogin.getInstance().setLogin("adm");
            } else {
                SingletonLogin.getInstance().setCargo("Vendedor");
                SingletonLogin.getInstance().setNome("Josué");
                SingletonLogin.getInstance().setLogin("consulta");
            }

        } catch (Exception e) {
            //Imprime qualquer erro técnico no console e devolve
            //uma exceção e uma mensagem amigável a camada de visão
            e.printStackTrace();
            throw new Exception("Erro na fonte de dados", e);
        }
    }
}
