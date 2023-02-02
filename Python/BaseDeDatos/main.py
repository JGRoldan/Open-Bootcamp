import sqlite3

#CREAR BASE DE DATOS e INSERTAR DATOS
def insertarAlumnos(id,name,apellido):
    conn = sqlite3.connect('Alumnos.db')
    cursor = conn.cursor()
    cursor.execute(""" CREATE TABLE IF NOT EXISTS Alumnos (
    id INTEGER PRIMARY KEY, 
    nombre TEXT NOT NULL,
    apellido TEXT NOT NULL
        ) """)
    
    query = 'INSERT INTO Alumnos (id, nombre, apellido) VALUES(?,?,?)'
    cursor.execute(query, (id,name,apellido))
    
    conn.commit()
    cursor.close()
    conn.close()
      
def encontrarAlumno(nombre):
        conn = sqlite3.connect('Alumnos.db')
        cursor = conn.cursor()
        query = f'SELECT * FROM Alumnos WHERE nombre = "{nombre}"'
        cursor.execute(query)
        validacion = cursor.fetchall()
        if validacion != []:
            print(validacion)
        else:
            print('Alumno no encontrado')
        conn.commit()
        cursor.close()
        conn.close()
    
def main():
    for i in range(8):
        ids = i+1
        name = input("Ingrese el nombre del alumno: ").title()
        apellido = input("Ingrese el apellido del alumno: ").title()
        insertarAlumnos(ids, name, apellido)
    
    nombre = input("Ingrese el nombre del alumno que desea buscar: ").title()
    encontrarAlumno(nombre)


if __name__ == "__main__":
    main()
