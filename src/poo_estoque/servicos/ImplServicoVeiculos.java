/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_estoque.servicos;

import java.util.List;
import poo_estoque.DAOs.CarrosDAO;
import poo_estoque.DAOs.MotosDAO;
import poo_estoque.objetos.Carro;
import poo_estoque.objetos.Moto;

/**
 *
 * @author Josué
 */
public class ImplServicoVeiculos implements ServicoVeiculos {

    @Override
    public void Inserir(Object veiculo, int i) throws Exception {
        try {
            if (i == 1) {
                MotosDAO.inserir((Moto) veiculo);
            } else {
                CarrosDAO.inserir((Carro) veiculo);
            }

        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("Erro na fonte de dados", e);
        }
    }

    @Override
    public void Atualizar(Object veiculo, int i) throws Exception {
        try {
            if (i == 1) {
                MotosDAO.atualizar((Moto) veiculo);
            } else {
                CarrosDAO.atualizar((Carro) veiculo);
            }
            return;
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("Erro na fonte de dados", e);
        }
    }

    @Override
    public void Excluir(int id, int i) throws Exception {
        try {
            if (i == 1) {
                MotosDAO.excluir(id);
            } else {
                CarrosDAO.excluir(id);
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("Erro na fonte de dados", e);
        }
    }

    @Override
        public List<Object> Procurar(String valor, int i) throws Exception {
                try {
            if (valor == null && i == 1 || "".equals(valor) && i == 1) {
                return (List) MotosDAO.listar();
            } else if (valor != null && i == 1 || !"".equals(valor) && i == 1) {
                return (List) MotosDAO.procurar(valor);
            }
            
            if (valor == null && i == 2 || "".equals(valor) && i == 2) {
                return (List) CarrosDAO.listar();
            } else {
                return (List) CarrosDAO.procurar(valor);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("Erro na fonte de dados", e);
        }
    }

    @Override
        public Object obter(int id, int i) throws Exception {
                try {
                    if (i == 1) {
            return MotosDAO.obter(id);}
                    else {
                        return CarrosDAO.obter(id);
                    }
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("Erro na fonte de dados", e);
        }
    }

}
