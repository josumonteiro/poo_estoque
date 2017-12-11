/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_estoque.DAOs;

import java.util.ArrayList;
import java.util.List;
import poo_estoque.objetos.Carro;

/**
 *
 * @author Josué
 */
public class CarrosDAO {

    private static int TOTAL_PRODUTOS = 0;

    private static List<Carro> LISTA_PRODUTOS = new ArrayList<Carro>();

    public static void inserir(Carro produto)
            throws Exception {
        produto.setId(TOTAL_PRODUTOS++);
        LISTA_PRODUTOS.add(produto);
    }

    public static void atualizar(Carro produto)
            throws Exception {
        if (produto != null && !LISTA_PRODUTOS.isEmpty()) {
            for (Carro prodLi : LISTA_PRODUTOS) {
                if (prodLi != null && prodLi.getId() == produto.getId()) {
                    prodLi.setMarca(produto.getMarca());
                    prodLi.setCor(produto.getCor());
                    prodLi.setModelo(produto.getModelo());
                    prodLi.setPreco(produto.getPreco());
                    prodLi.setQtd(produto.getQtd());
                    prodLi.setN_portas(produto.getN_portas());
                    break;
                }
            }
        }
    }

    public static void excluir(Integer id) throws Exception {
        if (id != null && !LISTA_PRODUTOS.isEmpty()) {
            for (int i = 0; i < LISTA_PRODUTOS.size(); i++) {
                Carro prodLi = LISTA_PRODUTOS.get(i);
                if (prodLi != null && prodLi.getId() == id) {
                    LISTA_PRODUTOS.remove(i);
                    break;
                }
            }
        }
    }

    public static List<Carro> listar()
            throws Exception {
        return LISTA_PRODUTOS;
    }

    public static List<Carro> procurar(String valor)
            throws Exception {
        List<Carro> listaResultado = new ArrayList<Carro>();

        if (valor != null && !LISTA_PRODUTOS.isEmpty()) {
            for (Carro prodLi : LISTA_PRODUTOS) {
                if (prodLi != null && prodLi.getModelo() != null) {
                    if (prodLi.getModelo().toUpperCase().contains(valor.toUpperCase())) {
                        listaResultado.add(prodLi);
                    }
                }
            }
        }

        return listaResultado;
    }

    public static Carro obter(Integer id)
            throws Exception {
        if (id != null && !LISTA_PRODUTOS.isEmpty()) {
            for (int i = 0; i < LISTA_PRODUTOS.size(); i++) {
                if (LISTA_PRODUTOS.get(i) != null && LISTA_PRODUTOS.get(i).getId() == id) {
                    return LISTA_PRODUTOS.get(i);
                }
            }
        }
        return null;
    }
}
