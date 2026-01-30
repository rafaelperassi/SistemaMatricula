package com.example.perassi.Controllers;
import com.example.perassi.Repositories.CursoRepository;
import com.example.perassi.models.Curso;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/curso")
public class CursoController {

    @Autowired
    private CursoRepository cursoRepository;

    @GetMapping
    public List<Curso> listar() {
        return cursoRepository.findAll();
    }

    @PostMapping
    public Curso criar(@RequestBody Curso curso) {
        return cursoRepository.save(curso);
    }
}
