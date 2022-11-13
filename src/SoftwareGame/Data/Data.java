package SoftwareGame.Data;

import SoftwareGame.Models.Question;

import java.util.ArrayList;
import java.util.List;

public class Data {
    public static ArrayList<Question> getQuestions (){
        ArrayList<Question> questions = new ArrayList<Question>();

        questions.add(new
                        Question(
                        "NO es un paradigma de programación: ",
                        List.of(
                                "Programación orientada a objetos",
                                "Programación orientada a aspectos",
                                "Programación lineal",
                                "Programación estructurada"
                        ),
                        "Programación lineal"
                )
        );


        questions.add(new
                        Question(
                        "En cuanto a la definición de objetos es correcto afirmar: ",
                        List.of(
                                "Un objeto es lo mismo que un método en Java pero en Python son diferentes",
                                "Un objeto es cualquier cosa imaginable que puede ser descrito listando sus características",
                                "Un objeto se compone de campos, comportamientos y clases",
                                "Un objeto puede tener máximo 4GB en RAM"
                        ),
                        "Un objeto es cualquier cosa imaginable que puede ser descrito listando sus características"
                )
        );


        questions.add(new
                        Question(
                        "El acrónimo POO significa: ",
                        List.of(
                                "Paradigma Orientado a Objetos",
                                "Programación de Orden Oscilatorio",
                                "Programación Orientada a Objetos",
                                "Ninguna de las anteriores"
                        ),
                        "Programación Orientada a Objetos"
                )
        );


        questions.add(new
                        Question(
                        "Un método constructor hace referencia a: ",
                        List.of(
                                "La metodología usada para las buenas prácticas de construir programas en POO",
                                "Una librería usada para construir fracciones de código que puede ser reusable por otras clases",
                                "Un fragmento de código que se usa para invocar nuevos objetos, pero solo usados como privados",
                                "Un tipo de comportamiento especial usado para la creación de objetos"
                        ),
                        "Un tipo de comportamiento especial usado para la creación de objetos"
                )
        );


        questions.add(new
                        Question(
                        "Una etiqueta se usa para: ",
                        List.of(
                                "Comentar el código y que se pueda entender por otros desarrolladores",
                                "Definir el código con un número de identificación  del desarrollador",
                                "Identificar un campo que a su vez es una característica del objeto",
                                "Un objeto usado solo en la interfaz gráfica para titular un atributo"
                        ),
                        "Identificar un campo que a su vez es una característica del objeto"
                )
        );


        questions.add(new
                        Question(
                        "Al proceso de creación de un objeto se le conoce como: ",
                        List.of(
                                "Instanciación",
                                "Definición",
                                "Depuración",
                                "Adición"
                        ),
                        "Instanciación"
                )
        );


        questions.add(new
                        Question(
                        "En Java, se desea crear un nuevo objeto car de la clase Autos, la sintáxis correcta es: ",
                        List.of(
                                "public class new car;",
                                "private object car();",
                                "Autos car = new Autos();",
                                "Create new object car.Autos();"
                        ),
                        "Autos car = new Autos();"
                )
        );


        questions.add(new
                        Question(
                        "En cuanto a los constructores es correcto afirmar: ",
                        List.of(
                                "Deben tener un nombre distinto a la clase que lo contiene, para diferenciarse de otros",
                                "No hay necesidad de colocar una lista de argumentos siempre y cuando tenga algún tipo de retorno como VOID",
                                "Debe tener el mismo nombre de la clase que lo contiene, y se diferencia por la lista de parámetros que reciben",
                                "En toda clase debe existir un método contructor, de lo contrario el sistema devuelve error"
                        ),
                        "Debe tener el mismo nombre de la clase que lo contiene, y se diferencia por la lista de parámetros que reciben"
                )
        );


        questions.add(new
                        Question(
                        "Un diagrama de clases UML es: ",
                        List.of(
                                "Un cuadro en Excel o cualquier herramienta para listar las clases de un proyecto",
                                "Un modelo para representar los elementos que hacen parte de la definición de una o varias clases",
                                "Un diagrama de flujo para representar la relación entre las clases",
                                "Un modelo que representa los elementos, atributos y métodos que pertenecen a una clase"
                        ),
                        "Un modelo para representar los elementos que hacen parte de la definición de una o varias clases"
                )
        );


        questions.add(new
                        Question(
                        "Un ejemplo de visibilidad es: ",
                        List.of(
                                "public",
                                "new",
                                "main",
                                "this"
                        ),
                        "public"
                )
        );


        questions.add(new
                        Question(
                        "A la acción que consiste en separar los detalles en que se utilizan los métodos y clases se le conoce como: ",
                        List.of(
                                "Encapsulación",
                                "Recursividad",
                                "Instanciación",
                                "Abstracción"
                        ),
                        "Abstracción"
                )
        );


        questions.add(new
                        Question(
                        "El método Setter es: ",
                        List.of(
                                "Una metodología propuesta por el matemático Setter para desarrollar Software",
                                "Consiste en permitir la modificación de un valor del atributo",
                                "Hace referencia al uso del comando SET en Java",
                                "Consiste en definir los parámetros de inicializar variables en Java"
                        ),
                        "Consiste en permitir la modificación de un valor del atributo"
                )
        );


        questions.add(new
                        Question(
                        "la manera convencional de nombrar un getter de tipo entero debe ser: ",
                        List.of(
                                "get method int(){return this.method;},",
                                "private int methodGet(){return this.method;},",
                                "public int getMethod(){return this.method;},",
                                "new getter int Method(){return this.method;},"
                        ),
                        "public int getMethod(){return this.method;},"
                )
        );


        questions.add(new
                        Question(
                        "Al espacio en la memoria donde se encuentra almacenado un objeto se le conoce como: ",
                        List.of(
                                "bucket",
                                "heap",
                                "buffer",
                                "memory address"
                        ),
                        "heap"
                )
        );


        questions.add(new
                        Question(
                        "Es un ejemplo de variable estática la siguiente: ",
                        List.of(
                                "int divisor = 2",
                                "private static long ultimo = 0",
                                "static Math.PI = 3.1416",
                                "public static long ultimo()"
                        ),
                        "private static long ultimo = 0"
                )
        );


        questions.add(new
                        Question(
                        "El comando para heredar la clase A en B es: ",
                        List.of(
                                "class A extends B",
                                "copy from A to B",
                                "public static class A extends to B",
                                "class A use in B"
                        ),
                        "class A extends B"
                )
        );


        questions.add(new
                        Question(
                        "El acrónimo GUI significa: ",
                        List.of(
                                "GUIA práctica de programación en JAVA",
                                "Guide Using Intensive, para determinar un atributo guia usado intensivamente",
                                "Goal Unique Inherited, para definir el objetivo del método constructor como único",
                                "Graphic User Interface, para definir una aplicación con interfaz gráfica"
                        ),
                        "Graphic User Interface, para definir una aplicación con interfaz gráfica"
                )
        );


        questions.add(new
                        Question(
                        "El polimorfísmo se define como: ",
                        List.of(
                                "Un mecanismo que permite tener un método en la clase padre y sobreescribirlo en la clase hija",
                                "Un hecho que hace que un método se pueda usar solo en la clase hija",
                                "Un método que permite tener otro método en cualquier clase de un proyecto",
                                "Una forma de multiplicar los objetos en cualquier procedimiento"
                        ),
                        "Un mecanismo que permite tener un método en la clase padre y sobreescribirlo en la clase hija"
                )
        );


        questions.add(new
                        Question(
                        "El término cohesión se define como: ",
                        List.of(
                                "hace referencia a la pertinencia de una clase como una entidad, o a cuánto se ajusta un método a un comportamiento especifico",
                                "hace referencia a la interconectividad entre las clases",
                                "hace referencia a ocultar tanto el comportamiento o la forma de desarrollar ciertas operaciones",
                                "sugiere la interpretación de la clase como el desarrollador lo considere y como lo relaciona con las demás clases"
                        ),
                        "hace referencia a la pertinencia de una clase como una entidad, o a cuánto se ajusta un método a un comportamiento especifico"
                )
        );


        questions.add(new
                        Question(
                        "Una de las reglas fundamentales de la POO es nunca usar campos públicos. La característica a ser usada para aplicar esta regla es: ",
                        List.of(
                                "Herencia",
                                "Poliformísmo",
                                "Encapsulamiento",
                                "Acoplamiento"
                        ),
                        "hace referencia a la pertinencia de una clase como una entidad, o a cuánto se ajusta un método a un comportamiento especifico"
                )
        );


        questions.add(new
                        Question(
                        "HashMap en Java, hace referencia a: ",
                        List.of(
                                "Una función en Java que ayuda a hacer mapas",
                                "Un comando para mapear objetos básicos",
                                "Una clase nativa para estructurar mapas",
                                "Una estructura de datos que asigna parejas clave-valor"
                        ),
                        "Una estructura de datos o tipo de contenedor"
                )
        );


        questions.add(new
                        Question(
                        "La librería necesaria para interactuar con el usuario en modo consola es: ",
                        List.of(
                                "import java.util.ArrayList;",
                                "import javax.swing.*;",
                                "import java.util.Scanner;",
                                "#include iostream.h;"
                        ),
                        "import java.util.Scanner;"
                )
        );


        questions.add(new
                        Question(
                        "Algunas características de los contenedores tipo conjunto son: ",
                        List.of(
                                "Se pueden eliminar elementos, pero no se puede saber su tamaño",
                                "Se pueden almacenar elementos repetidos y se puede saber su tamaño",
                                "Se pueden hacer operaciones matemáticas como suma, resta, multiplicación y división",
                                "No se pueden almacenar elementos repetidos, pero se puede consultar si un elemento está o no"
                        ),
                        "No se pueden almacenar elementos repetidos, pero se puede consultar si un elemento está o no"
                )
        );


        questions.add(new
                        Question(
                        "Prolog es un lenguaje de programación que usa el paradigma: ",
                        List.of(
                                "Programación orientada a objetos",
                                "Programación imperativa",
                                "Programación basada en hechos",
                                "Programación lógica"
                        ),
                        "Programación lógica"
                )
        );


        questions.add(new
                        Question(
                        "La palabra que falta en la siguiente afirmación es: Se habla de recursividad cuando una función esta en términos de sí misma o a grandes rasgos se define un ______ si una o más reglas en su definición se refieren a sí mismas. ",
                        List.of(
                                "Predicado",
                                "Sujeto",
                                "Sustantivo",
                                "Elemento"
                        ),
                        "Predicado"
                )
        );


        questions.add(new
                        Question(
                        "El valor de X es ?- len([a, b, c, d, e, [a, b], g, [d,e]], X): ",
                        List.of(
                                "6",
                                "8",
                                "10",
                                "La sintáxis está mal escrita"
                        ),
                        "8"
                )
        );


        questions.add(new
                        Question(
                        "Un ejemplo de lenguaje de programación funcional es: ",
                        List.of(
                                "Ruby",
                                "J++",
                                "Python",
                                "Haskell"
                        ),
                        "Haskell"
                )
        );


        questions.add(new
                        Question(
                        "Complete la frase: Todas aquellas clases que no tienen una superclase explícita tienen como su superclase a la clase _______.",
                        List.of(
                                "Util",
                                "Object",
                                "Swing",
                                "Main"
                        ),
                        "Object"
                )
        );


        questions.add(new
                        Question(
                        "En Java un ActionListener es: ",
                        List.of(
                                "Un oyente de eventos",
                                "Un oyente que detecta errores en el código",
                                "Una subclase que analiza ruido en el código",
                                "Un tipo de datos para sonidos en Java"
                        ),
                        "Un oyente de eventos"
                )
        );


        questions.add(new
                        Question(
                        "Un operador lógico en Java para Y es: ",
                        List.of(
                                "A && B",
                                "A AND B",
                                "A NAND B",
                                "A & B"
                        ),
                        "A && B"
                )
        );


        questions.add(new
                        Question(
                        "En que año fue comercializo java: ",
                        List.of(
                                "1991",
                                "1995",
                                "2002",
                                "2020"
                        ),
                        "1995"
                )
        );


        questions.add(new
                        Question(
                        "El lenguaje de programacion java fue desarrollado por: ",
                        List.of(
                                "James Gosling",
                                "Mark Elliot Zuckerberg,",
                                "Andrew McCollum ",
                                " Andrew McCollum"
                        ),
                        "James Gosling"
                )
        );


        questions.add(new
                        Question(
                        "Que define mejor el concepto ‘clase’ en la programación orientada a objetos: ",
                        List.of(
                                "Es un concepto similar al de 'array'",
                                "Es un tipo particular de variable",
                                "Es un modelo o plantilla a partir de la cual creamos objetos ",
                                "Es una categoria de datos ordenada secuencialmente "
                        ),
                        "Es un modelo o plantilla a partir de la cual creamos objetos"
                )
        );


        questions.add(new
                        Question(
                        "Qué significa instanciar una clase ",
                        List.of(
                                "Duplicar la clase",
                                "Eliminar una clase",
                                "Crear un objeto a partir de la clase ",
                                "Conectar dos clases entre sí "
                        ),
                        "Eliminar una clase"
                )
        );


        questions.add(new
                        Question(
                        "Qué código asociarías a una Interfaz en Java ",
                        List.of(
                                "public class Componente interface Product",
                                "Componente cp = new Componente (interfaz)",
                                "public class Componente implements Printable ",
                                " Componente cp = new Componente.interfaz"
                        ),
                        "public class Componente implements Printable"
                )
        );


        questions.add(new
                        Question(
                        "Qué es una excepción",
                        List.of(
                                "Un bucle",
                                "Una interfaz",
                                "Un error que lanza un método ",
                                "Un Metodo "
                        ),
                        "Un error que lanza un método"
                )
        );


        questions.add(new
                        Question(
                        "Que es la Encapsulación ",
                        List.of(
                                "Es la forma de proteger las propiedades de un objetos",
                                "un método de implementación",
                                "metodología de diseño de software ",
                                "  programas como Word"
                        ),
                        "Es la forma de proteger las propiedades de un objetos"
                )
        );


        questions.add(new
                        Question(
                        "Que es una Clases Abstracta ",
                        List.of(
                                "paradigma de programación",
                                "clases y objetos",
                                "structurar un programa",
                                "declara la existencia de métodos pero no la implementación de dichos métodos "
                        ),
                        "declara la existencia de métodos pero no la implementación de dichos métodos "
                )
        );


        questions.add(new
                        Question(
                        "Que es un constructor ",
                        List.of(
                                "método especial dentro de una clase ",
                                "clases y objetos",
                                " Una clase que declara la existencia",
                                "una clase común la cual posee atributos "
                        ),
                        "método especial dentro de una clase"
                )
        );


        questions.add(new
                        Question(
                        "Qué es una interfaz ",
                        List.of(
                                "son las clases y objetos",
                                "es una especie de plantilla para la construcción de clases",
                                "proceso de crear un conjuntos ",
                                "  códigos para desarrollar programas"
                        ),
                        "es una especie de plantilla para la construcción de clases"
                )
        );


        questions.add(new
                        Question(
                        "los tokens son ",
                        List.of(
                                " lenguaje de programación ",
                                " son el equivalente a las palabras y signos de puntuación en el lenguaje natural escrito",
                                "Fundamentos de programación  ",
                                " classes and objects"
                        ),
                        " son el equivalente a las palabras y signos de puntuación en el lenguaje natural escrito"
                )
        );


        questions.add(new
                        Question(
                        "Tipos de modificadores de acceso",
                        List.of(
                                "Private,Protected,Public,Friend,Protected Friend",
                                "no existen como tal en el mundo real",
                                "las llaves { }, y las sentencias entre ellas ",
                                "una clase sin especificar  "
                        ),
                        "Private,Protected,Public,Friend,Protected Friend"
                )
        );


        questions.add(new
                        Question(
                        "Qué es un objeto ",
                        List.of(
                                "plataforma informática de lenguaje de programación ",
                                "diseñado para ser portable en diversas plataformas",
                                " aplicaciones web",
                                " Los objetos corresponden a cosas que se encuentran en el mundo real"
                        ),
                        "Los objetos corresponden a cosas que se encuentran en el mundo real"
                )
        );


        questions.add(new
                        Question(
                        "Pueden las clases en Java heredar mas de una clase ",
                        List.of(
                                "Si",
                                "No",
                                "a veces ",
                                "Casi siempre "
                        ),
                        "No"
                )
        );


        questions.add(new
                        Question(
                        "Que hace la palabra clave super ",
                        List.of(
                                "se facilitan en comparación a otros lenguajes de programación",
                                "opción popular entre los desarrolladores",
                                "se utiliza para llamar el método overridden, el cual anula uno de sus métodos de superclase",
                                "lenguaje multiplataform "
                        ),
                        "se utiliza para llamar el método overridden, el cual anula uno de sus métodos de superclase"
                )
        );


        questions.add(new
                        Question(
                        "Cómo podemos llamar al método base sin crear una instancia ",
                        List.of(
                                "clase común ",
                                "método estático",
                                "clases estriba  ",
                                "clase abstracta  "
                        ),
                        "método estático"
                )
        );


        questions.add(new
                        Question(
                        "el puntero 'this' es",
                        List.of(
                                "La tecnología Java",
                                "define al objeto actual de una clase,",
                                "el código fuente ",
                                "máquina virtual de Java"
                        ),
                        "define al objeto actual de una clase"
                )
        );


        questions.add(new
                        Question(
                        "Qué es una función virtual pura",
                        List.of(
                                "necesita ser implementada por una clase derivada que no sea abstracta",
                                "Un archivo de código fuente",
                                "conceptos que se facilitan en comparación a otros lenguajes ",
                                "Independiente a la plataforma "
                        ),
                        "necesita ser implementada por una clase derivada que no sea abstracta"
                )
        );


        questions.add(new
                        Question(
                        "Que hace la palabra Static",
                        List.of(
                                " sus metodos son declarados",
                                "heredar de una clase ",
                                " comportamientos de objetos",
                                "define un método estático para una clase "
                        ),
                        "define un método estático para una clase"
                )
        );


        questions.add(new
                        Question(
                        "A qué denominamos un objeto servido ",
                        List.of(
                                "servidor es el que otorga recursos al objeto sin consumirlos",
                                "elementos estáticos",
                                "miembros de clase ",
                                "cálculos con circunferencias"
                        ),
                        "servidor es el que otorga recursos al objeto sin consumirlos"
                )
        );


        questions.add(new
                        Question(
                        "Qué es el diseño orientado a objeto",
                        List.of(
                                "notación para describir los modelos lógico y físico, así como los modelos estático",
                                "son excepciones que se dan durante la ejecucion del programa.",
                                "evento que ocurre durante la ejecucion del programa ",
                                "campo declarado como estatico puede ser accedido o invocado sin la necesidad "
                        ),
                        "notación para describir los modelos lógico y físico, así como los modelos estático"
                )
        );


        questions.add(new
                        Question(
                        "que es modularidad",
                        List.of(
                                "dividir un programa en módulos que pueden compilarse por separado, pero que tienen conexiones con otros módulos",
                                "nterface contractual ",
                                "método de diseño que abarca el proceso de descomposición ",
                                "análisis orientado a objetos "
                        ),
                        "dividir un programa en módulos que pueden compilarse por separado, pero que tienen conexiones con otros módulos"
                )
        );


        questions.add(new
                        Question(
                        "Todos los métodos son operaciones ",
                        List.of(
                                "Si",
                                "No",
                                "A veses ",
                                "Casi siempre"
                        ),
                        "Si"
                )
        );


        questions.add(new
                        Question(
                        "Cuántos tipos de herencia existen ",
                        List.of(
                                "2",
                                "3",
                                " 5",
                                " 0"
                        ),
                        "2"
                )
        );


        questions.add(new
                        Question(
                        "Qué se coloca en el bloque “Catch” ",
                        List.of(
                                "La excepción que necesitamos capturar",
                                "lenguaje común",
                                "Ejecución y el programa falla ",
                                " jerarquía es una clasificación "
                        ),
                        "La excepción que necesitamos capturar"
                )
        );


        questions.add(new
                        Question(
                        "Para que se utilizan las interfaces ",
                        List.of(
                                " para obligar a definir a las clases que la implementan un comportamiento particular para cada una",
                                "asociar a  un procesador virtual",
                                "Se obtiene implementando la interfaz IDisposable ",
                                "selección usan preguntas o nombres con elverbo ser "
                        ),
                        " para obligar a definir a las clases que la implementan un comportamiento particular para cada una"
                )
        );


        questions.add(new
                        Question(
                        " Cómo funciona el puerto serie",
                        List.of(
                                "esquema de transmisión de datos en serie un dispositivo envía datos aotro a razón de un bit a la vez a través de un cable",
                                "forma genérica de denominar a una   interfaz  ",
                                " En un esquema de transmisión de datos en paralelo",
                                " envía datos a otro a una tasa de n número de bits a través de n número de cable "
                        ),
                        "esquema de transmisión de datos en serie un dispositivo envía datos aotro a razón de un bit a la vez a través de un cable"
                )
        );


        questions.add(new
                        Question(
                        "A qué denominamos un objeto cliente ",
                        List.of(
                                "es cualquier objeto que utiliza los recursos de otro objeto, denominado servidor",
                                "reacciona un objeto en términos de sus cambios de estado",
                                " Un   contrato   entre   objetos   establece   todas   las   suposiciones",
                                "comportamiento de un objeto servido "
                        ),
                        "es cualquier objeto que utiliza los recursos de otro objeto, denominado servidor"
                )
        );


        questions.add(new
                        Question(
                        "Qué es una postcondición ",
                        List.of(
                                "Es una invariante satisfecha por una operación. ",
                                "es un concepto complementario a la abstracción",
                                "representa todo lo que un cliente necesita saber de una clase ",
                                " Se denomina implementación"
                        ),
                        "Es una invariante satisfecha por una operación"
                )
        );


        return questions;
    }
}
