using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace inicioDeProgramacion
{
    class Program
    {
        public static bool Palindromo(string arg)
        {
            bool valor = true;
            int palabra = 0;
            char[] caracter = new char[arg.Length];
            foreach (char c in arg)
            {
                caracter[palabra] = c;
                palabra++;
            }
            foreach (char c in arg)
            {
                palabra--;
                if (c == caracter[palabra])
                {
                    valor = true;
                }
                else
                {
                    valor = false;
                    return valor;
                }

            }
            return valor;
        }

        public static int repetir(string argumento, string parte)
        {
            int a = 0;
            int b = 0;

            string[] words = argumento.Split(' ');
            for(int i= 0; i < words.Length; i++)
            {
                if (words[a] == parte)
                {
                    a++;
                    b++;
                    Console.WriteLine(a);
                    b = 0;
                }
            }
            return a;
        }

        static void Main(string[] arg)
        {
            int menu = 0;
            string seleccion = "";
            string palindromo = "";
            while (menu == 0)
            {
                Console.WriteLine("1. Pepito \n");
                Console.WriteLine("2. Repeticion \n");
                Console.WriteLine("3. Salir \n");
                seleccion = Console.ReadLine();
                if (seleccion != "1,2,3")
                {
                    switch (seleccion)
                    {
                        case ("1"):
                            Console.Clear();
                            Console.WriteLine("Digite la palabra a comparar en el campo siguiente ");
                            palindromo = Console.ReadLine();
                            bool texto = Palindromo(palindromo);
                            if (texto == true)
                            {
                                Console.WriteLine("La palabra es palindromo ");
                                Console.ReadLine();
                            }
                            else
                            {
                                Console.WriteLine("La palabra no es palindromo ");
                                Console.ReadLine();
                            }
                            break;

                        case ("2"):
                            Console.Clear();
                            int repeticion = 0;

                            string valor1 = "";
                            string valor2 = "";

                            Console.WriteLine("Escriba un texto a colocar");
                            valor1 = Console.ReadLine();
                            Console.WriteLine("Escriba la palabra, oracion o cualquiera, que usted quiere que se repita");
                            valor2 = Console.ReadLine();
                            repeticion= repetir(valor1, valor2);
                            Console.WriteLine("El valor" + palindromo + "se logro repetir " + repeticion + "veces");
                            Console.ReadLine();

                            break;

                        case ("3"):
                            menu = 1;
                            break;
                    }
                }
               
                    
            }
        }

        
    }
}

