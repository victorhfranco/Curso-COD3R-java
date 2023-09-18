package br.com.cod3r.exerciciossb.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.cod3r.exerciciossb.model.entities.Produto;
import br.com.cod3r.exerciciossb.model.repositories.ProdutoRepository;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {

	@Autowired
	private ProdutoRepository produtoRepository;

//	@PostMapping
//	public @ResponseBody Produto novoProduto(
//			@RequestParam String nome,
//			@RequestParam double preco,
//			@RequestParam double desconto) {
//		Produto produto = new Produto(nome, preco, desconto);
	
//	@PostMapping
	@RequestMapping(method= {RequestMethod.POST, RequestMethod.PUT})
	public @ResponseBody Produto novoProduto(@Valid Produto produto) {
		produtoRepository.save(produto);
		return produto;
	}
	
	@GetMapping
	public Iterable<Produto> obterProdutos() {
		return produtoRepository.findAll();
	}
	
	@GetMapping(path="/nome/{parteNome}")
	public Iterable<Produto> obterProdutosPorNome(@PathVariable String parteNome) {
		return produtoRepository.findByNomeContainingIgnoreCase(parteNome);
	}
	
//	@GetMapping(path="/pagina/{numeroPagina}")
//	public Iterable<Produto> obterProdutoPorPagina(@PathVariable int numeroPagina) {
//		Pageable pageable = PageRequest.of(0, 3);
//		return produtoRepository.findAll(pageable);
//	}
	
	@GetMapping(path="/{id}") //ID
	public Optional<Produto> obterProdutoPorId(@PathVariable int id) {
		return produtoRepository.findById(id);
	}
	
	
//	@PutMapping
//	public Produto alterarProduto(Produto produto) {
//		produtoRepository.save(produto);
//		return produto;
//	}
	
	@DeleteMapping(path="/{id}")
	public void excluirProduto(@PathVariable int id) {
		produtoRepository.deleteById(id);
	}
}
