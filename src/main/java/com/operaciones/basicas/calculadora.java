package com.operaciones.basicas;

public class calculadora {
private Operacion operacion;
public calculadora(Operacion operacion) {
	this.operacion=operacion;
}
public void calcularOperacion(int n1, int n2) {
	operacion.calcular(n1,n2);
}
}
