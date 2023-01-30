# En este ejercicio tenéis que crear una lista de RadioButton que muestre la opción que se ha seleccionado y 
# que contenga un botón de reinicio para que deje todo como al principio.

# Al principio no tiene que haber una opción seleccionada.
# from tkinter 

import *

def reiniciar():
    radio.set(None)          # Reiniciamos el seleccionable
    label.config(text='')   # Reiniciamos la etiqueta

def selection():
   selected = f'You selected the option {str(radio.get())}'
   label.config(text=selected)

win = Tk()
win.geometry("700x350")


radio = IntVar()
Label(text="Your Favourite programming language:", font=('Aerial 11')).pack()

r1 = Radiobutton(win, text="C++", variable=radio, value=1, command=selection).pack()
r2 = Radiobutton(win, text="Python", variable=radio, value=2, command=selection).pack()
r3 = Radiobutton(win, text="Java", variable=radio, value=3, command=selection).pack()

label = Label(win)
label.pack()


b = Button(win, text = "Reiniciar", command=reiniciar).pack()

win.mainloop()
