public class OrdenaVet {
    public static void ordena(Qualidade[] a){
        Qualidade elem, menor;
        int pos;
        for(int i = 0; i < a.length - 1; i++){
            elem = a[i];
            menor = a[i + 1];
            pos = i + 1;
            for(int j = i + 2; j < a.length; j++){
                if(a[j].ehMelhor(menor)){ // Encontrando o menor elemento
                    menor = a[j];
                    pos = j;
                }
            }
            if(menor.ehMelhor(elem)){ // troca
                a[i] = a[pos];
                a[pos] = elem;
            }
        }
    }
}
