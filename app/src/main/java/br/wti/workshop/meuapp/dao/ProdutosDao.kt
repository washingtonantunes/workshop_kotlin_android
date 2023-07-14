package br.wti.workshop.meuapp.dao

import br.wti.workshop.meuapp.model.Produto

class ProdutosDao {

    companion object {
        private val produtos = mutableListOf<Produto>()
    }

    fun adiciona(produto: Produto){
        produtos.add(produto)
    }

    fun buscaTodos() : List<Produto> {
        return produtos.toList()
    }

}