package projetolivro;
public class ProjetoLivro {
    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];
        
        p[0] = new Pessoa("Micael", 20, "M");
        p[1] = new Pessoa("Maria", 25, "F");
       
        l[0] = new Livro("Livro1", "autor 1", 100, p[0]);
        l[1] = new Livro("Livro2", "autor 2", 200, p[1]);
        l[2] = new Livro("Livro3", "autor 3", 300, p[0]);
        
        System.out.println("----------------------------------------");
        System.out.println(l[0].toString());
        System.out.println("----------------------------------------");
        System.out.println(l[1].toString());
        System.out.println("----------------------------------------");
        System.out.println(l[2].toString());
    }
    
}
