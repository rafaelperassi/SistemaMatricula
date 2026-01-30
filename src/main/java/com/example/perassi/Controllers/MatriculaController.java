package com.example.perassi.Controllers;
import com.example.perassi.Repositories.AlunoRepository;
import com.example.perassi.Repositories.CursoRepository;
import com.example.perassi.Repositories.MatriculaRepository;
import com.example.perassi.models.Aluno;
import com.example.perassi.models.Curso;
import com.example.perassi.models.Matricula;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("/matricula")
public class MatriculaController {

    @Autowired
    private MatriculaRepository matriculaRepository;

    @Autowired
    private AlunoRepository alunoRepository;

    @Autowired
    private CursoRepository cursoRepository;

    @PostMapping
    public Matricula matricular(
            @RequestParam Long alunoId,
            @RequestParam Long cursoId
    ) {
        Aluno aluno = alunoRepository.findById(alunoId)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Aluno não encontrado"));

        Curso curso = cursoRepository.findById(cursoId)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Curso não encontrado"));

        Matricula matricula = new Matricula();
        matricula.setAluno(aluno);
        matricula.setCurso(curso);

        return matriculaRepository.save(matricula);
    }

    @GetMapping
    public List<Matricula> listar() {
        return matriculaRepository.findAll();
    }
}
