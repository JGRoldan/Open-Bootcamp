import calculadora

def main():
    x = int(input('ingrese un numero:'))
    y = int(input('ingrese un otro numero:'))
    print(x,'+',y,'=',calculadora.suma(x,y))
    print(x,'-',y,'=',calculadora.resta(x,y))
    print(x,'*',y,'=',calculadora.multiplicar(x,y))
    print(x,'/',y,'=',calculadora.dividir(x,y))

if __name__ == '__main__':
    main()