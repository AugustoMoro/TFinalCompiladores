Nome: Augusto Moro

O programa foi feito usando Antlr

A entrada é feita por arquivo no seguinte formato:
({E}, {A}, {T}, {EI}, {EF})
onde:

E: é o conjunto de estados do autômato, são colocados entre chaves e cada um separado por vírgula,
pode ser qualquer palavra contendo pelo menos uma letra e um número, ex: {q1, q2, q3}

A: é o alfabeto da fita, também são separados por vírgula, porém, aceitam apenas letras e número,
com tamanho máximo 1
ex: {1,0,a,b}

T: é o conjunto de transicões do automato cada transicao separada por virgula, por exemplo:
{T(q0,0)=q1, T(q0,1)=q0}, onde o T sempre tem que aparecer, e entre parenteses ficam
respectivamente o estado atual e o símbolo que foi lido na fita e a palavra que fica após o sinal de = é o próximo estado.

EI: é o estado inicial do automato, apenas aceita 1 estado, por ex: {q0}

EF: é o conjunto de estados finais do autômato, são colocados entre chaves e cada um separado por
vírgula, pode ser qualquer palavra contendo pelo menos uma letra e um número, ex: {q1, q2, q3}.

A entrada do programa é feita por meio de arquivo, o arquivo precisa estar na mesma pasta do
programa, e é referenciado pelo nome do arquivo (não esquecer da extensão .txt).

Para executar o programa diretamente basta executar o arquivo TFinal.jar na pasta dist, ou importar
o projeto inteiro para o netbeans, para importar o projeto no netbeans, não esquecer da biblioteca
antlr-4.7-complete.jar, contida dentro da pasta lib.