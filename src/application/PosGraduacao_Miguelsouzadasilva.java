package application;

import entities.Pessoas;

public class PosGraduacao_Miguelsouzadasilva extends Pessoas {
    private String cursoPosgraduacao;

    public String getCursoPosgraduacao() {
        return cursoPosgraduacao;
    }

    public void setCursoPosgraduacao(String cursoPosgraduacao) {
        this.cursoPosgraduacao = cursoPosgraduacao;
    }

    @Override
    public String toString() {
        return "Pos-Graduacao - Nome: " + getNome() + ", CPF: " + getCpf() + ", Matricula: " + getMatricula() + ", Curso: " + cursoPosgraduacao;
    }
}