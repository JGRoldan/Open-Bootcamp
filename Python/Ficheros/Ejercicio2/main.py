import pickle

#Clase sin constructor
class Vehiculo:
    ruedas = 4
    puertas = 5
    bocina = True
    
    def getDatos(self):
        return f'Ruedas {self.ruedas}, puertas {self.puertas}, bocina {self.bocina}'
    
v = Vehiculo()

#Guardar datos en el disco
f = open('datos.txt', 'wb')
pickle.dump(v,f)
f.close()

#Cargar los datos del disco
f = open('datos.txt', 'rb')
v1=pickle.load(f)
f.close()
print(v1.getDatos())
