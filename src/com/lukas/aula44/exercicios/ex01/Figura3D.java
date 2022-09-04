package com.lukas.aula44.exercicios.ex01;

import com.lukas.aula44.exercicios.ex01.interfaces.DimensaoSuperficial;
import com.lukas.aula44.exercicios.ex01.interfaces.DimensaoVolumetrica;

public abstract class Figura3D extends FiguraGeometrica implements DimensaoVolumetrica, DimensaoSuperficial{

    public Figura3D() { }

    public Figura3D(String nome, String cor) {
        super(nome, cor);
    }

    
    
}
