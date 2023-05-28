package org.example;

public class EjemMedia {
        static double mediana(int[] serie) {
            if(serie.length % 2 <= 0){
                return (double) (serie[serie.length / 2] + serie[(serie.length / 2) - 1]) ;
                else {
                    return (double) serie[serie.length / 2];
                }

            }




