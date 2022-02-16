# Each new term in the Fibonacci sequence is generated by adding the previous two terms. 
# By starting with 1 and 2, the first 10 terms will be:
# 
# 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
# 
# By considering the terms in the Fibonacci sequence whose values do not exceed four million, 
# find the sum of the even-valued terms.

atual = 1
proximo = 2
temp = 0
soma = 0

while atual <= 4000000:
    
    # Verifica se o valor atual é par
    if atual % 2 == 0:
        soma += atual
    
    # Faz a troca de qual o número atual e qual será o próximo
    temp = atual
    atual = proximo
    proximo += temp
    
print(soma) 