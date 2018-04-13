package fapi.vida;

public abstract class Vida {
    protected boolean vivo;



    public void taVivo(){
        if(vivo)System.out.println("Ta vivo");
        if(!vivo)System.out.println("não ta vivo");
    }

    public boolean isVivo() {
        return vivo;
    }

    public void setVivo(boolean vivo) {
        this.vivo = vivo;
    }
}
