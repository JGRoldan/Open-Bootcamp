f = open('ficheros/fichero.txt', 'w')
f.write('Primer comentario\n')
f.close()

f = open('ficheros/fichero.txt', 'r+')
f.readline()
f.write('Segundo comentario\n')
