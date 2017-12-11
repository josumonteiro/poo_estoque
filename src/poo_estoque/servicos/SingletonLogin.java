/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_estoque.servicos;

import poo_estoque.produtos.Usuario;

/**
 *
 * @author Josu
 */
public class SingletonLogin {

    private static SingletonLogin INSTANCE = new SingletonLogin();

    private Usuario user = new Usuario();

    private SingletonLogin() {

    }

    public static SingletonLogin getInstance() {
        return INSTANCE;
    }

    public String getLogin() {
        return user.getLogin();
    }

    public void setLogin(String user) {
        this.user.setLogin(user);
    }

    public void setCargo(String cargo) {
        user.setCargo(cargo);
    }

    public String getCargo() {
        if (user.getCargo() == null) {
            return "0";
        }
        return user.getCargo();
    }

    public void setFunc_id(int id) {
        user.setId(id);
    }

    public int getFunc_id() {
        return user.getId();
    }

    public void setNome(String nome) {
        user.setNome(nome);
    }

    public String getNome() {
        if (user.getNome() == null) {
            return "não logado";
        }
        return user.getNome();
    }

}
