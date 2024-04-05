package br.com.api.fatec.apifatec.domain.produto;

import br.com.api.fatec.apifatec.entities.Produto;

import java.util.List;
import java.util.stream.Collectors;

public class ProdutoMapper {

    public static Produto toEntity(ProdutoDTO dto){
        Produto produto = new Produto();
        produto.setId(dto.getId());
        produto.setNome(dto.getNome());
        produto.setDescricao(dto.getDescricao());
        produto.setPreco(dto.getPreco());
        produto.setQtdEstoque(dto.getQtdEstoque());
        return produto;
    }

    public static ProdutoDTO toDTO(Produto produto){
        ProdutoDTO dto = new ProdutoDTO();
        dto.setId(produto.getId());
        dto.setNome(produto.getNome());
        dto.setDescricao(produto.getDescricao());
        dto.setPreco(produto.getPreco());
        dto.setQtdEstoque(produto.getQtdEstoque());
        return dto;
    }
    List<ProdutoDTO> toDTOList(List<Produto> produtos){
        return produtos.stream().map(ProdutoMapper::toDTO).collect(Collectors.toList());
    }
}
