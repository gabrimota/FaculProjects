package org.example;

public class OportunidadeEstudo {

    private static final double NOTA_MAIOR9 = 0.70;
    private static final double NOTA_MAIOR8 = 0.50;
    private static final double NOTA_MAIOR7 = 0.30;
    private static final double NOTA_MENOR7 = 0.00;
    private static final double RENDA_MENSAL_MENOR2000 = 0.20;
    private static final double RENDA_MENSAL_MENOR4000 = 0.10;
    private static final double RENDA_MENSAL_MAIOR4000 = 0.00;
    private static final double POS_GRADUACAO = -0.10;
    private static final double CURSO_TECNICO = 0.50;


    public double calcularBolsa(double rendaMensal, double nota, String curso){
     double descontoBolsa;

        if ( nota >= 9.0){
            descontoBolsa = NOTA_MAIOR9;
        } else if (nota >= 8.0){
            descontoBolsa = NOTA_MAIOR8;
        } else if( nota >= 7.0){
            descontoBolsa = NOTA_MAIOR7;
        } else
            descontoBolsa = NOTA_MENOR7;

        if (rendaMensal < 2.000 ){
            descontoBolsa += RENDA_MENSAL_MENOR2000;
        } else if( rendaMensal < 4.000 ){
            descontoBolsa += RENDA_MENSAL_MENOR4000;
        } else descontoBolsa += RENDA_MENSAL_MAIOR4000;

        if(curso.equals("Pós-graduação")){
            descontoBolsa -= POS_GRADUACAO;
        } else if(curso.equals("Curso Técnico")) {
            descontoBolsa += CURSO_TECNICO;
        }

        return descontoBolsa;
    }


}
