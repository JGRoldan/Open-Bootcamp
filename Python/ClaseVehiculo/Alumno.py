class Alumno:
    def __init__(self,nombre,nota):
        self.nombre = nombre
        self.nota = nota;
        
    def datos(self):
        return 'Nombre:',self.nombre,'Nota:',self.nota,'Aprobado:',True if self.nota>=7 else False
    
        
a = Alumno('Juan',6)
print(a.datos())
