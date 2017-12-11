/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_estoque.servicos;

import java.util.List;

/**
 *
 * @author Josué
 */
public interface ServicoVeiculos {

    public void Inserir(Object veiculo, int i) throws Exception;
    public void Atualizar(Object veiculo, int i) throws Exception;
    public void Excluir(int id, int i) throws Exception;
    public List<Object> Procurar(String valor, int i) throws Exception;
    public Object obter(int id, int i) throws Exception;
}
