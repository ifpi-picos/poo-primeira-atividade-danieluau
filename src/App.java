import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

import aystelium.dwitza.Curso;
import aystelium.dwitza.Professor;
import aystelium.dwitza.Aluno;

public class App {

    static List<Curso> cursos = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        Professor t1 = new Professor("Roger");
        List<Integer> opcoes = new ArrayList<>();
        opcoes.add(1);
        opcoes.add(2);
        opcoes.add(3);
        opcoes.add(4);
        opcoes.add(5);
        opcoes.add(6);

        int opcaoEscolhida = 1;
        while (opcoes.get(opcaoEscolhida) != 6) {
            opcaoEscolhida = exibeMenu(opcoes);
            if (opcoes.get(opcaoEscolhida) == 1) {
                cadastraCurso(t1);
            } else if (opcoes.get(opcaoEscolhida) == 2) {
                matriculaAluno();
            } else if (opcoes.get(opcaoEscolhida) == 3) {
                mostraCursos();
            } else if (opcoes.get(opcaoEscolhida) == 4) {
                mostraAlunos();
            }
        }
        System.out.println(cursos.size());
    }
    private static void mostraAlunos() {
    }

    private static void mostraCursos() {
        String info = "";
        for (Curso curso : cursos) {
            info = info + "Nome: " + curso.getNome() + " Nivel: " + curso.getNivel() + " Carga horária: " + curso.getCh() + "\n";
            for (Aluno aluno : curso.getAlunos()) {
                info = info + " - " + aluno.getNome() + "\n";
            }
        }
        JOptionPane.showMessageDialog(null, info, "Cursos", JOptionPane.PLAIN_MESSAGE);
    }

    private static int exibeMenu(List<Integer> opcoes) {
        Object[] optionsArray = opcoes.toArray();
        int opcaoSelecionad = JOptionPane.showOptionDialog(null,
                "1. Cadastrar curso \n2. Cadastrar aluno \n3. Exibir cursos \n4. Exibir alunos \n5. Emitir Certificado \n6. Fechar",
                "Sistema de Cursos",
                JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null,
                optionsArray, null);
        return opcaoSelecionad;
    }

    private static void matriculaAluno() {
        List<String> opcoes = new ArrayList<>();
        for (Curso curso : cursos) {
            opcoes.add(curso.getNome());
        }
        Object[] optionsArray = opcoes.toArray();
        int opcaoEscolhida = JOptionPane.showOptionDialog(null,
                "Escolha o curso",
                "Cursos",
                JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null,
                optionsArray, null);

        String nomeCursoSelecionado = opcoes.get(opcaoEscolhida);
        String nomeAluno = JOptionPane.showInputDialog("Digite o nome do aluno");
        String emailAluno = JOptionPane.showInputDialog("Digite o email do aluno");

        Aluno novoAluno = new Aluno(nomeAluno, emailAluno);

        for (Curso curso : cursos) {
            if (curso.getNome().equals(nomeCursoSelecionado)) {
                curso.realizarMatricula(novoAluno);
                break;
            }
        }
 }

    private static void cadastraCurso(Professor p1) {
        String nomeCurso = JOptionPane.showInputDialog("Digite o nome do curso");
        String nivelCurso = JOptionPane.showInputDialog("Digite o nível do curso");
        String chCurso = JOptionPane.showInputDialog("Digite a Carga Horaria do curso");
        Curso novoCurso = new Curso(nomeCurso, nivelCurso, Integer.parseInt(chCurso), p1);
        cursos.add(novoCurso);
    }
}