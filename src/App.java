import java.time.LocalDate;

import entidades.Projeto;
import entidades.Tarefa;
import entidades.Usuario;
import enums.PrioridadeTarefa;
import enums.StatusProjeto;
import enums.StatusTarefa;
import enums.StatusUsuario;

public class App {
    public static void main(String[] args) throws Exception {
     // Instanciando objeto da classe usuario
     Usuario usuario = new Usuario();

     usuario.setId(1L);
     usuario.setNome("Davi Santos");
     usuario.setCpf("222.333.444-00");
     usuario.setEmail("davirr@gmail.com");
     usuario.setSenha("1234556");
     usuario.setDataNascimento(LocalDate.of(2008, 01, 10));
     usuario.setStatus(StatusUsuario.ATIVO);
// Instanciando objeto da classe objeto
     Projeto projeto = new Projeto();

        projeto.setId(1L);
        projeto.setNome("Sistema de Gestão de Projetos");
        projeto.setDataInicio(LocalDate.of(2026, 05, 9));
        projeto.setStatus(StatusProjeto.ATIVO);
        projeto.setResponsavel(usuario);

        //Instanciando uma Tarefa

        Tarefa tarefa = new Tarefa();
        tarefa.setId(1L);
        tarefa.setTitulo("Criação ds entidades do sistema");
        tarefa.setDataCriacao(LocalDate.now());
        tarefa.setPrioridade(PrioridadeTarefa.ALTA);
        tarefa.setStatus(StatusTarefa.CONCLUIDA);
        tarefa.setProjeto(projeto);
        tarefa.setUsuario(usuario);

    }
}
