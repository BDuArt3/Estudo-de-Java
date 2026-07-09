public class EstatisticasArray {
    public static void main(String[] args){
        int[] array = {10,20,30,};
        System.out.println(Maximo(array));
        System.out.println(Minimo(array));
        System.out.println(Media(array));
    }

    public static int Maximo(int[] array){
        int i = array[0];
        for (int num : array){
            if (num > i){
                i = num;
            }
        }
        return i;
    }

    public static int Minimo(int[] array){
        int i = array[0];
        for (int num : array){
            if (num < i){
                i = num;
            }
        }
        return i;
    }

    public static double Media(int[] array){
        int soma = 0;
        for (int n : array){
            soma += n;
        }
        double media = soma / array.length;
        return media;
    }
}