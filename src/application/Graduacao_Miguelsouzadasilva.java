package application;

import entities.Pessoas;

public class Graduacao_Miguelsouzadasilva extends Pessoas {
    private String cursoGraduacao;

    public String getCursoGraduacao() {
        return cursoGraduacao;
    }

    public void setCursoGraduacao(String cursoGraduacao) {
        this.cursoGraduacao = cursoGraduacao;
    }

    @Override
    public String toString() {
        return "Graduacao - Nome: " + getNome() + ", CPF: " + getCpf() + ", Matrícula: " + getMatricula() + ", Curso: " + cursoGraduacao;
    }
}