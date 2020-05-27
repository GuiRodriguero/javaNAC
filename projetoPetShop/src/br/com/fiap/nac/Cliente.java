package br.com.fiap.nac;

public class Cliente {
    float totalGasto;
    Animal animal = new Animal();

    public float getTotalGasto() {
        return totalGasto;
    }

    public void setTotalGasto(float totalGasto) {
        this.totalGasto = totalGasto;
    }
}

