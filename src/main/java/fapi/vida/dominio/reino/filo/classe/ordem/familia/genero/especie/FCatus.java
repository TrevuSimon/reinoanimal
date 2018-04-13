package fapi.vida.dominio.reino.filo.classe.ordem.familia.genero.especie;

import fapi.vida.dominio.reino.filo.classe.ordem.familia.genero.Felis;

public class FCatus extends Felis {
    @Override
    public void comer() {
        System.out.println("Gato esta comendo!");
    }

    @Override
    public void locomover() {
        System.out.println("Gato esta andando!");
    }

    @Override
    public void respirar() {
        System.out.println("Gato esta respirando!");
    }
}
