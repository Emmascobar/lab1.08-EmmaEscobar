package com.ironhack.classes;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class EjerciciosBD {

    public static BigDecimal redondeo(BigDecimal numero) {
        BigDecimal resultado = numero.multiply(new BigDecimal(2));
        return resultado.setScale(2, RoundingMode.CEILING);
    }

    public static BigDecimal reversSing(BigDecimal numero){
        return numero.negate().setScale(1, RoundingMode.HALF_EVEN);
    }

}
