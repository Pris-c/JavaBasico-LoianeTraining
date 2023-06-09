package com.prisc.cursojavabasico.parte5orientacaoaobjetos.labs.aula28a33;

public class AlunoEx3 {

    private String nome;
    private String nomeCurso;
    private String[] disciplina;
    private double[][] notasDisc;
    private int matricula;

    public AlunoEx3(){
        this.disciplina = new String[3];
        this.notasDisc = new double[3][3];
    }

    public AlunoEx3(String nome, String nomeCurso, int matricula) {
        this();
        this.nome = nome;
        this.nomeCurso = nomeCurso;
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public String[] getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String[] disciplina) {
        this.disciplina = disciplina;
    }

    public double[][] getNotasDisc() {
        return notasDisc;
    }

    public void setNotasDisc(double[][] notasDisc) {
        this.notasDisc = notasDisc;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }






    public double calcularMedia(int idDisciplina){
        double media = 0;
        double soma = 0;

        for (int i=0; i<getNotasDisc()[idDisciplina].length; i++){
            soma += getNotasDisc()[idDisciplina][i];
        }
        media = soma / 3;
        return media;
    }

    public String verificarAprovacao(int idDisciplina){
        double media = calcularMedia(idDisciplina);
        if (media>=7) {
            return "APROVADO";
        } else {
            return "REPROVADO";
        }
    }

    public void mostrarInfos(){
        System.out.println("Nome: " + getNome());
        System.out.println("Matrícula: " + getMatricula());
        System.out.println("Nome do curso: " + getNomeCurso());
        System.out.println();

        for (int i=0; i< getNotasDisc().length; i++){
            verificarAprovacao(i);
            System.out.println("Situação em " + getDisciplina()[i] + " : " + verificarAprovacao(i));
            System.out.print("Notas da disciplina " + getDisciplina()[i] + ": ");

            for (int j=0; j<getNotasDisc()[i].length; j++){
                System.out.print(getNotasDisc()[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("");

    }

    public void setDisciplinaPosicao(int posicao, String disciplina){
        this.disciplina[posicao] = disciplina;
    }

    public void setNotaDisciplina(int idDisc, int posicao, double nota){
        this.notasDisc[idDisc][posicao] = nota;
    }



}
