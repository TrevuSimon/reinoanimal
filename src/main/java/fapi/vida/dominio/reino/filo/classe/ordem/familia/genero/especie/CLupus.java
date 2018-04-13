package fapi.vida.dominio.reino.filo.classe.ordem.familia.genero.especie;

import fapi.vida.dominio.reino.filo.classe.ordem.familia.genero.Canis;

public class CLupus extends Canis {
    @Override
    public void comer() {
        System.out.println("Cachorro esta comendo!");
    }

    @Override
    public void locomover() {
        System.out.println("Cachorro esta andando!");
    }

    @Override
    public void respirar() {
        System.out.println("Cachorro esta respirando!");
    }
}
