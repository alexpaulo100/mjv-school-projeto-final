package edu.mjv.school.projetofinal.service;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.mjv.school.projetofinal.dto.CategoriaDTO;
import edu.mjv.school.projetofinal.model.Categoria;
import edu.mjv.school.projetofinal.repository.CategoriaRepository;

@Service
public class CategoriaService {
    @Autowired
    CategoriaRepository repository;

    @Autowired
    EmpresaService empresaService;

    public void salvar(CategoriaDTO categoriaDTO){
        repository.save(_toConvertCategoriaEntity(categoriaDTO));
    }

    public void apagarPorId(Integer id){
        System.out.println("Apagando dados");
        System.out.println("Id:" + id); 
        repository.deleteById(id); 
    }

    public List<Categoria> listarTodos() {
        System.out.println("Listando dados");
        return repository.findAll();
    }

    public Categoria _toConvertCategoriaEntity(CategoriaDTO categoriaDTO){
        Categoria entity = new Categoria();
        entity = new ModelMapper().map(categoriaDTO, Categoria.class);
        entity.setEmpresa(empresaService.buscarPorId(categoriaDTO.getIdEmpresa()));    
        return entity ;
     }
}
