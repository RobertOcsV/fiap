iptu = float(input("Insira o valor do iptu: "))
desconto = float(input("Qual a porcentagem de desconto? (0 a 100%): "))
iptuD = 0

parcela = iptu / 10



print("a parcela do iptu em 10 vezes é: ", parcela)


iptuD = (iptu * desconto) / 100

iptu = iptu - iptuD

print("Pagamento a vista do iptu aplicado com o desconto de", desconto ,"%" , "aplicado a vista foi:", iptu)