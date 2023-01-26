import time

horaActual = time.localtime().tm_hour
minActual = time.localtime().tm_min
secActual = time.localtime().tm_sec
horaDeSalida = 19

if(horaActual > horaDeSalida):
    print("Ya paso la hora de salida.", horaActual,':',minActual,':',secActual)
else:
    horaRestante= 19 - horaActual
    print('Quedan aproximadamente',horaRestante,'hs para la salida')
