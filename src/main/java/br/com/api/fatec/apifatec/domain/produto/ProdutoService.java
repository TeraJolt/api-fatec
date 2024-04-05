package br.com.api.fatec.apifatec.domain.produto;

import br.com.api.fatec.apifatec.entities.Produto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {
    @Autowired
    private ProdutoRepository produtoRepository;

    public List<Produto> listarProdutos(){
        return produtoRepository.findAll();
    }
    public Produto encontrarProdutoPorId(Long id){
        return produtoRepository.findById(id).orElse(null);
    }
    public Produto salvarProduto(Produto produto){
        return produtoRepository.save(produto);
    }
    public void deletarProduto(Long id){
        if (encontrarProdutoPorId(id) != null){
            produtoRepository.deleteById(id);
        }
        else {
            throw new IllegalArgumentException("Produto informado não existe");
        }
    }

    public Produto atualizarProduto(Long id, Produto produto){
        Produto produtoCadastradoProduto = encontrarProdutoPorId(id);

        if(produtoCadastradoProduto == null){
            return null;
        }else {
            produtoCadastradoProduto.setNome(produto.getNome());
            produtoCadastradoProduto.setDescricao(produto.getDescricao());
            produtoCadastradoProduto.setPreco(produto.getPreco());
            produtoCadastradoProduto.setQtdEstoque(produto.getQtdEstoque());
            return produtoRepository.save(produtoCadastradoProduto);
        }
    }
}