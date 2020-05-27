package br.com.fiap.nac;

public class PetShop {
    private float totalGasto; //soma dos serviços utilizados
    Animal animal = new Animal();

    public float getTotalGasto() {
        return totalGasto;
    }

    public void setTotalGasto(float totalGasto) {
        this.totalGasto = totalGasto;
    }
}

