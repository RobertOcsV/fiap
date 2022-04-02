desco_porce = float(input("Insira o valor em porcentagem de 0 a 100%: "))
valor_prodEtotal = float(input("Insira o valor do produto: "))

desco_porce = desco_porce / 100
valor_prodEtotal = valor_prodEtotal + (desco_porce * valor_prodEtotal )

print("Valor do produto  com o desconto foi:   ",valor_prodEtotal)

# se for pra adicionar um valor porcentual do produto, 
# é só fazer o desconto ser adicionado no valor do produto, se for pra descontar, é só subtrair