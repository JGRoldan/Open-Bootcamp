altura=float(input("Ingrese su altura en metros: "))
peso=float(input("Ingrese su peso en kg: "))
imc = round(peso / (altura **2),2)

print("Tu indice de masa corporal es " + str(imc))
