#include <stdio.h>
#include <math.h>
#include <stdlib.h>

struct Botas{
    int tamanho;
    char lado;
};

typedef struct Botas botas;

int main()
{
    int n;
    int contador = 0;
    
    //Redeber o total de botas
    printf("Digite a quantidade de botas individuais entregues: ");
    scanf("%d", &n);
    printf("\n");
    
    //Criação de um vetor do tipo do struct e da quantidade de botas que o usuário digitou
    botas p[n];
    
    /* Compara cada posição do vetor com todas as outras posições exceto ela mesma e aumenta o contador de pares quando 
    temos duas botas do mesmo tamanho mas de lados diferentes. Ao final, faz uma reatribuição aos valores referentes ao 
    lado da bota pra não ter como comparar uma bota de um par que já passou com outra de um par que ainda vai passar */
    
    while(n%2==0 && n>=2 && n<=pow(10,4)){
        
        for(int i = 0; i < n; i++){
            printf("Digite o tamanho e o lado (E ou D) da sua %dº bota: ", i+1);
            scanf(" %d %c", &p[i].tamanho, &p[i].lado);
        }
        
            for(int i = 0; i < n; i++){
                for(int j=0; j<n; j++){
                    if(p[i].lado =='D' || p[i].lado == 'd'){
                        p[i].lado = 'D';
                    }
                        if(p[i].lado == 'E' || p[i].lado == 'e'){
                            p[i].lado = 'E';
                        }
                            
                            if(i == j) {
                                break;
                            }
                            
                            if(p[i].tamanho>=30 && p[i].tamanho<=60){
                                if((p[i].tamanho == p[j].tamanho) && (p[i].lado != p[j].lado) && (p[i].lado != 'X') && (p[j].lado != 'X')) {
                                    p[i].lado = 'X';
                                    p[j].lado = 'X';
                                    contador++;
                                }
                            }
                }
            }
            
            break;
    }
    
    
    printf("\nPara %d botas individuais, temos %d par(es).", n, contador);

    return 0;
}