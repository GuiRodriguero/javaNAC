package br.com.fiap.nac;

public class Animal {
    private String nome;
    private String tipo;
    private String porte;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getPorte() {
        return porte;
    }

    public void setPorte(String porte) {
        this.porte = porte;
    }

    public void cadastrarAnimal(String nome, Integer porte, Integer tipo) {
        setNome(nome);

        if (porte == 0) {
            setPorte("Porte Pequeno");
        } else if (porte == 1) {
            setPorte("Porte Médio");
        } else if (porte == 2) {
            setPorte("Porte Grande");
        }

        if (tipo == 0) {
            setTipo("Cachorro");
        } else if (tipo == 1) {
            setTipo("Gato");
        } else if (tipo == 2) {
            setTipo("Outro");
        }
    }
}
