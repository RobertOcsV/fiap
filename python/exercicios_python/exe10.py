
valor1 = float(input("Insira o salário base: "))
valor2 = float(input("Insira o aumento do salário: "))

valor2 = valor2 - valor1

print("Aumento em dinheiro foi: ", valor2)

valor2 = (valor2 * 100) / valor1

print("O aumento porcentual do salário é: {:.2f}".format(valor2) + "%")