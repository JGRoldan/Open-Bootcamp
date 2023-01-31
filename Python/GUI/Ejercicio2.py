from tkinter import *

#CREAMOS VENTANA
win = Tk()
win.geometry("700x350")
win.title("Lista Seleccionable")

#CREAMOS LISTBOX
lista_elementos=Listbox(win,width=50)

lista_elementos.insert(0,"Elemento 1")
lista_elementos.insert(1,"Elemento 2")
lista_elementos.insert(2,"Elemento 3")
lista_elementos.insert(3,"Elemento 4")

#UBICAMOS LA LISTA
lista_elementos.place(x=100,y=100)
lista_etiq=Label(win,text="Lista de Elementos").place(x=100,y=50)

win.mainloop()
