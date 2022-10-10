/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetolivro;

/**
 *
 * @author Micael
 */
public class Livro implements IPublicacao{
    private String titulo;
    private String autor;
    private int totPag;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    public Livro(String titulo, String autor, int totPag, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPag = totPag;
        this.leitor = leitor;
        this.aberto = false;
        this.pagAtual = 0;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPag() {
        return totPag;
    }

    public void setTotPag(int totPag) {
        this.totPag = totPag;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    @Override
    public String toString() {
        return "Livro{" + "titulo=" + titulo + ", \nautor=" + autor + ", \ntotPag=" + totPag + ", \npagAtual=" + pagAtual + ", \naberto=" + aberto + ", \nleitor=" + leitor + '}';
    }
    
    
    

    @Override
    public void abrir() {
        this.setAberto(true);
    }

    @Override
    public void fechar() {
        this.setAberto(false);
    }

    @Override
    public void folhear(int p) {
        if(this.isAberto() && p > 0 && p < this.getTotPag()) {
            this.setPagAtual(p);
        } else {
            System.out.println("Error");
        }
    }

    @Override
    public void avancarPag() {
        if(this.isAberto() && this.getPagAtual() < this.getTotPag()) {
            this.pagAtual ++;
        } else {
            System.out.println("Error");
        }
    }

    @Override
    public void voltarPag() {
        if(this.isAberto() && this.getPagAtual() > 0) {
            this.pagAtual --;
        } else {
            System.out.println("Error");
        }
    }
    
}