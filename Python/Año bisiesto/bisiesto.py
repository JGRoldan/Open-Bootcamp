# Un año es bisiesto si es:
#  - Divisible entre 4.
#  - No divisible entre 100.
#  - Divisible entre 400. 

def bisiesto(anio):
    return anio % 4 == 0 and not(anio % 100 == 0) or anio % 400 == 0
    
print(bisiesto(2012))
