package br.com.dio;

import br.com.dio.model.Gato;

import java.util.Objects;

public class PrimeiroPrograma {

    public static void main(String[] args) {

        Gato gato = new Gato();
        System.out.println(gato);

        Livro livro1 = new Livro("Motivos de amar a Maria Eduar", 300);
        System.out.println(livro1);
     /*   int a = 5;
        int b = 3;
        System.out.println("hello wolrd " + (a+b) );*/


    }
}

class Livro {
    private String nome;
    private Integer paginas;

    public Livro(String nome, Integer paginas) {
        this.nome = nome;
        this.paginas = paginas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getPaginas() {
        return paginas;
    }

    public void setPaginas(Integer paginas) {
        this.paginas = paginas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Livro livro = (Livro) o;
        return Objects.equals(nome, livro.nome) && Objects.equals(paginas, livro.paginas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, paginas);
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", paginas=" + paginas +
                '}';
    }
}