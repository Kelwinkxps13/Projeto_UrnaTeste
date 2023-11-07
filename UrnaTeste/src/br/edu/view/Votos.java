/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.view;

/**
 *
 * @author Alunos
 */
public class Votos {
    protected static int votos12, votos13, votos22, votosBranco, votosNulo;

    public void setVotos12(int votos12) {
        this.votos12 += votos12;
    }

    public void setVotos13(int votos13) {
        this.votos13 += votos13;
    }

    public void setVotos22(int votos22) {
        this.votos22 += votos22;
    }

    public void setVotosBranco(int votosBranco) {
        this.votosBranco += votosBranco;
    }

    public void setVotosNulo(int votosNulo) {
        this.votosNulo += votosNulo;
    }
    
    

    public int getVotos12() {
        return votos12;
    }

    public int getVotos13() {
        return votos13;
    }

    public int getVotos22() {
        return votos22;
    }

    public int getVotosBranco() {
        return votosBranco;
    }

    public int getVotosNulo() {
        return votosNulo;
    }
    
    
}
