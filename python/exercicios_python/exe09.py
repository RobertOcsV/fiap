distanciaM = float(input("Insira a distância em metros: "))
tempoT = float(input("Insira o tempo percorrido em segundos: "))





resultado = distanciaM / tempoT
print("a velocidade média em  {:.2f}".format(resultado), "m/s" )


resultado = resultado * 3.6
print("a velocidade média em  {:.2f}".format(resultado), "km/h" )