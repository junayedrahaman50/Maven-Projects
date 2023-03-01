package com.testing;

public class Calculator {
public int addition(int a, int b) {
	return a+b;
}

public int multiplication(int i, int j) {
	return i*j;
}

public int factorial(int n) {
	int i, f = 1;
	for(i=1;i<=n;i++) {
		f *= i;
	}
	return f;
}

}
