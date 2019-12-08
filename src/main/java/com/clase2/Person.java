package com.clase2;

public abstract class Person {

    protected SistemaDigestivo sistemaDigestivo;

    void tomarSiestaParaDigerirMejor() throws InterruptedException {
        dormir();
        sistemaDigestivo.digerir();
    }

    private void dormir() throws InterruptedException {
        Thread.sleep(2000L);
    }

    abstract void saludar();
}
