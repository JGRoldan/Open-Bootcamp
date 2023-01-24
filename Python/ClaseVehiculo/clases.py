# En este ejercicio vais a crear la clase Vehículo la cual tendrá los siguientes atributos:

#     - Color

#     - Ruedas

#     - Puertas

# Por otro lado crearéis la clase Coche la cual heredará de Vehículo y tendrá los siguientes atributos:

#     - Velocidad

#     - Cilindrada

# Por último, tendrás que crear un objeto de la clase Coche y mostrarlo por consola.


class Vehiculo:
    
    def __init__(self, color,ruedas,puertas):
        self.color = color
        self.ruedas = ruedas
        self.puertas = puertas
    
    def getDatos(self):
        print("Tu auto es de color:", self.color,
            "tiene",self.ruedas,"ruedas",
            "y",self.puertas,"puertas.")

class Coche(Vehiculo):
  
    def __init__(self,colorAuto,ruedasAuto,puertasAuto,velocidad, cilindrada):
        super().__init__(colorAuto,ruedasAuto,puertasAuto)
        self.velocidad = velocidad
        self.cilindrada = cilindrada
        
    def descripcion(self):
        super().getDatos()
        print("Ademas, alcanza una velocidad maxima de",self.velocidad, "y tiene",self.cilindrada,"cilindros.")
        
print("Ingrese algunos datos de su auto: ")

#Instancia de la clase coche
c = Coche(
        input("Ingrese el color: "),
        input("Ingrese cantidad de ruedas: "),
        input("Ingrese cantidad de puertas: "),
        input("Ingrese la velocidad maxima: "),
        input("Ingrese la cantidad de cilindros: ")
        )
c.descripcion()
